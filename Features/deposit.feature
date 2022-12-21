Feature: check deposit functionality
  Scenario Outline:user make deposit process successfully
  Given user is in the home page by valid credentials6 "<username>" and "<password>"
    When user clicks deposit and enters "<accNo>" and "<amountValue>" and "<description>"
    Then alert message will be displayed
    Examples:
    |username|password|accNo|amountValue|description|
    | mngr455793   | 123457@|12345 |500 |  cash |