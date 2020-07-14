Feature: Title of your feature

  Scenario Outline: Creation of Deposit from AA Deposit -  Floating Deposit
    Given Login to the application using valid credentials <td>
    Then Navigate to Floating Deposit
    And Click on New Arrangement icon
    Then Enter Customer and Currency fields with valid values <td>
    And Validate a Deal
    Then input all mandatory fields with valid values <td>
    And Commit the Deal and get the transaction id
    Given Logout from the Application
    Given Login to the Applicaiton using Authoriser credentials <tr>
    Then Navigate to Deposit Arrangements and Unauthorised Tab
    And input the Deal to be authorised
    Then Authorise the deal
    Given Logout from the Application

    Examples: 
      | td | tr |
      |  1 |  2 |
