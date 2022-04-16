$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/ForgetPass.feature");
formatter.feature({
  "name": "To validate forgotten password of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate forgotten password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to click the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d99.0.4844.82)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027RAJAPRASANNA-PC\u0027, ip: \u0027192.168.43.169\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [f41aa7e61bd1284a4a61d8656eddfbb5, findElement {using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.82, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\RAJAPR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60548}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:60548/devtoo..., se:cdpVersion: 99.0.4844.82, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f41aa7e61bd1284a4a61d8656eddfbb5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat helper.BaseClass.btnClick(BaseClass.java:66)\r\n\tat org.sample.StepDefinition.user_have_to_click_the_forgotten_password(StepDefinition.java:67)\r\n\tat ✽.user have to click the forgotten password(file:src/test/resources/FeatureFiles/ForgetPass.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to enter email or mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_mobile_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To validate Login Functionality in Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Login using invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter Invalid username and Invalid password",
  "rows": [
    {
      "cells": [
        "Username",
        "greens"
      ]
    },
    {
      "cells": [
        "Mail",
        "Selenium123@gmail.com"
      ]
    },
    {
      "cells": [
        "Phone",
        "343346567"
      ]
    },
    {
      "cells": [
        "Address",
        "tambaram"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userEnterInvalidUsernameAndInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userIsInInvalidCredentialPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login using valid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and invalid password",
  "rows": [
    {
      "cells": [
        "Username",
        "Mail",
        "Phone",
        "Address"
      ]
    },
    {
      "cells": [
        "Abi",
        "sdffhgh",
        "234567878",
        "tambaram"
      ]
    },
    {
      "cells": [
        "Mani",
        "awserdtfyg",
        "2345678",
        "Guindy"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userIsInInvalidCredentialPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});