package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.scb.t24.utility.Reporter;

public class HomePage_Threasurey extends BasePage {

	public HomePage_Threasurey() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//frame[@scrolling='auto']")
	WebElement frameMenu;

	@FindBy(xpath = "//span[text()='User Menu']")
	WebElement lnkUserMenu;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Account']")
	WebElement lnkAccount;

	@FindBy(xpath = "//a[text()='Open Current Account']")
	WebElement lnkOpenCurrentAccount;

	@FindBy(xpath = "a//span[text()='Open Savings Account']")
	WebElement lnkOpenSavingsAccount;

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

	public CurrentAccountPage OpenCurrentAccontLink() {
		explicitWait(frameMenu);
		switchToFrameUsingElement(frameMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkAccount.click();
		lnkOpenCurrentAccount.click();
		lnkMMTrader.click();
		lnkMMDeposit.click();
		return new CurrentAccountPage();
	}

	public HomePage_Threasurey navigateToMMDeposit() {
		explicitWait(frameMenu);
		switchToFrameUsingElement(frameMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkFrontOffice.click();
		lnkMMTrader.click();
		lnkMMDeposit.click();

		return this;
	}

	public HomePage_Threasurey navigaToForexForwardDeal() {

		explicitWait(frameMenu);
		switchToFrameUsingElement(frameMenu);
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

	public AuthoriseDeleteMMTransactionsPage navigateToAuthoriseDeleteMMTransactions() {

		explicitWait(frameMenu);
		switchToFrameUsingElement(frameMenu);
		explicitWait(lnkUserMenu);
		lnkUserMenu.click();
		lnkTreasuryOperations.click();
		lnkForexMoneyMarket.click();
		lnkBackOffice.click();
		lnkMoneyMarket.click();
		lnkParentAuthoriseDeleteMMTransactions.click();
		lnkChildAuthoriseDeleteMMTransactions.click();

		return new AuthoriseDeleteMMTransactionsPage();

	}

	public ChooseForexForwardDealPage navigateToCaptureForexForwardDeal() {

		lnkCaptureForexFrwdDeal.click();
		switchToLastWindowWithSSLError();
		return new ChooseForexForwardDealPage();
	}

	public AuthoriseConfirmForexDealsPage navigateToAuthoriseConfirmForexDeals() {

		explicitWait(frameMenu);
		switchToFrameUsingElement(frameMenu);
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
}
