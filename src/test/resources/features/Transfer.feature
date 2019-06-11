Feature: Trasnfer Between Accounts

  Background:
    Given The main page is loaded
    Given We filled the account name field on the main page with "Test"
    And We clicked the add button on the main page
    Given We Filled the account name field on the main page with "Destination"
    And We clicked the add button on the main page
    Given We clicked the "Test" button on the main page
#    Then We clicked on the 'Income' button
#      And We fill the Income Name text field with "Test Income" on Income Page
#      And We select "others" from category on the Income Page
#      And We fill the 'AmountBS' field with "100" on the Income Page
#      And We fill the 'DateField' field with "11/06/2019" on the Income page
#      And We Click the 'Register Transaction' button on the income page
#    Then We click the 'Exit' button on the header page
#    Given We clicked the "Test" button on the main page

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






