Feature: As a user I want to be able to login
         and navigate through all tabs


  Background: Login with Reg Ex
    Given I am on the LandingPage
    When I enter my "username" as "montego001"
    When I enter my "password" as "12345678"
    And I click the login button
    Then I should be on Homepage

    Scenario: Click through all tabs
      Given Im on the "LoginPage"
      When I click "TYJ" tab
      When I click "BYJ" tab
      When I click "JT" tab
      When I click "ABTUS" tab
      Then I am "ABTUS page"