Feature: create the account

  Scenario: create account successfully
    When create an account for user "kim" and password "123"
    Then exists an account for user "kim" and password "123"