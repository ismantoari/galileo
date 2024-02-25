package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MembershipLevelPage;

public class MembershipLevelStepdef {

    MembershipLevelPage membershipLevelPage = new MembershipLevelPage();

    @And("user input membership level name {string}")
    public void userInputMembershipLevelName(String membershipLevelName) {
        membershipLevelPage.inputMembershipLevelName(membershipLevelName);
    }


    @And("user input color code for membership level {string}")
    public void userInputColorCodeForMembershipLevel(String colorMemberhip) {
        membershipLevelPage.inputColorCodeForMembershipLevel(colorMemberhip);
    }

    @And("user add member level description {string}")
    public void userAddMemberLevelDescription(String descriptionOfMembershipLevel) {
        membershipLevelPage.addMemberLevelDescription(descriptionOfMembershipLevel);
    }

    @And("user input spending to earn one point by {string}")
    public void userInputSpendingToEarnOnePointBy(String spendingToPoint) {
        membershipLevelPage.inputSpendingToEarnOnePointBy(spendingToPoint);
    }

    @And("user select partial redeem {string}")
    public void userSelectPartialRedeem(String selectOptionPartialRedeem) {
        membershipLevelPage.selectPartialRedeem(selectOptionPartialRedeem);
    }

    @And("user input max redeem {string} %")
    public void userInputMaxRedeem(String maxRedeemPercent) {
        membershipLevelPage.inputMaxRedeem(maxRedeemPercent);
    }



//    @And("user click add button reward list {string}")
//    public void userClickAddButtonRewardList(String bottonAddRwd) {
//        membershipLevelPage.clickAddButtonRewardList(bottonAddRwd);
//    }

        @And("user click add button reward list")
    public void userClickAddButtonRewardList() {
        membershipLevelPage.clickAddButtonRewardList();
    }

    @And("user input reward name {string}")
    public void userInputRewardName(String rewardName) {
        membershipLevelPage.inputRewardName(rewardName);
    }

    @And("user input reward description {string}")
    public void userInputRewardDescription(String rewardDescription) {
        membershipLevelPage.inputRewardDescription(rewardDescription);
    }


    @When("user click button Add Membership")
    public void userClickButtonAddMembership() {
        membershipLevelPage.clickButtonAddMembership();
    }
}
