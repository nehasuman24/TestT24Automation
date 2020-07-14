package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InternalAmendmentpage extends BasePage {
	
	public InternalAmendmentpage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//frame[@scrolling='auto']")
	WebElement frameMenu;
	
	@FindBy(xpath ="//a[contains(@title,'Selection Screen')]")
	WebElement imgSelect;
	
	@FindBy(xpath="//input[@id='value:1:1:1']")
	WebElement texttransacref;
	
	@FindBy(xpath ="//img[contains(@title,'Run Selection')]")
	WebElement imgRunSelect;
	
	@FindBy(xpath ="//img[contains(@title,'Amend')]")
	WebElement imgAmend;
	
	@FindBy(xpath = "//span[text()='Internal Amendment Info']")
	WebElement TabAmendInfo;
	
	@FindBy(xpath ="//*[@id='fieldName:Amendments']")
	WebElement txtDetails ;
	
	@FindBy(xpath ="//img[contains(@title,'Validate a deal')]")
	WebElement imgValidate;
	
	@FindBy(xpath ="//img[contains(@title,'Commit the deal')]")
	WebElement imgCommitdeal;
	
	@FindBy(xpath ="//*[contains(@class,'warningbox')]")
	WebElement warningLC ;
	
	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement linkAcceptOverrides;
	

	@FindBy(xpath ="//td[@class='message']")
	WebElement  transaccomplete;
	

	@FindBy(xpath ="//img[contains(@title,'Selection Screen')]")
	WebElement imgSelectionbutton1;
	
	@FindBy(xpath="//input[@id='value:1:1:1']")
	WebElement textreference1;
	
	@FindBy(xpath ="//img[contains(@title,'Run Selection')]")
	WebElement imgRunButton1;
	
	@FindBy(xpath ="//img[contains(@title,'Authorise')]")
	WebElement imgAuthorisebutton1;
	
	@FindBy(xpath ="//img[contains(@title,'Authorises a deal')]")
	WebElement imgAuthoriseadeal1;
	
	@FindBy(xpath = "//td[contains(text(),'Txn Complete')]")
	WebElement TranxCompleteMessage1;

	
	
	public InternalAmendmentpage Amendmentpage(String strtransac, String strDetails) throws InterruptedException
	{
		try
		{
			switchToFrameUsingElement(frameMenu);
			driver.manage().window().maximize();
		    imgSelect.click();
			texttransacref.sendKeys(strtransac);
			imgRunSelect.click();
			imgAmend.click();
			TabAmendInfo.click();
			txtDetails.sendKeys(strDetails);
			imgValidate.click();
			imgCommitdeal.click();
			warningLC.click();
			WebElement element=driver.findElement(By.name("warningLC"));
			Select se=new Select(element);
			se.selectByValue("RECEIVED");
			if(driver.findElements(By.xpath("//a[contains(text(),'Accept Overrides')]")).size()>0)
			{
				linkAcceptOverrides.click();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


			String message=transaccomplete.getText();
			linkAcceptOverrides.click();
			
		}
			finally{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	           return new InternalAmendmentpage();
}
	
	    public InternalAmendmentpage AuthorizeDelImportLCsAmendmentsPage(String strtransac ) throws InterruptedException
	
	          {
		
		
	          Thread.sleep(1000);
	          imgSelectionbutton1.click();
	          textreference1.sendKeys(strtransac);
	          imgRunButton1.click();
	          imgAuthorisebutton1.click();
	          imgAuthoriseadeal1.click();
	          waitForVisibilityOfElement(TranxCompleteMessage1);
	          return this;
	
		}
	    
	    public void Closethewindow()
	    
	    {
	    	driver.close();
	    }
	    
}


