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

//By selectPartialRedeem = By.xpath("input[value='Tidak']");
    By radioSelectPartialRedeem (String inputPartialRedeem){
        return By.xpath("input[value='"+ inputPartialRedeem+"']");
    }
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

        WebElement form = driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-355862'])[1]"));

        WebElement element = driver.findElement(radioSelectPartialRedeem(selectOptionPartialRedeem));

        form.click();
        //js.executeScript("arguments[0].scrollIntoView(true);",element);

        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);

        js.executeScript("window.scrollBy(0,1000)", "");

       // form.sendKeys(Keys.chord(Keys.DOWN));


                driver.findElement(radioSelectPartialRedeem(selectOptionPartialRedeem)).click();
    }

    public void inputMaxRedeem(String maxRedeemPercent){
        driver.findElement(maxRedeem).clear();
                driver.findElement(maxRedeem).sendKeys(maxRedeemPercent);

    }








}
