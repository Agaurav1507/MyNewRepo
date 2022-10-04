package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = {"src\\test\\resources\\Features\\Vtigerlogin.feature" },

		glue = { "stepdefinition" },

		plugin = ("html:target/cucumber-html-report10"),

		monochrome = true)

public class Mygstestrunner extends AbstractTestNGCucumberTests {
	
	

}
