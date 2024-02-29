package pages;

import org.openqa.selenium.By;

import static helper.BestUtil.driver;

public class PromoPage {
    By dropDownLoyaltyProgramName = By.xpath("//div[@name='loyalty_program_id']//div[@class='MuiAutocomplete-endAdornment css-2iz2x6']");
    By inputLoyaltyProgram = By.xpath("//input[@id='loyalty_program_id-autocomplete']");
    By inputPromoName = By.xpath("//input[@name=\"name\"]");
    By inputPromoCode = By.xpath("//input[@name='promo_code']");
    By inputProgramFund = By.xpath("//input[@name=\"general_config.total_fund\"]");
    By inputPromoDescription = By.name("description");
    By ddlPromoType = By.xpath("//label[text()=\"Promo Type *\"]/following-sibling::*");
    By ddlType = By.xpath("//label[text()=\"Type *\"]/following-sibling::*");
    By loyaltyProgramMember = By.name("promo_amount.loyalty_program_member_flag");

    By inputLpmPromoAmount = By.id("promo_amount.loyalty_program_member_max_amount_gained");
    By inputLpmMinimumTransaction = By.id("promo_amount.loyalty_program_member_min_trx_amount");

    By selectLpmMembership = By.name("promo_loyalty_program_membership");
    By checkGalileoMember = By.name("promo_amount.galileo_member_flag");
    By inputPromoAmountGalileoMember = By.id("promo_amount.galileo_member_max_amount_gained");
    By inputMinimumTransactionGalileoMember = By.id("promo_amount.galileo_member_min_trx_amount");
    By checkNonMember =By.name("promo_amount.non_galileo_user_flag");
    By inputPromoAmountNonMember = By.id("promo_amount.non_galileo_user_max_amount_gained");
    By inputMinimumTrxNonMember = By.id("promo_amount.non_galileo_user_min_trx_amount");
    By calenderPromoDateStarted = By.name("general_config.started_at");
    By calenderPromoDateEnded = By.name("general_config.ended_at");
    By selectPromoPeriodRestriction = By.xpath("((//p[text()=\"Promo Period Restriction\"]/following::*)[1]/child::*)[2]");
    By inputMaxAmountPromoPeriodRestriction = By.id("general_config.max_amount_per_period");
    By inputMaxCountPromoPeriodRestriction = By.id("general_config.max_trx_count_per_period");
    By inputMaxCountPerUserPeriodRestriction = By.id("general_config.max_trx_count_per_period_per_user");
    By checkPromoPlaceAllMerchant = By.name("promo_merchant");
    By ddlPromoPlaceAllMerchant = By.id("autocomplete-promo_merchant");
    By buttonAddPromoTime = By.xpath("((//h6[text()='Promo Time']/following::*/child::*/child::*)/button[text()='Tambah'])[1]");
    By ddlDayPromoTime = By.xpath("(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-9jrssf\"])[1]");
    By ddlHourStartedPromoTime = By.xpath("(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-9jrssf\"])[2]");
    By ddlMinutesStartedPromoTime = By.xpath("(//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-9jrssf\"])[3]");
    By ddlHourEndedPromoTime = By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-9jrssf'])[4]");
    By ddlMinutesEndedPromoTime = By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-9jrssf'])[5]");








    public void selectLoyaltyProgramName(String loyaltyProgramName){
        driver.findElement(dropDownLoyaltyProgramName).click();
        driver.findElement(By.xpath("//*[text()='"+loyaltyProgramName+"']")).click();
    }

    public void inputPromoName(String promoName){
        driver.findElement(inputPromoName).sendKeys(promoName);
    }

    public void inputPromoCode(String promoCode){
        driver.findElement(inputPromoCode).sendKeys(promoCode);
    }

    public void inputProgramFund(String programFund){
        driver.findElement(inputProgramFund).sendKeys(programFund);
    }

    public void inputDescriptionOfPromo(String promoDescription){
        driver.findElement(inputPromoDescription).sendKeys(promoDescription);
    }
    public void inputPromoType(String promoType){
        driver.findElement(ddlPromoType).click();
        driver.findElement(By.xpath("//*[text()='"+promoType+"']")).click();
    }

    public void userSelectType(String selectType){
        driver.findElement(ddlType).click();
        driver.findElement(By.xpath("//*[text()='"+selectType+"']")).click();
    }

    public void selectLoyaltyProgramMember(){
        driver.findElement(loyaltyProgramMember).click();
    }

    public void inputLoyaltyProgramMemberPromoAmount(String lpmPromoAmount){
        driver.findElement(inputLpmPromoAmount).sendKeys(lpmPromoAmount);
    }

    public void inputLoyaltyProgramMemberMinimumTransaction(String lpmMinimumTransaction){
        driver.findElement(inputLpmMinimumTransaction).sendKeys(lpmMinimumTransaction);
    }

    public void selectLoyaltyProgramMemberMembership(String lpmMembership){
        driver.findElement(selectLpmMembership).click();
        driver.findElement(By.xpath("//*[text()='"+lpmMembership+"']")).click();
    }

    public void selectGalileoMember(){
        driver.findElement(checkGalileoMember).click();
    }

    public void inputPromoAmountForPromoCalculationGalileoMember(String galileoPromoAmount){
        driver.findElement(inputPromoAmountGalileoMember).sendKeys(galileoPromoAmount);
    }

    public void inputMinimumTransactionForPromoCalculationGalileoMember(String minimumTrxGalileo){
        driver.findElement(inputMinimumTransactionGalileoMember).sendKeys(minimumTrxGalileo);
    }

    public void selectNonMemberAndOthers(){
        driver.findElement(checkNonMember).click();
    }

    public void inputPromoAmountForPromoCalculationNonMember(String promoAmountNonMember){
        driver.findElement(inputPromoAmountNonMember).sendKeys(promoAmountNonMember);
    }

    public void inputMinimumTransactionForPromoCalculationNonMember(String minimumTrxNonMember){
        driver.findElement(inputMinimumTrxNonMember).sendKeys(minimumTrxNonMember);
    }

    public void setPromoDateStartedAt(String promoStarted){
        driver.findElement(calenderPromoDateStarted).sendKeys(promoStarted);
    }

    public void setPromoDateEndedAt(String promoEnded){
        driver.findElement(calenderPromoDateEnded).sendKeys(promoEnded);
    }

    public void setPromoPeriodRestriction(String promoPeriodRestriction){
        driver.findElement(selectPromoPeriodRestriction).click();
        driver.findElement(By.xpath("//*[text()='"+promoPeriodRestriction+"']")).click();
    }

    public void inputMaxAmountForPromoCountPeriodRestriction(String maxAmountPromoPeriodRestriction){
        driver.findElement(inputMaxAmountPromoPeriodRestriction).sendKeys(maxAmountPromoPeriodRestriction);
    }

    public void inputMaxCountForPromoCountPeriodRestriction(String maxCountPromoPeriodRestriction){
        driver.findElement(inputMaxCountPromoPeriodRestriction).sendKeys(maxCountPromoPeriodRestriction);
    }

    public void inputMaxCountPerUserForPromoCountPeriodRestriction(String maxCountPerUserPeriodRestriction){
        driver.findElement(inputMaxCountPerUserPeriodRestriction).sendKeys(maxCountPerUserPeriodRestriction);
    }

    public void setPromoPlaceToMerchant(String promoPlace){

        if (promoPlace.equals("All Merchant")) {
            driver.findElement(checkPromoPlaceAllMerchant).click();
        }
        else {
            String subPromoPlace = promoPlace.substring(0, 3);
            driver.findElement(ddlPromoPlaceAllMerchant).click();
            driver.findElement(ddlPromoPlaceAllMerchant).sendKeys(subPromoPlace);
            driver.findElement(By.xpath("//*[text()='" + promoPlace + "']")).click();
        }
    }

    public void setDayOfPromoTime(String dayPromoTime){
        driver.findElement(ddlDayPromoTime).click();
        driver.findElement(By.xpath("//*[text()='" + dayPromoTime + "']")).click();
    }


}
