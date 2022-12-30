@smoke
Feature: Logged User could switch between currencies US-Euro
  Scenario: user switch us to euro
    Given user navigate to home page
    When user click on drop down list and click on Euro
    Then All the products change to euro symbol