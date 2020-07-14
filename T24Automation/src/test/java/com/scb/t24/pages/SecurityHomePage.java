package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityHomePage extends BasePage {



	public SecurityHomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//frame[contains(@id,'menu')]")
	WebElement FrameMenu;

	@FindBy(xpath = "//frame[contains(@id,'banner')]")
	WebElement frameBanner;


	@FindBy(xpath = "//span[contains(text(),'User Menu')]")
	WebElement lnkUserMenu;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Private Operations']")
	WebElement lnkPrivateoperations;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']")
	WebElement lnkSecurities;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Front Office']")
	WebElement lnkFrontOfficeSecurities;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Direct Ordering']")
	WebElement lnkDirectOrdering;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Single Orders']")
	WebElement lnkSingleOrder;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Single Orders']//following-sibling::ul//span[text()='Order Entry']")
	WebElement lnkOrderEntry;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Single Orders']//following-sibling::ul//span[text()='Order Entry']//following-sibling::ul//a[contains(text(),'Buy Order')]")
	WebElement lnkBuyOrder;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Single Orders']//following-sibling::ul//span[text()='Order Entry']//following-sibling::ul//a[contains(text(),'Sell Order')]")
	WebElement lnkSellOrder;


	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Middle Office']")
	WebElement lnkMiddleOfficeSecurities;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Client Order Execution']")
	WebElement lnkClientOrderExecution;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Order execution']")
	WebElement lnkOrderExecution;

	@FindBy(xpath="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//a[text()='Order Execution Bonds ']")
	WebElement lnkOrderExecutionBonds;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Back Office']")
	WebElement lnkBackOfficeSecurities;
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Securities Authorisation']")
	WebElement SecurityAuthorisation;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//a[text()='Securities Transactions ']")
	WebElement SecurityTransactions; 




	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Treasury Operations']")
	WebElement lnkTreasuryOperations;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']")
	WebElement lnkSecuritiesOwnBook;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']//following-sibling::ul//span[text()='Back Office']")
	WebElement lnkBackOfficeOwnBook;



	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']//following-sibling::ul//span[text()='Off Market Trades/Transfers']")
	WebElement lnkOffMarketTraders;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']//following-sibling::ul//span[text()='Off Market Trades/Transfers']//following-sibling::ul//a[contains(text(),'Transfer-IN ')]")
	WebElement lnkTransferIn;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']//following-sibling::ul//span[text()='Off Market Trades/Transfers']//following-sibling::ul//a[contains(text(),'Transfer-OUT ')]")
	WebElement lnkTransferOut;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities (Own Book)']//following-sibling::ul//span[text()='Off Market Trades/Transfers']//following-sibling::ul//a[contains(text(),'Authorise Transfers ')]")
	WebElement lnkAutoriseTrasnfers;

	/**
	 * 
	 * @return
	 * @throws InterruptedException 
	 */
	public  SecurityHomePage navigateBuyOrder() throws InterruptedException
	{
		try{
			driver.manage().window().maximize(); 
			switchToFrameUsingElement(FrameMenu);
			Thread.sleep(3000);
			lnkUserMenu.click();
			lnkPrivateoperations.click();
			lnkSecurities.click();
			lnkFrontOfficeSecurities.click();
			lnkDirectOrdering.click();
			lnkSingleOrder.click();
			lnkOrderEntry.click();
			lnkBuyOrder.click();}
		finally{

		}
		return new SecurityHomePage();
	}
	public SecurityHomePage navigateSellOrder() throws InterruptedException
	{
		try{
			driver.manage().window().maximize(); 
			switchToFrameUsingElement(FrameMenu);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			lnkUserMenu.click();
			lnkPrivateoperations.click();
			lnkSecurities.click();
			lnkFrontOfficeSecurities.click();
			lnkDirectOrdering.click();
			lnkSingleOrder.click();
			lnkOrderEntry.click();
			lnkSellOrder.click();
		}
		finally
		{

		}
		return new SecurityHomePage();
	}
	public void navigateSecuritiesTransaction()
	{

		switchToFrameUsingElement(FrameMenu);
		driver.manage().window().maximize();
		lnkUserMenu.click();
		lnkPrivateoperations.click();
		lnkSecurities.click();
		lnkBackOfficeSecurities.click();
		SecurityAuthorisation.click();
		SecurityTransactions.click();
	}
	public SecurityHomePage MiddleOffice() throws InterruptedException {
		try {
			Thread.sleep(2000);
			switchToFrameUsingElement(FrameMenu);
			lnkUserMenu.click();
			lnkPrivateoperations.click();
			lnkSecurities.click();
			lnkMiddleOfficeSecurities.click();
			lnkClientOrderExecution.click();
			lnkOrderExecution.click();
			lnkOrderExecutionBonds.click();	
		} finally {

		}

		return new SecurityHomePage();
	}



	public void SecurityTransferInHome() throws InterruptedException
	{
		driver.manage().window().maximize(); 
		switchToFrameUsingElement(FrameMenu);
		Thread.sleep(3000);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkSecuritiesOwnBook.click();
		lnkBackOfficeOwnBook.click();
		lnkOffMarketTraders.click();
		lnkTransferIn.click();

	}
	public void SignOff()
	{
		switchToFrameUsingElement(frameBanner);
	}
	public SecurityHomePage SecurityTransferOutHome() throws InterruptedException
	{
		try
		{
			driver.manage().window().maximize(); 
			switchToFrameUsingElement(FrameMenu);
			Thread.sleep(3000);
			lnkUserMenu.click();
			lnkTreasuryOperations.click();
			lnkSecuritiesOwnBook.click();
			lnkBackOfficeOwnBook.click();
			lnkOffMarketTraders.click();
			lnkTransferOut.click();
		}
		finally
		{

		}
		return new SecurityHomePage();
	}

	public SecurityHomePage  AutoriseTransfersHome() throws InterruptedException
	{
		try
		{
			driver.manage().window().maximize(); 
			switchToFrameUsingElement(FrameMenu);
			Thread.sleep(3000);
			lnkUserMenu.click();
			lnkTreasuryOperations.click();
			lnkSecuritiesOwnBook.click();
			lnkBackOfficeOwnBook.click();
			lnkOffMarketTraders.click();
			lnkAutoriseTrasnfers.click();
		}
		finally
		{

		}
		return new SecurityHomePage();

	}

}
