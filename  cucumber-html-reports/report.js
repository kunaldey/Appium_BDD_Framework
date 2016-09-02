$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testEbay.feature");
formatter.feature({
  "line": 2,
  "name": "eBay sample test",
  "description": "",
  "id": "ebay-sample-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Open Menu",
  "description": "",
  "id": "ebay-sample-test;open-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch eBay application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on home haburger menu",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select categories",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I open Books \u0026 Magazines category",
  "keyword": "Then "
});
formatter.match({
  "location": "testEbay.launchEbay(String,String)"
});
formatter.result({
  "duration": 2311840,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027stepdefinition.testEbay.launchEbay(String,String) in file:/D:/GitRpository/Appium_BDD_Framework/target/test-classes/\u0027 with pattern [^Launch eBay application$] is declared with 2 parameters. However, the gherkin step has 0 arguments []. \nStep: Given Launch eBay application\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCukes(TestNGCucumberRunner.java:43)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run_cukes(AbstractTestNGCucumberTests.java:14)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:100)\r\n\tat org.testng.internal.MethodInvocationHelper$1.runTestMethod(MethodInvocationHelper.java:189)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.run(AbstractTestNGCucumberTests.java:19)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeHookable(MethodInvocationHelper.java:201)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:642)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:811)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1129)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:746)\r\n\tat org.testng.TestRunner.run(TestRunner.java:600)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:39)\r\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:400)\r\n\tat org.testng.internal.thread.ThreadUtil$2.call(ThreadUtil.java:64)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testEbay.clickMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testEbay.openCategories()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testEbay.openSubCat()"
});
formatter.result({
  "status": "skipped"
});
});