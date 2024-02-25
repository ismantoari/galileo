package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.awt.Robot;</pre>
import java.awt.event.KeyEvent;
import java.time.Duration;

import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_loyalty_add;

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

    By paymentMethodAllWallet = By.name("loyalty_wallet");

    By buttonLoyaltySaveChanges = By.xpath("//button[@type=\"submit\"]");

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
        //======================== PENAMBAHAN GAMBAR OYALTY +++++++++++++++++++++++

        public void uploadPicture () throws Exception {
//            Robot rb = new Robot();
//
//            rb.keyPress(KeyEvent.VK_D);
//            rb.keyRelease(KeyEvent.VK_D);
//            Thread.sleep(2000);
//
//            rb.keyPress(KeyEvent.VK_SHIFT);
//            rb.keyPress(KeyEvent.VK_SEMICOLON);
//            rb.keyRelease(KeyEvent.VK_SEMICOLON);
//            rb.keyRelease(KeyEvent.VK_SHIFT);
//
//            rb.keyPress(KeyEvent.VK_BACK_SLASH);
//            rb.keyRelease(KeyEvent.VK_BACK_SLASH);
//            Thread.sleep(2000);
//
//            rb.keyPress(KeyEvent.VK_P);
//            rb.keyRelease(KeyEvent.VK_P);
//
//            rb.keyPress(KeyEvent.VK_I);
//            rb.keyRelease(KeyEvent.VK_I);
//
//            rb.keyPress(KeyEvent.VK_C);
//            rb.keyRelease(KeyEvent.VK_C);
//            Thread.sleep(2000);


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
                case "Tidak" -> {
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/preceding::*[@name=\"loyalty_program_exclusive\"]")).click();
                }
                case "No" -> {
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/preceding::*[@name=\"loyalty_program_exclusive\"]")).click();
                }
                case "Ya" -> {
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/following::*[@name=\"loyalty_program_exclusive\"]")).click();
                }
                case "Yes" -> {
                    driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-j7qwjs\" and text()=\"Tidak\"]/following::*[@name=\"loyalty_program_exclusive\"]")).click();
                }
                default -> System.out.println("INVALID CONDITION");
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
                case ("All")->{
                driver.findElement(appliedMerchantAll).click();
                }
                default -> {
                }
            }
        }

        public void setAppliedPaymentMethod(String appliedPaymentMethod) {
            switch (appliedPaymentMethod) {
                case ("All Wallet") -> {
                    driver.findElement(paymentMethodAllWallet).click();
                }
                default -> {

                }
            }
        }

        public void clickLastButtonOnLoyaltyPageTo(String submitButton){
            switch (submitButton){
                case ("Simpan Perubahan") ->{
                    driver.findElement(buttonLoyaltySaveChanges).click();
                }
                case ("Save Changes") ->{
                    driver.findElement(buttonLoyaltySaveChanges).click();
                }
            }
        }



}
