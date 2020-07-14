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
public class TransactionsSearchPage extends BasePage {

	/**
	 * @param remoteWebDriver
	 */
	public TransactionsSearchPage() {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='value:1:1:1']")
	WebElement txtTransactionRef;

	@FindBy(xpath = "//input[@id='defaultButton']")
	WebElement btnFind;

	public TransactionsSearchPage searchTransactionId() {

		txtTransactionRef.sendKeys(GetTransactionIdStatusPage.tranxId);

		btnFind.click();
		return new TransactionsSearchPage();
	}

}
