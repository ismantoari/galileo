package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoyaltyPage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoyaltyStepdef {

    LoyaltyPage loyaltyPage = new LoyaltyPage();
    HomePage homePage = new HomePage();

    @When("user click sub menu Tambah Loyalty")
    public void userClickSubMenuTambahLoyalty() {
        loyaltyPage.clickSubMenuTambahLoyalty();


    }

    @Then("verify user on page add loyalty")
    public void verifyUserOnPageAddLoyalty() {
        loyaltyPage.userOnPageAddLoyalty();
    }

    @When("user click add button {string}")
    public void userClickAddButton(String buttonAdd) {
        homePage.clickAdd(buttonAdd);

    }

    @And("user select flag language {string}")
    public void userSelectFlagLanguage(String languageFlag) {
        homePage.selectFlagLanguage(languageFlag);
    }

    @When("user input loyalty name {string}")
    public void userInputLoyaltyName(String inputLoyaltyName) {
        loyaltyPage.userInputLoyaltyName(inputLoyaltyName);
    }

    @And("user input point to rupiah ratio {string}")
    public void userInputPointToRupiahRatio(String pointToRupiah) {
        loyaltyPage.inputPointToRupiahRatio(pointToRupiah);
    }

    @And("user choose Exclusive selection with {string}")
    public void userChooseExclusiveSelectionWith(String exclusiveLoyalty) {
        loyaltyPage.chooseExclusiveSelectionWith(exclusiveLoyalty);
    }

    @And("user choose Expiry Date selection with {string}")
    public void userChooseExpiryDateSelectionWith(String pointExpiry) {
        loyaltyPage.chooseExpiryDateSelectionWith(pointExpiry);
    }

    @And("user input Point Expiry in Day with setting {string}")
    public void userInputPointExpiryinDaywithsetting(String paramPointExpiryInDay) {
        loyaltyPage.inputPointExpiryinDaywithsetting(paramPointExpiryInDay);

    }


    @And("user choose Accumulated Earn Point Duration for {string}")
    public void userChooseAccumulatedEarnPointDurationFor(String accumulatedEarnPointDuration) {
        loyaltyPage.chooseAccumulatedEarnPointDurationFor(accumulatedEarnPointDuration);
    }

    @And("user choose OTP digit for {string}")
    public void userChooseOTPDigitFor(String OTPDigit) {
        loyaltyPage.chooseOTPDigitFor(OTPDigit);
    }


    @And("user input loyalty description {string}")
    public void userInputLoyaltyDescription(String textLoyaltyDescription) {
        loyaltyPage.inputLoyaltyDescription(textLoyaltyDescription);
    }


    @And("user click add membership level")
    public void userClickAddMembershipLevel() {
        loyaltyPage.userClickAddMembershipLevel();
    }

    @And("user add loyalty picture with path {string}")
    public void userAddLoyaltyPictureWithPath(String membershipPicture) throws Exception {
        loyaltyPage.addLoyaltyPictureWithPath(membershipPicture);
        Robot rb = new Robot();

        Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_F);
        rb.keyRelease(KeyEvent.VK_F);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SHIFT);

        rb.keyPress(KeyEvent.VK_BACK_SLASH);
        rb.keyRelease(KeyEvent.VK_BACK_SLASH);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_P);
        rb.keyRelease(KeyEvent.VK_P);

        rb.keyPress(KeyEvent.VK_Q);
        rb.keyRelease(KeyEvent.VK_Q);

        rb.keyPress(KeyEvent.VK_A);
        rb.keyRelease(KeyEvent.VK_A);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_PERIOD);
        rb.keyRelease(KeyEvent.VK_PERIOD);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_J);
        rb.keyRelease(KeyEvent.VK_J);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_P);
        rb.keyRelease(KeyEvent.VK_P);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_G);
        rb.keyRelease(KeyEvent.VK_G);
        Thread.sleep(200);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);
    }


    @And("user set Applied Merchant {string}")
    public void userSetAppliedMerchant(String appliedMerchant) {
        loyaltyPage.setAppliedMerchant(appliedMerchant);
    }

    @And("user set Applied Payment Method {string}")
    public void userSetAppliedPaymentMethod(String appliedPaymentMethod) {
        loyaltyPage.setAppliedPaymentMethod(appliedPaymentMethod);
    }


    @When("user click last button on loyalty page to {string}")
    public void userClickLastButtonOnLoyaltyPageTo(String addButton) {
        loyaltyPage.clickLastButtonOnLoyaltyPageTo(addButton);
    }
    //======================================

    @Then("verify the existence of a loyalty program {string}")
    public void verifyTheExistenceOfALoyaltyProgram(String loyaltyName) {
        loyaltyPage.verifyTheExistenceOfALoyaltyProgram(loyaltyName);

    }

    @And("user search loyalty program {string}")
    public void userSearchLoyaltyProgram(String searchContent) {
        loyaltyPage.searchLoyaltyProgram(searchContent);
    }

    @And("user click burger menu loyalty list")
    public void userClickBurgerMenuLoyaltyList() {
        loyaltyPage.clickBurgerMenuLoyaltyList();
    }

    @And("user click delete loyalty list")
    public void userClickDeleteLoyaltyList() {
        loyaltyPage.clickDeleteLoyaltyList();
    }

    @And("user click edit loyalty list")
    public void userClickEditLoyaltyList() {
        loyaltyPage.clickEditLoyaltyList();
    }


    @And("user input new loyalty name {string}")
    public void userInputNewLoyaltyName(String newLoyaltyName) {
        loyaltyPage.inputNewLoyaltyName(newLoyaltyName);
    }

    @And("there is pop up confirmation deletion with text {string}")
    public void thereIsPopUpConfirmationDeletionWithText(String popUpConfirmDelete){
        loyaltyPage.popUpConfirmationDeletionWithText(popUpConfirmDelete);
    }

    @When("user click confimation button {string}")
    public void userClickConfimationButton(String confirmationDelete) {
        loyaltyPage.clickButtonDeleteConfirmation (confirmationDelete);
    }

    @Then("verify there is no loyalty program {string}")
    public void verifyThereIsNoLoyaltyProgram(String loyaltyNameToDelete) {
        loyaltyPage.verifyThereIsNoLoyaltyProgram(loyaltyNameToDelete);
    }


}
