/**
 * 
 */
package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author dineshkumar.rc
 *
 */
public class CaptureForwardDealsDetailPage extends BasePage {

	public CaptureForwardDealsDetailPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='fieldName:COUNTERPARTY']")
	WebElement txtCounterParty;

	@FindBy(xpath = "//input[@id='fieldName:DEALER.DESK']")
	WebElement txtDealerDesk;

	@FindBy(xpath = "//input[@id='fieldName:CURRENCY.BOUGHT']")
	WebElement txtCurrencyBought;

	@FindBy(xpath = "//input[@id='fieldName:CURRENCY.SOLD']")
	WebElement txtCurrencySold;

	@FindBy(xpath = "//input[@id='fieldName:AMOUNT.BOUGHT']")
	WebElement txtAmountBought;

	@FindBy(xpath = "//input[@id='fieldName:VALUE.DATE.BUY']")
	WebElement txtValueDateBuy;

	@FindBy(xpath = "//input[@id='fieldName:AMOUNT.SOLD']")
	WebElement txtAmountSold;

	@FindBy(xpath = "//input[@id='fieldName:VALUE.DATE.SELL']")
	WebElement txtValueDateSell;

	@FindBy(xpath = "//a[@title='Commit the deal']")
	WebElement btnCommitDeal;

	@FindBy(xpath = "//a[text()='Accept Overrides']")
	WebElement lnkAcceptOverrides;

	@FindBy(xpath = "//frame[contains(@src,'../jsps/enqrequest.jsp')]")
	WebElement frameTable;

	public CaptureForwardDealsDetailPage enterMandatoryFields(String strCounterParty, String strDealerDesk,
			String strCurrencyBought, String strAmountBought, String strValueDateBuy, String strCurrencySold,
			String strAmountSold, String strValueDateSell) {
		maximizeBrowserWindow();
		explicitWait(txtCounterParty);
		txtCounterParty.sendKeys(strCounterParty);
		txtDealerDesk.click();
		closeLastBrowserWindow();
		switchToFrameUsingElement(frameTable);
		txtDealerDesk.sendKeys(strDealerDesk);
		txtCurrencyBought.sendKeys(strCurrencyBought);
		txtAmountBought.sendKeys(strAmountBought);
		txtValueDateBuy.sendKeys(strValueDateBuy);
		txtCurrencySold.sendKeys(strCurrencySold);
		txtAmountSold.sendKeys(strAmountSold);
		txtValueDateSell.sendKeys(strValueDateSell);

		return new CaptureForwardDealsDetailPage();
	}

	public GetTransactionIdStatusPage CommitForexForwardDeal() {
		btnCommitDeal.click();
		waitForVisibilityOfElement(lnkAcceptOverrides);
		lnkAcceptOverrides.click();
		return new GetTransactionIdStatusPage();

	}

}
