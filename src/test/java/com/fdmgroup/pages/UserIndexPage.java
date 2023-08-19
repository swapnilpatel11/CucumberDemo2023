package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIndexPage {
	public static WebElement usernameDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]"));
	}
	
	public static WebElement logoutLink(WebDriver driver) {
		return driver.findElement(By.id("logout_link"));
	}
	
}
