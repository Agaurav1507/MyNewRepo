package Trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver chrome = new ChromeDriver();

		chrome.get("https://www.flipkart.com/");

		chrome.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		Actions mouse = new Actions(chrome);

		// identify the mainmenu

		List<WebElement> mainmenu = chrome.findElements(By.cssSelector("._331-kn>div>div>div>a"));

		System.out.println("mainmenu counts are = " + mainmenu.size());

		// identify submenu

		for (int i = 0; i < mainmenu.size(); i++) {

			System.out.println("********************" + mainmenu.get(i).getText() + "***********************");

			mouse.moveToElement(mainmenu.get(i)).perform();

			List<WebElement> submenu = chrome
					.findElements(By.cssSelector(".ZEl_b_ >div:nth-child(2)>div>div>div:nth-child(1)>a"));

			if (submenu.size() > 0) {

				for (int j = 0; j < submenu.size(); j++) {

					System.out.println("********************" + submenu.get(j).getText() + "************************");
					
					mouse.moveToElement(submenu.get(i)).perform();
					
					Thread.sleep(2000);

					List<WebElement> submenu2 = chrome
							.findElements(By.cssSelector(".ZEl_b_ >div:nth-of-type(2)>div>div>div:nth-of-type(2)>a"));

					if (submenu2.size() > 0) {

						for (int k = 0; k < submenu2.size(); k++) {

							System.out.println(submenu2.get(k).getText());
						}
					}

					else {
						System.out.println("no subsubmenu");
					}
				}
			} else {
				System.out.println("No submenu");
			}
		}

	}

}
