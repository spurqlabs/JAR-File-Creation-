package org.CBDD.core;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(features = "classpath:Features",
        glue = {"org.CBDD"})

public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
