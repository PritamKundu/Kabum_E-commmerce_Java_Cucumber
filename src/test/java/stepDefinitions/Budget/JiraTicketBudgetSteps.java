package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Budget.AddNewBudgetAccountPage;
import pages.Budget.BudgetApprovalPage;
import pages.Budget.InitialViewPage;
import pages.Budget.JiraTicketBudgetPage;
import utils.TestContextSetup;


public class JiraTicketBudgetSteps {

    WebDriver driver;
    TestContextSetup testContextSetup;
    JiraTicketBudgetPage jiraTicketBudgetPage;
    BudgetApprovalPage budgetApprovalPage;

    public JiraTicketBudgetSteps(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.jiraTicketBudgetPage =testContextSetup.pageObjectManager.getJiraTicketBudgetPage();
        this.driver = testContextSetup.driver;
        this.budgetApprovalPage = testContextSetup.pageObjectManager.getBudgetApprovalPage();
    }

    @And("enter data {string} search field")
    public void enterDataSearchField(String searchData) throws InterruptedException {
        budgetApprovalPage.setinputsearchbox().sendKeys(searchData);
        Thread.sleep(5000);


    }


    @And("click search data")
    public void clickSearchData() throws InterruptedException {
        jiraTicketBudgetPage.clickSearchDataHooter().click();
        String Expected = "Allen";
        String Actual = jiraTicketBudgetPage.assertRightSideName().getText();
        //System.out.println(Actual);
        //Assert.assertNotEquals(Actual, wrongData);
        //Assert.assertFalse(wrongData,Actual);
        Assert.assertNotEquals(Actual, Expected);
        //Assert.assertFalse(Boolean.parseBoolean(jiraTicketBudgetPage.assertRightSideName().getText()), wrongData);
        Thread.sleep(5000);
    }
}
