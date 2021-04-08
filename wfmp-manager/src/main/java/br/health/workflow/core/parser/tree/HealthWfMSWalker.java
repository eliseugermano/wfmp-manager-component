package br.health.workflow.core.parser.tree;

import br.health.workflow.core.parser.antlr4.HealthWfMSBaseListener;
import br.health.workflow.core.parser.antlr4.HealthWfMSParser.*;
import br.health.workflow.db.semantic.entity.*;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class HealthWfMSWalker extends HealthWfMSBaseListener {
	
	private Map<String, PlaceEntity> placeTable = new HashMap<String, PlaceEntity>();
	private PetriNetEntity workflow;
	
	private List<String> targetList = new ArrayList<>();
	private String sourcePlaceName;
	
	private List<EventEntity> eventObjects = new ArrayList<>();
	private List<ConditionEntity> conditionObjects = new ArrayList<>();
	private List<ActionEntity> actionList = new ArrayList<>();
	
	public HealthWfMSWalker(PetriNetEntity workflow) {
		this.workflow = workflow;
	}
	
	@Override
	public void enterRoot(RootContext ctx) {
		String workflowName = ctx.getChild(1).getText();
		workflow.setName(workflowName);
	}
	
	@Override
	public void enterFirstPlaceDef(FirstPlaceDefContext ctx) {
		super.enterFirstPlaceDef(ctx);
		
		// Define the source place of a transition
		sourcePlaceName = ctx.getChild(0).getText();
		loadTransitionsFirstPlace(ctx);
	}
	
	@Override
	public void enterOtherPlaceDef(OtherPlaceDefContext ctx) {
		super.enterOtherPlaceDef(ctx);
		targetList.clear();
		
		// Define the source place of a transition
		sourcePlaceName = ctx.getChild(1).getText();
	}
	
	@Override
	public void enterTrasitionDef(TrasitionDefContext ctx) {
		super.enterTrasitionDef(ctx);
		
		log.info("[DSL] \t-> [enterTrasitionDef]");
		loadTransitionsOtherPlaces(ctx);
	}
	
	@Override
	public void enterEventDef(EventDefContext ctx) {
		if(ctx.getChildCount()==0) return;
		
		EventEntity event = eventObjects.remove(0);
		String eventType = ctx.getChild(0).getChild(0).getText();
		String eventKind = ctx.getChild(0).getChild(1).getChild(0).getText();
		
		if(ctx.getChild(0).getChild(1).getChild(0).getChildCount()>1){
			event.setMultipleKinds(true);
			
			for (int i = 2; i < ctx.getChild(0).getChild(1).getChild(0).getChildCount(); i=i+2) {
				eventKind += "."+ctx.getChild(0).getChild(1).getChild(i).getText();
			}
		}
		event.setEventType(eventType);
		event.setObjectKind(eventKind);
	}
		
	@Override
	public void enterStatement(StatementContext ctx) {
		ConditionEntity condition = conditionObjects.remove(0);
		String statement = ctx.getChild(0).getText();
		
		if(statement.equals("isTrue") || statement.equals("isFalse")){
			String objectCondition = ctx.getChild(2).getChild(0).getText();
			String attrCondition = ctx.getChild(2).getChild(2).getText();
			condition.setBinaryOperation(new BinaryOperationEntity(statement, objectCondition, attrCondition, "=="));
		} else if(statement.equals("currentTime") || statement.equals("currentDate") || statement.equals("currentDayWeek") || statement.equals("waitTime")){
			/* other conditions */
		}
	}
	
	@Override
	public void enterActionDef(ActionDefContext ctx) {
		ActionEntity action = actionList.remove(0);
		
		//  AST nodes indexes from ACTION_NODE
		int END_POINT_NODE, STRUCT_NODE = 2, IDENTIFIER_NODE = 0, RESOURCE_NODE = 4, ATTRIBUTE_NODE = 2;
		
		for (int CALLDEF_ELEMENT_i = 0, CALLDEF_NODE_i=1; CALLDEF_ELEMENT_i < action.getCalls().size(); CALLDEF_ELEMENT_i++, CALLDEF_NODE_i=CALLDEF_NODE_i+2) {
			ServiceCallEntity call = action.getCalls().get(CALLDEF_ELEMENT_i);
			
			if(ctx.getChild(CALLDEF_NODE_i).getChild(0).getChildCount()>0)
				call.setSyncCallService(true);
			
			if(targetList.get(CALLDEF_ELEMENT_i).equals("end.workflow")){
				END_POINT_NODE=1;
				call.setEndPoint(ctx.getChild(CALLDEF_NODE_i).getChild(END_POINT_NODE).getText());
			} else if(targetList.get(CALLDEF_ELEMENT_i).equals("end.workflow.export")){
				END_POINT_NODE=1;
				call.setEndPoint(ctx.getChild(CALLDEF_NODE_i).getChild(END_POINT_NODE).getText());
				call.setExport(ctx.getChild(CALLDEF_NODE_i).getChild(STRUCT_NODE).getText());
			} else {
				END_POINT_NODE=2;
				
				// Save the endpoint of the service
				call.setEndPoint(ctx.getChild(CALLDEF_NODE_i).getChild(END_POINT_NODE).getChild(IDENTIFIER_NODE).getText());
				
				log.info("[DSL] \t-> [targetName] "+ targetList);
				log.info("[DSL] \t-> [action] "+ call.getEndPoint());
				
				// Checks whether the call should be made to a service or a workflow
				String resourceType = ctx.getChild(CALLDEF_NODE_i).getChild(RESOURCE_NODE).getText();
				call.setCallWorkflow(resourceType.equals("FromService")?false:true);
				
				// Parameters
				if(ctx.getChild(1).getChild(2).getChildCount()>3){
					call.setParameter(ctx.getChild(CALLDEF_NODE_i).getChild(END_POINT_NODE).getChild(ATTRIBUTE_NODE).getChild(IDENTIFIER_NODE).getText());
					// add other parameters
				}
			}
		}
	}
	
	@Override
	public void enterCallDef(CallDefContext ctx) {
		super.enterCallDef(ctx);
	}
	
	private void loadTransitionsFirstPlace(ParseTree ctx){
		
		//  AST nodes indexes from TransitionsFirstPlace
		int ACTION_NODE = 2, STRUCT_NODE = 6;
		
		List<ServiceCallEntity> calls = new ArrayList<ServiceCallEntity>();
		List<PlaceEntity> targets = new ArrayList<PlaceEntity>();
		
		for (int CALLDEF_NODE_i = 0; CALLDEF_NODE_i < ctx.getChild(ACTION_NODE).getChildCount(); CALLDEF_NODE_i=CALLDEF_NODE_i+2) {
			// Define the next place
			String targetName = ctx.getChild(ACTION_NODE).getChild(CALLDEF_NODE_i+1).getChild(STRUCT_NODE).getText();
			
			targetList.add(targetName);
			PlaceEntity targetPlace = new PlaceEntity(targetName);
			targets.add(targetPlace);
			calls.add(new ServiceCallEntity());
			placeTable.put(targetName, targetPlace);
			log.info("[DSL] \t-> [loadTransitionsFirstPlace] ");
		}
		
		log.info("[DSL] \t-> [source] "+ sourcePlaceName + " [target(s)] "+targetList.toString());
		
		// There isn't EVENT for first transition
		
		// There isn't CONDITION for first transition
		
		// Sets the ACTION used in the ECA pattern
		
		ActionEntity action = new ActionEntity();
		action.setCalls(calls);
		actionList.add(action);
		
		PlaceEntity source = new PlaceEntity(sourcePlaceName);
		source.addTransition(new EventEntity(), new ConditionEntity(), action, targets);
		workflow.setStart(source);
		placeTable.put(sourcePlaceName, source);
	}
	
	private void loadTransitionsOtherPlaces(ParseTree ctx) {
		
		// AST nodes indexes from TransitionsOtherPlaces
		int STRUCT_NODE = 6, ACTION_NODE;
		
		// Checks the position of the "action" node in AST
		ACTION_NODE = (ctx.getChildCount()>5) ? 5 : 3;
		
		List<ServiceCallEntity> calls = new ArrayList<ServiceCallEntity>();
		List<PlaceEntity> targetPlaces = new ArrayList<PlaceEntity>();
		String targetName;
		
		for (int CALLDEF_NODE_i = 0; CALLDEF_NODE_i < ctx.getChild(ACTION_NODE).getChildCount(); CALLDEF_NODE_i=CALLDEF_NODE_i+2) {
			
			// Define the next place
			if(ctx.getChild(ACTION_NODE).getChild(CALLDEF_NODE_i+1).getChildCount()>3)
				targetName = ctx.getChild(ACTION_NODE).getChild(CALLDEF_NODE_i+1).getChild(STRUCT_NODE).getText();
			
			else if(ctx.getChild(ACTION_NODE).getChild(CALLDEF_NODE_i+1).getChildCount()==3)
				targetName = "end.workflow.export";
			
			else
				targetName = "end.workflow";
			
			targetList.add(targetName);
			PlaceEntity target = new PlaceEntity(targetName);
			
			// checks if targetPlace is in table
			if(!placeTable.containsKey(targetName))
				placeTable.put(targetName, target);
			
			targetPlaces.add(placeTable.get(targetName));
			calls.add(new ServiceCallEntity());
			log.info("[DSL] \t-> [loadTransitionsOtherPlaces]");
		}
		
		log.info("[DSL] \t-> [source] "+ sourcePlaceName + " [target] "+targetList.toString());
		
		// Sets the EVENT used in the ECA pattern
		EventEntity event = new EventEntity();
		eventObjects.add(event);
		
		// Sets the CONDITION used in the ECA pattern
		ConditionEntity condition = new ConditionEntity();
		if(ACTION_NODE==5 && ctx.getChild(3).getChildCount()>0)
			conditionObjects.add(condition);
		
		// Sets the ACTION used in the ECA pattern
		ActionEntity action = new ActionEntity();
		action.setCalls(calls);
		actionList.add(action);
		
		// checks if sourcePlace is in table
		if(!placeTable.containsKey(sourcePlaceName)) {
			PlaceEntity source = new PlaceEntity(sourcePlaceName);
			
			source.addTransition(event, condition, action, targetPlaces);
			placeTable.put(sourcePlaceName, source); // add a new place in the table
		} else {
			placeTable.get(sourcePlaceName).addTransition(event, condition, action, targetPlaces);
		}
	}
}