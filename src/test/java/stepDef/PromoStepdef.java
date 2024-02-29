package stepDef;

import io.cucumber.java.en.And;
import pages.PromoPage;

public class PromoStepdef {
    PromoPage promoPage = new PromoPage();


    @And("user select loyalty program name {string}")
    public void userSelectLoyaltyProgramName(String loyaltyProgramName) {
        promoPage.selectLoyaltyProgramName(loyaltyProgramName);
    }

    @And("user input promo name {string}")
    public void userInputPromoName(String promoName) {
        promoPage.inputPromoName(promoName);
    }

    @And("user input promo code {string}")
    public void userInputPromoCode(String promoCode) {
        promoPage.inputPromoCode(promoCode);
    }

    @And("user input program fund {string}")
    public void userInputProgramFund(String programFund) {
        promoPage.inputProgramFund(programFund);
    }

    @And("user input description of Promo {string}")
    public void userInputDescriptionOfPromo(String promoDescription) {
        promoPage.inputDescriptionOfPromo(promoDescription);
    }

    @And("user input promo type {string}")
    public void userInputPromoType(String promoType) {
        promoPage.inputPromoType(promoType);
    }

    @And("user select Type {string}")
    public void userSelectType(String selectType) {
        promoPage.userSelectType(selectType);
    }

    @And("user select Loyalty Program Member")
    public void userSelectLoyaltyProgramMember() {
        promoPage.selectLoyaltyProgramMember();
    }


    @And("user input Promo Amount for promo calculation loyalty program member {string}")
    public void userInputLoyaltyProgramMemberPromoAmount(String lpmPromoAmount) {
        promoPage.inputLoyaltyProgramMemberPromoAmount(lpmPromoAmount);
    }

    @And("user input Minimum Transaction for promo calculation loyalty program member {string}")
    public void userInputMinimumTransactionForPromoCalculationLoyaltyProgramMember(String lpmMinimumTransaction) {
        promoPage.inputLoyaltyProgramMemberMinimumTransaction(lpmMinimumTransaction);
    }

    @And("user select Membership for promo calculation loyalty program member {string}")
    public void userSelectMembershipForPromoCalculationLoyaltyProgramMember (String lpmMembership) {
        promoPage.selectLoyaltyProgramMemberMembership(lpmMembership);
    }

    @And("user select Galileo Member")
    public void userSelectGalileoMember() {
        promoPage.selectGalileoMember();
    }

    @And("user input Promo Amount for promo calculation galileo member {string}")
    public void userInputPromoAmountForPromoCalculationGalileoMember(String galileoPromoAmount) {
        promoPage.inputPromoAmountForPromoCalculationGalileoMember(galileoPromoAmount);
    }

    @And("user input Minimum Transaction for promo calculation galileo member {string}")
    public void userInputMinimumTransactionForPromoCalculationGalileoMember(String minimumTrxGalileo) {
        promoPage.inputMinimumTransactionForPromoCalculationGalileoMember(minimumTrxGalileo);
    }

    @And("user select non member and others")
    public void userSelectNonMemberAndOthers() {
        promoPage.selectNonMemberAndOthers();
    }

    @And("user input Promo Amount for promo calculation non member {string}")
    public void userInputPromoAmountForPromoCalculationNonMember(String promoAmountNonMember) {
        promoPage.inputPromoAmountForPromoCalculationNonMember(promoAmountNonMember);
    }

    @And("user input Minimum Transaction for promo calculation non member {string}")
    public void userInputMinimumTransactionForPromoCalculationNonMember(String minimumTrxNonMember) {
        promoPage.inputMinimumTransactionForPromoCalculationNonMember(minimumTrxNonMember);
    }

    @And("user set Promo Date Started at {string}")
    public void userSetPromoDateStartedAt(String promotStarted) {
        promoPage.setPromoDateStartedAt(promotStarted);
    }

    @And("user set Promo Date Ended at {string}")
    public void userSetPromoDateEndedAt(String promoEnded) {
        promoPage.setPromoDateEndedAt(promoEnded);
    }

    @And("user set Promo Period Restriction {string}")
    public void userSetPromoPeriodRestriction(String promoPeriodRestriction) {
        promoPage.setPromoPeriodRestriction(promoPeriodRestriction);
    }

    @And("user input Max Amount for Promo Count Period Restriction {string}")
    public void userInputMaxAmountForPromoCountPeriodRestriction(String maxAmountPromoPeriodRestriction) {
        promoPage.inputMaxAmountForPromoCountPeriodRestriction(maxAmountPromoPeriodRestriction);
    }

    @And("user input Max Count for Promo Count Period Restriction {string}")
    public void userInputMaxCountForPromoCountPeriodRestriction(String maxCountPromoPeriodRestriction) {
        promoPage.inputMaxCountForPromoCountPeriodRestriction(maxCountPromoPeriodRestriction);
    }

    @And("user input Max Count Per User for Promo Count Period Restriction {string}")
    public void userInputMaxCountPerUserForPromoCountPeriodRestriction(String maxCountPerUserPeriodRestriction) {
        promoPage.inputMaxCountPerUserForPromoCountPeriodRestriction(maxCountPerUserPeriodRestriction);
    }

    @And("user set promo place to merchant {string}")
    public void userSetPromoPlaceToMerchant(String promoPlace) {
        promoPage.setPromoPlaceToMerchant(promoPlace);
    }

    @And("user set day of promo time {string}")
    public void userSetDayOfPromoTime(String dayPromoTime) {
        promoPage.setDayOfPromoTime(dayPromoTime);
    }
}

