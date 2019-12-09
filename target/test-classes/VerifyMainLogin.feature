Feature:  As a user I want to able to login
          using multiple data

# This way of writing is generic with regx
  Scenario: Login 1
    Given I am on the home page for weglobal training
    When I enter "username" as "montego001"
    And I enter "password" as "12345678"
    And Click login button
    Then Home page should is displayed

# This way of writing tests is called datatable
    Scenario: Login 2
      Given I am on the home page for weglobal training
      When I enter username and password as the below
      | montego01 | 12345678 |
      And I click the "Login" Button
      Then Home page should is displayed

# This way of writing is called multiple data
  Scenario Outline: Login 3
    Given I am on the home page for weglobal training
    When I enter "username" as "<UsernameData>"
    And I enter "password" as "<PasswordData>"
    And Click login button
    Then Home page should is displayed
    `
    Examples: Login dummy data
    |UsernameData|PasswordData|
    | mongego01  | 12345678   |
    | monge      |   15678    |
    | mong       |     678    |

# This way of writing is not efficient and the code can not be reused
  Scenario: Login 4
    Given I am on the home page for weglobal training
    When I enter my username as montego001
    And I enter my password as 12345678
    And Click login button
    Then Home page should is displayed





