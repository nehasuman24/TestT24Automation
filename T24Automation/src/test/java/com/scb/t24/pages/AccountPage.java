		 package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
	public AccountPage() {
		super(driver);
	}
	@FindBy(xpath = "//*[@title='New Deal']")
	WebElement lnkNewDeal;
	@FindBy(xpath = "//a[text()='Continue to this website (not recommended).']")
			WebElement lnkexception;
	
	public ClickAccountNewDeal openNewDeal() {
		switchToLastWindowWithSSLError();
		//waitForVisibilityOfElement(lnkexception);
		try{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if(lnkexception.isDisplayed()){
			sleep(2000);
		driver.manage().window().maximize();
		acceptSSLError();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		lnkNewDeal.click();

		return new ClickAccountNewDeal();
	}
}
