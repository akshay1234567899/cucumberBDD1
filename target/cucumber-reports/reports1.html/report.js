$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Feature/Customer.feature");
formatter.feature({
  "name": "customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Steps common for all scenarios:",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_open_URL(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"this.driver\" is null\n\tat stepdefination.Stepdef.user_open_URL(Stepdef.java:69)\n\tat ✽.user open URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"(/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Feature/Customer.feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter email \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_enter_email_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_can_see_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers menu item",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new customers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_can_view_add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter customer infotmation",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_enter_customer_infotmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see conformation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_can_see_conformation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Steps common for all scenarios:",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_open_URL(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"this.driver\" is null\n\tat stepdefination.Stepdef.user_open_URL(Stepdef.java:69)\n\tat ✽.user open URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"(/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Feature/Customer.feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter email \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_enter_email_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_can_see_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers menu item",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search customers by FirstName and LastName",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Enter customer first name",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.enter_customer_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer last name",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.enter_customer_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should found the name in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_should_found_the_name_in_the_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});