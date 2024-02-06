Feature: Loyalty Program
  @web
    @loyaltyProgram
    Scenario Outline: User add loyalty program
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    When user click menu Loyalty Program "<Sub Loyalty Program>"
    #Then appear list sub loyalty program "<List Sub Loyalty Program>"


    Examples:
    | Sub Loyalty Program | List Sub Loyalty Program  |
    | Loyalty             | Loyalty List              |
    | Promo               | Promo List                |
    | Voucher             | Voucher List              |
