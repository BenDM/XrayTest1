$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate google search text field",
  "description": "",
  "id": "google-search;validate-google-search-text-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to google page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I validate the search tesxt field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_open_a_browser()"
});
formatter.result({
  "duration": 103400271,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat Test.StepDefinitions.i_open_a_browser(StepDefinitions.java:13)\r\n\tat ✽.Given I open a browser(Sample.feature:4)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_google_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.i_validate_the_search_tesxt_field()"
});
formatter.result({
  "status": "skipped"
});
});