Feature: Access a Product via category after applying multiple filters

	@SmokeTest
  Scenario: verify filters result
    Given browser is open
    And user is on home web page
    When user click the general category button
   	And user click the category button
    And user click the sub category button
    When user click filter button
    And user select the filter
    When user is navigated to filter results
    Then verify filter result

