Feature: logout functionality
  Scenario Outline: logout successfully
    Given user is in the home page by valid credentials "<username>" and "<password>"
    When user click on logout
    Then user logout successfully
    Examples:
      |username|password|
      |     mngr455793   |   123457@     |