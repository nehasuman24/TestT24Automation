/**
 * 
 */
package com.scb.t24.glue;

import com.scb.t24.pages.AuthoriseConfirmForexDealsPage;
import com.scb.t24.pages.CaptureForwardDealsDetailPage;
import com.scb.t24.pages.ChooseForexForwardDealPage;
import com.scb.t24.pages.HomePage_Threasurey;
import com.scb.t24.pages.LoginPage;
import com.scb.t24.pages.TransactionsSearchPage;
import com.scb.t24.runner.ReadTestData;
import cucumber.api.java.en.Then;

/**
 * @author dineshkumar.rc
 *
 */
public class ForexForwardDealStepDefinitionFile extends ReadTestData {/*

	@Then("^Navigate to Capture Forex Forward Deal$")
	public void navigate_to_Capture_Forex_Forward_Deal() throws Throwable {
		new HomePage_Threasurey().navigaToForexForwardDeal().navigateToCaptureForexForwardDeal();
	}

	@Then("^Enter Mandatory fields in Forex Forward deal ([0-9]*)$")
	public void enter_Mandatory_fields_in_Forex_Spot_deal(int iteration) throws Throwable {
		new ChooseForexForwardDealPage().selectInterBankOption().enterMandatoryFields(
				tdForexForwardDeal.get(0).get(iteration), tdForexForwardDeal.get(1).get(iteration),
				tdForexForwardDeal.get(2).get(iteration), tdForexForwardDeal.get(3).get(iteration),
				tdForexForwardDeal.get(4).get(iteration), tdForexForwardDeal.get(5).get(iteration),
				tdForexForwardDeal.get(6).get(iteration), tdForexForwardDeal.get(7).get(iteration));
	}

	@Then("^Commit the Deal and get the transaction id$")
	public void commit_the_Deal_and_get_the_transaction_id() throws Throwable {
		new CaptureForwardDealsDetailPage().CommitForexForwardDeal().getTransactionId();
		closeAllBrowser();
	}

	@Then("^Navigate to Authorise/Confirm Forex deals ([0-9]*)$")
	public void navigate_to_Authorise_Confirm_Forex_deals(int iteration) throws Throwable {
		launchChromeBrowser();
		loadURL("https://144.36.210.62/t24trngR14/");
		new LoginPage().loginToApplicationWithSecondUser(tdLogin.get(0).get(iteration), tdLogin.get(1).get(iteration))
				.navigateToAuthoriseConfirmForexDeals();
	}

	@Then("^Search the deal and authorise$")
	public void search_the_deal_and_authorise() throws Throwable {
		new AuthoriseConfirmForexDealsPage().clickSearchButton();
		new TransactionsSearchPage().searchTransactionId();
		new AuthoriseConfirmForexDealsPage().clickAuthorizeButton().clickAuthorizeADealButton();
		

	}*/
}
