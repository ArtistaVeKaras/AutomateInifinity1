Feature:  As a user I want to be able to login
         and logout into the application

  # Using two scenarios login and logout!
 Scenario: Login login and logout
    Given the user is "login page" page and the title is "Login"
    When I enter my "username" in the textfield as "montego01"
    When I enter my "password" in the textfield as "12345679"
    And  I click login button on the login page
    Then I should be on the "home page" and the title should be "WEG Group"

 Scenario: Logout after login in
    Given the user is "Home" page
    And  I click logout link
    Then user should on the "login" page and the tilte should be "Login"