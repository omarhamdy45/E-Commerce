@smoke
Feature: Logged user could add different products to wishlist

  Background:
    Given user navigate to Login page
    When  user fill login data
    Then  successfully login message displayed

  Scenario: user can add more than  product to wishlist

    Given user navigate to product page
    When  user click on add to wish button
    Then  product added  to wishlist message displayed
    And   wishlist counter is increased

