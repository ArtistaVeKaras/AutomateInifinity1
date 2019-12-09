Feature: As a user I want to be able to login
         using my credentials and enter data into
         the system

  @TestComplete
  Scenario: Login DataTable
    Given I am on the Landing page
    When I enter my username & password as below
      | montego001 | 12345678 |
    And I click the login button
    Then I should be on Homepage
    And  I click the tradeYourJet button
    And I enter the following details
    | 1000 | 3000 | 22:00 |
    And  I click the submit button
    Then I should on the tradeyourjet  page
