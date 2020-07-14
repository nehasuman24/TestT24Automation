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
public class AuthoriseDeleteMMTransactionsPage extends BasePage{

	public AuthoriseDeleteMMTransactionsPage() {
		super(driver);
	}
	
	@FindBy(xpath="//img[contains(@src,'../plaf/images/default/tools/select.gif')]")
	WebElement btnSearch;
	
	@FindBy(xpath= "//frame[contains(@src,'../jsps/')]")
	WebElement frameHeader;
	
	@FindBy(xpath= "//frame[contains(@src,'../html/product/blank.htm')]")
	WebElement frameTable;
	
	@FindBy(xpath ="//table[@id='datadisplay']/tbody/tr[1]/td[11]")
	WebElement btnAuthorize;
	
	@FindBy(xpath ="//table[@id='goButton']/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[5]")
	WebElement btnAuthorizeADeal;
	
	@FindBy(xpath = "//span[text()='Audit']")
	WebElement tabAudit;

	@FindBy(xpath = "//*[@id='tab5']/tbody/tr[3]/td[3]/span")
	WebElement txtRecordStatus;
	
	public TransactionsSearchPage clickSearchButton(){
		switchToFrameUsingElement(frameHeader);
		btnSearch.click();
		return new TransactionsSearchPage();
	}
	
	public AuthoriseDeleteMMTransactionsPage clickAuthorizeButton(){
		btnAuthorize.click();
		tabAudit.click();
		String recordStatus = txtRecordStatus.getText();
		if (recordStatus == "INAU") {
			System.out.println("Call contracts with the Transaction " + tranxId
					+ " created sucessfully and the status is " + recordStatus);
		} else {
			System.out.println("Forex forward deal not created properly");
		}
		return new AuthoriseDeleteMMTransactionsPage();
	}
	
	public AuthoriseDeleteMMTransactionsPage clickAuthorizeADealButton(){
		driver.switchTo().defaultContent();
		switchToFrameUsingElement(frameTable);
		btnAuthorizeADeal.click();
		
		if (statusOfTransaction == "A") {
			System.out.println("Money market Call contracts with the Transaction " + tranxId
					+ " Authorised sucessfully and the status is " + statusOfTransaction);
		} else {
			System.out.println("Money marker Call contracts not Authorised properly");
		}
		return new AuthoriseDeleteMMTransactionsPage();
	}
	
}
