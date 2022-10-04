package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utilities.seleniumutility;
import WebPages.googlesearchpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGoogleSearch_stepdefinition extends seleniumutility {

	static WebDriver driver;

	@Given("^User is already in google search page$")
	public void user_is_already_in_google_search_page()  {

		driver = setup("chrome", "https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("User types {string} in search input field and clicks on search button")
	public void user_types_selenium_interview_questions_in_search_input_field_and_clicks_on_search_button(String name) {

		driver.findElement(By.name("q")).sendKeys(name);

		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}

	@Then("user gets search result page with the title {string}")
	public void user_gets_search_result_page_with_the_title_selenium_interview_questions_google_search(String title) {

		Assert.assertEquals(driver.getTitle(), title);

	}

	@When("^User types (.+) in search input field and clicks on search button$")
	public void user_types_in_search_input_field_and_clicks_on_search_button(String texttobesearched) {

		driver.findElement(By.name("q")).sendKeys(texttobesearched);

		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}

	@Then("^user reached to search result page with the title (.+)$")
	public void user_reached_to_search_result_page_with_the_title(String expectedtitle) {

		Assert.assertEquals(driver.getTitle(), expectedtitle);

	}

	@And("^Close the opened browser$")
	public void close_the_opened_browser() throws Throwable {

		driver.close();

	}

}
