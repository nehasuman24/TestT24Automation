package com.scb.t24.glue;

import com.scb.t24.pages.BackOffice_HomePage;
import com.scb.t24.pages.FrontOfficePage;
import com.scb.t24.pages.LoginPage;
import com.scb.t24.pages.MidOffi_ExecutedOrderBondPage;
import com.scb.t24.pages.SearchHistoryFilePage;
import com.scb.t24.pages.SecurityHomePage;
import com.scb.t24.pages.UnexecutedOrderBondPage;
import com.scb.t24.runner.ReadTestData;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityBuy extends ReadTestData {

	@Then("^Navigate to Buy Order$")
	public void navigate_to_Buy_Order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		new SecurityHomePage().navigateBuyOrder();
	}

	@Then("^Enter Mandatory fields in Security Buy Order ([0-9]*)$")
	public void enter_Mandatory_fields_in_Security_Buy_Order(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new FrontOfficePage().BuyOrderform(tdBuyOrder.get(0).get(iteration), tdBuyOrder.get(1).get(iteration),
				tdBuyOrder.get(2).get(iteration), tdBuyOrder.get(3).get(iteration));
	}

	@Then("^Navigate to Sell Order$")
	public void navigate_to_Sell_Order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		new SecurityHomePage().navigateSellOrder();
	}

	@Then("^Enter Mandatory fields in Security Sell Order ([0-9]*)$")
	public void enter_Mandatory_fields_in_Security_Sell_Order(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new FrontOfficePage().BuyOrderform(tdBuyOrder.get(0).get(iteration), tdBuyOrder.get(1).get(iteration),
				tdBuyOrder.get(2).get(iteration), tdBuyOrder.get(3).get(iteration));
	}

	@Then("^Commit the Deal and fetch the transaction id$")
	public void commit_the_Deal_and_fetch_the_transaction_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new FrontOfficePage().CommitAndGetId();
		closeAllBrowser();

	}

	@Then("^Navigate to Order Execution Bonds from Middle Office ([0-9]*)$")
	public void navigate_to_Order_Execution_Bonds_from_Middle_Office(int iteration) throws Throwable {
		sleep(5000);
		launchChromeBrowser();
		loadURL("https://144.36.210.62/t24trngR14/servlet/BrowserServlet");
		new LoginPage().loginToApplication(tdLogin.get(0).get(iteration), tdLogin.get(1).get(iteration));

		switchToLastWindowWithSSLError();
		new SecurityHomePage().MiddleOffice();
	}

	@When("^Click on Drill down button$")
	public void click_on_Drill_down_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switchToLastWindowWithSSLError();
		new UnexecutedOrderBondPage().UnExecutedOrderBonds();
	}

	@Then("^Enter mandatory fields ([0-9]*)$")
	public void enter_mandatory_fields(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new MidOffi_ExecutedOrderBondPage().ExecutedOrder(tdExecutedOrdeBond.get(0).get(iteration),
				tdExecutedOrdeBond.get(1).get(iteration), tdExecutedOrdeBond.get(2).get(iteration),
				tdExecutedOrdeBond.get(3).get(iteration));
	}

	@Then("^Commit the Deal and Capture the transation id$")
	public void commit_the_Deal_and_Capture_the_transation_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new MidOffi_ExecutedOrderBondPage().ValidateAndCommit();
	}

	@Then("^Select Search History File from the dropdown and Submit ([0-9]*)$")
	public void select_Search_History_File_from_the_dropdown_and_Submit(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SearchHistoryFilePage().SearchHistory(tdSearchHistory.get(0).get(iteration));
	}

	@Then("^Search with the id$")
	public void search_with_the_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SearchHistoryFilePage().SearchWithId();
	}

	@Then("^Get the Sec Trade Id from the Execute Open Orders page$")
	public void get_the_Sec_Trade_Id_from_the_Execute_Open_Orders_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new SearchHistoryFilePage().GetTradeId();
	}

	@Then("^Close the Window ([0-9]*)$")
	public void close_the_Window(int iteration) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
		switchToLastWindowWithSSLError();
		closeAllBrowser();
		sleep(5000);
		launchChromeBrowser();
		loadURL("https://144.36.210.62/t24trngR14/servlet/BrowserServlet");
//		acceptSSLError();
		new LoginPage().loginToApplication(tdLogin.get(0).get(iteration), tdLogin.get(1).get(iteration));
	}

	@Then("^Navigate to Securities Transaction$")
	public void navigate_to_Securities_Transaction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switchToLastWindowWithSSLError();
		new SecurityHomePage().navigateSecuritiesTransaction();
	}

	@Then("^Search with the Sec trade id and click the Drill down$")
	public void search_with_the_Sec_trade_id_and_click_the_Drill_down() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switchToLastWindowWithSSLError();
		new BackOffice_HomePage().SearchSecid();
	}

	@Then("^Commit the deal and retrive the transaction id$")
	public void commit_the_deal_and_retrive_the_transaction_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		new BackOffice_HomePage().transactioncomplete();
		closeAllBrowser();
		sleep(5000);
	}

}
