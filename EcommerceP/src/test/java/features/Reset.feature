@smoke
Feature: user can reset  your password
  Scenario: User could reset his/her password successfully

    Given user navigate to reset page
    When  user enter email
    Then  successfully recovery message displayed