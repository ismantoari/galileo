package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeMyStepdef {
    HomePage homePage = new HomePage();

    @When("user click menu Loyalty Program {string}")
    public void userClickMenuLoyaltyProgram(String LoyaltyProgramSubMenu) {
        homePage.clickMenuLoyaltyProgram(LoyaltyProgramSubMenu);
    }

    @Then("appear {string}")
    public void appear(String listSubLoyaltyProgram) {
        homePage.assertListSubLoyaltyProgram(listSubLoyaltyProgram);
    }
}
