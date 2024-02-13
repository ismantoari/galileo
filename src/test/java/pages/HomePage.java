package pages;

import org.junit.Assert;
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

    By mainMenuSelector(String mainmenu) {
        return By.xpath("//*[@role='button']/descendant::*[text()='" + mainmenu + "']");
    }

    By subMenuSelector(String submenu) {
        return By.xpath("//*[@class='MuiListItemText-root css-xdiy5h' and text()='" + submenu + "']");
    }

    By addButtonTopRight(String buttonAdd) {
        return By.xpath("//button[normalize-space()='"+buttonAdd+ "']");
    }

    By pageVerification(String pageTitle) {
        return By.xpath("//*[text()='" + pageTitle + "']");
    }

    By countryFlag (String flagOfCountry){
        return By.xpath("//li[@role='menuitem']/descendant::*[text()='"+flagOfCountry+"']");
    }

    By selectFlag = By.xpath("//img[@alt='Indonesia']");

    By alertLogin = By.xpath("//div[@role=\"alert\"]");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    public void validateUserIsOnHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(greeting));
        assertEquals(galileo_home, driver.getCurrentUrl());
    }

    public void clickMenuLoyaltyProgram(String loyaltyProgramSubMenu) {
        List<WebElement> mainMenu = driver.findElements(menu);
        ArrayList<String> menuGalileo = new ArrayList<String>();

        int banyakMenu;
        banyakMenu = mainMenu.size();
        System.out.println("Banyak Menu : " + banyakMenu);


        for (int i = 0; i < banyakMenu; i++) {
            wait.until(ExpectedConditions.presenceOfElementLocated(menu));
            menuGalileo.add(mainMenu.get(i).getText());
            System.out.println("menuGalileo" + i + " " + menuGalileo.get(i));
        }
    }


    public void assertListSubLoyaltyProgram(String listSubLoyaltyProgram) {
        if (listSubLoyaltyProgram.contentEquals("Loyalty List")) {
            System.out.println("Loyalty List");
        } else if (listSubLoyaltyProgram.contentEquals("Promo List")) {
            System.out.println("Promo List");
        } else if (listSubLoyaltyProgram.contentEquals("Voucher List")) {
            System.out.println("Voucher List");
        } else {
            System.out.println("WRONG SELECT CONDITION");
        }
    }

    public void clickMainMenu(String mainmenu) {
        driver.findElement(mainMenuSelector(mainmenu)).click();
    }

    public void clickSubMenu(String submenu) {
        driver.findElement(subMenuSelector(submenu)).click();
    }
    public void pageVerivication(String pageTitle) {
        driver.findElement(pageVerification(pageTitle)).isDisplayed();
    }

    public void clickAdd(String buttonMark) {
        wait.until(ExpectedConditions.presenceOfElementLocated(addButtonTopRight(buttonMark)));
        driver.findElement(addButtonTopRight(buttonMark)).click();
    }

    public void selectFlagLanguage(String idOrEn){
        wait.until(ExpectedConditions.elementToBeClickable(selectFlag));
       // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(selectFlag));
        driver.findElement(selectFlag).click();
        //driver.findElement(countryFlag(idOrEn)).click();

        System.out.println(idOrEn);
    }


}
