Feature: feature to test google search funcationality

	
  Scenario: Validate google search is working
    Given browser is open
    And user is on home web page
    When user type in the search bar
    And user select category
    And user click the search button
    When user is navigated to search results
    Then verify search result

    #Examples:
    #|text|
    #|Customer Solution|