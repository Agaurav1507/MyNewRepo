$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/AUTOMATIONCLASSES/WORKSPACE/BDDMavenJenkinPageObjectModel/src/test/resources/Features/Acitime.feature");
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
  "location": "TestActitimeStepDefinition.user_is_already_having_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "also having username and password",
  "keyword": "And "
});
formatter.match({
  "location": "TestActitimeStepDefinition.also_having_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "TestActitimeStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Actitime home page will be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestActitimeStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});