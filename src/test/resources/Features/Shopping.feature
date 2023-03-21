Feature: Verify the Shipping Details

  Background: Login to Application with Datatable details
    Given Login to application with datatable credentials
    |username|password|
    |rahulshettyacademy|learning|

   Scenario: Verify checkout link is displyaing on the Shopping Page
     Given user is in Shopping Page
     Then Verify Checkout link is displaying

   Scenario: Verify Shopping Page is displaying different categeroies
     Given user is in Shopping Page
     Then user gets category sections
     And count of categories should be 3

