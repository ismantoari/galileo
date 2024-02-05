package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepdef {
    LoginPage loginPage = new LoginPage();
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.url_galileo();
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String userName) {
        loginPage.inputUserNameWith(userName);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }


    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("check login {string}")
    public void checkLogin(String loginScenario) {
        loginPage.assertLogin(loginScenario);
    }
}
