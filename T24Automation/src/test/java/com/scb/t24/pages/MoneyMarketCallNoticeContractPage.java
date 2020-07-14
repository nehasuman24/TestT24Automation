package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoneyMarketCallNoticeContractPage extends BasePage {

	public MoneyMarketCallNoticeContractPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='fieldName:DEALER.DESK']")
	WebElement txtDealerDesk;

	@FindBy(xpath = "//input[@id='fieldName:CUSTOMER.ID']")
	WebElement txtCounterParty;

	@FindBy(xpath = "//input[@id='fieldName:CURRENCY']")
	WebElement txtCurrency;

	@FindBy(xpath = "//input[@id='fieldName:PRINCIPAL']")
	WebElement txtAmount;

	@FindBy(xpath = "//input[@id='fieldName:MATURITY.DATE']")
	WebElement txtNoticeDays;

	@FindBy(xpath = "//input[@id='fieldName:INTEREST.RATE']")
	WebElement txtInterestRate;

	@FindBy(xpath = "//img[@title='Frequency Control']")
	WebElement drpdwnFreqCtrl;

	@FindBy(xpath = "//img[@title='Save']")
	WebElement drpdwnFreqCtrlSave;

	@FindBy(xpath = "//img[@title='Validate a deal']")
	WebElement txtValidateDeal;

	@FindBy(xpath = "//img[@title='Commit the deal']")
	WebElement btnCommitDeal;

	@FindBy(id = "errorImg")
	WebElement lnkAcceptOverrideWrng;

	public MoneyMarketCallNoticeContractPage enterMandatoryFields() {

		maximizeBrowserWindow();
		txtDealerDesk.sendKeys("01");
		txtCounterParty.sendKeys("100472");
		txtCurrency.click();
		closeLastBrowserWindow();
		txtCurrency.sendKeys("USD");
		txtAmount.sendKeys("1000");
		txtNoticeDays.sendKeys("10");
		txtInterestRate.click();
		waitForVisibilityOfElement(txtInterestRate);
		txtInterestRate.sendKeys("10");
		drpdwnFreqCtrl.click();
		drpdwnFreqCtrlSave.click();

		return this;
	}

	public GetTransactionIdStatusPage clickCommitContract() {
		btnCommitDeal.click();
		waitForVisibilityOfElement(lnkAcceptOverrideWrng);
		lnkAcceptOverrideWrng.click();
		return new GetTransactionIdStatusPage();
	}
}
