package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AAProductCatalogPage extends BasePage {

	public AAProductCatalogPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//td[text()='Term Deposits']//img[@alt='Expand group']")
	WebElement lnkTermDeposits;
	
	@FindBy(xpath = "//td[text()='3 Months Deposit']//following-sibling::td//a[@title='New Arrangement']")
	WebElement lnk3MonthsDeposit;
	
	public AAArrangementSimulationDataCapturePage navigateToAAArrangementSimulationDataCapture(){
		lnkTermDeposits.click();
		lnk3MonthsDeposit.click();
		switchToLastWindowWithSSLError();
		return new AAArrangementSimulationDataCapturePage();
	}

}
