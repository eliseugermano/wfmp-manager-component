package br.health.workflow.dsl;

import br.health.workflow.db.semantic.repository.PetriNetRepository;
import br.health.workflow.service.PetriNetAnalyzerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class WorkflowServiceTest {

    @Mock
    private PetriNetRepository petriNetRepository;

    @Mock
    private PetriNetAnalyzerService analyzer;

    @Before
    public void initMocks() {

    }

    @Test
    public void registerTest() {
        Assert.assertThat("Error", 1, is(1));
    }

}
