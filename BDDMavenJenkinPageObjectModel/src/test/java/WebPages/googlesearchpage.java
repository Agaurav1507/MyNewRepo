package WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.seleniumutility;

public class googlesearchpage extends seleniumutility {

	WebDriver driver;

	public googlesearchpage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")

	private WebElement searchinputfield;

	public void searchtext(String texttobesearched) {

		typeinput(searchinputfield, texttobesearched);

		getactiveelement().sendKeys(Keys.ENTER);
	}

	public String searchresultpagetitle() {

		return driver.getTitle();

	}

	public void closebrowser() {

		driver.close();
	}

}
