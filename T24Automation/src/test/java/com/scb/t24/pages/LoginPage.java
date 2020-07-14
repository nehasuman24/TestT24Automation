package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='signOnName']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='sign-in']")
	WebElement btnSignIn;

	@FindBy(xpath = "//a[@title='Sign off']")
	WebElement btnSignOff;

	/**
	 * 
	 * @return
	 */
	public HomePage loginToApplication(String strUserName, String strPassword) {
		try {
			txtUserName.sendKeys(strUserName);
			txtPassword.sendKeys(strPassword);
			btnSignIn.click();
		} finally {

		}

		return new HomePage();
	}

	public HomePage loginToApplicationWithSecondUser(String strUserName2, String strPassword2) {
		try {
			txtUserName.sendKeys(strUserName2);
			txtPassword.sendKeys(strPassword2);
			btnSignIn.click();
		} finally {

		}

		return new HomePage();
	}

	public HomePage LogOff() {
		try {

			btnSignOff.click();
		} finally {

		}

		return new HomePage();
	}
}
