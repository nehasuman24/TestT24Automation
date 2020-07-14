package com.scb.t24.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//frame[@scrolling='auto']")
	WebElement frmMenu;

	@FindBy(xpath = "//span[text()='User Menu']")
	WebElement lnkUserMenu;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Account']")
	WebElement lnkAccount;

	@FindBy(xpath = "//*[@id='pane_']/ul[1]/li/ul/li[4]/ul/li[1]/a")
	WebElement lnkOpenCurrentAccount;

	@FindBy(xpath = "//*[@id='pane_']/ul[1]/li/ul/li[4]/ul/li[2]/a")
	WebElement lnkOpenSavingsAccount;
	
	@FindBy(xpath = "//*[@id='pane_']/ul[1]/li/ul/li[4]/ul/li[9]/a")
	WebElement lnkAuthorizeDelete;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Treasury Operations']")
	WebElement lnkTreasuryOperations;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']")
	WebElement lnkForexMoneyMarket;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']//following-sibling::ul//span[text()='Front Office']")
	WebElement lnkFrontOffice;

	@FindBy(xpath = "//span[text()='Money Market Trader']")
	WebElement lnkMMTrader;

	@FindBy(xpath = "//span[text()='MM Takings/Deposit']")
	WebElement lnkMMDeposit;

	@FindBy(xpath = "//span[text()='MM Takings/Deposit']//following-sibling::ul//a[text()='Call/Notice Contracts ']")
	WebElement lnkCallNotice;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']//following-sibling::ul//span[text()='Back Office']")
	WebElement lnkBackOffice;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']//following-sibling::ul//span[text()='Back Office']//following-sibling::ul//span[text()='Money Market']")
	WebElement lnkMoneyMarket;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']//following-sibling::ul//span[text()='Back Office']//following-sibling::ul//span[text()='Money Market']//following-sibling::ul//span[text()='Authorise/Delete MM Transactions']")
	WebElement lnkParentAuthoriseDeleteMMTransactions;

	@FindBy(xpath = "//span[text()='Forex & Money Market Trader']//following-sibling::ul//span[text()='Back Office']//following-sibling::ul//span[text()='Money Market']//following-sibling::ul//span[text()='Authorise/Delete MM Transactions']//following-sibling::ul//a[text()='Authorise/Delete MM Transactions ']")
	WebElement lnkChildAuthoriseDeleteMMTransactions;


	@FindBy(xpath = "//frame[contains(@id,'menu')]")
	WebElement FrameuserMenu;
	
	
	@FindBy(xpath = "//a[@title='Sign off']")
	WebElement SignOff;
	
	@FindBy(xpath = "//*[contains(@id,'banner')]")
	WebElement FrameSignOff;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Customer']")
	WebElement lnkCustomer;
	
	@FindBy(xpath = "//*[@id='pane_']/ul[1]/li/ul/li[2]/ul/li[1]/a")
	WebElement lnkIndividualCustomer;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Retail Operations']")
	WebElement lnkRetailOperations;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Retail Operations']//following-sibling::ul//a[contains(text(),'Product Catalog')]")
	WebElement lnkProductCatalog;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Retail Operations']//following-sibling::ul//a[contains(@onclick,'Find Deposit')]")
	WebElement lnkFindDeposit;
	
	@FindBy(xpath = "//span[text()='Forex Trader']")
	WebElement lnkForexTrader;

	@FindBy(xpath = "//span[text()='Forex Deals']")
	WebElement lnkForexDeals;
	
	@FindBy(xpath = "//a[text()='Capture Forex Forward Deal ']")
	WebElement lnkCaptureForexFrwdDeal;
	
	@FindBy(xpath = "//span[text()='Forex ']")
	WebElement lnkBackOfficeForex;

	@FindBy(xpath = "//span[text()='Auth/Rev/Confirm Forex Deals']")
	WebElement lnkAuthRevConfirmForexDeals;

	@FindBy(xpath = "//a[text()='Authorise/Confirm Forex Deals ']")
	WebElement lnkAuthoriseForexDeals;
	
	@FindBy(xpath="//span[contains(text(),'Corporate Operations')]")
	WebElement lnkCorporateOperations;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Corporate Operations']//following-sibling::ul//span[text()='Trade Finance']")
	WebElement lnkTradeFinance;
	
	@FindBy(xpath="//span[contains(text(),'Import LCs')]")
	WebElement lnkImportLCs;

	@FindBy(xpath = "//span[contains(text(),'Maintenance of Import LCs')]")
	WebElement lnkMainImportLCs;
	
	@FindBy(xpath = "//a[text()='Internal Amendment ']")
	WebElement lnkIAmendment;
	
	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Corporate operations']//following-sibling::ul//span[text()='Trade Finance']//following-sibling::ul//span[text()='Authorise TF Transactions']")
	WebElement lnkAuthoriseTFTransac;
	
	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Corporate operations']//following-sibling::ul//span[text()='Trade Finance']//following-sibling::ul//span[text()='Authorise TF Transactions']//following-sibling::ul//a[@title='Authorise/Delete Import LCs/Amendments']")
	WebElement lnkAuthoriseAmend;
	
	
	/**
	 * Click on Open Individual Customer Link
	 * @Author Sourya
	 * @Date Feb 22, 2017
	 * @return
	 */
	public CustomerCreationPage navigateToCustomer() {
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkCustomer.click();
		lnkIndividualCustomer.click();
		switchToLastWindowWithSSLError();
		return new CustomerCreationPage();
	}
	
	
	/**
	 * Click on Open Current Account Link
	 * @Author sindu
	 * @Date Feb 21, 2017
	 * @return
	 */
	
	public AccountPage openCurrentAccontLink() {
		sleep(10000);
		switchToFrameUsingElement(FrameuserMenu);
		sleep(4000);	
		lnkUserMenu.click();
		lnkAccount.click();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lnkOpenCurrentAccount); 
		sleep(3000);
		//lnkOpenCurrentAccount.click();
		/*lnkMMTrader.click();
		lnkMMDeposit.click();*/

		return new AccountPage();}
	
	/**
	 * Method for Signoff
	 * @Author sindu
	 * @Date Feb 21, 2017
	 * @return
	 */
	
	public void signOff(){
		
		switchToLastWindowWithSSLError();
		switchToFrameUsingElement(FrameSignOff);	
		SignOff.click();
		
	}

	/**
	 * Method for Clicking on Open Savings Account Link
	 * @Author sindu
	 * @Date Feb 21, 2017
	 * @return
	 */
	public AccountPage openSavingsAccontLink() {
		switchToLastWindowWithSSLError();
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		//lnkUserMenu.click();
		//lnkAccount.click();
		lnkOpenSavingsAccount.click();
		/*lnkMMTrader.click();
		lnkMMDeposit.click();*/
		return new AccountPage();
	}
	
	public ListofAuthoriseDeleteAccount authorizeDeleteAccount() {
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkAccount.click();
		lnkAuthorizeDelete.click();
		/*lnkMMTrader.click();
		lnkMMDeposit.click();*/

		return new ListofAuthoriseDeleteAccount();
	}
	public HomePage navigateToMMDeposit() {
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkFrontOffice.click();
		lnkMMTrader.click();
		lnkMMDeposit.click();

		return this;
	}
	
	public AuthoriseDeleteMMTransactionsPage navigateToAuthoriseDeleteMMTransactions(){
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkBackOffice.click();
		lnkMoneyMarket.click();
		lnkParentAuthoriseDeleteMMTransactions.click();
		lnkChildAuthoriseDeleteMMTransactions.click();
		
		return new AuthoriseDeleteMMTransactionsPage();
		
	}
	
	/**
	 * Method for Clicking on Product Catalog Link
	 * @Author Sourya
	 * @Date Feb 21, 2017
	 * @return
	 */
	public AAProductCatalogPage navigateToAAProductCatalog(){
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkRetailOperations.click();
		lnkProductCatalog.click();
		switchToLastWindowWithSSLError();
		return new AAProductCatalogPage();
	}
	
	/**
	 * Method for Clicking on Find Deposit Link
	 * @Author Sourya
	 * @Date Feb 21, 2017
	 * @return
	 */
	public AAArrangementPage navigateToArrangementAndUnauthorizedTab(){
		sleep(10000);
		switchToFrameUsingElement(frmMenu);
		sleep(4000);
		lnkUserMenu.click();
		lnkRetailOperations.click();
		lnkFindDeposit.click();
		switchToLastWindowWithSSLError();
		return new AAArrangementPage();
	}
	
	public CurrentAccountPage OpenCurrentAccontLink() {
		explicitWait(frmMenu);
		switchToFrameUsingElement(frmMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkAccount.click();
		lnkOpenCurrentAccount.click();
		lnkMMTrader.click();
		lnkMMDeposit.click();
		return new CurrentAccountPage();
	}

	public HomePage navigaToForexForwardDeal() {

		explicitWait(frmMenu);
		switchToFrameUsingElement(frmMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkFrontOffice.click();
		lnkForexTrader.click();
		lnkForexDeals.click();

		return this;
	}

	public MoneyMarketCallNoticeContractPage navigateToCallNoticeContracts() {

		lnkCallNotice.click();
		switchToLastWindowWithSSLError();

		return new MoneyMarketCallNoticeContractPage();
	}

	public ChooseForexForwardDealPage navigateToCaptureForexForwardDeal() {

		lnkCaptureForexFrwdDeal.click();
		switchToLastWindowWithSSLError();
		return new ChooseForexForwardDealPage();
	}

	public AuthoriseConfirmForexDealsPage navigateToAuthoriseConfirmForexDeals() {

		explicitWait(frmMenu);
		switchToFrameUsingElement(frmMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkBackOffice.click();
		lnkBackOfficeForex.click();
		lnkAuthRevConfirmForexDeals.click();
		lnkAuthoriseForexDeals.click();

		return new AuthoriseConfirmForexDealsPage();
	}
	
	/**
	 * Method for Clicking on Internal Amendment
	 * @Author Neha
	 * @Date March 10, 2017
	 * @return
	 */
	
	public  InternalAmendmentpage navigateInternalAmendment() throws InterruptedException
	{
		    explicitWait(frmMenu);
		    switchToFrameUsingElement(frmMenu);
			explicitWait(lnkUserMenu);
			lnkUserMenu.click();
			lnkCorporateOperations.click();
			lnkTradeFinance.click();
			lnkImportLCs.click();
			lnkMainImportLCs.click();
			lnkIAmendment.click();
		
		return new InternalAmendmentpage();
	}
	
	public InternalAmendmentpage AuthorizeDelImportLCsAmendmentsPage()
	{
		lnkUserMenu.click();
		lnkCorporateOperations.click();
		lnkTradeFinance.click();
		lnkAuthoriseTFTransac.click(); 
		lnkAuthoriseAmend.click();
		
		return new InternalAmendmentpage();
		
	}
	
	
}
