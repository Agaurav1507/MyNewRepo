package TestingBasicEamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example7 {

    @Test
	
	public void loginPageValidationInActitimeApplication() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://demo.actitime.com/login.do");
		
		WebElement username=chrome.findElement(By.name("username"));
		
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(username.isEnabled(), "Username input field field is not functional");
		Assert.assertEquals(username.getAttribute("placeholder"), "Username" , "username input field placeholder name is changed");
		
		//identify remember checkbox
		
		WebElement checkbox=chrome.findElement(By.id("keepLoggedInCheckBox"));
		
		Assert.assertTrue(checkbox.isDisplayed());
		Assert.assertTrue(checkbox.isEnabled(), "checkbox is not functional");
		Assert.assertFalse(checkbox.isSelected(), "checkbox is bydefault selected");
		
		checkbox.click();
		
		Assert.assertTrue(checkbox.isSelected(), "checkbox is not functional");
		
		
	}
    
    
	
}
