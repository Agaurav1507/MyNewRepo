package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.seleniumutility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testacti_stepdefinition extends seleniumutility {

	static WebDriver driver;
	
	String Username = null;
	String Password = null;

	@Given("^User is already having application URL$")
	public void user_is_already_having_application_url() {

		driver = setup("chrome", "https://demo.actitime.com/login.do");

	}

	@Given("^User is already having application URL as (.+)$")
	public void user_is_already_having_application_url_as(String url) {

		driver=setup("chrome",url);

	}

	@When("user enter the username {string} and password {string}")
	public void user_enter_the_username_admin_and_password_manager(String username, String password) {

		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("pwd")).sendKeys(password);

	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() {

		driver.findElement(By.name("username")).sendKeys(Username);

		driver.findElement(By.name("pwd")).sendKeys(Password);

	}

	@And("^also having username as (.+) and password as (.+) for the application$")
	public void also_having_username_as_and_password_as_for_the_application(String username, String password) {

		Username = username;
		Password = password;

	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {

		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		setsleeptime(3000);

	}

	@Then("^Actitime home page will be displayed with the application title as (.+)$")
	public void actitime_home_page_will_be_displayed_with_the_application_title_as(String title) {

		Assert.assertEquals(getcurrenttitleofapp(), title);

	}

	@Then("Actitime home page will be displayed as {string}")
	public void actitime_home_page_will_be_displayed_(String title) {

		String actualtitle = driver.getTitle();

		Assert.assertEquals(actualtitle, title);

	}

	@And("^close the browser$")
	public void close_the_browser() {

		driver.close();

	}

}
