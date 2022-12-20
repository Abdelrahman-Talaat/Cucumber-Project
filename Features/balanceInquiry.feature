Feature: balance inquiry functionality
  Scenario Outline: check account balance successfully
    Given user is in the home page by valid credentials2 "<username>" and "<password>"
    When user clicks on balance inquiry
    When user enters Acc No "<accNo>" and click submit
    Then alert will be displayed and when accept it user will be directed to balance inquiry form

    Examples:
    |username|password|accNo|
    |         mngr455793   |   123457@      |   12345  |