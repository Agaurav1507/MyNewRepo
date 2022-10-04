package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check4 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://techextensor.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//ul[@class='list list--primary']/li[5]/a")).click();
		
		for(int i=1;i<21;i++) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		}
		
		WebElement projectname1=driver.findElement(By.xpath("//div[@class='row sorting-container portfolio-layout aos-init aos-animate']/div[1]"));
		
		System.out.println(projectname1.getText());
		

	}

}
