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
}
