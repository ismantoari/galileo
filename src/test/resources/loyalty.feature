Feature: Loyalty Program
#  @web @loyaltyProgram
#    Scenario Outline: User add loyalty program
#    Given user is on login page
#    And user input username with "administrator"
#    And user input password with "pvs1909~"
#    And user click login button
#    When user click menu Loyalty Program "<Sub Loyalty Program>"
#    #Then appear list sub loyalty program "<List Sub Loyalty Program>"
#
#
#    Examples:
#    | Sub Loyalty Program |
#    | Loyalty             |
#    | Promo               |
#    | Voucher             |

  @web
  Scenario: Test Fawwaz 1
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    Then verify show page "Loyalty List"

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

  @web
  Scenario: Test Fawwaz 4
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Payment Issuer"
    And user click sub menu "Payment Method"
    Then verify show page "Payment Method"
