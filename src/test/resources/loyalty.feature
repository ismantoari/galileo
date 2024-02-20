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
  Scenario: Full Fill Page Add Loyalty
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user select flag language "Indonesia"
    And user click main menu "Loyalty Program"
    And user click sub menu "Loyalty"
    And user click add button "Tambah Loyalty"
    And verify show page "Loyalty"
    When user input loyalty name "Galileo SQA"
    And user input point to rupiah ratio "1"
    And user choose Exclusive selection with "Ya"
    And user choose Expiry Date selection with "Expiry"
    And user choose Accumulated Earn Point Duration for "3 bulan terakhir"
    And user choose OTP digit for "2 Angka"
    And user input loyalty description "Ini adalah deskripsi loyalty program dengan input text via automatic test"
    And user click add membership level
    And user input membership level name "First Level Loyalty SQA"


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


