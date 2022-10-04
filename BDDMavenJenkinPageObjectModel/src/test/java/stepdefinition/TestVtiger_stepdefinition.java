package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.seleniumutility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestVtiger_stepdefinition extends seleniumutility {

	 WebDriver driver;
	String url = null;

	@Given("^User has a valid application URL$")
	public void user_has_a_valid_application_url()  {

		url = "https://demo.vtiger.com/vtigercrm/index.php";
	}

	@Given("^User has a valid application URL (.+)$")
	public void user_has_a_valid_application_url_something(String strArg1) {

		url = strArg1;

	}

	@When("^User hits a login page url$")
	public void user_hits_a_login_page_url() {

		driver = setup("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

	}

	 @Then("User should reach to login page with title {string}")
	public void user_should_reach_to_login_page_with_title_something(String strArg1) {

		Assert.assertEquals(getcurrenttitleofapp(), strArg1, "User not reached to login page");

		cleanup();

	}

	@Then("User should reach to home page with title {string}")
	public void user_should_reach_to_home_page_with_title_something(String strArg1) {

		Assert.assertEquals(getcurrenttitleofapp(), strArg1);

		cleanup();
	}

	@Then("User should remain in login page with title {string}")
	public void user_should_remain_in_login_page_with_title_something(String strArg1) {

		Assert.assertEquals(getcurrenttitleofapp(), strArg1);

		cleanup();

	}

	@And("Enter the username as {string}")
	public void enter_the_username_as_something(String strArg1) {

		driver.findElement(By.xpath("//input[@id='username']")).clear();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strArg1);

	}

	@And("Enter the password as {string}")
	public void enter_the_password_as_something(String strArg1) {

		driver.findElement(By.xpath("//input[@id='password']")).clear();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(strArg1);

	}
	
	@And("^Enter the username1 as (.+)$")
	public void enter_the_username1_as_something(String strArg1) {

		driver.findElement(By.xpath("//input[@id='username']")).clear();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strArg1);

	}

	@And("^Enter the password2 as (.+)$")
	public void enter_the_password2_as_something(String strArg1) {

		driver.findElement(By.xpath("//input[@id='password']")).clear();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(strArg1);

	}
	
	@Then("^User should remain in login page with title1 (.+)$")
	public void user_should_remain_in_login_page_with_title1(String strArg1) {

		Assert.assertEquals(getcurrenttitleofapp(), strArg1);

		cleanup();

	}
	
	

	@And("^Click on Signin button$")
	public void click_on_signin_button() {

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

	
}
