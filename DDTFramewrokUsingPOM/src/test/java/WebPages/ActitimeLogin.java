package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class ActitimeLogin extends seleniumutility {

	WebDriver driver;

	public ActitimeLogin(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")

	public WebElement userinputfield;

	@FindBy(name = "pwd")

	public WebElement passwordinputfield;

	@FindBy(css = "#loginButton")

	public WebElement loginbutton;

	public WebElement getUserinputfield() {
		return userinputfield;
	}

	public WebElement getPasswordinputfield() {
		return passwordinputfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	public void login(String username,String password) {
		
		typeinput(userinputfield,username);
		
		typeinput(passwordinputfield,password);
		
		clickonelement(loginbutton);
		
	}

}
