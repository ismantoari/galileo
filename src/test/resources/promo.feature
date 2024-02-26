@web
Feature: Promo

  @web
    @Promo
  Scenario: Loyalty Program Promo
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Promo"
    Then verify show page "Promo List"