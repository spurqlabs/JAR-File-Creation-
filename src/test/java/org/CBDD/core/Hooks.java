package org.CBDD.core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.CBDD.utilities.WebUtil;

public class Hooks extends TestContext {
    @Before
    public void beforeScenario(Scenario scenario) {
        driver = WebUtil.initWebDriver();
    }
    @After
    public void afterScenario() {
        WebUtil.tearDown();
    }
}
