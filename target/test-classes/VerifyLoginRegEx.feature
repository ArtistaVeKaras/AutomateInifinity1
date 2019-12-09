Feature: As a user I want to be able to login
@TestComplete
  Scenario: Login with Reg Ex
    Given I am on the LandingPage
    When I enter my "username" as "montego001"
    When I enter my "password" as "12345678"
    And I click the login button
    Then I should be on Homepage