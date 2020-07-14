package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnexecutedOrderBondPage extends BasePage {



	public UnexecutedOrderBondPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//img[@title='Selection Screen']")
	WebElement btnSearchingScreen;

	@FindBy(xpath="//a[@class='iconLink']")
	WebElement btnDrillDown;

	@FindBy(xpath="//input[@id='value:1:1:1']")
	WebElement btnSearchId;

	@FindBy(xpath="//a[contains(text(),'Find')]")
	WebElement btnFind;


	/**
	 * 
	 * @return
	 */
	public UnexecutedOrderBondPage UnExecutedOrderBonds() {
		try {
			driver.manage().window().maximize();
			btnSearchingScreen.click();
			btnSearchId.sendKeys(IdMessage);
			btnFind.click();
			btnDrillDown.click();

		} finally {

		}

		return new UnexecutedOrderBondPage();
	}
}
