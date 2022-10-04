package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSEprog1 {
	
	@Test
	
	public void testcase() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gsmarena.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		WebElement samsung=driver.findElement(By.xpath("//a[text()='Samsung']"));
		
		jse.executeScript("arguments[0].click();", samsung);
		
		String title=jse.executeScript("return document.title;").toString();
		
		System.out.println(title);
		
		//to perform scroll
		
		jse.executeScript("window.scrollBy(0,500)");
		
		//jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
