package com.fdmgroup.testScripts;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefTest {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@Given("User click the username dropdown")
	public void user_click_the_username_dropdown() {
	    UserIndexPage.usernameDropdown(driver).click();
	}

	@When("User click the LogOut button")
	public void user_click_the_log_out_button() {
	    UserIndexPage.logoutLink(driver).click();
	}

	@Then("User should be redirect to the home page of zero banking application")
	public void user_should_be_redirect_to_the_home_page_of_zero_banking_application() {
	    assertTrue(HomePage.signInButton(driver).isDisplayed());
	}

}
