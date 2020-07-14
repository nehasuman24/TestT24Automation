package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchAccount extends BasePage  {
 static int count=0;
	public SearchAccount() {
		super(driver);
		
	}
	@FindBy(xpath= "//input[@id='value:2:1:1']")
	WebElement txtAccountNumber;
	@FindBy(xpath= "//input[@id='value:1:1:1']")
	WebElement txtAccountNumberSecond;	
	@FindBy(xpath= "//a[@title='Run Selection']")
	WebElement btnFind;
	@FindBy(xpath = "//img[@title='Selection Screen']")
	WebElement btnSearch; 
	
	public SearchAccount filterAccount()
	{
		txtAccountNumber.clear();
		ClickAccountNewDeal accountNewDeal = new ClickAccountNewDeal();
		AuthorizeDeleteAccount authorizeAccount = new AuthorizeDeleteAccount();
		String AccountNumber[]=	accountNewDeal.AccountNumbers;
		System.out.println("Accounts:  " +AccountNumber[0]);
		for(String accountNumber:AccountNumber)
		{
			
			if(count==0)
			txtAccountNumber.sendKeys(accountNumber);
			else{
				btnSearch.click();
				txtAccountNumberSecond.sendKeys(accountNumber);
			}
		     btnFind.click();
		     authorizeAccount.doAuthorize();
		     count++;
		}
		
		return new SearchAccount();
	}
}
