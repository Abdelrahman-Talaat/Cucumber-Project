Feature: add customer functionality
  Scenario Outline: add customer successfully
    Given user is in the home page by valid credentials13 "<username>" and "<password>"
    When user clicks on add customer and enters the following fields  "<customerName>"  "<DOB>"  "<address>" "<city>" "<state>" "<pin>" "<telephone>" "<email>" "<password>"
    Then message will be displayed
    Examples:
    |username|password|customerName|DOB|address|city|state|pin|telephone|email|password|
    |mngr455793|123457@|Virendra|12122013|Jamnagar|Jamnagar|Gujarat|567321|8000439024|Virendra@gmail.com|67902|
