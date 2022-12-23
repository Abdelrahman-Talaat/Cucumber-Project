Feature: edit customer functionality
  Scenario Outline: user makes to customer account successfully
    Given user is in the home page by valid credentials10 "<username>" and "<password>"
    When user clicks on edit customer and enters "<customerId>"
    Then alert message will be displayed customer does not exist
    Examples:
    |username|password|customerId|
    |mngr455793|123457@|1234 |