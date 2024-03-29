package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeMyStepdef {
    HomePage homePage = new HomePage();

    @When("user click menu Loyalty Program {string}")
    public void userClickMenuLoyaltyProgram(String LoyaltyProgramSubMenu) {
        homePage.clickMenuLoyaltyProgram(LoyaltyProgramSubMenu);
    }

    @Then("appear list sub loyalty program {string}")
    public void appearListSubLoyaltyProgram(String listSubLoyaltyProgram) {
        homePage.assertListSubLoyaltyProgram(listSubLoyaltyProgram);
    }

    @And("user click main menu {string}")
    public void userClickMainMenu(String mainmenu){
        homePage.clickMainMenu(mainmenu);
    }

    @And("user click sub menu {string}")
    public void userClickSubMenu(String submenu) {
        homePage.clickSubMenu(submenu);
    }

    @Then("verify show page {string}")
    public void verifyShowPage(String pageTitle) {
        homePage.pageVerivication(pageTitle);
    }

    @And("check total {string}")
    public void checkTotal(String totalRelatedCount) {
        homePage.checkTotal(totalRelatedCount);
    }

    @And("check active {string}")
    public void checkActive(String activeReletedCount) {
        homePage.checkActive(activeReletedCount);
    }

    @And("check upcoming {string}")
    public void checkUpcoming(String upcomingRelatedCount) {
        homePage.checkUpcoming(upcomingRelatedCount);
    }

    @And("check expired {string}")
    public void checkExpired(String expiredRelatedCount) {
        homePage.checkExpired(expiredRelatedCount);
    }


}
