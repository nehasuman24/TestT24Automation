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
public class GetTransactionIdStatusPage extends BasePage{

	public GetTransactionIdStatusPage() {
		super(driver);
	}
	
	@FindBy(xpath ="//td[@class='message']")
	WebElement lblConfirmationMsg;
	
	public GetTransactionIdStatusPage getTransactionId(){
		String ds =lblConfirmationMsg.getText();
		
		statusOfTransaction = ds.substring(ds.length()-1);
		
		String[] dd = ds.split(":");
		String fullID = dd[1];
		String[] tranIDs = fullID.split(" ");
		tranxId =tranIDs[1];
		return new GetTransactionIdStatusPage();
	}
	
	
}
