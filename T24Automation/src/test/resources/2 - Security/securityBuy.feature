Feature: Security Order Buy

Scenario Outline: Security Buy Order Verfication

	Given Login to the application using valid credentials <td>
	Then  Navigate to Buy Order
	Then  Enter Mandatory fields in Security Buy Order <td>
	And Commit the Deal and fetch the transaction id
	Then Navigate to Order Execution Bonds from Middle Office <td>
	When Click on Drill down button
	Then Enter mandatory fields <td>
	And Commit the Deal and Capture the transation id
	Then Select Search History File from the dropdown and Submit <td>
	Then Search with the id
	Then Get the Sec Trade Id from the Execute Open Orders page
	And Close the Window <td>
	Then Navigate to Securities Transaction
	Then Search with the Sec trade id and click the Drill down
	And Commit the deal and retrive the transaction id
	
	Examples:
		|td|
		|1|