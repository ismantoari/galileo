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
    By inputTextLoyaltyName = By.cssSelector("#\\:rd\\:");
    By inputTextPointToRupiah = By.id("loyalty_program_point_to_rupiah_ratio");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public void clickSubMenuTambahLoyalty(){
        driver.findElement(addLoyalty).click();
    }

    public void userOnPageAddLoyalty(){
        String url_loyalty_add = driver.getCurrentUrl();
        Assert.assertEquals(galileo_loyalty_add,url_loyalty_add);
    }

    public void userInputLoyaltyName(String inputLoyaltyName){
        wait.until(ExpectedConditions.presenceOfElementLocated(inputTextLoyaltyName));
        driver.findElement(inputTextLoyaltyName).sendKeys(inputLoyaltyName);
    }

    public void inputPointToRupiahRatio(String pointToRupiah){
        driver.findElement(inputTextPointToRupiah).sendKeys(pointToRupiah);
    }




}
