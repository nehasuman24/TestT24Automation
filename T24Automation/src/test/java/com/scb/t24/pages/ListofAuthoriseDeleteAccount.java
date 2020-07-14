package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListofAuthoriseDeleteAccount extends BasePage {
		
		

		public ListofAuthoriseDeleteAccount() {
			super(driver);
			// TODO Auto-generated constructor stub
			
			
		}
		@FindBy(xpath = "//img[@title='Selection Screen']")
		WebElement btnSearch; 
		@FindBy(xpath = "//a[text()='Continue to this website (not recommended).']")
		WebElement lnkexception;
		
		public SearchAccount doAccountSearch()
		{
			sleep(4000);
			switchToLastWindowWithSSLError();
			driver.manage().window().maximize();
			try
			{
			if(lnkexception.isDisplayed()){
				acceptSSLError();
				}
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
				catch(Exception e)
				{
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
			btnSearch.click();
			
			return new SearchAccount();
		}
}
