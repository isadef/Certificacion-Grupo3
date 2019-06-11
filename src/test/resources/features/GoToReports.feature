Feature: Go to reports for new account

  Background:
    Given The main page is loaded
    Given We filled the account name field on the main page with "Test"
    And We clicked the add button on the main page

  Scenario: Check that the title of the reports page includes the account name
    Given We clicked the "Test" button on the main page
    When We click 'Reports' button on the main menu page
    Then The title is "Reports for: Test"

#  Scenario: Check that the reports table is empty when there is no data for the account
#    Given We clicked the "Test" button on the main page
#    When We click 'Reports' button on the main menu page
#    And We select 'By category' in the select option on the reports page
#    And We click the 'Show report' button on the reports page
#    Then The table has "0" rows