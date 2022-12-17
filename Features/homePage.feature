Feature:Check Home Page By Verify Manager Id
  Scenario: Get Manager Id
    Given User already login successfully
    When User is in the home page
    Then User can verify manager id message that is displayed in the home page