@smoke
Feature: Logged user could add different products to Shopping cart

  Background:
    Given user navigate to Login page
    When  user fill login data
    Then  successfully login message displayed

  Scenario: user can add more than  product to cart

    Given user navigate to product page
    When  user click on add to compare list button
    Then  product added to compare list message displayed

