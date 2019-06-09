package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Sailesh\\eclipse-workspace\\BDDBasics\\src\\Features\\TestSuite01.feature"}, glue= {"StepDefinitions"})

public class TestRunner {

	}

