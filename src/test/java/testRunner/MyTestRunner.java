package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//This is test runner file using JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/Appfeatures"},
	glue = {"stepDefinitions", "appHooks"},
	plugin = {"pretty"}
)	


public class MyTestRunner {

}
