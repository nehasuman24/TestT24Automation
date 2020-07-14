package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AAArrangementActivityPage extends BasePage {

	public AAArrangementActivityPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[@title='Authorises a deal']")
	WebElement btnAuthoriseDeal;
	
	@FindBy(xpath = "//div[@id='processingPage' and contains(@style,'display: block')]")
	WebElement lblLoader;
	
	@FindBy(xpath = "//td[contains(text(),'Txn Complete')]")
	WebElement lblTxcCompleteMessage;
	
	public AAArrangementActivityPage authoriseDeal(){
		btnAuthoriseDeal.click();
		waitForNotVisible(lblLoader);
		waitForVisibilityOfElement(lblTxcCompleteMessage);
		return this;
	}
}
