Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Account creation for retail customer
    Given Login to the application using valid credentials <td>
    Then click on open current account menu
    Then click on new deal icon in the account menu
    Then fill all the mandatory details for the newly created customer <td>
    Then validate and commit the deal
    Then click on open savings account menu
    Then click on new deal icon in the account menu
    Then for the same customer fill all the mandatory details <td>
    Then validate and commit the deal
    Then click on open savings account menu
    Then click on new deal icon in the account menu
    Then for the same customer fill all the mandatory details as FCY <td>
    Then validate and commit the deal
    Then authorise the deal <tr>

    Examples: 
      | td | tr |
      |  3 |  4 |
