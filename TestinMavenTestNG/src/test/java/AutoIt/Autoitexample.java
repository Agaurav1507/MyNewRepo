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

public class Autoitexample {

	@Test

	public void testcase() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;


		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
		WebElement button= driver.findElement(By.xpath("//div[h2[text()='UploadFile']]/div[1]/form/input"));

		js.executeAsyncScript("arguments[0].click();", button);
		
		Runtime.getRuntime().exec("F:\\AUTOMATIONCLASSES\\AutoItFiles\\Myautoitfile.exe");
	}

}
