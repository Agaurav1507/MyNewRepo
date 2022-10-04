package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {

	@BeforeMethod
	
	public void enterappurl() {
		                                                                 //browser is open
		System.out.println("app url is entered");   
		
		//url entered
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		
		option.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
	}                                                                    //succ login
	                                                                     //logout success
	@Test(priority=1)                                                    //url enterd
	                                                                     //task created success
	public void verifylogin() {                                          //logout success
		System.out.println("successfully login");                        //browser is closed
	}
	
	@AfterMethod
	
	public void logout() {
		System.out.println("logout succesfull");
	}
	
	@Test(priority=2)
	
	public void createtask() {
		System.out.println("Task created successfully");
	}
	
	@BeforeTest
	
	public void openBrowser() {
		
		System.out.println("Browser is opened");
	}
	
	@AfterTest
	
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
		
	
}
