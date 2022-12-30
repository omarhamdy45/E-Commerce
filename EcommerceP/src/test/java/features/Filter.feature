@smoke
Feature: Logged user could filter with color
  Scenario: user can filter products with product like shoes
    Given user navigate to shoes page
    When  user Select color like red
    Then  all shoes with red is displayed