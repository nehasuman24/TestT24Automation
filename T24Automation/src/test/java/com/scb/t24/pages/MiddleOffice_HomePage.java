package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiddleOffice_HomePage extends BasePage {



	public MiddleOffice_HomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[contains(@id,'menu')']")
	WebElement LBL_FrameMenu;

	@FindBy(xpath = "//*[contains(text(),'User Menu')")
	WebElement LBL_UserMenu;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Private Operations']")
	WebElement Lbl_Privateoperations;

	@FindBy(xpath ="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']")
	WebElement Lbl_Securities;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Front Office']")
	WebElement Lbl_MiddleOffice;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Client Order Execution']")
	WebElement LBL_ClientOrderExecution;

	@FindBy(xpath = "//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//span[text()='Order execution']")
	WebElement LBL_OrderExecution;

	@FindBy(xpath="//span[contains(text(),'User Menu')]//following-sibling::ul//span[text()='Securities']//following-sibling::ul//a[text()='Order Execution Bonds ']")
	WebElement LBL_OrderExecutionBonds;



	/**
	 * 
	 * @return
	 */
	public MiddleOffice_HomePage MiddleOffice() {
		try {

			LBL_UserMenu.click();
			Lbl_Privateoperations.click();
			Lbl_Securities.click();
			Lbl_MiddleOffice.click();
			LBL_ClientOrderExecution.click();
			LBL_OrderExecution.click();
			LBL_OrderExecutionBonds.click();	
		} finally {

		}

		return new MiddleOffice_HomePage();
	}
}
