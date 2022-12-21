Feature: fund transfer functionality
  Scenario Outline: user makes fund transfer successfully
    Given user is in the home page by valid credentials7 "<username>" and "<password>"
    When user click fund transfer and enters "<payersAccNo>" and "<payeesAccNo>" and "<amountValue>" and "<description>"
    Then alert message will be displayed that account doesn't exist
    Examples:
    |username|password|payersAccNo|payeesAccNo|amountValue|description|
    |mngr455793| 123457@  | 123  |23415|  500 |cash   |