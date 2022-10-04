Feature: Check Vtiger all Functionalities in detail

  Scenario: Verify user is able to login in the application with valid credentinal
    Given User has a valid application URL 'https://demo.vtiger.com/vtigercrm/index.php'
    When User hits a login page url
    And Enter the username as 'admin'
    And Enter the password as 'Test@123'
    And Click on Signin button
    Then User should reach to home page with title 'Dashboard'
      | 
