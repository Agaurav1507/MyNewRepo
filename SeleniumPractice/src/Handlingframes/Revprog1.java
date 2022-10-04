package Handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revprog1 {

	public static void main(String[] args) {
                
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		Actions act=new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		List<WebElement> all=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		for(int i=1;i<all.size();i++) {
		
		WebElement src=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
		WebElement dest=driver.findElement(By.xpath("//ul[@id='sortable']/li[+(i+1)+]"));
		
		act.dragAndDrop(src, dest).build().perform();
		
		}
		driver.close();
	}

}
