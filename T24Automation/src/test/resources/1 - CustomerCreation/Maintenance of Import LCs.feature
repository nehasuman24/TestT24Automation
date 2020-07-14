Feature: Maintainance of Import LCs

Scenario Outline:  Maintainance of Import LCs

	     Given Login to the application using valid credentials <td>
	     Then Navigate to Internal Amendments
		   Then fill all the mandatory details <td>
       And Validate a Deal
       And Commit the Deal and get the transaction id
  		 Then Login to the application with another valid credentials
		   Then authorise the deal
		   And Close the Window
		   Given Login to the Application using valid credentials
       Then Navigate to Take/Reduce Margin 
		   Then fill all the mandatory details <td>
       And Validate a Deal
       And Commit the Deal and get the transaction id
  	         	 Then Login to the application with another valid credentials 
		           Then authorise the deal
		            And Close the Window
		          Given Login to the Application using valid credentials 
               Then Navigate to Amendment seeking Benef,s Consent   
		           Then fill all the mandatory details 
                And Validate a Deal
                And Commit the Deal and get the transaction id
  		         Then Login to the application with another valid credentials 
		           Then authorise the deal
	            	And Close the Window
	           	Given Login to the Application using valid credentials 
               Then Navigate to Approve/Reject Amendment of Import LC    
		           Then fill all the mandatory details 
                And Validate a Deal
                And Commit the Deal and get the transaction id
  		         Then Login to the application with another valid credentials 
		           Then authorise the deal
		            And Close the Window
		          Given Login to the Application using valid credentials 
               Then Navigate to Cancellation of Import LC    
		           Then fill all the mandatory details 
                And Validate a Deal
                And Commit the Deal and get the transaction id
  		         Then Login to the application with another valid credentials 
		           Then authorise the deal
		            And Close the Window
		          Given Login to the Application using valid credentials 
                Then Navigate to Release Margin     
		            Then fill all the mandatory details 
                And Validate a Deal
                And Commit the Deal and get the transaction id
  		         Then Login to the application with another valid credentials 
		           Then authorise the deal
		            And Close the Window

	
Examples:
		|td|
		|1|