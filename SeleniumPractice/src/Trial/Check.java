package Trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

//		WebDriver chrome = new ChromeDriver();
//
//		chrome.get("https://www.facebook.com/");
//		
//		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
////		chrome.findElement(By.xpath("//a[text()='Phones']")).click();
////		
////		List<WebElement> phonemenu=chrome.findElements(By.cssSelector(".col-lg-9>div>div"));
////		
////		System.out.println(phonemenu.size());
////		
////		for(int i=0;i<phonemenu.size();i++) {
////			
////			System.out.println(phonemenu.get(i).getText());
////		}
////      
//		chrome.findElement(By.xpath("//input[@id='email']")).sendKeys("gaurav.agrawal");
		
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
	}
	
	
	
	

}
