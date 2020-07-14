package com.scb.t24.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerCreationPage extends BasePage {
	
	public CustomerCreationPage() {
		super(driver);
	}
	
	@FindBy(id ="fieldName:MNEMONIC")
	WebElement txtmneomonic;
	
	@FindBy(id ="fieldName:SHORT.NAME:1")
	WebElement txtshortname;
	
	@FindBy(id ="fieldName:NAME.1:1")
	WebElement txtname;
	
	@FindBy(id ="fieldName:SECTOR")
	WebElement txtsector;
	
	@FindBy(id="fieldName:LANGUAGE")
	WebElement txtlanguage;
	
	@FindBy(xpath  ="//input[contains(@name,'WORK.EMAIL') and (@type='radio')]")
	WebElement rdemail;
	
	@FindBy(xpath ="//a[@title='Commit the deal']")
	WebElement btncommit;
	
	@FindBy(xpath = "//span[contains(@class,'iddisplay_CUSTOMER')]")
	WebElement txtCustomerID;
		
	@FindBy(xpath ="//td[@class='message']")
	WebElement lblConfirmationMsg;
	
	@FindBy(xpath = "//td[contains(text(),'Txn Complete')]")
	WebElement lblTransactionCompleteMessage;
    
public CustomerCreationPage enterMandatoryFields(String strShortName, String strSector, String strLanguage, String strWorkEmail) {

	driver.manage().window().maximize();
	String strNeomonic=strRandomStringGenerator(6);
	txtmneomonic.sendKeys(strNeomonic);
	txtshortname.sendKeys(strShortName);
	String strName=strRandomStringGenerator(12);
	txtname.sendKeys(strName);
	txtsector.sendKeys(strSector);
	txtlanguage.sendKeys(strLanguage);
	List<WebElement> wbListEmail = driver.findElements(By.xpath("//input[contains(@name,'WORK.EMAIL') and (@type='radio')]"));
	for(int itr=0; itr<wbListEmail.size() - 1; itr++){
		String rdValue = wbListEmail.get(itr).getAttribute("value");
		if(rdValue.equalsIgnoreCase(strWorkEmail))
			wbListEmail.get(itr).click();
	}
	strCustomerID = txtCustomerID.getText().toString();
	return this;
}

public CustomerCreationPage commitCustomer(){
	btncommit.click();
	waitForVisibilityOfElement(lblTransactionCompleteMessage);
	return this;
}

public CustomerCreationPage captureCustomerIDGenerated(){
	System.out.println("Customer Created Successfully. Customer ID : "+strCustomerID);
	driver.close();
	switchToLastWindowWithSSLError();
	sleep(4000);
	return this;
}



}



