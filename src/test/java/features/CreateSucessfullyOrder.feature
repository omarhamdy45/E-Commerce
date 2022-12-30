@smoke
Feature: Logged user could add different products to Shopping cart

  Background:
    Given user navigate to Login page
    When  user fill login data
    Then  successfully login message displayed
    And   shopping cart is increased
  Scenario: user complete his order
    Given user navigate to shopping cart page

    When  user do checkout
    And   user fill all mandatory data
    Then  Click Confirm order
    And   Successfully order message is visible
