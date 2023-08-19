Feature: Feature to test the login functionality of Zero Banking Application.

  Scenario: Check signin button exists on Home Page
    Given User launch the browser
    When User open the Zero Banking Application
    Then Signin button should be displayed

   Scenario: Login successful with valid credentials
   Given User launch the browser
   And User open the Zero Banking Application
   And click Signin button on home page of application
   When User enter username and password
   And User click on Signin button
   Then User should be redirected to the home page of user
   