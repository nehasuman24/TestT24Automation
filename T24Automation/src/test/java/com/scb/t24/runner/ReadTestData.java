/**
 * 
 */
package com.scb.t24.runner;

import java.util.ArrayList;
import com.scb.t24.wrappers.GenericWrappers;

/**
 * @author r.priyadharshini
 *
 */
public class ReadTestData extends GenericWrappers {
	public static ArrayList<ArrayList<String>> tdLogin = readDataFromCSV("Login");
	public static ArrayList<ArrayList<String>> tdBuyOrder = readDataFromCSV("BuyOrder");
	public static ArrayList<ArrayList<String>> tdSearchHistory = readDataFromCSV("SearchHistory");
	public static ArrayList<ArrayList<String>> tdSecurityTransfer = readDataFromCSV("SecurityTransferData");
	public static ArrayList<ArrayList<String>> tdExecutedOrdeBond = readDataFromCSV("SecurityExecutedBond");
	public static ArrayList<ArrayList<String>> tdForexForwardDeal = readDataFromCSV("ForexForwardDeal");
	public static ArrayList<ArrayList<String>> tdCreateCustomer = readDataFromCSV("CustomerAccount");
	public static ArrayList<ArrayList<String>> tdSavingsAccount = readDataFromCSV("SavingsAccount");
	public static ArrayList<ArrayList<String>> tdFCY = readDataFromCSV("FCY");
	public static ArrayList<ArrayList<String>> tdCustomerCreation = readDataFromCSV("CreateCustomer");
	public static ArrayList<ArrayList<String>> tdAAArrangementDataCapture = readDataFromCSV("AAArrangementDataCapture");
	public static ArrayList<ArrayList<String>> tdInternalAmendment = readDataFromCSV("InternalAmendment");

}
