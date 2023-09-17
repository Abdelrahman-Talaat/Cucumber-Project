package CucumberTestRunner;


import BaseTest.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/login.feature",glue = {"StepDefinitions", "BaseTest"})
public class TestRunner extends BaseTest {
}
