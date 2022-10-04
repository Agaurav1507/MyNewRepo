package Handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revprog2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Actions act = new Actions(driver);

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(frame);

		List<WebElement> all = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		for(int i=0;i<7;i++) {
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		}

		for (int i = 0; i < all.size(); i++) {

			WebElement src = driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
			WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li[("+ (i+1) +")]"));

			act.dragAndDrop(src, dest).build().perform();

		}
		
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
