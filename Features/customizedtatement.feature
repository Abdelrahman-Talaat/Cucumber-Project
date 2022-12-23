Feature:customized statement functionality
  Scenario Outline: user access his customized statement successfully
    Given user is in the home page by valid credentials11 "<username>" and "<password>"
    When user clicks on customized statement and enter "<accNo>" and "<fromDate>" and "<toDate>" and "<minNoOfTransactions>" and "<noOfTransactions>"
    Then alert message will be displayed1
    Examples:
    |username|password|accNo|fromDate|toDate|minNoOfTransactions|noOfTransactions|
    |mngr455793|123457@|123|12122013|12122014|3|2|