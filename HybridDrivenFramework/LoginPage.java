package com.Framework.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	String url = "https://www.login.hiox.com/login?referrer=easycalculation.com";

	// Create Constructor
	public LoginPage(WebDriver driver) { 
			this.driver = driver;
			 
		}

	@FindBy(id = "log_email")
	WebElement email;

	@FindBy(name = "log_password")
	WebElement password;

	@FindBy(xpath = "//input[@name='log_submit']")
	WebElement loginbtn;

	public void Login_EasyCal(String name, String pass) {
		email.sendKeys(name);
		password.sendKeys(pass);
		loginbtn.click();

	}
}
