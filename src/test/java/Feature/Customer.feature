Feature: customer
Background: Steps common for all scenarios:
  Given launch chrome browser
  When user open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  And user enter email "admin@yourstore.com" and password "admin"
  And click on login
  When User can see customers menu
  Then click on customers menu item

@regression
  Scenario: Add new customers
    And click on Add new button
    Then User can view add new customer page
    When User enter customer infotmation
    And Click on save button
    Then User can see conformation message "The new customer has been added successfully."
    And close browser

@sanity
    Scenario: Search customers by email
      And  Enter email address
      When click on search button
      Then user should found the eamil address in the table
      And close browser
@sanity @regression
  Scenario: Search customers by FirstName and LastName
    And  Enter customer first name
    And Enter customer last name
    When click on search button
    Then user should found the name in the table
    And close browser