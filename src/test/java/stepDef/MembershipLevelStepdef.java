package stepDef;

import io.cucumber.java.en.And;
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
}
