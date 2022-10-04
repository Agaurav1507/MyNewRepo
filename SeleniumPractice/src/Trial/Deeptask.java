package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deeptask {

	public static void main(String[] args) {
          
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apptest-example.herokuapp.com/admin/login");
		
		driver.findElement(By.id("admin_user_email")).sendKeys("admin@example.com");
		
		driver.findElement(By.id("admin_user_password")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		driver.findElement(By.xpath("//a[text()='New Product']")).click();
		
		driver.findElement(By.cssSelector("#product_sku")).sendKeys("Iphone");
		
		driver.findElement(By.cssSelector("#product_description")).sendKeys("256GB,8GB");
		
		WebElement create=driver.findElement(By.xpath("//input[@value='Create Product']"));
		
		create.click();
		
		String actualtitle=driver.findElement(By.xpath("//fieldset[1]/ol/li/p")).getText();
		String expectedtitle="can't be blank";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title is Mandatory");
		}else {
			System.out.println("Title is not Mandatory");
		}
		
		WebElement title=driver.findElement(By.cssSelector("#product_title"));
		
		title.sendKeys("Just check weather title accepts more than 40 letters or not");
		
		String actuallenght=driver.findElement(By.xpath("//input[@type='text']")).getText();
		
		System.out.println(actuallenght);
		
//		String expectedlength="Just check weather title accepts more than 40 letters or not";
//		
//		if(actuallenght.equals(expectedlength)) {
//			System.out.println("Max Length is 40");
//		}else {
//			System.out.println("No limit");
//		}
	}
	

}
