package Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 {
	
	@BeforeMethod
	
	public void openBrowser() {
		System.out.println("chrome browser is opened and url is entered");
	}
	
	@Test(priority=1)
	
	public void verifylogin() {
		System.out.println("Successfully login");
	}
	
	@AfterMethod
	
	public void closebrowser() {
		System.out.println("Browser instance is closed");
	}
	
	@Test(priority=2)
	
	public void createtask() {
		System.out.println("Task created successfully");
	}

}
