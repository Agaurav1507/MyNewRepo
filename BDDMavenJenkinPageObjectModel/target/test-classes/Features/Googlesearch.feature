Feature: Perform Google Search Based On Requirement

  @tag1
  Scenario: Search 'selenium interview questions' in Google
    
    Given User is already in google search page
    When User types 'selenium interview questions' in search input field and clicks on search button
    Then user gets search result page with the title 'selenium interview questions - Google Search'
    And Close the opened browser

  @tag2
  Scenario Outline: Search <texttobesearched> in google search page
    
    Given User is already in google search page
    When User types <texttobesearched> in search input field and clicks on search button
    Then user reached to search result page with the title <expectedtitle>
    And close the opened browser

    Examples: 
      | texttobesearched | expectedtitle                |
      | selenium 3.0     | selenium 3.0 - Google search |
      | selenium 4.0     | selenium 4.0 - Google search |
