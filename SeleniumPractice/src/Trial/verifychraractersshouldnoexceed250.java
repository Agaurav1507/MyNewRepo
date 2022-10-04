package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifychraractersshouldnoexceed250 {

	public static void main(String[] args) {
             
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		 
		// Locating firstname web element
		WebElement firstNameInputbox = driver.findElement(By.name("username"));
 
		/***************** Way 1 ********************************/
 
		// Type more than 10 characters as max limit is defined as 10 as per requirement
		 
		firstNameInputbox.sendKeys("hgjhgkshkjhsjdhcbjksdhckusdhcjks");
 
		// Get the typed value
		String typedValue = firstNameInputbox.getAttribute("value");
 
		// Get the length of typed value
		int size = typedValue.length();
 
		// Assert with expected
		if (size == 250) {
			System.out.println("Max character functionality is working fine.");
		}
 
		else {
			System.out.println("No limit is set.");
		}
 
		/************************ Way 2 ********************************************/
 
//		// Clear already typed value.
//		firstNameInputbox.clear();
//		;
// 
//		// Get maxlength attribute of input box
//		String maxLengthDefined = firstNameInputbox.getAttribute("maxlength");
// 
//		if (maxLengthDefined == null) {
//			System.out.println("No limit is set.");
//		}
// 
//		else {
//			if (maxLengthDefined.equals("10")) {
//				System.out.println("Max character limit is set as expected.");
//			}
//		}
// 
//		// Closing driver
//		driver.quit();
	}

}
