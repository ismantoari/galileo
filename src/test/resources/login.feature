Feature: Login
  @web
    @login
  Scenario Outline: Login Regress
    Given user is on login page
    When user input username with "<username>"
    And user input password with "<password>"
    And user click login button
    Then check login "<case login>"

    Examples:
      |username     |password          | case login                  |
      |administrator|pvs1909~          | positive                    |
      |administrator|invalid_password  | negative invalid pwd        |
      |invalid_user |pvs1909~          | negative invalid user       |
      |             |                  | negative user blank         |
      |administrator|                  | negative password blank     |