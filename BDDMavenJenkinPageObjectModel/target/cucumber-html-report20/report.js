$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Acitime.feature");
formatter.feature({
  "name": "Testing actitime application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing actitime login functionality for valid user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already having application URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_is_already_having_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username \u0027admin\u0027 and password \u0027manager\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_enter_the_username_admin_and_password_manager(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page will be displayed as \u0027actiTIME - Enter Time-Track\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "Testacti_stepdefinition.actitime_home_page_will_be_displayed_(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Testing actitime login functionality for \u003cuser\u003e \u003cusername\u003e \u003cpassword\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having application URL as \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "also having username as \u003cusername\u003e and password as \u003cpassword\u003e for the application",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Actitime home page will be displayed with the application title as \u003ctitle\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "url",
        "username",
        "password",
        "title"
      ]
    },
    {
      "cells": [
        "valid",
        "https://demo.actitime.com/",
        "admin",
        "manager",
        "actiTIME - Enter Time-Track"
      ]
    },
    {
      "cells": [
        "invalid",
        "https://demo.actitime.com/",
        "admin12",
        "manager",
        "actiTIME - Login"
      ]
    },
    {
      "cells": [
        "invalid",
        "https://demo.actitime.com/",
        "admin",
        "manager23",
        "actiTIME - Login"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing actitime login functionality for valid admin manager",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having application URL as https://demo.actitime.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_is_already_having_application_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also having username as admin and password as manager for the application",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.also_having_username_as_and_password_as_for_the_application(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page will be displayed with the application title as actiTIME - Enter Time-Track",
  "keyword": "Then "
});
formatter.match({
  "location": "Testacti_stepdefinition.actitime_home_page_will_be_displayed_with_the_application_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing actitime login functionality for invalid admin12 manager",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having application URL as https://demo.actitime.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_is_already_having_application_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also having username as admin12 and password as manager for the application",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.also_having_username_as_and_password_as_for_the_application(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page will be displayed with the application title as actiTIME - Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Testacti_stepdefinition.actitime_home_page_will_be_displayed_with_the_application_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing actitime login functionality for invalid admin manager23",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already having application URL as https://demo.actitime.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_is_already_having_application_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also having username as admin and password as manager23 for the application",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.also_having_username_as_and_password_as_for_the_application(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Testacti_stepdefinition.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page will be displayed with the application title as actiTIME - Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Testacti_stepdefinition.actitime_home_page_will_be_displayed_with_the_application_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});