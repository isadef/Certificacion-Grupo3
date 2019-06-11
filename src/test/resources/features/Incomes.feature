Feature: Manage Income
  Background:
    Given The main page is loaded
    Given We filled the account name field on the main page with "Test"
    And We clicked the add button on the main page
    Given We clicked the "Test" button on the main page
  Scenario: Create an income category
    Given We clicked the 'Income' button on the main menu page
    And We fill the 'category name' field with "Prueba" on the Transactions page
    And We click the 'Register Category' button on the Transactions page
    Then Search the 'category success' alert on the Transactions page
    And Search the category option "Prueba" on the category selector on the Transactions page

  Scenario: create an income and show correct message
    Given We clicked the 'Expenses' button on the main menu page
    And  We fill the 'expense name' field with "Prueba" on the Transactions page
    And We select the "Others" values on the category selector on the Transactions page
    And We fill the 'AmountBS' field with "100" on the Transactions page
    And We fill the 'DateField' field with "23/05/2019" on the Transactions page
    And We click the 'Register Transition' button on the Transaction page
    Then Search the 'transaction fail' alert on the Transactions page