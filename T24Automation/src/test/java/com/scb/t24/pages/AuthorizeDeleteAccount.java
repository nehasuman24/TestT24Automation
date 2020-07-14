package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizeDeleteAccount extends BasePage{
	public AuthorizeDeleteAccount() {
		super(driver);
		
	}
   
	@FindBy(xpath ="//td[@class='message']")
	WebElement lblConfirmationMsg;
	 @FindBy(xpath ="//a[@title='Authorise']")
	 WebElement btnAuthorize;
	 @FindBy(xpath ="//a[@title='Authorises a deal']")
	 WebElement btnAuthorizeDeal;
	 public static String tranxId;
		public static String statusOfTransaction;
	 public AuthorizeDeleteAccount doAuthorize()
	 {
		 btnAuthorize.click();
		 btnAuthorizeDeal.click();
			
			
		 //GetTransactionIdStatusPage transactionStatus = new GetTransactionIdStatusPage();
			//transactionStatus.getTransactionId();
		 String ds =lblConfirmationMsg.getText();
			statusOfTransaction = ds.substring(ds.length()-1);
			
			String[] dd = ds.split(":");
			String fullID = dd[1];
			String[] tranIDs = fullID.split(" ");
			tranxId =tranIDs[1];
			System.out.println("Transaction "+tranxId+" completed sucessfully and the status is "+statusOfTransaction);
			
			//System.out.println("for i value"+i+", Account number is "+transactionStatus.tranxId);
	       return this;
		 
	 }
}
