package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Secruity_TransferInPage extends BasePage {



	public Secruity_TransferInPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[contains(@id,'contract_screen_div')]")
	String WindowSecurityTransfer;

	@FindBy(xpath="//input[contains(@id,'SECURITY.NO')]")
	WebElement txtSecurity;

	@FindBy(xpath="//input[contains(@id,'fieldName:CUSTOMER.NO')]")
	WebElement txtClientNumber;

	@FindBy(xpath ="//*[@id='fieldName:NO.NOMINAL']")
	WebElement  txtNominal;

	@FindBy(xpath="//*[@id='alltab']//span[contains(text(),'Broker')]")
	WebElement tabBroker;

	@FindBy(xpath ="//input[@id='fieldName:BROKER.NO']")
	WebElement txtCounterParty;

	@FindBy(xpath ="//img[contains(@title,'Validate a deal')]")
	WebElement imgValidate;

	@FindBy(xpath ="//img[contains(@title,'Commit the deal')]")
	WebElement imgCommit;

	@FindBy(xpath ="//td[contains(text(),'A/C BALANCE STILL LESS THAN MINIMUM BAL')]")
	WebElement txtMinBalance;

	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement lnk_AcceptOverrides;




	/**
	 *
	 * @return
	 * @throws InterruptedException 
	 */
	public Secruity_TransferInPage SecurityTransfers(String strSecurity, String strClientDetails, String strNominal, String strCounterParty) throws InterruptedException
	{
		try
		{
			Thread.sleep(2000);
			switchToLastWindowWithSSLError();
			driver.manage().window().maximize();
			txtSecurity.sendKeys(strSecurity);
			txtClientNumber.sendKeys(strClientDetails);
			txtNominal.sendKeys(strNominal);
			tabBroker.click();
			txtCounterParty.sendKeys(strCounterParty);
		}
		finally{
		}
		return new Secruity_TransferInPage();
	}
	public Secruity_TransferInPage ValidateAndCommitTheDeal()
	{
		try
		{
			imgValidate.click();
			imgCommit.click();
			
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
		return new Secruity_TransferInPage();
		//imgCommit.click();

	}

}
