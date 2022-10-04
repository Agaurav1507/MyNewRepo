package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		features= {"src\\test\\resources\\Features\\Googlesearch.feature"},
		
		glue= {"stepdefinition"},
		
		plugin= {"html:target/cucumber-html-report20"},
				
		monochrome=true)

public class Testrunner extends AbstractTestNGCucumberTests {
	
	
}
		
		
		