package com.scb.t24.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/1 - CustomerCreation/Maintenance of Import LCs.feature", glue = {
		"com.scb.t24.glue"})
public class TestRunner {
	

}



// , format = { "pretty", "html:target/cucumber-html-report","json:target/cucumber-html-report/cucumber.json"}

/*
package com.scb.t24.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//C://Users//janani.pachiappan//workspace//com.T24.Automation//
//C://Users//janani.pachiappan//workspace//com.T24.Automation//
@CucumberOptions(features="src/test/resources/LoanModule/Homeloan.feature",glue={"com.scb.t24.glue"})
//@CucumberOptions(features="src/test/resources/LoanModule/Loanwithcollateral.feature,")
public class TestRunner {

}  */

