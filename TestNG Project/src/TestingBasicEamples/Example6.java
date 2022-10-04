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

public class Example6 {
	
@Test
	
	public void loginLogoutInActitimeApplication() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://demo.actitime.com/login.do");
		
		System.out.println("Before login page title = "+chrome.getTitle());
		
		// validation using TestNG
		
		Assert.assertEquals(chrome.getTitle(), "actiTIME - Login");
		
		             //or
		
		//Assert.assertEquals(chrome.getTitle(), "actiTIME -Login", "Either login page not opened or title got changed");
		
		// identify the required element from the UI and perform required action 0-30
		
		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = chrome.findElement(By.id("username"));
		
		usernameInputField.sendKeys("admin");
		
		// identify the required element from the UI and perform required action 0-30
		
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		
		// identify the required element from the UI and perform reqiored action
		
		chrome.findElement(By.id("loginButton")).click(); // 0-30
		
		Thread.sleep(2000);
		
		WebElement logoutBtn = chrome.findElement(By.linkText("Logout"));
		
		//give explicite wait
		
		WebDriverWait wait=new WebDriverWait(chrome,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
		
		System.out.println("After login page get title = "+chrome.getTitle());

		
	}
	
	@Test
	
	public void loginPageValidationInActitimeApplication() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://demo.actitime.com/login.do");
		
		chrome.findElement(By.name("username")).sendKeys("admin");
		
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement login=chrome.findElement(By.id("loginButton"));
		
		login.click();
		
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//give implicite wait
		
		WebElement logout=chrome.findElement(By.className("logout"));
		
		WebDriverWait wait=new WebDriverWait(chrome,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		
		//validate
		
		Assert.assertEquals(chrome.getTitle(), "actiTIME - Enter Time-Track", "title does not match");
		
		System.out.println(chrome.getTitle());
		
	}

}
