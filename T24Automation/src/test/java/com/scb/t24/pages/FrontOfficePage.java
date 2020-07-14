package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontOfficePage extends BasePage {



	public FrontOfficePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath ="//*[@id='fieldName:CUST.NUMBER:1']")
	WebElement txtClientDetails;

	@FindBy(xpath ="//*[@id='fieldName:NO.NOMINAL:1']")
	WebElement  txtNominal;

	@FindBy(xpath="//*[@id='alltab']//span[contains(text(),'Broker')]")
	WebElement tabBroker;

	@FindBy(xpath ="//*[@id='fieldName:DEPOSITORY']")
	WebElement txtDepository;

	@FindBy(xpath ="//img[contains(@title,'Validate a deal')]")
	WebElement imgValidate;

	@FindBy(xpath ="//img[contains(@title,'Commit the deal')]")
	WebElement imgCommit;

	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement lnk_AcceptOverrides;

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txncompletemessage;

	@FindBy(xpath="//form[@id='appreq']")
	WebElement Close_ID;

	@FindBy(xpath="//input[contains(@id,'SECURITY.NO')]")
	WebElement txtSecurity;

	@FindBy(xpath="//input[contains(@id,'CUST.NUMBER:1')]")
	WebElement txtClientNumber;

	@FindBy(xpath="//table[contains(@class,'tab-nav_SECOPENORDER')]//span[text()='Broker Details']")
	WebElement tabBrokerDetails;



	/**
	 * 
	 * @param string4 
	 * @param string3 
	 * @param string2 
	 * @param str 
	 * @return
	 * @throws InterruptedException 
	 */

	public FrontOfficePage BuyOrderform(String strSecurity, String strClientDetails, String strNominal, String strDepository) throws InterruptedException
	{
		try
		{
			Thread.sleep(1000);
			switchToLastWindowWithSSLError();
			driver.manage().window().maximize();
			txtSecurity.sendKeys(strSecurity);//locator missing
			txtClientDetails.sendKeys(strClientDetails);
			txtNominal.sendKeys(strNominal);
			tabBroker.click();
			txtDepository.sendKeys(strDepository);
		}
		finally{
		}
		return new FrontOfficePage();

	}
	public FrontOfficePage CommitAndGetId()
	{
		try
		{
			imgValidate.click();
			imgCommit.click();
			//boolean val=txncompletemessage.isDisplayed();
			//System.out.println(val);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(driver.findElements(By.xpath("//a[contains(text(),'Accept Overrides')]")).size()>0)
			{
				lnk_AcceptOverrides.click();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			message=txncompletemessage.getText();
			IdMessage=message.substring(14,31);
			System.out.println(IdMessage);	
			Close_ID.click();
			System.out.println("Front Office Completed Successfully");
		}
	finally{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new FrontOfficePage();
	}
}
