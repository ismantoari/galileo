package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.BestUtil.driver;
import static helper.Endpoint.host_galileo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage {

    By usernameInputText = By.id(":r1:");
    By passwordInputText = By.id(":r2:");
    By loginButton = By.id(":r3:");
    By forgotPasswordLink = By.xpath("//a[@href='/auth/forgot-password']");
    By errorInvUserPwd = By.xpath("//div[@class='MuiAlert-message css-2shwac']");
    By errorUserBlank = By.id(":r1:-helper-text");
    By errorPasswordBlank = By.id(":r2:-helper-text");
    By alertLogin = By.xpath("//div[@role=\"alert\"]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void url_galileo(){
        driver.get(host_galileo);
    }

    public void inputUserNameWith(String name){
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputText));
        driver.findElement(usernameInputText).sendKeys(name);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void forgotPassword(){
        driver.findElement(forgotPasswordLink).click();
    }



    public void assertLogin(String testCategory){
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        switch (testCategory) {
            case "positive" -> {
                HomePage homePage = new HomePage();
                homePage.validateUserIsOnHomePage();

                String textLogin =  driver.findElement(alertLogin).getText();
                System.out.println("text alert positive     : " + textLogin);
                //driver.findElement(alertLogin).click();
            }
            case "negative invalid pwd" -> {
                wait.until(ExpectedConditions.presenceOfElementLocated(errorInvUserPwd));
                assertTrue(driver.findElement(errorInvUserPwd).isDisplayed());
                assertEquals("Request failed with status code 401", driver.findElement(errorInvUserPwd).getText());

                String textLogin =  driver.findElement(alertLogin).getText();
                System.out.println("text alert invalid pwd  : " + textLogin);
            }
            case "negative invalid user" -> {
                wait.until(ExpectedConditions.presenceOfElementLocated(errorInvUserPwd));
                assertTrue(driver.findElement(errorInvUserPwd).isDisplayed());
                assertEquals("Request failed with status code 404", driver.findElement(errorInvUserPwd).getText());

                String textLogin =  driver.findElement(alertLogin).getText();
                System.out.println("text alert invalid user : " + textLogin);
            }
            case "negative user blank" -> {
                wait.until(ExpectedConditions.presenceOfElementLocated(errorUserBlank));
                assertTrue(driver.findElement(errorUserBlank).isDisplayed());
                assertEquals("User Name is a required field", driver.findElement(errorUserBlank).getText());
            }
            case "negative password blank" -> {
                wait.until(ExpectedConditions.presenceOfElementLocated(errorPasswordBlank));
                assertTrue(driver.findElement(errorPasswordBlank).isDisplayed());
                assertEquals("Password is a required field", driver.findElement(errorPasswordBlank).getText());
            }
            default -> System.out.println("INVALID CONDITION");
        }

    }

}
