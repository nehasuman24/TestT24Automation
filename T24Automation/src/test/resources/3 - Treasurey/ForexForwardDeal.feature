Feature: Forex Forward Deal

  Scenario Outline: Scenario1 - Forex Forward Deal Input
    Given Login to the application using valid credentials <td>
    Then Navigate to Capture Forex Forward Deal
    Then Enter Mandatory fields in Forex Forward deal <td>
    And Commit the Deal and get the transaction id
    Then Navigate to Authorise/Confirm Forex deals <tr>
    Then Search the deal and authorise
    Then Get the transaction Id and close the application.

    Examples: 
      | td | tr |
      |  1 |  2 |
