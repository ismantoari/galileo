package stepDef;

import io.cucumber.java.en.And;
import pages.MembershipLevelPage;

public class MembershipLevelStepdef {

    MembershipLevelPage membershipLevelPage = new MembershipLevelPage();

    @And("user input membership level name {string}")
    public void userInputMembershipLevelName(String membershipLevelName) {
        membershipLevelPage.inputMembershipLevelName(membershipLevelName);
    }

}
