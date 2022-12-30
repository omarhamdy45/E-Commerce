@smoke
Feature: user can  login
  Scenario: user fill data to register to website

    Given user navigate to Login page
    When  user fill login data
    Then  successfully login message displayed