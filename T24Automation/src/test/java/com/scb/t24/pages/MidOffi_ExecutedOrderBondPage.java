package com.scb.t24.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MidOffi_ExecutedOrderBondPage extends BasePage {



	public MidOffi_ExecutedOrderBondPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='fieldName:CUST.PRICE:1:1']")
	WebElement txtPrice;

	@FindBy(xpath="//*[@id='alltab']//span[contains(text(),'Broker')]")
	WebElement tabBroker;

	@FindBy(xpath="//input[@id='fieldName:BROKER.NO:1']")
	WebElement Brokerno;

	@FindBy(xpath="//select[@id='fieldName:BROKER.TYPE:1']")
	WebElement brokertype;

	@FindBy(xpath="//input[@id='fieldName:PRICE:1']")
	WebElement txtPrice1;

	@FindBy(xpath="//input[@id='fieldName:DELIVERY.INSTR:1']")
	WebElement txtDeliveryInst;

	@FindBy(xpath ="//img[contains(@title,'Validate a deal')]")
	WebElement Lbl_Validate;

	@FindBy(xpath ="//img[contains(@title,'Commit the deal')]")
	WebElement btn_Commit;

	@FindBy(xpath ="//a[contains(text(),'Accept Overrides')]")
	WebElement lnk_AcceptOverrides;


	/**
	 * 
	 * @return
	 * @throws InterruptedException 
	 */
	public MidOffi_ExecutedOrderBondPage ExecutedOrder(String strPrice, String strBroker, String strBrokerType , String strDeliveryInst) throws InterruptedException {
		try {
			Thread.sleep(1000);
			txtPrice.sendKeys(strPrice);
			tabBroker.click();
			Brokerno.sendKeys(strBroker);
			Select se=new Select(brokertype);
			se.selectByVisibleText("Broker");
			txtPrice1.sendKeys(strPrice);
			txtDeliveryInst.sendKeys(strDeliveryInst);

		} finally {

		}

		return new MidOffi_ExecutedOrderBondPage();
	}
	/**
	 * 
	 * @return
	 */
	public MidOffi_ExecutedOrderBondPage ValidateAndCommit() {
		try {
			driver.manage().window().maximize();
			Lbl_Validate.click();
			btn_Commit.click();
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

		return new MidOffi_ExecutedOrderBondPage();
	}
}
