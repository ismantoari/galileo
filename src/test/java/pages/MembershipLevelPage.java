package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static helper.BestUtil.driver;

public class MembershipLevelPage {
By textBoxMembershipLevelName = By.xpath("//input[@name=\"name\"]");
By colorMembershipLevel = By.xpath("//input[@name=\"color\"]");

By descriptionMemberLevel = By.name("description");
By spendingToEarnPoint = By.name("currency_value");

By maxRedeem = By.name("max_redeemed_value");

//    By buttonAddReward (String buttonAddRwd){
//        return By.xpath("//div[@class=\"MuiStack-root css-snxq2g\"]/child::*/child::*[text()='"+ buttonAddRwd+"']");
//    }
    By buttonAddReward = By.xpath("(//div[@class=\"MuiStack-root css-snxq2g\"]/child::*/child::*)[2]");

//By selectPartialRedeem = By.xpath("input[value='Tidak']");
    By radioSelectPartialRedeem (String inputPartialRedeem){
        return By.xpath("(//span[text()='"+inputPartialRedeem+"']/parent::*)/child::*/child::input[@type=\"radio\"]");
    }


   By textBoxRewardName = By.name("reward_list.0.reward_name");
   By textBoxRewardDescription = By.name("reward_list.0.reward_description");
   By buttonAddMembership = By.xpath("(//div[@class=\"MuiStack-root css-8vaenn\"]/child::*/child::*)[2]");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    String selectAll = Keys.chord(Keys.CONTROL, "a");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void inputMembershipLevelName(String membershipLevelName){
    driver.findElement(textBoxMembershipLevelName).sendKeys(membershipLevelName);
    }

    public void inputColorCodeForMembershipLevel(String colorMemberhip){

        WebElement colorCodeMember = driver.findElement(colorMembershipLevel);
        colorCodeMember.sendKeys(selectAll, Keys.chord(Keys.DELETE));
        driver.findElement(colorMembershipLevel).sendKeys(colorMemberhip);
    }

    public void addMemberLevelDescription(String descriptionOfMembershipLevel){
        driver.findElement(descriptionMemberLevel).sendKeys(descriptionOfMembershipLevel);

    }

    public void inputSpendingToEarnOnePointBy(String spendingToPoint){
        WebElement STEOP = driver.findElement(spendingToEarnPoint);
        STEOP.sendKeys(selectAll, Keys.chord(Keys.DELETE));
        driver.findElement(spendingToEarnPoint).sendKeys(spendingToPoint);

    }

    public void selectPartialRedeem (String selectOptionPartialRedeem){


        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("(//div[@class=\"simplebar-track simplebar-vertical\"])[2]"));

        action.moveToElement(ele);
        WebElement hadiah = driver.findElement(By.xpath("//h6[text()=\"Daftar Hadiah\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);",hadiah);

        driver.findElement(radioSelectPartialRedeem(selectOptionPartialRedeem)).click();
        partialRedeem(selectOptionPartialRedeem);
    }

    String valuePartialRedeem;
    public String partialRedeem (String amber){
        this.valuePartialRedeem = amber;
        return valuePartialRedeem;
    }

    public void inputMaxRedeem(String maxRedeemPercent){
        System.out.println("Partial Redeem : " +valuePartialRedeem );
        switch (valuePartialRedeem){
            case "Ya" ->{
                WebElement inputMaxRedeem = driver.findElement(maxRedeem);
                inputMaxRedeem.sendKeys(selectAll, Keys.chord(Keys.DELETE));
                driver.findElement(maxRedeem).sendKeys(maxRedeemPercent);
            }
            case "Yes" ->{
                WebElement inputMaxRedeem = driver.findElement(maxRedeem);
                inputMaxRedeem.sendKeys(selectAll, Keys.chord(Keys.DELETE));
                driver.findElement(maxRedeem).sendKeys(maxRedeemPercent);
            }
            default -> {
            }
        }
    }

//public void clickAddButtonRewardList(String buttonAddRwd) {
//    driver.findElement(buttonAddReward(buttonAddRwd)).click();
//}

    public void clickAddButtonRewardList() {
        driver.findElement(buttonAddReward).click();
    }

public void inputRewardName(String rewardName){
        driver.findElement(textBoxRewardName).sendKeys(rewardName);
}

public void inputRewardDescription(String rewardDescription){
        driver.findElement(textBoxRewardDescription).sendKeys(rewardDescription);
        }

public void clickButtonAddMembership() {
        driver.findElement(buttonAddMembership).click();

}



}
