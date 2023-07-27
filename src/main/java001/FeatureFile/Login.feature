Feature: Login

  Scenario: succesfully login with valid cerdentials
    Given launch chrome browser
    When user open URL "https://www.nopcommerce.com/en/login?returnUrl=%2Fen"
    And user enter email "" and password ""
    And click on login
    Then page title should be ""
    When user click on logout button
    Then page title should be ""
    And close browser

