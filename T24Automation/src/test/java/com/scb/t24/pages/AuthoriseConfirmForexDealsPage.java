package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.scb.t24.utility.Reporter;

/**
 * @author dineshkumar.rc
 *
 */
public class AuthoriseConfirmForexDealsPage extends BasePage {

	public AuthoriseConfirmForexDealsPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[contains(@src,'../plaf/images/default/tools/select.gif')]")
	WebElement btnSearch;

	@FindBy(xpath = "//frame[contains(@src,'../jsps/')]")
	WebElement frameHeader;

	@FindBy(xpath = "//frame[contains(@id,'FRAME02')]")
	WebElement frameTable;

	@FindBy(xpath = "//*[@id='r1']/td[12]/a/img")
	WebElement btnAuthorize;

	@FindBy(xpath = "//table[@id='goButton']/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[5]")
	WebElement btnAuthorizeADeal;

	@FindBy(xpath = "//span[text()='Audit']")
	WebElement tabAudit;

	@FindBy(xpath = "//*[@id='tab5']/tbody/tr[3]/td[3]/span")
	WebElement txtRecordStatus;

	public TransactionsSearchPage clickSearchButton() {
		{
			maximizeBrowserWindow();
			switchToLastWindowWithSSLError();
			switchToFrameUsingElement(frameHeader);
			btnSearch.click();
			return new TransactionsSearchPage();
		}
	}

	public AuthoriseConfirmForexDealsPage clickAuthorizeButton() {
		{

			btnAuthorize.click();
			driver.switchTo().defaultContent();
			switchToFrameUsingElement(frameTable);
			tabAudit.click();
			String recordStatus = txtRecordStatus.getText();
			String expectedRecordStatus = "INAU";
			if (recordStatus.equalsIgnoreCase(expectedRecordStatus)) {
				System.out.println("Forex forward deal with the Transaction " + tranxId
						+ " created sucessfully and the status is " + recordStatus);
			} else {
				System.out.println("Forex forward deal not created properly");
			}

		}
		return new AuthoriseConfirmForexDealsPage();

	}

	public AuthoriseConfirmForexDealsPage clickAuthorizeADealButton() {

		driver.switchTo().defaultContent();
		switchToFrameUsingElement(frameTable);
		btnAuthorizeADeal.click();
		new GetTransactionIdStatusPage().getTransactionId();
		String expectedTransactionstatus = "A";
		if (statusOfTransaction.equalsIgnoreCase(expectedTransactionstatus)) {
			System.out.println("Forex forward deal with the Transaction " + tranxId
					+ " Authorised sucessfully and the status is " + statusOfTransaction);
		} else {
			System.out.println("Forex forward deal not Authorised properly");
		}

		return new AuthoriseConfirmForexDealsPage();
	}

}
