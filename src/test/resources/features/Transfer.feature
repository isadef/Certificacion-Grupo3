Feature: Trasnfer Between Accounts

  Background:
    Given The main page is loaded
    Given We filled the account name field on the main page with "Test"
    And We clicked the add button on the main page
    Given We Filled the account name field on the main page with "Destination"
    And We clicked the add button on the main page
    Given We clicked the "Test" button on the main page
    Given We clicked the 'Income' button on the main menu page
    And  We fill the 'income name' field with "Test Income" on the Transactions page
    And We select the "Others" values on the category selector on the Transactions page
    And We fill the 'AmountBS' field with "100" on the Transactions page
    And We fill the 'DateField' field with "23/05/2019" on the Transactions page
    And We click the 'Register Transition' button on the Transaction page
    Then We click the 'Exit' button on the header page
    Given We clicked the "Test" button on the main page

  Scenario: Check Error Message When No Category is Selected to Transfer
    Given We clicked the 'Transfer' Button on the main menu page
    And we fill 'amount in BS' text field with "100" on transfer page
    And We click the 'Transfer' Button
    Then Search the 'Error Message' fail alert on transfer page

  Scenario: Check Error Message When No Ammount is filled in text field to Transfer
    Given We clicked the 'Transfer' Button on the main menu page
    And We select the "Destination" value on 'Destination Account' selector on Transfer Pager
    And We click the 'Transfer' Button
    Then Search the 'Error Message' fail alert on transfer page

  Scenario: Check Success Message When Transfered Correctly
    Given We clicked the 'Transfer' Button on the main menu page
    And We select the "Destination" value on 'Destination Account' selector on Transfer Pager
    And we fill 'amount in BS' text field with "50" on transfer page
    And We click the 'Transfer' Button
    Then Search the 'Success Message' alert on transfer page











