package br.health.workflow.service;

import br.health.workflow.core.parser.antlr4.HealthWfMSLexer;
import br.health.workflow.core.parser.antlr4.HealthWfMSParser;
import br.health.workflow.core.parser.tree.HealthWfMSWalker;
import br.health.workflow.db.semantic.entity.PetriNetEntity;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@NoArgsConstructor
public class PetriNetAnalyzerService {
	
	/**
	 * Loads and walks AST to build the semantic model
	 *
	 */
	public PetriNetEntity createSemanticModel(String content) {
		PetriNetEntity workflow = new PetriNetEntity();
		ParseTree tree = this.loadAST(content);

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new HealthWfMSWalker(workflow), tree);
		return workflow;
	}
	
	/**
	 * Syntactically parses the script and builds an AST
	 *
	 */
	private ParseTree loadAST(String content) {
		ANTLRInputStream input = new ANTLRInputStream(content);
		HealthWfMSLexer lexer = new HealthWfMSLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HealthWfMSParser parser = new HealthWfMSParser(tokens);
		return parser.root();
	}

}