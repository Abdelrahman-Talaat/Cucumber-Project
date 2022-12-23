Feature: check mini statement functionality
  Scenario Outline: know account statement successfully
    Given user is in the home page by valid credentials8 "<username>" and "<password>"
    When user click miniStatement and enter the account number "<accNO>"
    Then alert message will be displayed that account doesn't exist1
    Examples:
    |username|password|accNO|
    |mngr455793|123457@ |1234|