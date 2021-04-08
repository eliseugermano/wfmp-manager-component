package br.health.workflow.dsl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class HealthWfMSWalkerTest {

    @Before
    public void initMocks() {

    }

    @Test
    public void registerTest() {
        Assert.assertThat("Error", 1, is(1));
    }

}
