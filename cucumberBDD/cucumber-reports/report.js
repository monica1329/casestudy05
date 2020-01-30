$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:skeleton/demowebshoplogin.feature");
formatter.feature({
  "name": "Demo Web Shop Login feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login For Demo Web Shop for Admin user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "askmail@email.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@ymail.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop for Admin user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@email.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop for Admin user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@ymail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop for Admin user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.DemoWebShopLoginStepDefinition.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:skeleton/shout/shout.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Persons are within the range",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Sean is 10 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_is_meters_away_from_Lucia(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_shouts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia hears the message \"Free coffee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.stepdefinition.lucia_hears_the_message(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cFree [C]offee\u003e but was:\u003cFree [c]offee\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat skeleton.stepdefinition.lucia_hears_the_message(stepdefinition.java:28)\r\n\tat ✽.Lucia hears the message \"Free coffee\"(classpath:skeleton/shout/shout.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Persons are not in the range",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Sean is 100 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_is_meters_away_from_Lucia(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_shouts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia hears no message",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.stepdefinition.lucia_hears_no_message()"
});
formatter.result({
  "status": "passed"
});
});