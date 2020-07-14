package com.scb.t24.glue;

import com.scb.t24.pages.AAArrangementActivityPage;
import com.scb.t24.pages.AAArrangementPage;
import com.scb.t24.pages.AAArrangementSimulationDataCapturePage;
import com.scb.t24.pages.AAProductCatalogPage;
import com.scb.t24.pages.DepositOverviewPage;
import com.scb.t24.pages.HomePage;
import com.scb.t24.pages.LoginPage;
import com.scb.t24.runner.ReadTestData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FloatingDepositStepDefenitionFile extends ReadTestData {

	@Then("^Navigate to Floating Deposit$")
	public void navigate_to_Floating_Deposit() throws Throwable {
		new HomePage().navigateToAAProductCatalog();
	}

	@Then("^Click on New Arrangement icon$")
	public void click_on_New_Arrangement_icon() throws Throwable {
		new AAProductCatalogPage().navigateToAAArrangementSimulationDataCapture();
	}

	@Then("^Enter Customer and Currency fields with valid values ([0-9]*)$")
	public void enter_Customer_and_Currency_fields_with_valid_values(int iteration) throws Throwable {
		new AAArrangementSimulationDataCapturePage().captureCustomerandCurrency(tdAAArrangementDataCapture.get(0).get(iteration),tdAAArrangementDataCapture.get(1).get(iteration));
	}

	@Then("^Validate a Deal$")
	public void validate_a_Deal() throws Throwable {
		new AAArrangementSimulationDataCapturePage().validateaDeal();
	}

	@Then("^input all mandatory fields with valid values ([0-9]*)$")
	public void input_all_mandatory_fields_with_valid_values(int interation) throws Throwable {
		new AAArrangementSimulationDataCapturePage().captureMandatoryFields(tdAAArrangementDataCapture.get(2).get(interation),
																			tdAAArrangementDataCapture.get(3).get(interation),
																			tdAAArrangementDataCapture.get(4).get(interation),
																			tdAAArrangementDataCapture.get(5).get(interation),
																			tdAAArrangementDataCapture.get(6).get(interation));
	}

	@Then("^Commit the Deal and get the transaction id$")
	public void commit_the_Deal_and_get_the_transaction_id() throws Throwable {
		new AAArrangementSimulationDataCapturePage().commitAndGetTransactionID();
	}

	@Given("^Logout from the Application$")
	public void logout_from_the_Application() throws Throwable {
		new HomePage().signOff();
	}

	@Given("^Login to the Applicaiton using Authoriser credentials ([0-9]*)$")
	public void login_to_the_Applicaiton_using_Authoriser_credentials(int iteration) throws Throwable {
		if(tdLogin.get(2).get(iteration).equalsIgnoreCase("IE")){
			launchIeBrowser();
			loadURL("http://10.237.37.99/t24trngR14/servlet/BrowserServlet");
			acceptSSLError();
		}else{
			launchChromeBrowser();
			loadURL("http://10.237.37.99/t24trngR14/servlet/BrowserServlet");
		}
		new LoginPage().loginToApplicationWithSecondUser(tdLogin.get(0).get(iteration), tdLogin.get(1).get(iteration));	
	}

	@Then("^Navigate to Deposit Arrangements and Unauthorised Tab$")
	public void navigate_to_Deposit_Arrangements_and_Unauthorised_Tab() throws Throwable {
		new HomePage().navigateToArrangementAndUnauthorizedTab();
		new AAArrangementPage().navigateToUnauthorisedTab();
		
	}

	@Then("^input the Deal to be authorised$")
	public void input_the_Deal_to_be_authorised() throws Throwable {
		new AAArrangementPage().dealAuthorisation();
		new DepositOverviewPage().navigateToAuthorisePage();
	}

	@Then("^Authorise the deal$")
	public void authorise_the_deal() throws Throwable {
		new AAArrangementActivityPage().authoriseDeal();
	}

}
