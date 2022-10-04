$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Vtigerlogin.feature");
formatter.feature({
  "name": "As a end user I want to verify Vtiger application login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Vtiger application login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has a valid application URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_has_a_valid_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_hits_a_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should reach to login page with title \u0027vtiger\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_should_reach_to_login_page_with_title_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to login in the application with valid credentinal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has a valid application URL \u0027https://demo.vtiger.com/vtigercrm/index.php\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_has_a_valid_application_url_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_hits_a_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as \u0027admin\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_username_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as \u0027Test@123\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_password_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should reach to home page with title \u0027Dashboard\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_should_reach_to_home_page_with_title_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to login in the application with invalid credentinal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has a valid application URL \u0027https://demo.vtiger.com/vtigercrm/index.php\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_has_a_valid_application_url_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_hits_a_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as \u0027admin123\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_username_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as \u0027Test@123\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_password_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should remain in login page with title \u0027vtiger\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_should_remain_in_login_page_with_title_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify user is able to login in the application with \u003ccredentinal\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has a valid application URL \u003cappUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the username1 as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the password2 as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.step({
  "name": "User should remain in login page with title1 \u003cpageTitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "credentinal",
        "appUrl",
        "username",
        "password",
        "pageTitle"
      ]
    },
    {
      "cells": [
        "valid credentinal",
        "https://demo.vtiger.com/vtigercrm/index.php",
        "admin",
        "Test@123",
        "Dashboard"
      ]
    },
    {
      "cells": [
        "invalid credentinal",
        "https://demo.vtiger.com/vtigercrm/index.php",
        "admingau",
        "Test@123",
        "vtiger"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user is able to login in the application with valid credentinal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has a valid application URL https://demo.vtiger.com/vtigercrm/index.php",
  "keyword": "Given "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_has_a_valid_application_url_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_hits_a_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username1 as admin",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_username1_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password2 as Test@123",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_password2_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should remain in login page with title1 Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_should_remain_in_login_page_with_title1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to login in the application with invalid credentinal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has a valid application URL https://demo.vtiger.com/vtigercrm/index.php",
  "keyword": "Given "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_has_a_valid_application_url_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_hits_a_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username1 as admingau",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_username1_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password2 as Test@123",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.enter_the_password2_as_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should remain in login page with title1 vtiger",
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger_stepdefinition.user_should_remain_in_login_page_with_title1(String)"
});
formatter.result({
  "status": "passed"
});
});