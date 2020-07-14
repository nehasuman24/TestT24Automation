package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityAuthoriseAndReversalPage extends BasePage {

	//	String IdMessage;
	//	String message;
	//	String transactionId;

	public SecurityAuthoriseAndReversalPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txncompletemessage;	

	@FindBy(xpath="//img[contains(@src,'../plaf/images/default/tools/select.gif')]")
	WebElement btnSearch;

	@FindBy(xpath = "//input[@id='value:1:1:1']")
	WebElement txtTransRefId;

	@FindBy(xpath = "//a[contains(text(),'Find')]")
	WebElement btnFind;

	@FindBy(xpath="//img[contains(@src,'../plaf/images/default/enquiry/drilldown/txnauthorise.gif')]")
	WebElement btnTick;

	@FindBy(xpath="//span[@class='iddisplay iddisplay_SECURITYTRANSFER iddisplay_SECURITYTRANSFER_AUTH']")
	WebElement txtTrasnsactionId;

	@FindBy(xpath="//img[@title='Authorises a deal']")
	WebElement btnAuthorise;

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txtmessage;

	@FindBy(xpath ="//input[@class='idbox idbox_SECURITYTRANSFER idbox_SECURITYTRANSFER_AUTH']")
	WebElement  txnSearchTransactionId;

	@FindBy(xpath="//img[@title='Perform an action on the contract']")
	WebElement btnActionOfContract;

	@FindBy(xpath="//img[@title='Reverses a deal from the live file']")
	WebElement btnReverseADeal;

	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement lnk_AcceptOverrides;

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txncompletemessage1;//need to remove



	/**
	 * 
	 * @return
	 */

	public SecurityAuthoriseAndReversalPage txncompletemessage()
	{
		try
		{
			message=txncompletemessage.getText();
			IdMessage=message.substring(14,31);
			System.out.println(IdMessage);
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}

	public SecurityAuthoriseAndReversalPage AuthoriseText()
	{
		try
		{
			btnSearch.click();
			switchToLastWindowWithSSLError();
			System.out.println("id="+IdMessage);
			txtTransRefId.sendKeys(IdMessage);
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}
	public SecurityAuthoriseAndReversalPage Find()
	{
		try
		{
			btnFind.click();
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}
	public SecurityAuthoriseAndReversalPage AuthoriseId(){
		try
		{
			driver.manage().window().maximize();
			btnTick.click();
			String transactionId=txtTrasnsactionId.getText();
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();

	}
	public SecurityAuthoriseAndReversalPage AuthoriseDeal() throws InterruptedException
	{
		try
		{
			btnAuthorise.click();
			Thread.sleep(1000);
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}
	public SecurityAuthoriseAndReversalPage Close()
	{
		try
		{
			driver.close();
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}
	public SecurityAuthoriseAndReversalPage CompletedScenario()
	{
		try
		{
			System.out.println("Completed Successfully");
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}


	public SecurityAuthoriseAndReversalPage getTheTransferIdToReverseDeal() throws InterruptedException 
	{
		try
		{

			Thread.sleep(1000);
			String message1=txncompletemessage.getText();
			IdMessage=message1.substring(13,31);
			txnSearchTransactionId.sendKeys(IdMessage);
			btnActionOfContract.click();
		}
		finally{
		}
		return new SecurityAuthoriseAndReversalPage();
	}
	public SecurityAuthoriseAndReversalPage ReverseDeal()
	{
		try
		{
			btnReverseADeal.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(driver.findElements(By.xpath("//a[contains(text(),'Accept Overrides')]")).size()>0)
			{
				lnk_AcceptOverrides.click();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		finally{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new SecurityAuthoriseAndReversalPage();

	}


}


