package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositOverviewPage extends BasePage {

	public DepositOverviewPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//img[@alt='Select Drilldown']")
	WebElement btnApprove;
	
	public AAArrangementActivityPage navigateToAuthorisePage(){
		btnApprove.click();
		switchToLastWindowWithSSLError();
		return new AAArrangementActivityPage();
	}
}
