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
  "name": "Actitime home page will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Testacti_stepdefinition.actitime_home_page_will_be_displayed_()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [actiTIME -  Enter Time-Track] but found [actiTIME - Login]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertEquals(Assert.java:125)\r\n\tat org.testng.Assert.assertEquals(Assert.java:178)\r\n\tat org.testng.Assert.assertEquals(Assert.java:188)\r\n\tat stepdefinition.Testacti_stepdefinition.actitime_home_page_will_be_displayed_(Testacti_stepdefinition.java:49)\r\n\tat ✽.Actitime home page will be displayed(src/test/resources/Features/Acitime.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Testacti_stepdefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});