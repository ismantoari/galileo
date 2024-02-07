Feature: Loyalty
  @web
  Scenario: Loyalty Page
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    Then verify show page "Loyalty List"

  @web
  Scenario: Add Loyalty
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    When user click add button "Add Loyalty"
    #When user click sub menu Tambah Loyalty
    Then verify show page "Loyalty"


  @web
  Scenario: Test Fawwaz 2
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Promo"
    Then verify show page "Promo List"

  @web
  Scenario: Test Fawwaz 3
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Voucher"
    Then verify show page "Voucher List"


