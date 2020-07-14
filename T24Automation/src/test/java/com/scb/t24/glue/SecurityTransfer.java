package com.scb.t24.glue;

import com.scb.t24.pages.LoginPage;
import com.scb.t24.pages.Secruity_TransferInPage;
import com.scb.t24.pages.SecurityAuthoriseAndReversalPage;
import com.scb.t24.pages.SecurityHomePage;
import com.scb.t24.runner.ReadTestData;
import com.scb.t24.wrappers.GenericWrappers;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityTransfer extends ReadTestData {

	//	@Given("^Login to the Applicaiton using login credentials$")
	//	public void login_to_the_Applicaiton_using_login_credentials() throws Throwable {
	//		openChromeBrowser();
	//		new Login().loadURL();
	//		new Login().loginToApplication();
	//	}
	@Then("^Navigate to Transfer In Screen$")
	public void navigate_to_Transfer_In_Screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		new SecurityHomePage().SecurityTransferInHome();
	}

	@Then("^Enter Mandatory fields in Transfer In Screen ([0-9]*)$")
	public void enter_Mandatory_fields_in_Transfer_In_Screen(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new Secruity_TransferInPage().SecurityTransfers(tdSecurityTransfer.get(0).get(iteration),tdSecurityTransfer.get(1).get(iteration),tdSecurityTransfer.get(2).get(iteration),tdSecurityTransfer.get(3).get(iteration));
	}
	@Then("^Navigate to Transfer Out Screen$")
	public void navigate_to_Transfer_Out_Screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SecurityHomePage().SecurityTransferOutHome();
	}
	@Then("^Enter Mandatory fields in Transfer Out Screen ([0-9]*)$")
	public void enter_Mandatory_fields_in_Transfer_Out_Screen(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new Secruity_TransferInPage().SecurityTransfers(tdSecurityTransfer.get(0).get(iteration),tdSecurityTransfer.get(1).get(iteration),tdSecurityTransfer.get(2).get(iteration),tdSecurityTransfer.get(3).get(iteration));
	}


	@Then("^Commit the Deal and get the transaction id\\.$")
	public void commit_the_Deal_and_get_the_transaction_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new Secruity_TransferInPage().ValidateAndCommitTheDeal();
	}

	@Then("^Navigate to Authorise transfers screen ([0-9]*)$")
	public void navigate_to_Authorise_transfers_screen(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SecurityAuthoriseAndReversalPage().txncompletemessage();
		new SecurityAuthoriseAndReversalPage().Close();
		switchToLastWindowWithSSLError();
		new SecurityHomePage().SignOff();
		new LoginPage().LogOff();
		new LoginPage().loginToApplicationWithSecondUser(tdLogin.get(0).get(iteration),tdLogin.get(1).get(iteration));
		//new SecurityAuthoriseAndReversalPage().Close();
		new SecurityHomePage().AutoriseTransfersHome();
	}

	@Then("^click on search screen and serach using transaction id\\.$")
	public void click_on_search_screen_and_serach_using_transaction_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switchToLastWindowWithSSLError();
		new SecurityAuthoriseAndReversalPage().AuthoriseText();
	}

	@Then("^click find$")
	public void click_find() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SecurityAuthoriseAndReversalPage().Find();
	}

	@Then("^click the authorise button for the selected transaction\\.$")
	public void click_the_authorise_button_for_the_selected_transaction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SecurityAuthoriseAndReversalPage().AuthoriseId();
	}

	@Then("^authorise the deal\\.$")
	public void authorise_the_deal() throws Throwable {
		Thread.sleep(1000);
		new SecurityAuthoriseAndReversalPage().AuthoriseDeal();
		new SecurityAuthoriseAndReversalPage().CompletedScenario();
		Thread.sleep(1000);
		closeAllBrowser();
	}
}

