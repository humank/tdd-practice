Feature: add the budget

  Scenario: Add budget successfully
    When Add budget 1000 for "2017-10"
    Then exists budget 1000 for "2017-10"