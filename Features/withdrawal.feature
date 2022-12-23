Feature: withdrawal functionality
  Scenario Outline: user makes withdrawal function successfully
    Given user is in the home page by valid credentials9 "<username>" and "<password>"
    When  user clicks on withdrawal and enter "<accNo>" and "<amountValue>" and "<description>"
    Then alert message will be displayed Account does not exist
    Examples:
    |username|password|accNo|amountValue|description|
    |mngr455793|123457@|123|500|cash|