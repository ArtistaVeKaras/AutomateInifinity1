Feature: As a user I want to be able to login
         using my username and password and
         click the login button

  @TestComplete
  Scenario Outline: Login
    Given I am on the Landing page
    When I enter my "username" as "<userName_Details>" in the textfield
    When I enter my "password" as "<password_Details>" in the textfield
    And  I click login button
    Then Home page should be displayed

    Examples: Login Details
    | userName_Details | password_Details |
    |   montego001     |         12345678 |
    |   montego0       |            45678 |
