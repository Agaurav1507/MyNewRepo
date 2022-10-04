import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printalllinksinawebpage {

	public static void main(String[] args) {
            
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText()+ " - " + list.get(i).getAttribute("href"));
		}
		
		
	}

}
