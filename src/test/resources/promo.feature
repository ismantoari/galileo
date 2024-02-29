@web
Feature: Promo

  @web
    @Promo
  Scenario: Loyalty Program Promo - Check Menu
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And user click main menu "Loyalty Program"
    When user click sub menu "Promo"
    Then verify show page "Promo List"


  @web
  @Promo
  Scenario: Loyalty Program Promo - Check Add Promo Page
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user click main menu "Loyalty Program"
    And user click sub menu "Promo"
    And verify show page "Promo List"
    And user select flag language "Indonesia"
    When user click add button "Tambah Promo"
    Then verify show page "Promo"


#  @web
#  @Promo
#  Scenario: Loyalty Program Promo - Check Total Promo
#    Given user is on login page
#    And user input username with "administrator"
#    And user input password with "pvs1909~"
#    And user click login button
#    And check login "positive"
#    And user select flag language "Indonesia"
#    And user click main menu "Loyalty Program"
#    And user click sub menu "Promo"
#    And verify show page "Promo List"
#    And check total "Promo"


#  @web
#  @Promo
#  Scenario: Promo - Check All Header Board
#    Given user is on login page
#    And user input username with "administrator"
#    And user input password with "pvs1909~"
#    And user click login button
#    And check login "positive"
#    And user select flag language "Indonesia"
#    And user click main menu "Loyalty Program"
#    And user click sub menu "Promo"
#    And verify show page "Promo List"
#    And check total "Promo"
#    And check active "Promo"
#    And check upcoming "Promo"
#    And check expired "Promo"


  @web
  @Promo
  Scenario: Promo - Check All Header Board
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user select flag language "Indonesia"
    And user click main menu "Loyalty Program"
    When user click sub menu "Promo"
    Then verify show page "Promo List"
    And check total "Promo"
    And check active "Promo"
    And check upcoming "Promo"
    And check expired "Promo"


  @web
  @Promo
  Scenario: Add Promo with Promo Type : Discount, Type promo : Fix Amount, dst
    Given user is on login page
    And user input username with "administrator"
    And user input password with "pvs1909~"
    And user click login button
    And check login "positive"
    And user select flag language "English"
    And user click main menu "Loyalty Program"
    And user click sub menu "Promo"
    And verify show page "Promo List"
    And check total "Promo"
    And check active "Promo"
    And check upcoming "Promo"
    And check expired "Promo"
    And user click add button "Add Promo"
    And verify show page "Promo"
    And user select loyalty program name "PQA Loyalty 1"
    And user input promo name "PQA Special Promo"
    And user input promo code "1001"
    And user input program fund "100000"
    And user input description of Promo "Deskripsi PQA Special Promo"
    #===  Promo Calculation  ====#
    And user input promo type "Discount"
    And user select Type "Fix Amount"
    #===  Promo Calculation for Loyalty Program Member ====#
    And user select Loyalty Program Member
    And user input Promo Amount for promo calculation loyalty program member "5000"
    And user input Minimum Transaction for promo calculation loyalty program member "10000"
    And user select Membership for promo calculation loyalty program member "Select All"
   #===   Promo Calculation for Galileo Member ===#
    And user select Galileo Member
    And user input Promo Amount for promo calculation galileo member "3000"
    And user input Minimum Transaction for promo calculation galileo member "10000"
    #===   Promo Calculation for Non member & others ===#
    And user select non member and others
    And user input Promo Amount for promo calculation non member "1000"
    And user input Minimum Transaction for promo calculation non member "10000"
    #====   Promo Issuance Velocity & Restriction   ===#
    And user set Promo Date Started at "02-03-2024"
    And user set Promo Date Ended at "21-03-2024"
    And user set Promo Period Restriction "Daily"
    And user input Max Amount for Promo Count Period Restriction "100000"
    And user input Max Count for Promo Count Period Restriction "10"
    And user input Max Count Per User for Promo Count Period Restriction "1"
    #=====  Set Promo Place =====#
    And user set promo place to merchant "Pisang Prima Rasa"
    #=====  Set Promo Time ======#
    And user set day of promo time "Friday"



