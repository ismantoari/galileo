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


  @web
  @voucher
  Scenario: Loyalty Program Promo - Check Header Board
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user select flag language "Indonesia"
    And user click main menu "Loyalty Program"
    And user click sub menu "Voucher"
    And verify show page "Voucher List"
    And check total "Voucher"
    And check active "Voucher"
    And check upcoming "Voucher"
    And check expired "Voucher"