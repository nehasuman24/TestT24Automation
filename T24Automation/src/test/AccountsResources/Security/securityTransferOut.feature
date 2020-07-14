Feature: Security Transfer Out

Scenario Outline: Security Transfer Out Verification

	Given Login to the application using valid credentials <td>
	Then  Navigate to Transfer Out Screen
	Then  Enter Mandatory fields in Transfer Out Screen <td>
	And Commit the Deal and get the transaction id. 
	Then Navigate to Authorise transfers screen <tr>
	And click on search screen and serach using transaction id.
	And click find
	Then click the authorise button for the selected transaction.
	And authorise the deal.
	
		Examples:
		|td|tr|
		|1|2|