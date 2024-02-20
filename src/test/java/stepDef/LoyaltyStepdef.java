package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoyaltyPage;

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
}
