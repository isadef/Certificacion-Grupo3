Feature: Verify Account Settings Functionality
  Background:
    Given The main page is loaded
    And We filled the account name field on the main page with "Settings"
    And We clicked the add button on the main page

  Scenario: Check if an account is deleted
    Given We clicked the "Settings" button on the main page
    When We click 'Account Settings' button on the main menu page
    And We click the 'Delete account' button on the account settings page
    Then Account menu has 1 account button

  Scenario: Check if the account title changes
    Given We clicked the "Settings" button on the main page
    When We click 'Account Settings' button on the main menu page
    And We change the account name field on the account settings page by adding "Testing" to it
    And We click the 'Change name' button on the account settings page
    And We click the 'Exit' like button on the account settings page
    Then The account title is "SettingsTesting"


