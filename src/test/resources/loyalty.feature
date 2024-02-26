Feature: Loyalty
  @web
    @Loyalty
  Scenario: Loyalty Page
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    Then verify show page "Loyalty List"

  @web
    @Loyalty
  Scenario: Page Add Loyalty
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user select flag language "Indonesia"
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    When user click add button "Tambah Loyalty"
    Then verify show page "Loyalty"

  @web
    @Loyalty
  Scenario: Full Fill Page Add Loyalty with Reward List
    #precondition login
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    #set language
    And user select flag language "Indonesia"
    #add loyalty program
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    And user click add button "Tambah Loyalty"
    And verify show page "Loyalty"
    When user input loyalty name "PQA Galileo Loyalty 1"
    And user add loyalty picture with path "F:\PQA.png"
    And user input point to rupiah ratio "1"
    And user choose Exclusive selection with "Ya"
    And user choose Expiry Date selection with "No Expired"
    And user input Point Expiry in Day with setting "100"
    And user choose Accumulated Earn Point Duration for "3 bulan terakhir"
    And user choose OTP digit for "2 Angka"
    And user input loyalty description "Ini adalah deskripsi loyalty program dengan input text via automatic test"
    And user click add membership level
    And user input membership level name "Membership PQA level 1"
    And user input color code for membership level "#CD7F32"
    And user add member level description "Bronze membership PQA level 1"
    And user input spending to earn one point by "1000"
    And user select partial redeem "Ya"
    And user input max redeem "10" %
    And user click add button reward list
    And user input reward name "SQA Happy Giveaway"
    And user input reward description "ini adalah deskripsi hadiah dari SQA Happy Giveaway"
    And user click button Add Membership
    And user set Applied Merchant "All"
    #And user set Member Invitation
    And user set Applied Payment Method "All Wallet"
    When user click last button on loyalty page to "Tambah Loyalty"
    #Verification sucsess add loyalty
    Then verify the existence of a loyalty program "PQA Galileo Loyalty 1"





