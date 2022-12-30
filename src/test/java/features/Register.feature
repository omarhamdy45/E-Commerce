@smoke
Feature: user can create account
  Scenario: user fill data to register to website

    Given user navigate to register page
    When  user fill data
    And   user press register button
    Then  successfully message displayed