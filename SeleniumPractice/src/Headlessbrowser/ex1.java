package Headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex1 {

	public static void main(String[] args) {
         
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		FirefoxOptions option=new FirefoxOptions();
		
		option.setHeadless(true);
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1=new FirefoxDriver(option);
		
		driver1.get("https://www.google.com/");
	}

}
