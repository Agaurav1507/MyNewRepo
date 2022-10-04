package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac4 {

	public static void main(String[] args) {
             
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		Actions mouse=new Actions(chrome);
		
		chrome.get("https://www.flipkart.com/");
		
		chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		List<WebElement> mainmenu=chrome.findElements(By.cssSelector("._331-kn>div>div>div>a"));
		
		for(int i=0;i<mainmenu.size();i++) {
			
			mouse.moveToElement(mainmenu.get(i)).perform();
		}
	}

}
