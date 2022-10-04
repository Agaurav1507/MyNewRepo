package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac5 {

	public static void main(String[] args) {

		
        WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		Actions mouse=new Actions(chrome);
		
		chrome.get("https://jqueryui.com/slider/");
		
		chrome.findElement(By.cssSelector("https://jqueryui.com/slider/")).click();
		
		WebElement scrollbar=chrome.findElement(By.cssSelector("https://jqueryui.com/slider/"));
		
		mouse.clickAndHold(scrollbar).perform();
		
		
	}

}
