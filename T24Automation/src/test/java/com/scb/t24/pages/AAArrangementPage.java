package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AAArrangementPage extends BasePage {

	public AAArrangementPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//span[text()='Unauthorised']")
	WebElement btnUnauthorised;
	
	@FindBy(xpath = "//label[contains(.,'Arrangement')]/../..//following-sibling::td//input[@type='text']")
	WebElement txtArrangement;
	
	@FindBy(xpath = "//a[@title='Run Selection']")
	WebElement btnFind;
	
	@FindBy(xpath = "//span[contains(text(),'Results')]")
	WebElement lblResult;
	
	@FindBy(xpath = "//img[@title='Overview']")
	WebElement btnOverview;
	
	public AAArrangementPage navigateToUnauthorisedTab(){
		btnUnauthorised.click();
		return this;
	}
	
	public DepositOverviewPage dealAuthorisation(){
		System.out.println("Arrangement ID : " + strArrangementID);
		txtArrangement.clear();
		txtArrangement.sendKeys(strArrangementID);
		btnFind.click();
		waitForVisibilityOfElement(lblResult);
		btnOverview.click();
		switchToLastWindowWithSSLError();
		return new DepositOverviewPage();
	}
	
	
}
