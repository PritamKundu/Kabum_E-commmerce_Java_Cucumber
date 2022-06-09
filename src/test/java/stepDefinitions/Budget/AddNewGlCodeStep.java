package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Budget.AddNewBudgetAccountPage;
import pages.Budget.AddNewGlCodePage;
import pages.Budget.InitialViewPage;
import utils.TestContextSetup;

import java.sql.Time;


public class AddNewGlCodeStep{

    WebDriver driver;
    TestContextSetup testContextSetup;
    AddNewGlCodePage addNewGlCodePage;
    AddNewBudgetAccountPage addNewBudgetAccountPage;
    InitialViewPage initialViewPage;

    public AddNewGlCodeStep(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.addNewGlCodePage = testContextSetup.pageObjectManager.getAddNewGLCodePage();
        this.addNewBudgetAccountPage = testContextSetup.pageObjectManager.getAddNewBudgetAccountPage();
        this.driver = testContextSetup.driver;
        this.initialViewPage = testContextSetup.pageObjectManager.getInitialViewPage();
    }



    @Then("click on new gl code from dropdown")
    public void clickOnNewGlCodeFromDropdown() throws InterruptedException {addNewGlCodePage.clickAddNewGlCode().click();
        Thread.sleep(5000);
    }

    @And("enter {string} in gl code text box")
    public void enterInGlCodeTextBox(String value) {addNewGlCodePage.sendGlCodeTextBox().sendKeys(value);
    }

    @Then("click on sava button in GL code detail page")
    public void clickOnSavaButtonInGLCodeDetailPage() throws InterruptedException {addNewGlCodePage.getSaveButtonInGlCodeDetailPage().click();
        Thread.sleep(2000);
    }

    @And("select a category from category list in GL code details")
    public void selectACategoryFromCategoryListInGLCodeDetails() throws InterruptedException {
        addNewGlCodePage.getSelectCategory().click();
        addNewGlCodePage.getSelectCategoryItem().click();
        Thread.sleep(5000);
    }

    @And("set minimum amount {string} and maximum amount {string} in text field")
    public void setMinimumAmountAndMaximumAmountInTextField(String min, String max) throws InterruptedException {
        addNewGlCodePage.getMinimumAmount().clear();
        addNewGlCodePage.getMinimumAmount().sendKeys(min);
        addNewGlCodePage.getMaximumAmount().clear();
        addNewGlCodePage.getMaximumAmount().sendKeys(max);
        Thread.sleep(5000);
    }

    @And("write something on description text box")
    public void writeSomethingOnDescriptionTextBox() {
        addNewGlCodePage.getDescription().sendKeys("This is description");
    }

    @And("click on active checkbox unmark it")
    public void clickOnActiveCheckboxUnmarkIt() {addNewGlCodePage.getActiveCheckBox().click();
    }

}
