Feature: add account functionality
  Scenario Outline: user can add account successfully
    Given user is in the home page by valid credentials12 "<username>" and "<password>"
    When user clicks on add account and enters "<customerId>" and "<accountType>" and "<initialDeposit>"
    Then alert message will be displayed2
    Examples:
    |username|password|customerId|accountType|initialDeposit|
    |mngr455793|123457@|12345|Savings|500|