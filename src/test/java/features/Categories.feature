@smoke
Feature: Logged user could select different Categories


  Scenario: user can select categories and sub categories if found
    Given   user navigate to homee page
    When    user select category and subcategory
    And     user click on subcategory
    Then    user find relative product page