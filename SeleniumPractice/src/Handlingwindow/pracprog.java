package Handlingwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.thirdparty.publicsuffix.PublicSuffixType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pracprog {
	
	public static void main(String[] args) {
		
	       WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://etrain.info/in");
	       
	       System.out.println(driver.getTitle());
	       
	       System.out.println("***************************************");
	       
	       driver.findElement(By.cssSelector(".icon-youtube")).click();
	       
	       String gethomewinid=driver.getWindowHandle();
	       
	       System.out.println(gethomewinid);
	       
	       System.out.println("***************************************");
	       
	       Set<String> allwinid=driver.getWindowHandles();
	       
	       allwinid.remove(gethomewinid);
	       
	       Iterator<String> itr=allwinid.iterator();
	       
	       String childwinid=itr.next();
	       
	       System.out.println(childwinid);
	       
	       System.out.println("****************************************");
	       
	       driver.switchTo().window(childwinid);
	       
	       System.out.println(driver.getTitle());
	       
	       driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in'][1]")).click();
	       
	       driver.close();
	       
	       driver.switchTo().window(gethomewinid);
	       
	       driver.quit();
	       
	       
	}

}
