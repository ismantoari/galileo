Feature: Voucher

  @web
  Scenario: Loyalty Program Voucher
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Voucher"
    Then verify show page "Voucher List"