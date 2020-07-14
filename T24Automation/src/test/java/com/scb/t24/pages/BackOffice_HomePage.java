package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackOffice_HomePage extends BasePage {



	public BackOffice_HomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath = "//frame[contains(@id,'Tabs')]")
	WebElement FrameMenu;

	@FindBy(xpath = "//frame[contains(@id,'workarea')]")
	WebElement FrameMenu1;

	@FindBy(xpath = "//frame[contains(@id,'BLANK')]")
	WebElement FrameMenu2;


	@FindBy(xpath ="//input[contains(@id,'value:1')]")
	WebElement txtSecurityTransactionsId;


	@FindBy(xpath ="//a[@class='iconLink']")
	WebElement imgSecurityTransationComplete;

	@FindBy(xpath ="//span[contains(@class,'SECTRADE_COMPLETE')]")
	WebElement imgSecurityTransctioncompletemsg;

	@FindBy(xpath ="//input[@id='defaultButton']")
	WebElement btnSecTrnansFind;

	@FindBy(xpath ="//img[contains(@title,'Commit the deal')]")
	WebElement imgCommit;

	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement lnk_AcceptOverrides;

	@FindBy(xpath ="//td[@class='message']")
	WebElement  txncompletemessage;

	/**
	 * 
	 * @return
	 * @throws InterruptedException 
	 */

	public BackOffice_HomePage  SearchSecid() throws InterruptedException
	{

		try
		{driver.manage().window().maximize();
		switchToFrameUsingElement(FrameMenu);
		switchToFrameUsingElement(FrameMenu1);
		txtSecurityTransactionsId.clear();
		txtSecurityTransactionsId.sendKeys(transactionId);
		btnSecTrnansFind.click();
		}
		finally{
		}
		return new BackOffice_HomePage();
	}
	public BackOffice_HomePage transactioncomplete()
	{
		try{
			driver.manage().window().maximize();
			imgSecurityTransationComplete.click();
			driver.switchTo().defaultContent();
			switchToFrameUsingElement(FrameMenu2);
			imgCommit.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(driver.findElements(By.xpath("//a[contains(text(),'Accept Overrides')]")).size()>0)
			{
				lnk_AcceptOverrides.click();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


			String message=txncompletemessage.getText();
			IdMessage=message.substring(14,32);
			System.out.println(IdMessage);
			System.out.println("BackOffice Completed Successfully");
		}
		finally{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new BackOffice_HomePage();
	}	
}
