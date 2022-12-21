Feature: delete account functionality
  Scenario Outline: delete account successfully
    Given user is in the home page by valid credentials3 "<username>" and "<password>"
    When user clicks on delete account and enters "<accNo>"
    Then alert will be displayed to confirm delete account
    Examples:
    |username|password|accNo|
    |         mngr455793   |   123457@            |12345|
