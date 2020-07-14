package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHistoryFilePage extends BasePage {


	public SearchHistoryFilePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txncompletemessage;

	@FindBy(xpath ="//select[contains(@id,'moreactions')]") 
	WebElement SearchHistory;

	@FindBy(xpath ="//img[@title='Go']")
	WebElement BtnTick;

	@FindBy(xpath ="//input[@id='value:1:1:1']")
	WebElement txtIdValue;

	@FindBy(xpath ="//input[@id='defaultButton']")
	WebElement btnFind;

	@FindBy(xpath ="//div[@id='enquiryDataSizer']//img")
	WebElement SearchICon;

	@FindBy(xpath ="//*[@id='tab1']/tbody/tr[20]/td[3]/span")//locator need to check
	WebElement TransactionID;
	/**
	 * 
	 * @param strSearchHistory 
	 * @return
	 */
	public SearchHistoryFilePage  SearchHistory(String strSearchHistory) {
		try {
			driver.manage().window().maximize();
			String message=txncompletemessage.getText();
			IdMessage=message.substring(14,32);
			System.out.println(IdMessage);
			Select se=new Select(SearchHistory);
			se.selectByVisibleText(strSearchHistory);
			BtnTick.click();	
		} finally {

		}

		return new SearchHistoryFilePage();
	}
	/**
	 * 
	 * @return
	 */
	public SearchHistoryFilePage SearchWithId() {
		try {
			switchToLastWindowWithSSLError();
			driver.manage().window().maximize();
			System.out.println(IdMessage);
			txtIdValue.clear();
			txtIdValue.sendKeys(IdMessage);

			btnFind.click();
		} finally {

		}

		return new SearchHistoryFilePage();
	}
	/**
	 * 
	 * @return
	 */
	public SearchHistoryFilePage GetTradeId () {
		try {
			driver.manage().window().maximize();
			SearchICon.click();
			transactionId=TransactionID.getText();
			System.out.println("MidOffice Completed Successfully");

		} finally {

		}

		return new SearchHistoryFilePage();
	}
}
