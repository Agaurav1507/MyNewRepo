package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	
	public void checkfunctionality() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://techextensor.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//ul[@class='list list--primary']/li[5]/a")).click();
		
		for(int i=1;i<21;i++) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		}
		
		WebElement projectname1=driver.findElement(By.xpath("//div[@class='row sorting-container portfolio-layout aos-init aos-animate']/div[1]/div/a/div/div/div[@class='expand']/*[1]"));
		
		System.out.println(projectname1.getText());
		
//   	List<WebElement> projects=driver.findElements(By.xpath("//div[@id='clients-grid']/div"));
    

//		for(int i=1;i<projects.size();i++) {
//			
//			WebElement projectname=driver.findElement(By.xpath("//div[@id='clients-grid']/div["+(i)+"]/div/a/div/div/div[@class='expand']/h5"));
//			
//			System.out.println(projectname.getText());
//		}
	}

}
