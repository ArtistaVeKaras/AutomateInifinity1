Feature: As a user I want to be able to login

  @TestComplete
  Scenario: Login DataTable
    Given I am on the Landing page
    When I enter my username and password as below
    | montego001 | 12345678 |
    And I click the login button
    Then I should be on Homepage