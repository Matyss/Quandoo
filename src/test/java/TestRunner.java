import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/resources/features"}, glue = "stepdefs")
public class TestRunner extends AbstractTestNGCucumberTests {

}
