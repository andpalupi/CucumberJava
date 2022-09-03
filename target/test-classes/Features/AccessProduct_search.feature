Feature: feature to test google search funcationality

	@SmokeTest
  Scenario: Validate google search is working
    Given open browser
    And home web page
    When user enters a text in search box
    And user select category
    And user click the search button
    When user is navigated to search results
    Then verify search result
