Feature: Create Individual Customer

Scenario Outline: Create Individual Customer

	Given Login to the application using valid credentials <td>
	Then navigate to Individual Customer
	Then Enter valid values in all the mandatory fields <td>
	Then Commit the deal
	And Capture the Customer Number generated
	Then Log out
	
Examples:
		|td|
		|1|