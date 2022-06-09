package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Budget.*;
import utils.TestContextSetup;
import java.sql.Time;

public class BudgetHistory{

    WebDriver driver;
    TestContextSetup testContextSetup;
    BudgetAttachmentPage budgetAttachmentPage;
    BudgetApprovalPage budgetApprovalPage;
    AddNewGlCodePage addNewGlCodePage;
    AddNewBudgetAccountPage addNewBudgetAccountPage;
    InitialViewPage initialViewPage;
    BudgetHistoryPage budgetHistoryPage;

    public BudgetHistory(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.budgetHistoryPage = testContextSetup.pageObjectManager.getBudgetHistoryPage();
        this.budgetAttachmentPage =testContextSetup.pageObjectManager.getbudgetAttachmentPage();
        this.budgetApprovalPage = testContextSetup.pageObjectManager.getBudgetApprovalPage();
        this.addNewGlCodePage = testContextSetup.pageObjectManager.getAddNewGLCodePage();
        this.addNewBudgetAccountPage = testContextSetup.pageObjectManager.getAddNewBudgetAccountPage();
        this.driver = testContextSetup.driver;
        this.initialViewPage = testContextSetup.pageObjectManager.getInitialViewPage();
    }


    @Then("Verify Budget History tab available")
    public void VerifyBudgetHistorytabavailable() {
        Assert.assertEquals("SPOLNET", driver.getTitle());
    }



    @Given("click budget option from left Menu")
    public void clickBudgetOptionFromLeftMenu() throws InterruptedException {budgetHistoryPage.seBudgetMenu().click();
        Thread.sleep(5000);
    }

    @When("click on all Budget")
    public void clickOnAllBudget() {budgetHistoryPage.seAllBudget().click();
    }


    @And("Click All Unit Box")
    public void verifyClickAllUnitBox() throws InterruptedException {budgetHistoryPage.SeClickAllUnitBox().click();
        Thread.sleep(8000);
    }

    @And("Find a Value from Searchbox")
    public void FindAValueFromSearchBox() throws InterruptedException {budgetHistoryPage.SeSearchBar().sendKeys("test");
        Thread.sleep(5000);
    }


    @Then("Click budget unit account button")
    public void clickBudgetUnitAccountButton() throws InterruptedException {budgetHistoryPage.SeClickAllUnitBox().click();
        Thread.sleep(5000);
    }

    @Then("Open a previous created file from Search")
    public void openAPreviousCreatedFileFromSearch() throws InterruptedException {
        budgetHistoryPage.SeFindPreviousCreatedBudgetTest().click();
        Thread.sleep(5000);
    }

    @Then("Click on History tab")
    public void clickOnHistoryTab() throws InterruptedException {budgetHistoryPage.SetClickOnHistoryTab().click();
        Thread.sleep(2000);
    }

    @And("Click All View All Icon")
    public void clickAllViewAllIcon() throws InterruptedException {budgetHistoryPage.SetClickAllViewAllIcon().click();
        Thread.sleep(2000);
    }


}
