package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions ( 
		
		features= {"src\\test\\resources\\Features\\Vtiger1.feature"},
		glue= {"stepdefinition1"},
		plugin= {"html:target/cucumber-html-report5"},
		monochrome=true
		)



public class Vtiger1runner extends AbstractTestNGCucumberTests {

}
