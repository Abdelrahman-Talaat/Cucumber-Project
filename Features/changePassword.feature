Feature: change password functionality
 Scenario Outline:change password successfully and login again
   Given  user is in the home page by valid credentials1 "<username>" and "<password>"
   When user clicks on change password button
   And user enter "<oldPassword>" and "<newPassword>" and "<confirmedPassword>"
   Then user can login again with the changed password "<newPassword>"
   Examples:
   |username|password|oldPassword|newPassword|confirmedPassword|
   |     mngr455793   |   123457@     |123457@|123457@|123457@|
