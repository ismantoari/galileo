package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_home;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {

    By greeting = By.xpath("//h5[@class=\"MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-1puxygr\"]");


    public void validateUserIsOnHomePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(greeting));
          assertEquals(galileo_home , driver.getCurrentUrl());
    }

    public void clickMenuLoyaltyProgram(String loyaltyProgramSubMenu){
        if (loyaltyProgramSubMenu.contentEquals("Loyalty")){
            System.out.println("Loyalty");
        }

        else if (loyaltyProgramSubMenu.contentEquals("Promo")){
            System.out.println("Promo");
        }
        else if (loyaltyProgramSubMenu.contentEquals("Voucher")){
            System.out.println("Voucher");
        }
        else {
            System.out.println("UNUSUAL CONDITION");
        }
    }


    public void assertListSubLoyaltyProgram(String listSubLoyaltyProgram){
        if (listSubLoyaltyProgram.contentEquals("Loyalty")){
            System.out.println("Loyalty");
        }
        else         if (listSubLoyaltyProgram.contentEquals("Promo")){
            System.out.println("Promo");
        }

        else         if (listSubLoyaltyProgram.contentEquals("Voucher")){
            System.out.println("Voucher");
        }

    }
}
