package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.awt.Robot;</pre>
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;

import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_loyalty_add;
import static org.junit.Assert.*;

public class LoyaltyPage {
    By addLoyalty = By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1ra0vbb\"]");
    By inputTextLoyaltyName = By.xpath("//input[@name=\"loyalty_program_name\"]");
    By inputTextPointToRupiah = By.id("loyalty_program_point_to_rupiah_ratio");
    By selectPointExpiryDate (String pointExpiry) {
        return By.xpath("(//div[text()='"+pointExpiry+ "']/parent::*/parent::*)/child::*/child::input[@type=\"radio\"]");
    }
    By selectAccumulationEarnPointDuration (String earnPointDuration) {
        return By.xpath("(//div[text()='" + earnPointDuration + "']/parent::*/parent::*)/child::*/child::input[@type='radio']");
    }
    By selectOTPDigit (String OTPDigit){
        return By.xpath("(//div[text()='" +OTPDigit+"']/parent::*/parent::*)/child::*/child::input[@type='radio']");
    }
    By loyaltyDescription = By.xpath("//textarea[@name=\"loyalty_program_description\"]");
    By buttonAddMembership = By.xpath("//div[@class=\"MuiStack-root css-1sa853d\"]/child::button[@type=\"button\"]");

    By uploadLoyaltyProgramLogo = By.xpath("//div[@role=\"presentation\"]");
    By logoLoyalty = By.xpath("//h6[text()='Logo Loyalty Program']");
    By textBoxPointExpiryinDay = By.id("loyalty_program_point_expiry_day");
    By appliedMerchantAll = By.name("loyalty_merchant");
    By allPaymentMethodincludeCashId = By.xpath("//p[text()='Semua Payment method termasuk Cash']/preceding-sibling::*");
    By allPaymentMethodincludeCashEn = By.xpath("//p[text()='All Payment Method Including Cash']/preceding-sibling::*");
    By paymentMethodAllWallet = By.name("loyalty_wallet");
    By paymentMethodAllBnpl = By.name ("loyalty_bnpl");
    By paymentMethodAllBank = By.name("loyalty_bank");

    By buttonAddLoyalty (String buttonAddLyt){
        return By.xpath("//button[text()='"+buttonAddLyt+"']");
    }

//    By buttonEditSaveChangesId = By.xpath("//button[text()='Simpan Perubahan']");
//    By buttonEditSaveChangesEn = By.xpath("//button[text()='Save Changes']");

    By textBoxLoyaltySearch = By.xpath("(//div[@class='MuiFormControl-root MuiTextField-root css-i44wyl']/child::*/child::*)[2]");
    By resultSearchLoyaltyName (String searchLoyaltyName) {
        return By.xpath("//h6[@class='MuiTypography-root MuiTypography-subtitle2 MuiTypography-noWrap css-1k96qjc' and text()='"+ searchLoyaltyName+ "']");
    }
    By burgerMenuLoyaltyList = By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight MuiTableCell-sizeMedium css-1lymf83']//button[@type='button']");
    By buttonDeleteLoyaltyList = By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-sbyx5u']");
    By buttonEditLoyaltyList   = By.cssSelector(".MuiButtonBase-root.MuiMenuItem-root.MuiMenuItem-gutters.MuiMenuItem-root.MuiMenuItem-gutters.css-1q7d9dc");
    By popUpDeleteConfirmation = By.xpath("//h6[@class=\"MuiTypography-root MuiTypography-subtitle1 css-1glvazp\"]");
    By buttonDeleteConfirmation (String deleteConfirmation) {
        return By.xpath("//button[text()='"+deleteConfirmation+"']");
    }
    By alert = By.xpath("//div[@role=\"alert\"]");


    String selectAll = Keys.chord(Keys.CONTROL, "a");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        public void clickSubMenuTambahLoyalty () {
            driver.findElement(addLoyalty).click();
        }

        public void userOnPageAddLoyalty () {
            String url_loyalty_add = driver.getCurrentUrl();
            Assert.assertEquals(galileo_loyalty_add, url_loyalty_add);
        }

        public void userInputLoyaltyName (String inputLoyaltyName){
            wait.until(ExpectedConditions.presenceOfElementLocated(inputTextLoyaltyName));
            driver.findElement(inputTextLoyaltyName).sendKeys(inputLoyaltyName);
        }

        public void addLoyaltyPictureWithPath(String membershipPicture) {
            driver.findElement(uploadLoyaltyProgramLogo).click();
            System.out.println(membershipPicture);
        }

        //===========================================================================

        public void inputPointToRupiahRatio (String pointToRupiah){
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(logoLoyalty));
            driver.findElement(inputTextPointToRupiah).sendKeys(pointToRupiah);
        }

        public void chooseExclusiveSelectionWith (String exclusiveLoyalty){
            switch (exclusiveLoyalty) {
                case "Tidak" :
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/preceding::*[@name=\"loyalty_program_exclusive\"]")).click();
                case "No" :
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/preceding::*[@name=\"loyalty_program_exclusive\"]")).click();
                    break;
                case "Ya" :
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/following::*[@name=\"loyalty_program_exclusive\"]")).click();
                case "Yes" :
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/following::*[@name=\"loyalty_program_exclusive\"]")).click();
                    break;
                default : System.out.println("INVALID CONDITION");
            }
        }

        public void chooseExpiryDateSelectionWith (String pointExpiry){
            driver.findElement(selectPointExpiryDate(pointExpiry)).click();
            pointExpiryDateSelection(pointExpiry);
        }
        String valuePointExpiryDateSelection;
        public String pointExpiryDateSelection (String amber){
            this.valuePointExpiryDateSelection = amber;
            return valuePointExpiryDateSelection;
        }

        public void inputPointExpiryinDaywithsetting (String setPointExpiryinDay) {
            System.out.println("Point Expiry Date : " + valuePointExpiryDateSelection);
            switch (valuePointExpiryDateSelection) {
                case "Expiry" -> {
                    WebElement inputMaxRedeem = driver.findElement(textBoxPointExpiryinDay);
                    inputMaxRedeem.sendKeys(selectAll, Keys.chord(Keys.DELETE));
                    driver.findElement(textBoxPointExpiryinDay).sendKeys(setPointExpiryinDay);
                }
                default -> {
                }
            }
        }




        public void chooseAccumulatedEarnPointDurationFor (String accumulatedEarnPointDuration){
            driver.findElement(selectAccumulationEarnPointDuration(accumulatedEarnPointDuration)).click();
        }

        public void chooseOTPDigitFor(String OTPDigit){
            driver.findElement(selectOTPDigit (OTPDigit)).click();
        }

        public void inputLoyaltyDescription (String textLoyaltyDescription){
            driver.findElement(loyaltyDescription).sendKeys(textLoyaltyDescription);
        }

        public void userClickAddMembershipLevel(){
            driver.findElement(buttonAddMembership).click();
        }

        public void setAppliedMerchant(String appliedMerchant){
            switch (appliedMerchant){
                case ("All"):
                driver.findElement(appliedMerchantAll).click();
                break;
                default :
            }
        }

        public void setAppliedPaymentMethod(String appliedPaymentMethod) {
            switch (appliedPaymentMethod) {
                case ("Semua Payment method termasuk Cash"):
                    driver.findElement(allPaymentMethodincludeCashId).click();
                    break;
                case ("All Payment Method Including Cash"):
                    driver.findElement(allPaymentMethodincludeCashEn).click();
                    break;
                case ("All Wallet") :
                    driver.findElement(paymentMethodAllWallet).click();
                    break;
                case ("All BNPL") :
                    driver.findElement(paymentMethodAllBnpl).click();
                    break;
                case ("All Bank") :
                    driver.findElement(paymentMethodAllBank).click();
                    break;
                case ("All Wallet; All Bnpl") :
                    driver.findElement(paymentMethodAllWallet).click();
                    driver.findElement(paymentMethodAllBnpl).click();
                case ("All Wallet; All Bank") :
                    driver.findElement(paymentMethodAllWallet).click();
                    driver.findElement(paymentMethodAllBank).click();
                    break;
                case ("All Wallet; All Bnpl, All Bank"):
                    driver.findElement(paymentMethodAllWallet).click();
                    driver.findElement(paymentMethodAllBnpl).click();
                    driver.findElement(paymentMethodAllBank).click();
                    break;
                default :
            }
        }



//        public void clickLastButtonOnLoyaltyPageTo(String submitButton){
//            switch (submitButton){
//                case ("Tambah Loyalty") :
//                    driver.findElement(buttonAddLoyaltyId).click();
//                    break;
//                case ("Add Loyalty") :
//                    driver.findElement(buttonAddLoyaltyEn).click();
//                    break;
//                case ("Simpan Perubahan"):
//                    driver.findElement(buttonEditSaveChangesId).click();
//                    break;
//                case ("Save Changes"):
//                    driver.findElement(buttonEditSaveChangesEn).click();
//
//            }
//        }

    public void clickLastButtonOnLoyaltyPageTo (String submitButton) {
        driver.findElement(buttonAddLoyalty(submitButton)).click();
    }

        public void searchLoyaltyProgram(String loyaltyName){
            WebElement searchInput = driver.findElement(textBoxLoyaltySearch);
            searchInput.sendKeys(selectAll, Keys.chord(Keys.DELETE));
            searchInput.sendKeys(loyaltyName);
        }


        public void verifyTheExistenceOfALoyaltyProgram(String loyaltyProgramName){
            searchLoyaltyProgram(loyaltyProgramName);
            driver.findElement(resultSearchLoyaltyName(loyaltyProgramName)).isDisplayed();
        }

        public void clickBurgerMenuLoyaltyList(){
            driver.findElement(burgerMenuLoyaltyList).click();
        }

        public void clickDeleteLoyaltyList(){
            driver.findElement(buttonDeleteLoyaltyList).click();
        }
        public void clickEditLoyaltyList(){
        driver.findElement(buttonEditLoyaltyList).click();
        }


        public void inputNewLoyaltyName(String newLoyaltyName){
            driver.findElement(inputTextLoyaltyName).sendKeys(selectAll, Keys.chord(Keys.DELETE));
            driver.findElement(inputTextLoyaltyName).sendKeys(newLoyaltyName);
        }

        public void popUpConfirmationDeletionWithText(String popUpConfirmDelete) {
            assertTrue(driver.findElement(popUpDeleteConfirmation).isDisplayed());
            String confirmTextDelete = driver.findElement(popUpDeleteConfirmation).getText();
            System.out.println("isi pop up confirmation : " + confirmTextDelete);
            assertEquals(popUpConfirmDelete, confirmTextDelete);
        }

        public void clickButtonDeleteConfirmation (String confirmationDelete){
            driver.findElement(buttonDeleteConfirmation(confirmationDelete)).click();
        }

        public void verifyThereIsNoLoyaltyProgram(String loyaltyNameToDelete){
            searchLoyaltyProgram(loyaltyNameToDelete);
            driver.findElement(By.xpath("//img[@alt='No Data']"));
        }

}
