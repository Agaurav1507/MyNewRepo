package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.seleniumutility;

public class Vtigerlogin1 extends seleniumutility{
	
	WebDriver driver;
	
	public Vtigerlogin1(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id='username']")
	
	private WebElement usernamefield;
	
	@FindBy(css="input[id='password']")
	
	private WebElement passwordfield;
	
	@FindBy(xpath="//button[text()='Sign in']")
	
	private WebElement loginbutton;

	public WebElement getUsenamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	public void fillusername(String username) {
		
		typeinput(usernamefield,username);
		
	}
	
	public void fillpassword(String password) {
		typeinput(passwordfield,password);
	}
	
	public void clickloginbutton() {
		
		loginbutton.click();
	}

}
