package com.scb.t24.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.scb.t24.runner.ReadTestData;

public class BasePage extends ReadTestData {
	public static String tranxId;
	public static String statusOfTransaction;
	public static  String IdMessage="";
	public static String message="";
	public static	String transactionId="";
	public static String strCustomerID="";
	public static String strArrangementID = "";
	public BasePage(RemoteWebDriver remoteWebDriver) {
		driver = remoteWebDriver;
		PageFactory.initElements(driver, this);
	}
}
