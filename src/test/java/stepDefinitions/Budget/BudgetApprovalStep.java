package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Budget.AddNewBudgetAccountPage;
import pages.Budget.AddNewGlCodePage;
import pages.Budget.BudgetApprovalPage;
import pages.Budget.InitialViewPage;
import utils.TestContextSetup;

import java.sql.Time;


public class BudgetApprovalStep{

    WebDriver driver;
    TestContextSetup testContextSetup;
    BudgetApprovalPage budgetApprovalPage;
    AddNewGlCodePage addNewGlCodePage;
    AddNewBudgetAccountPage addNewBudgetAccountPage;
    InitialViewPage initialViewPage;

    public BudgetApprovalStep(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.budgetApprovalPage = testContextSetup.pageObjectManager.getBudgetApprovalPage();
        this.addNewGlCodePage = testContextSetup.pageObjectManager.getAddNewGLCodePage();
        this.addNewBudgetAccountPage = testContextSetup.pageObjectManager.getAddNewBudgetAccountPage();
        this.driver = testContextSetup.driver;
        this.initialViewPage = testContextSetup.pageObjectManager.getInitialViewPage();
    }

    @And("click all unit box in bugt by unit manager")
    public void clickallunitbox() throws InterruptedException {
        budgetApprovalPage.getActiveCheckBox().click();
        Thread.sleep(5000);
    }

    @And("input searchbox on budget unit manager")
    public void enterdatasearchbox() throws InterruptedException {
        budgetApprovalPage.setinputsearchbox().sendKeys("test");
        Thread.sleep(4000);
    }

    @Then("click budget unit account button")
    public void clicksetclickbudgetunit() throws InterruptedException {
        budgetApprovalPage.setclickbudgetunit().click();
        Thread.sleep(4000);
    }


    @And("click plus btn")
    public void setclickplusbttn() throws InterruptedException {
        budgetApprovalPage.setclickplusbtn().click();
        Thread.sleep(3000);
    }

    @And("select a value from add remove GL")
    public void setinputvaluee() throws InterruptedException {
        budgetApprovalPage.setinputvalue().sendKeys("001");
        Thread.sleep(3000);
    }

    @Then("click save button on budget details")
    public void setclicksavebtn() throws InterruptedException {
        budgetApprovalPage.setclicksavebtn().click();
        Thread.sleep(3000);
    }

    @Then("click on chk box")
    public void setclickshkbox() throws InterruptedException {
        budgetApprovalPage.setclickshkbox().click();
        Thread.sleep(3000);
    }

    @Then("click expenditures")
    public void setclickexpenditures() throws InterruptedException {
        budgetApprovalPage.setclickexpenditures().click();
        Thread.sleep(3000);
    }

    @Then("click three dot budget summery")
    public void setclickthreedott() throws InterruptedException {
        budgetApprovalPage.setclickthreedot().click();
        Thread.sleep(3000);
    }


    @Then("click delete button on budget summery")
    public void setclickdeletebtnn() throws InterruptedException {
        budgetApprovalPage.setclickdeletebtn().click();
        Thread.sleep(3000);
    }


    @Then("click delete button and delete")
    public void setclickconfirmdltt() throws InterruptedException {
        budgetApprovalPage.setclickconfirmdlt().click();
        Thread.sleep(3000);
    }

    //Sp 45
    @And("click on All Unit CheckBox")
    public void clickOnAllUnitCheckBox() throws InterruptedException {
        budgetApprovalPage.getActiveCheckBox().click();
        Thread.sleep(2000);
    }

    @Then("Click the  Favourite star icon")
    public void clickTheFavouriteStarIcon() throws InterruptedException {
        budgetApprovalPage.SetFavouriteStarIcon().click();
        Thread.sleep(3000);
    }

    //Sp 35 to 39, 45
    @Then("open it  display will show you Budget Details")
    public void openItDisplayWillShowYouBudgetDetails() throws InterruptedException {
        budgetApprovalPage.SetFindPreviousCreatedBudgetTest().click();
        Thread.sleep(5000);

    }

    @And("Again click the  Favourite star icon")
    public void againClickTheFavouriteStarIcon() throws InterruptedException {budgetApprovalPage.SetFavouriteStarIcon().click();
            Thread.sleep(3000);
        }


}
