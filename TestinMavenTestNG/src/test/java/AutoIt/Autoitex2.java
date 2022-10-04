package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoitex2 {
	
	@Test
	
	public void testcase() throws IOException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://pdfhost.io/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
		
		driver.findElement(By.xpath("//div[@class='FileUpload-dropzone']/div/div[3]")).click();
		
	//	jse.executeAsyncScript("arguments[0].click();", upload);
	
		
		Runtime.getRuntime().exec("F:\\AUTOMATIONCLASSES\\AutoItFiles\\trial.exe");
		
	}

}
