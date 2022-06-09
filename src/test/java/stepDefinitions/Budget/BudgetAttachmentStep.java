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


public class BudgetAttachmentStep{

        WebDriver driver;
        TestContextSetup testContextSetup;
        BudgetAttachmentPage budgetAttachmentPage;
        BudgetApprovalPage budgetApprovalPage;
        AddNewGlCodePage addNewGlCodePage;
        AddNewBudgetAccountPage addNewBudgetAccountPage;
        InitialViewPage initialViewPage;

        public BudgetAttachmentStep(TestContextSetup testContextSetup)
        {
                this.testContextSetup=testContextSetup;
                this.budgetAttachmentPage =testContextSetup.pageObjectManager.getbudgetAttachmentPage();
                this.budgetApprovalPage = testContextSetup.pageObjectManager.getBudgetApprovalPage();
                this.addNewGlCodePage = testContextSetup.pageObjectManager.getAddNewGLCodePage();
                this.addNewBudgetAccountPage = testContextSetup.pageObjectManager.getAddNewBudgetAccountPage();
                this.driver = testContextSetup.driver;
                this.initialViewPage = testContextSetup.pageObjectManager.getInitialViewPage();
        }




        @Then("click on budget attchment plus button")
        public void setclickattchmentplusbtnn() throws InterruptedException {
                budgetAttachmentPage.setclickattchmentplusbtn().click();
                Thread.sleep(5000);

        }


        @Then("right click on budget link")
        public void setclickrightbtnn() throws InterruptedException {
//                getbudgetAttachmentPage().setclickrightbtn();
                Actions actions;
                actions = new Actions(driver);
                actions.contextClick(budgetAttachmentPage.setclickrightbtn()).build().perform();
                Thread.sleep(5000);
        }


        @Then("right click on new directory")
        public void setrightclicknewdictt() throws InterruptedException {
                budgetAttachmentPage.setrightclicknewdict().click();
                Thread.sleep(5000);
        }

        @Then("right click on new directory for edit button")
        public void SetClickdictForeditButton() throws InterruptedException {
                budgetAttachmentPage.setClickdictForeditButton().click();
                Thread.sleep(5000);

        }

        @Then("Click edit blue button")
        public void SetClickEditBlueButton() throws InterruptedException {
                budgetAttachmentPage.SETClickEditBlueButton().click();
                Thread.sleep(5000);

        }


        @Then("show four options")
        public void setclickrightbufouropp() throws InterruptedException {
                Actions actions = new Actions(driver);
                actions.contextClick(budgetAttachmentPage.setclickrightbufourop()).build().perform();
                Thread.sleep(5000);
        }


        @Then("created folders button and right click of your mouse")
        public void setrightclickonmousebtn() throws InterruptedException {
                Actions actions = new Actions(driver);
                actions.contextClick(budgetAttachmentPage.setrightclickonmouse()).build().perform();
                Thread.sleep(5000);
        }


        @Then("click delete directory on budget documents")
        public void clickDeleteButtonOnRightButton() throws InterruptedException {
                budgetAttachmentPage.SetclickDeleteButtonOnRightButton().click();
                Thread.sleep(5000);

        }

        @Then("click delete button plus yes")
        public void setClickDeletePlusYes() throws InterruptedException {
                budgetAttachmentPage.SetClickDeletePlusYes().click();
                Thread.sleep(5000);

        }

        @Then("click delete button plus yes and x icon")
        public void setClickCrossIcon() throws InterruptedException {
                budgetAttachmentPage.SetClickCrossIcon().click();
                Thread.sleep(5000);
        }


        @Then("input link name on edit links")
        public void SetClickLinkName() throws InterruptedException {
                budgetAttachmentPage.SETClickLinkName().clear();
                Thread.sleep(2000);
                budgetAttachmentPage.SETClickLinkName().sendKeys("test");
                Thread.sleep(4000);
        }

        @Then("input Link URL from edit option")
        public void inputLinkURLFromEditOption() throws InterruptedException {
                budgetAttachmentPage.SetRemoveAndPutNewLink().clear();
                Thread.sleep(2000);
                budgetAttachmentPage.SetRemoveAndPutNewLink().sendKeys("http://yahoo.com");
                Thread.sleep(2000);
                
        }

        @And("input a Link Description")
        public void inputALinkDescription() throws InterruptedException {
                budgetAttachmentPage.SetInputLinkDescription().clear();
                Thread.sleep(2000);
                budgetAttachmentPage.SetInputLinkDescription().sendKeys("put all information");
                Thread.sleep(2000);

        }

        @Then("Click on Save button")
        public void clickOnSaveButton() throws InterruptedException {budgetAttachmentPage.SetClickOnSaveButton().click();
                Thread.sleep(2000);
        }

        @And("Click On Delete Button")
        public void clickOnDeleteButton() throws InterruptedException {budgetAttachmentPage.SetClickOnDeleteButton().click();
                Thread.sleep(2000);
        }

        @Then("Click on YES Button")
        public void clickOnYESButton() throws InterruptedException {budgetAttachmentPage.SetClickOnYesButton().click();
                Thread.sleep(2000);
        }

        @And("Click On X Icon")
        public void clickOnXIcon() throws InterruptedException {budgetAttachmentPage.SetClickOnXIcon().click();
                Thread.sleep(2000);
        }

        @Then("Click NEW blue button")
        public void clickNEWBlueButton() throws InterruptedException {budgetAttachmentPage.SetClickOnNEWButton().click();
                Thread.sleep(5000);
        }

        @And("Select a Created Directory")
        public void selectACreatedDirectory() throws InterruptedException {budgetAttachmentPage.SetSelectOnCreatedDirectory().click();
                Thread.sleep(5000);
        }


        @Then("Click on Blue Color NEW Icon")
        public void clickOnBlueColorNEWIcon() throws InterruptedException {budgetAttachmentPage.SetClickOnBlueColorNEWIcon().click();
                Thread.sleep(5000);

        }

        @And("Select a Created Directory right click")
        public void selectACreatedDirectoryRightClick() throws InterruptedException {budgetAttachmentPage.SetSelectOnCreatedDirectory();
                Actions actions = new Actions(driver);
                actions.contextClick(budgetAttachmentPage.SetSelectOnCreatedDirectory()).build().perform();
                Thread.sleep(5000);
        }

        @Then("Click on Rename Directory")
        public void ClickOnRenameDirectory() throws InterruptedException {budgetAttachmentPage.SetRenameDirectoryClick().click();
                Thread.sleep(5000);

                budgetAttachmentPage.SetRenameDirectoryClick().clear();
                Thread.sleep(2000);
                budgetAttachmentPage.SetRenameDirectoryClick().sendKeys("Testcase");
                Thread.sleep(2000);
        }

        @And("change name Directory")
        public void changeNameDirectory() throws InterruptedException {budgetAttachmentPage.SetRenameDirectory().clear();
                Thread.sleep(2000);
//                getbudgetAttachmentPage().SetRenameDirectory().sendKeys("Testcase");
//                Thread.sleep(2000);
        }


}




