/**
 * 
 */
package com.scb.t24.glue;

import com.scb.t24.pages.AuthoriseDeleteMMTransactionsPage;
import com.scb.t24.pages.HomePage_Threasurey;
import com.scb.t24.pages.LoginPage;
import com.scb.t24.pages.MoneyMarketCallNoticeContractPage;
import com.scb.t24.pages.TransactionsSearchPage;
import com.scb.t24.runner.ReadTestData;
import com.scb.t24.pages.GetTransactionIdStatusPage;
import cucumber.api.java.en.Then;

/**
 * @author dineshkumar.rc
 *
 */
public class MMStepDefenitionFile extends ReadTestData {

	@Then("^Navigate to MM Takings/Deposits$")
	public void navigate_to_MM_Takings_Deposits() throws Throwable {
		new HomePage_Threasurey().navigateToMMDeposit();
	}

	@Then("^Navigate to Call/Notice Contracts$")
	public void navigate_to_Call_Notice_Contracts() throws Throwable {
		new HomePage_Threasurey().navigateToCallNoticeContracts();
	}

	@Then("^Enter Mandatory fields in MM Contract$")
	public void enter_Mandatory_fields_in_MM_Contract() throws Throwable {
		new MoneyMarketCallNoticeContractPage().enterMandatoryFields();

	}

	@Then("^Commit the Contract and get the transaction id$")
	public void commit_the_Contract_and_get_the_transaction_id() throws Throwable {
		new MoneyMarketCallNoticeContractPage().clickCommitContract().getTransactionId();
		closeAllBrowser();
		sleep(5000);
	}

	@Then("^Navigate to Authorise/Delete MM Transactions$")
	public void navigate_to_Authorise_Delete_MM_Transactions(int iteration) throws Throwable {
		launchChromeBrowser();
		loadURL("https://144.36.210.62/t24trngR14/servlet/BrowserServlet");
		new LoginPage().loginToApplicationWithSecondUser(tdLogin.get(0).get(iteration),tdLogin.get(1).get(iteration)).navigateToAuthoriseDeleteMMTransactions();

	}

	@Then("^Search the contract and authorise$")
	public void search_the_contract_and_authorise() throws Throwable {
		switchToLastWindowWithSSLError();
		new AuthoriseDeleteMMTransactionsPage().clickSearchButton();
		new TransactionsSearchPage().searchTransactionId();
		new AuthoriseDeleteMMTransactionsPage().clickAuthorizeButton().clickAuthorizeADealButton();
	}

	@Then("^Get the transaction Id and close the application\\.$")
	public void get_the_transaction_Id_and_close_the_application() throws Throwable {
		new GetTransactionIdStatusPage().getTransactionId().closeAllBrowser();
	}

}
