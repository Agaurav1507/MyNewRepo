Feature: Perform Google Search Based On Requirement

  @tag1 
 Scenario: Search 'selenium interview questions' in Google
   
    Given User is already in google search page
    When User types 'selenium interview questions' in search input field and clicks on search button
    Then user gets search result page with the title 'selenium interview questions - Google Search'
    And Close the opened browser