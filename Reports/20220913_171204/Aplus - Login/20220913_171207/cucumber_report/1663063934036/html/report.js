$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/ahmadilham/Documents/A+/Katalon/amartha_katalon/Include/features/Login.feature");
formatter.feature({
  "name": "Login/Logout APlus",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "mitra input  phone number to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PhoneNumber"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.step({
  "name": "she login using phone number \u003cphonenumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "she should see that has message \u003coutcome\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phonenumber",
        "outcome"
      ]
    },
    {
      "cells": [
        "081289945245",
        "succedeed"
      ]
    },
    {
      "cells": [
        "08123213123",
        "failed"
      ]
    }
  ]
});
formatter.scenario({
  "name": "mitra input  phone number to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PhoneNumber"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.alice_start_open_aplus_aplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she login using phone number 081289945245",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.she_login_using_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see that has message succedeed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.she_should_see_that_has_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "mitra input  phone number to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PhoneNumber"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.alice_start_open_aplus_aplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she login using phone number 08123213123",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.she_login_using_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see that has message failed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.she_should_see_that_has_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "valid login as mitra and non mitra",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logintoAplus"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.step({
  "name": "she login using phone number \u003cphonenumber\u003e",
  "keyword": "* "
});
formatter.step({
  "name": "she input her pin \u003cpin\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "she should see logged as \u003coutcome\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phonenumber",
        "pin",
        "outcome"
      ]
    },
    {
      "cells": [
        "081319967818",
        "123654",
        "Mitra"
      ]
    },
    {
      "cells": [
        "081289945245",
        "123654",
        "nonMitra"
      ]
    }
  ]
});
formatter.scenario({
  "name": "valid login as mitra and non mitra",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@logintoAplus"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.alice_start_open_aplus_aplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she login using phone number 081319967818",
  "keyword": "* "
});
formatter.match({
  "location": "Login_steps.she_login_using_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she input her pin 123654",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.she_input_her_pin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see logged as Mitra",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.she_should_see_logged(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "valid login as mitra and non mitra",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@logintoAplus"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.alice_start_open_aplus_aplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she login using phone number 081289945245",
  "keyword": "* "
});
formatter.match({
  "location": "Login_steps.she_login_using_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she input her pin 123654",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.she_input_her_pin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see logged as nonMitra",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.she_should_see_logged(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "mitra login with invalid pin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@InvalidPIN"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.step({
  "name": "she login using phone number \u003cphonenumber\u003e",
  "keyword": "* "
});
formatter.step({
  "name": "she input her pin \u003cpin\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "she should see that error message \u003cmessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phonenumber",
        "pin",
        "message"
      ]
    },
    {
      "cells": [
        "081319967818",
        "123123",
        "Maaf PIN salah, coba lagi, ya."
      ]
    }
  ]
});
formatter.scenario({
  "name": "mitra login with invalid pin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@InvalidPIN"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Alice start open aplus aplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.alice_start_open_aplus_aplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she login using phone number 081319967818",
  "keyword": "* "
});
formatter.match({
  "location": "Login_steps.she_login_using_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she input her pin 123123",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.she_input_her_pin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see that error message Maaf PIN salah, coba lagi, ya.",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.she_should_see_that_error_message(String)"
});
formatter.result({
  "status": "passed"
});
});