package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class Kitelogin extends seleniumutility {
	
	WebDriver driver;
	
	public Kitelogin(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="userid")
	
	private WebElement useridfield;
	
	@FindBy(id="password")
	
	private WebElement passwordfield;
	
	@FindBy(id="pin")
	
	private WebElement pinfield;
	
	@FindBy(css="button[class='button-orange wide']")
	
	private WebElement loginbutton;
	

	public WebElement getUseridfield() {
		return useridfield;
	}

	public void setUseridfield(WebElement useridfield) {
		this.useridfield = useridfield;
	}

	public WebElement getPassword() {
		return passwordfield;
	}

	public WebElement getPin() {
		return pinfield;
	}
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void login() {
		
		useridfield.sendKeys("LY6977");
		
		passwordfield.sendKeys("Agaurav1507#");
		
		clickonelement(loginbutton);
		
		pinfield.sendKeys("278954");
		
		
		clickonelement(loginbutton);
	}

}
