Feature: Login to the Rahulshetty Application

  Scenario: Verify title of the Login page
    Given user is on login page
    When user gets the title of page
    Then verify the title of the login application

  Scenario: Verify title of the Home page
    Given user is on login page
    When user enters username as "rahulshettyacademy"
    And user enters the password as "learning"
    And user click on the login button

