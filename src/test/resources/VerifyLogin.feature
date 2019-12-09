Feature: As a user I want to be able to login

  # This was the first ever feature file and the most basic way
  # to right a feature file with no regular expression.
  # The @wip tag stands for work in progress
  @wip
  Scenario: Login
    Given I am on the Landing page
    When I enter my username and password
    And I click the login button
    Then I should be on Homepage