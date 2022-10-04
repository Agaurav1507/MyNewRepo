$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Vtiger1.feature");
formatter.feature({
  "name": "Check Vtiger all Functionalities in detail",
  "description": "",
  "keyword": "Feature"
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
  "location": "TestVtiger1_stepdefinition.user_has_a_valip_application_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits a login page url",
  "keyword": "When "
});
formatter.match({
  "location": "TestVtiger1_stepdefinition.user_hits_the_login_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as \u0027admin\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger1_stepdefinition.enter_the_username_as_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as \u0027Test@123\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger1_stepdefinition.enter_the_password_as_test123(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "TestVtiger1_stepdefinition.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should reach to home page with title \u0027Dashboard\u0027",
  "rows": [
    {
      "cells": []
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestVtiger1_stepdefinition.user_should_reach_to_home_page_with_title(String,String)"
});
formatter.result({
  "status": "passed"
});
});