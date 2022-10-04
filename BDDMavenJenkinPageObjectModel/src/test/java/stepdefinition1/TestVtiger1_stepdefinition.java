package stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.seleniumutility;
import WebPages.Vtigerlogin1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestVtiger1_stepdefinition extends seleniumutility {

	WebDriver driver;

	String Url = null;

	Vtigerlogin1 getvtigerlogin;

	@Given("User has a valid application URL {string}")
	public void user_has_a_valip_application_url(String url) {

		getvtigerlogin = new Vtigerlogin1(driver);
		Url = url;

	}

	@When("User hits a login page url")
	public void user_hits_the_login_page_url() {

		driver = setup("chrome", Url);

	}

	@Then("User should reach to home page with title {string}")
	public void user_should_reach_to_home_page_with_title(String strArg1,String strArg2) {

		Assert.assertEquals(getcurrenttitleofapp(), strArg1);
		
		cleanup();
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as_admin(String name) {
		
		getvtigerlogin = new Vtigerlogin1(driver);

		driver.findElement(By.cssSelector("input[id='username']")).clear();

		getvtigerlogin.fillusername("admin");
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as_test123(String pass) {

		driver.findElement(By.cssSelector("input[id='password']")).clear();

		getvtigerlogin.fillpassword("Test@123");
	}

	@And("^Click on Signin button$")
	public void click_on_signin_button() {

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

}
