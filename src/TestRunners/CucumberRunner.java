package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
glue = "Test", plugin = {
		"json:target/cucumber/cucumber.json",
		"pretty:target/cucumber/cucumber-pretty.json",
		"junit:target/cucumber/cucumber-result.xml"})

public class CucumberRunner {

}
