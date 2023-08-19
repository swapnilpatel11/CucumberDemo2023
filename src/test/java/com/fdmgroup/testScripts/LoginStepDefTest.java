package com.fdmgroup.testScripts;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import java.time.Duration;


public class LoginStepDefTest {
	
	DriverUtilities driverUtilities;
	WebDriver driver;

	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
	    driverUtilities = DriverUtilities.getInstance();
	    driver = driverUtilities.getDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	}

	@When("User open the Zero Banking Application")
	public void user_open_the_zero_banking_application() {
		driver.manage().window().maximize();
	    driver.get(DataFile.homeURL);
	}

	@Then("Signin button should be displayed")
	public void signin_button_should_be_displayed() {
	    assertTrue(HomePage.signInButton(driver).isDisplayed());
	}

	@Given("click Signin button on home page of application")
	public void click_signin_button_on_home_page_of_application() {
	    HomePage.signInButton(driver).click();
	    assertEquals(DataFile.loginPageHeader,LoginPage.loginPageHeader(driver).getText());
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
	    LoginPage.usernamrField(driver).sendKeys(DataFile.usr);
	    LoginPage.passwordField(driver).sendKeys(DataFile.psw);
	}

	@When("User click on Signin button")
	public void user_click_on_signin_button() {
	   LoginPage.signInButton(driver).click();
	   driver.navigate().back();
	}

	@Then("User should be redirected to the home page of user")
	public void user_should_be_redirected_to_the_home_page_of_user() {
	    assertEquals(DataFile.usr,UserIndexPage.usernameDropdown(driver).getText());
	}




}
