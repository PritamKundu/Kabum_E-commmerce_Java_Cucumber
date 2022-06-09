package stepDefinitions.LoginPage;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage.LogInPage;
import utils.TestContextSetup;


public class LoginPage_Steps {


    TestContextSetup testContextSetup;
    LogInPage logInPage;

    public LoginPage_Steps(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.logInPage =testContextSetup.pageObjectManager.getLogInPage();
    }


    @Given("user Enter username {string}")
    public void user_enter_username(String username) {
        logInPage.setUserName(username);

    }
    @And("user Enter password {string}")
    public void user_enter_password(String password) {
        logInPage.setPassword(password);
//        getLoginPage().setPassword(password);
  }
    @Then("click on login button")
    public void click_on_login_button() throws InterruptedException {
        logInPage.setLogin().click();
//        getLoginPage().setLogin();
        Thread.sleep(5000);
    }

}