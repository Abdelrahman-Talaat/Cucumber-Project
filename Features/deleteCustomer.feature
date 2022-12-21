Feature: delete customer functionality
  Scenario Outline: delete customer successfully
    Given user is in the home page by valid credentials4 "<username>" and "<password>"
    When user clicks delete customer and enters customer id "<customerId>"
    Then alert will be displayed to confirm delete customer
    Examples:
      |username|password|customerId|
      |         mngr455793   |   123457@            |12345|
