@smoke

Feature: User could reset his/her password successfully


  Scenario: user could search for product name
    Given user navigate to home field
    When user search for product name like apple
    Then user could search successfully and go to search page



  Scenario: user search using invalid product name
    Given   user clicks on search field
    When    user search for product name like north
    Then    user could not search for the product