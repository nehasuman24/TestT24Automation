package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class ClickAccountNewDeal extends BasePage {

	public ClickAccountNewDeal() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String[] AccountNumbers = new String[10];
	public static int i=0;
	String transactionId;
    @FindBy(name ="fieldName:CUSTOMER")
    WebElement txtCustomerId;
    @FindBy(name ="fieldName:CATEGORY")
    WebElement txtProductCode;
    @FindBy(name ="fieldName:CURRENCY")
    WebElement txtCURRENCY;
    @FindBy(name ="fieldName:MNEMONIC")
    WebElement txtMNEMONIC;
    @FindBy(xpath = "//a[@title='Commit the deal']")
    WebElement lnkCommitDeal;
    @FindBy(xpath="//span[contains(@class,'iddisplay_ACCOUNT')]")
    WebElement lblTransactionId;
    
    public ClickAccountNewDeal enterCurrentAccountDetails(String CustomerId,String PCode,String Cur,String MNEMONIC)
    {
    	switchToLastWindowWithSSLError();
    	driver.manage().window().maximize();
    	
    	//transactionId= lblTransactionId.getText();
    	txtCustomerId.sendKeys(CustomerId);
    	txtProductCode.clear();
    	txtProductCode.sendKeys(PCode);
    	txtCURRENCY.clear();
    	txtCURRENCY.sendKeys(Cur);
    	txtMNEMONIC.sendKeys(MNEMONIC);
    	return new ClickAccountNewDeal();
    }
    public ClickAccountNewDeal enterSavingsAccountDetails(String CustomerId,String PCode,String Cur,String MNEMONIC)
    {
    	switchToLastWindowWithSSLError();
    	//transactionId= lblTransactionId.getText();
    	txtCustomerId.sendKeys(CustomerId);
    	txtProductCode.clear();
    	txtProductCode.sendKeys(PCode);
    	txtCURRENCY.clear();
    	txtCURRENCY.sendKeys(Cur);
    	txtMNEMONIC.sendKeys(MNEMONIC);
    	return new ClickAccountNewDeal();
    }
    public ClickAccountNewDeal enterFCYAccountDetails(String CustomerId,String PCode,String Cur,String MNEMONIC)
    {
    	switchToLastWindowWithSSLError();
    	//transactionId= lblTransactionId.getText();
    	txtCustomerId.sendKeys(CustomerId);
    	txtProductCode.clear();
    	txtProductCode.sendKeys(PCode);
    	txtCURRENCY.clear();
    	txtCURRENCY.sendKeys(Cur);
    	txtMNEMONIC.sendKeys(MNEMONIC);
    	return new ClickAccountNewDeal();
    }
    public GetTransactionIdStatusPage clickCommit()
    {
    	
    	lnkCommitDeal.click();
    	//System.out.println("Account number" + );
    	GetTransactionIdStatusPage transactionStatus = new GetTransactionIdStatusPage();
    			transactionStatus.getTransactionId();
    			System.out.println(transactionStatus.tranxId);
    			String AA=transactionStatus.tranxId;
    			AccountNumbers[i]=AA;
    			i++;
    			System.out.println("For Account type: "+i+", Account number is "+transactionStatus.tranxId);
    			driver.close();
    			sleep(1000);
    			switchToLastWindowWithSSLError();
    	return transactionStatus;
    }
    
}
