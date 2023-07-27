Feature: Login
@regression
  Scenario: succesfully login with valid cerdentials

    Given launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enter email "admin@yourstore.com" and password "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on logout button
    And close browser

@sanity
    Scenario Outline: succesfully login with valid cerdentials DDT
      Given launch chrome browser
      When user open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
      And user enter email "<email>" and password "<password>"
      And click on login
      Then page title should be "Dashboard / nopCommerce administration"
      When user click on logout button
      And close browser
Examples:
      |email|password|
      |admin@yourstore.com|admin|
      |admin@yourstore.com|test |


