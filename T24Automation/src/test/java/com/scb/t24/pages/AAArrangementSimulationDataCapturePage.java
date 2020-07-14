package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AAArrangementSimulationDataCapturePage extends BasePage {

	public AAArrangementSimulationDataCapturePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@id='fieldName:CUSTOMER']")
	WebElement txtCustomer;
	
	@FindBy(xpath = "//input[@id='fieldName:CURRENCY']")
	WebElement txtCurrency;
	
	@FindBy(xpath = "//a[@title='Validate a deal']")
	WebElement btnValidateaDeal;
	
	@FindBy(xpath = "//span[@id='disabled_ARRANGEMENT']")
	WebElement txtArrangement;
	
	@FindBy(xpath = "//a[text()='Commitment']")
	WebElement lnkCommitment;
	
	@FindBy(xpath = "//a[text()='Settlement Instructions']")
	WebElement lnkSettlementInstruction;
	
	@FindBy(xpath = "//input[@id='fieldName:AMOUNT']")
	WebElement txtAmount;
	
	@FindBy(xpath = "//input[contains(@id,'PAYIN.ACCOUNT')]")
	WebElement txtPayInAccount;
	
	@FindBy(xpath = "//input[contains(@id,'PAYIN.ACTIVITY')]")
	WebElement txtAccountDebitActivity;
	
	@FindBy(xpath = "//span[text()='Pay Out']")
	WebElement btnPayOut;
	
	@FindBy(xpath = "//input[contains(@id,'PAYOUT.ACCOUNT')]")
	WebElement txtPayOutAccount;
	
	@FindBy(xpath = "//input[contains(@id,'PAYOUT.ACTIVITY')]")
	WebElement txtAccountCreditActivity;
	
	@FindBy(xpath = "//a[@title='Commit the deal']")
	WebElement btnCommitDeal;
	
	@FindBy(xpath = "//a[text()='Accept Overrides']")
	WebElement lnkAcceptArrangements;
	
	@FindBy(xpath = "//select[contains(@id,'received Deposit Agreement')]")
	WebElement dpdReceivedDeposit;
	
	@FindBy(xpath = "//div[@id='processingPage' and contains(@style,'display: block')]")
	WebElement lblLoader;
	
	@FindBy(xpath = "//td[contains(text(),'Txn Complete')]")
	WebElement lblTxcCompleteMessage;
	
	public AAArrangementSimulationDataCapturePage captureCustomerandCurrency(String strCustomer, String strCurrency){
		txtCustomer.sendKeys(strCustomer);
		txtCurrency.sendKeys(strCurrency);
		return this;
	}
	
	public AAArrangementSimulationDataCapturePage validateaDeal(){
		btnValidateaDeal.click();
		waitForVisibilityOfElement(txtArrangement);
		return this;		
	}
	
	public AAArrangementSimulationDataCapturePage captureMandatoryFields(String strAmount, String strPayInAccount, String strAccountDebitActivity, String strPayOutAccount, String strAccountCreditActivity){
		lnkCommitment.click();
		txtAmount.sendKeys(strAmount);
		lnkSettlementInstruction.click();
		txtPayInAccount.sendKeys(strPayInAccount);
		txtAccountDebitActivity.sendKeys(strAccountDebitActivity);
		btnPayOut.click();
		txtPayOutAccount.sendKeys(strPayOutAccount);
		txtAccountCreditActivity.sendKeys(strAccountCreditActivity);
		return this;
	}
	
	public HomePage commitAndGetTransactionID(){
		strArrangementID = txtArrangement.getText().toString();
		System.out.println("Arrangement ID : " + strArrangementID);
		btnCommitDeal.click();
		waitForVisibilityOfElement(txtArrangement);
		if(lnkAcceptArrangements.isDisplayed() && dpdReceivedDeposit.isDisplayed()){
			Select optSelect = new Select(dpdReceivedDeposit);
			optSelect.selectByValue("RECEIVED");
			lnkAcceptArrangements.click();
		}else if(lnkAcceptArrangements.isDisplayed())
			lnkAcceptArrangements.click();
		//waitForNotVisible(lblLoader);
		waitForVisibilityOfElement(lblTxcCompleteMessage);
		driver.close();
		sleep(10000);
		switchToLastWindowWithSSLError();
		sleep(10000);
		driver.close();
		sleep(10000);
		switchToLastWindowWithSSLError();
		return new HomePage();
	}

}
