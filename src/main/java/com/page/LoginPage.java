package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	//1. By Locators to be created
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	//2.Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//3. page actions : features(behaviour) of the page the form of methods
	// there are no assertions in the page class . assertions are there in step definition claa
	//stepdefinition should not contain the page methods  or By locator .
	
	public String  getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isFwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
			}
	
	public void enterPassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
			}
	
	public void clickOnlogin() {
		driver.findElement(signInButton).click();
			}
	
	
}
