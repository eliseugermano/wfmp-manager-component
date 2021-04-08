package br.health.workflow.dsl;

import br.health.workflow.db.semantic.entity.PetriNetEntity;
import br.health.workflow.db.semantic.entity.PlaceEntity;
import br.health.workflow.db.semantic.entity.TransitionEntity;
import br.health.workflow.service.PetriNetAnalyzerService;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class PetriNetAnalyzerServiceTest {

    @InjectMocks
    private PetriNetAnalyzerService petriNetAnalyzerService;

    @Test
    public void createSemanticModelWf01Test() throws IOException {
        String content = Resources.toString(Resources.getResource("wf01-and-split"), Charsets.UTF_8);

        PetriNetEntity workflow = petriNetAnalyzerService.createSemanticModel(content);
        Assert.assertThat("Incorrect workflow name", "BloodPressureAnalysis", is(workflow.getName()));

        // start task place
        PlaceEntity startTaskPlace = workflow.getStart();
        Assert.assertThat("Incorrect place name", "start task", is(startTaskPlace.getName()));

        // start task transitions
        List<TransitionEntity> startTaskTransitions = startTaskPlace.getTransitions();
        Assert.assertThat("Wrong the amount of transitions", 1, is(startTaskTransitions.size()));

        // BloodPressureSensor place
        PlaceEntity bloodPressureSensorPlace = workflow.getStart().getTransitions().get(0).getTargets().get(0);
        Assert.assertThat("Incorrect place name", "BloodPressureSensor", is(bloodPressureSensorPlace.getName()));

        // BloodPressureSensor transitions
        List<TransitionEntity> bloodPressureSensorTransitions = bloodPressureSensorPlace.getTransitions();
        Assert.assertThat("Wrong the amount of transitions", 1, is(bloodPressureSensorTransitions.size()));

        // PatientHistory place
        PlaceEntity patientHistoryPlace = workflow.getStart().getTransitions().get(0).getTargets().get(0).getTransitions()
                .get(0).getTargets().get(1);
        Assert.assertThat("Incorrect place name", "PatientHistory", is(patientHistoryPlace.getName()));

        // PatientHistory transitions
        List<TransitionEntity> patientHistoryTransitions = patientHistoryPlace.getTransitions();
        Assert.assertThat("Wrong the amount of transitions", 1, is(patientHistoryTransitions.size()));

        // HealthcareAnalytics place
        PlaceEntity healthcareAnalyticsPlace = workflow.getStart().getTransitions().get(0).getTargets().get(0).getTransitions()
                .get(0).getTargets().get(0);
        Assert.assertThat("Incorrect place name", "HealthcareAnalytics", is(healthcareAnalyticsPlace.getName()));

        // HealthcareAnalytics transitions
        List<TransitionEntity> healthcareAnalyticsTransitions = healthcareAnalyticsPlace.getTransitions();
        Assert.assertThat("Wrong the amount of transitions", 2, is(healthcareAnalyticsTransitions.size()));

        // EndWorkflow place
        PlaceEntity endWorkflowPlace1 = workflow.getStart().getTransitions().get(0).getTargets().get(0).getTransitions().get(0)
                .getTargets().get(0).getTransitions().get(0).getTargets().get(0);
        Assert.assertThat("Incorrect place name", "end.workflow.export", is(endWorkflowPlace1.getName()));

        String loopingPlaceName = workflow.getStart().getTransitions().get(0).getTargets().get(0).getTransitions().get(0)
                .getTargets().get(0).getTransitions().get(1).getTargets().get(0).getName();
        Assert.assertThat("Incorrect place name", "BloodPressureSensor", is(loopingPlaceName));
    }

}
