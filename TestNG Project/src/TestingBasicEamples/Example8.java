package TestingBasicEamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example8 {

	@Test
	
	public void windowhandling() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://etrain.info/in");
		
		String homepageid=chrome.getWindowHandle();
		
		System.out.println("home page id is :-" +homepageid);
		
		chrome.findElement(By.cssSelector(".icon-youtube")).click();
		
		Set<String> allwinid=chrome.getWindowHandles();
		
		System.out.println("all win id :-" +allwinid);
		
		
		Iterator<String> itr=allwinid.iterator();
		
		String homewinid=itr.next();
		
		String childwinid=itr.next();
		
		System.out.println("homepage id is = "+homewinid);
		
		System.out.println("childpage id is = "+childwinid);
		
		chrome.switchTo().window(childwinid);
		
		System.out.println("child win title is = "+chrome.getTitle());
		
		System.out.println("child win url is = "+chrome.getCurrentUrl());
		
		chrome.close();
		
		chrome.switchTo().window(homewinid);
		
		System.out.println("main window title is = "+chrome.getTitle() );
		System.out.println("main win url is = "+chrome.getCurrentUrl());
		
		
		
		
		
		
		
		
	}

}
