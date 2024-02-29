package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_home;
import static org.junit.Assert.assertEquals;


public class HomePage {

    String totalPromoBefore, totalPromoAfter, activePromoBefore, activePromoAfter, upcomingPromoBefore, upcomingPromoAfter, expiredPromoBefore, expiredPromoAfter;
    String totalVoucherBefore, totalVoucherAfter, activeVoucherBefore, activeVoucherAfter, upcomingVoucherBefore, upcomingVoucherAfter, expiredVoucherBefore, expiredVoucherAfter;

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
    By selectLang = By.xpath("//span[@class=\"MuiBox-root css-gecs57\"]");
   By countryFlag (String flagOfCountry){
   return By.xpath("//li[@role=\"menuitem\"]/descendant::span[@class=\"MuiBox-root css-1ang2f9\"]/descendant::span[@class=\"wrapper lazy-load-image-background  lazy-load-image-loaded\"]/descendant::img[@alt=\"" + flagOfCountry + "\"]");
  }
    By alert = By.xpath("//div[@role=\"alert\"]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public void validateUserIsOnHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(greeting));
        assertEquals(galileo_home, driver.getCurrentUrl());
    }
//    By totalItem (String totalCount) {
//        return By.xpath("//h6[text()='Total']/following-sibling::*");
//    }

    By totalItem = By.xpath("//h6[text()='Total']/following-sibling::*");
    By activeItem = By.xpath("(//h6[@class='MuiTypography-root MuiTypography-subtitle2 css-yemnbq'])[2]");
    By upcomingItem = By.xpath("//h6[text()='Upcoming']/following-sibling::*");
    By expiredItem = By.xpath("//h6[text()='Expired']/following-sibling::*");


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

    public void selectFlagLanguage(String idOrEn) {

        //driver.findElement(alert).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectLang));
        driver.findElement(selectLang).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(countryFlag(idOrEn)));
        driver.findElement(countryFlag(idOrEn)).click();
    }


    public void checkTotal(String totalChecker) {
        String totalContainer = driver.findElement(totalItem).getText();
        System.out.println("Total " + totalChecker + ": " + totalContainer);

        switch (totalChecker) {
            case "Promo" :
                this.totalPromoBefore = totalContainer;
                break;
            case "Voucher" :
                this.totalVoucherBefore = totalContainer;
        }
    }

    public void checkActive(String activeChecker){
        String activeContainer = driver.findElement(activeItem).getText();
        System.out.println(("Active "+activeChecker+": " + activeContainer));
        switch (activeChecker){
            case "Promo" :
                this.activePromoBefore = activeContainer;
                break;
            case "Voucher" :
                this.activeVoucherBefore = activeChecker;
        }
    }

    public void checkUpcoming(String upcomingRelatedCount){
        String upcomingContainer = driver.findElement(upcomingItem).getText();
        System.out.println("upcoming "+upcomingRelatedCount+": "+upcomingContainer);

        switch (upcomingContainer){
            case "Promo" :
                this.upcomingPromoBefore = upcomingContainer;
                break;
            case "Voucher" :
                this.upcomingVoucherBefore = upcomingContainer;
        }
    }

    public void checkExpired(String expiredRelatedCount){
        String expiredContainer = driver.findElement(expiredItem).getText();
        System.out.println("expired "+expiredRelatedCount+ ": "+ expiredContainer);

        switch (expiredContainer){
            case "Promo":
                this.expiredPromoBefore = expiredContainer;
                break;
            case "Voucher" :
                this.expiredVoucherBefore = expiredContainer;
        }
    }
}
