Feature:  As a user I want to able to login
  and navigate thru all tabs

  Background: Login
    Given I am on the home page for Weglobal training
    When I enter "username" as "montego01"
    And I enter "password" as "12345678"
    And Click login button
    Then Home page should be displayed

  Scenario Outline: View menu pages
    Given The home page is displayed
    When I click  in "<Tab>" tab
    Then "<ConfirmPage>" should be displayed

      Examples: Pages menu on tab
     |    Tab         | ConfirmPage  |
     | Trade Your Jet | TradeYourJet |
     | Book Your Jet  | BookYourJet  |
     | Just Trade     | JustTrade    |
     | About Us       |   About Us   |
