/**
 * 
 */
package com.scb.t24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author dineshkumar.rc
 *
 */
public class ChooseForexForwardDealPage extends BasePage {

	public ChooseForexForwardDealPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[text()='Inter Bank']")
	WebElement lnkInterBank;

	@FindBy(xpath= "//frame[contains(@src,'../jsps/enqrequest.jsp')]")
	WebElement frameTable;

	
	
	public CaptureForwardDealsDetailPage selectInterBankOption(){
		maximizeBrowserWindow();
		switchToLastWindowWithSSLError();
		sleep(4000);
		explicitWait(frameTable);
		switchToFrameUsingElement(frameTable);
		lnkInterBank.click();
		
		return new CaptureForwardDealsDetailPage();
		
	}
}
