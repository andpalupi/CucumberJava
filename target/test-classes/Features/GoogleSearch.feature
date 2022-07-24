Feature: feature to test google search funcationality

  Scenario: Validate google search is working
    Given browser is open
    And user is on Verint page
    When users click the search button
    And users enters a text in search box
    And hits enter
    When user is navigated to search results
    Then verify search result

    #Examples:
    #|text|
    #|Customer Solution|