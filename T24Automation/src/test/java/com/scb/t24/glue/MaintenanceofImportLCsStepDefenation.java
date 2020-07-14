package com.scb.t24.glue;


import com.scb.t24.pages.HomePage;
import com.scb.t24.pages.InternalAmendmentpage;
import com.scb.t24.runner.ReadTestData;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MaintenanceofImportLCsStepDefenation extends ReadTestData {
	
	

@Then("^Navigate to Internal Amendments$")
public void navigate_to_Internal_Amendments() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    new HomePage().navigateInternalAmendment();
    throw new PendingException();
}

@Then("^fill all the mandatory details ([0-9]*)$")
public void fill_all_the_mandatory_details(int iteration) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	new InternalAmendmentpage().Amendmentpage(tdInternalAmendment.get(0).get(iteration), tdInternalAmendment.get(1).get(iteration)
			);
    
}

@Then("^Login to the application with another valid credentials$")
public void login_to_the_application_with_another_valid_credentials(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
    new HomePage().navigateInternalAmendment();
    
}

@Then("^authorise the deal$")
public void authorise_the_deal(String strtransac) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	new InternalAmendmentpage().AuthorizeDelImportLCsAmendmentsPage(strtransac);
    
}

@Then("^Close the Window$")
public void close_the_Window() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	new InternalAmendmentpage().Closethewindow();
    
}

@Given("^Login to the Application using valid credentials$")
public void login_to_the_Application_using_valid_credentials(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^Navigate to Take/Reduce Margin$")
public void navigate_to_Take_Reduce_Margin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^Navigate to Amendment seeking Benef,s Consent$")
public void navigate_to_Amendment_seeking_Benef_s_Consent() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^Navigate to Approve/Reject Amendment of Import LC$")
public void navigate_to_Approve_Reject_Amendment_of_Import_LC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^Navigate to Cancellation of Import LC$")
public void navigate_to_Cancellation_of_Import_LC() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^Navigate to Release Margin$")
public void navigate_to_Release_Margin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}



}
