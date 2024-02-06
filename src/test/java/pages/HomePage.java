package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_home;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {

    By greeting = By.xpath("//h5[@class=\"MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-1puxygr\"]");
    By menu = By.xpath("//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-15q9ois\"]");
    By menuLoyaltyProgram = By.xpath("(//div[@class=\"MuiListItemText-root css-136jjw8\"])[3]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void validateUserIsOnHomePage(){
          wait.until(ExpectedConditions.presenceOfElementLocated(greeting));
          assertEquals(galileo_home , driver.getCurrentUrl());
    }

    public void clickMenuLoyaltyProgram(String loyaltyProgramSubMenu){

        //==========================================================
        // klik menu Loyalty Program
        //=========================================================
        if (loyaltyProgramSubMenu.contentEquals("Loyalty")){
            driver.findElement(menuLoyaltyProgram).click();
        }
        else {
            System.out.println("Bukan menu Loyalty");
        }

        //===========================================================

        List<WebElement> mainMenu = driver.findElements(menu);
        ArrayList<String> menuGalileo = new ArrayList<String>();

        int banyakMenu;
        banyakMenu = mainMenu.size();
        System.out.println("Banyak Menu : " + banyakMenu);


//        for (int i = 0; i < banyakMenu; i++) {
//            wait.until(ExpectedConditions.presenceOfElementLocated(menu));
//            menuGalileo.add(mainMenu.get(i).getText());
//            System.out.println("menuGalileo"+i+ " " + menuGalileo.get(i) );
//        }
    }


    public void assertListSubLoyaltyProgram(String listSubLoyaltyProgram){
        if (listSubLoyaltyProgram.contentEquals("Loyalty List")){
            System.out.println("Loyalty List");
        }
        else if (listSubLoyaltyProgram.contentEquals("Promo List")){
            System.out.println("Promo List");
        }
        else if (listSubLoyaltyProgram.contentEquals("Voucher List")){
            System.out.println("Voucher List");
        }
        else {
            System.out.println("WRONG SELECT CONDITION");
        }
    }
}
