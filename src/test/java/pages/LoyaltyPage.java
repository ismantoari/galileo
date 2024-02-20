package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        public void inputPointToRupiahRatio (String pointToRupiah){
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

}
