package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Budget.InitialViewPage;
import utils.TestContextSetup;

import java.io.IOException;


public class BudgetInitialViewStep {

//    WebDriver driver;
    TestContextSetup testContextSetup;
    InitialViewPage initialViewPage;

    public BudgetInitialViewStep(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.initialViewPage =testContextSetup.pageObjectManager.getInitialViewPage();

    }


    @Then("validation of page title")
    public void validationOfPageTitle() {
//        Assert.assertEquals("SPOLNET", initialViewPage.getTitle());
    }

    @Then("Click on search bar and write a value")
    public void clickOnSearchBarAndWriteAValue() {
        initialViewPage.verifySearchOnData().sendKeys("a");
    }

    @Then("click on all unit checkbox")
    public void clickOnAllUnitCheckbox() throws InterruptedException {
        initialViewPage.clickOnAllUnit().click();
        Thread.sleep(5000);
    }


    @Then("click detail button secondary")
    public void clickDetailButtonSecondary() throws InterruptedException {
        initialViewPage.clickButtonSecondary().click();
        Thread.sleep(3000);
    }

    @Given("Click detail Primary Button")
    public void clickDetailPrimaryButton() throws InterruptedException {
        initialViewPage.setDetailButtonPrimary().click();
        Thread.sleep(5000);

    }

    @When("Search field check")
    public void searchFieldCheck() {
        initialViewPage.verifySearchOnData().sendKeys("a");

    }

    @Then("verify no records display")
    public void verifyNoRecordsDisplay() throws InterruptedException {
        String searchRecords = initialViewPage.verifySearchNoRecords().getText();
        Thread.sleep(4000);
        Assert.assertEquals("There are no records to display.", searchRecords);
    }

    @Then("click unit manager dropdown")
    public void clickUnitManagerDropdown() {
        initialViewPage.clickUnitManagerDropdown().click();
    }

    @When("Click three dot button")
    public void clickThreeDotButton() {
        initialViewPage.clickThreeDotButton().click();
    }

    @Then("verify display budget account and gl code")
    public void verifyDisplayBudgetAccountAndGlCode() {
        initialViewPage.verifyNewBudgetAccount().isDisplayed();
        initialViewPage.verifyNewGlCode().isDisplayed();
    }

    @Then("click new budget account")
    public void clickNewBudgetAccount() throws InterruptedException {
        initialViewPage.verifyNewBudgetAccount().click();
        Thread.sleep(3000);
    }


    @Then("verify new budget account form title")
    public void verifyNewBudgetAccountFormTitle() throws InterruptedException {
        String title = initialViewPage.verifyNewBudgetAccountTitle().getText();
        Assert.assertEquals("Budget Account Detail", title);
        Thread.sleep(3000);
    }

    @And("enter data account title field")
    public void enterDataAccountTitleField() throws InterruptedException {
        initialViewPage.verifyNewBudgetAccountTitleBox().sendKeys("Adam");
        Thread.sleep(3000);
    }

    @Then("verify account title text box display")
    public void verifyAccountTitleTextBoxDisplay() throws InterruptedException {
        initialViewPage.verifyNewBudgetAccountTitleBox().isDisplayed();
        Thread.sleep(4000);
    }


    @And("click planning unit dropdown")
    public void clickPlanningUnitDropdown() throws InterruptedException {
        initialViewPage.verifyPlanningUnitDropdown().click();
        Thread.sleep(3000);
    }

    @Then("select option planning unit dropdown")
    public void selectOptionPlanningUnitDropdown() throws InterruptedException {
        initialViewPage.clickPlanningUnitDropdownOption().click();
        Thread.sleep(3000);
    }

    @And("select option function unit dropdown")
    public void selectOptionFunctionUnitDropdown() throws InterruptedException {
        initialViewPage.clickFunctionDropdownOption().click();
        Thread.sleep(3000);
    }

    @Then("click on edit icon")
    public void clickOnEditIcon() throws InterruptedException {
        initialViewPage.clickEditIcon().click();
        Thread.sleep(3000);

    }

    @Then("validation edit page all field")
    public void validationEditPageAllField() throws InterruptedException {
        initialViewPage.verifyBudgetFunctionNumber().isDisplayed();
        initialViewPage.verifyBudgetCategory().isDisplayed();
        initialViewPage.verifyBudgetCategoryDescription().isDisplayed();
        Thread.sleep(3000);
    }

    @And("change budget function number")
    public void changeBudgetFunctionNumber() throws InterruptedException {
        initialViewPage.getBudgetFunctionNumberDecreaseButton().click();
        Thread.sleep(2000);
    }


    @Then("Click on Attachments Tab")
    public void clickOnAttachmentsTab() throws InterruptedException {initialViewPage.SetClickOnAttachmentsTab().click();
        Thread.sleep(4000);
    }


    @Then("Click on Document Repository Plus button")
    public void clickOnDocumentRepositoryPlusButton() throws InterruptedException
    {initialViewPage.SetClickOnDocumentRepositoryPlusBtn().click();
        Thread.sleep(4000);
    }
//
//    @Then("Mouse Right click of Budget Document")
//    public void setclickbudgetdocumentt() throws InterruptedException
//    {initialViewPage.setclickbudgetdocument();
//        Actions actions = new Actions(driver);
//        actions.contextClick().perform();
//        Thread.sleep(2000);
//    }



    @Then("Mouse Right click of Budget Document")
    public void setclickbudgetdocumentt () throws InterruptedException {
        initialViewPage.setclickbudgetdocument();
        Thread.sleep(5000);
    }

    @And("Create a New Directory")
    public void createANewDirectory() throws InterruptedException {initialViewPage.SetOnCreateANewDirectory().click();
        Thread.sleep(4000);
    }


    @And("Select New Directory folder")
    public void selectNewDirectoryFolder() throws InterruptedException {initialViewPage.GetSelectNewDirectoryFolder().click();
        Thread.sleep(4000);
    }


    @Then("click Blue Color UPLOAD button")
    public void clickBlueColorUPLOADButton() throws InterruptedException {initialViewPage.SetClickBlueColorUPLOADButton().click();
        Thread.sleep(4000);
    }


//    @Then("Click on Select files and select any file from your device")
//    public void clickOnSelectFilesAndSelectAnyFileFromYourDeviceAndClickUpload() throws InterruptedException
//    {
//
//        getBudgetPage().GetClickOnSelectFile().sendKeys("G:\\New folder\\doc.txt");
//        Thread.sleep(5000);
//    }

//    @Then("Click on Select files and select any file from your device")
//    public void clickOnSelectFilesAndSelectAnyFileFromYourDeviceAndClickUpload() throws InterruptedException, IOException {
//        Actions actions = new Actions(testContextSetup.driver);
//        actions.moveToElement(initialViewPage.GetClickOnSelectFile()).click().perform();
//        Thread.sleep(5000);
//        Runtime.getRuntime().exec("\"C:\\Users\\arouf\\Desktop\\New folder\\fileuploadone.exe\"");
//        initialViewPage.GetClickOnSelectFile().sendKeys("C:\\Users\\arouf\\Desktop\\Document.txt");
//        Thread.sleep(5000);
//    }



    @Then("Click on Select files and select any file from your device")
    public void clickOnSelectFiles () throws InterruptedException, IOException {
        initialViewPage.clickOnSelectFilesAndSelectAnyFileFromYourDeviceAndClickUpload();
        Thread.sleep(5000);
    }

    @Then("Click on Upload Button")

    public void ClickOnUploadButton() throws InterruptedException {

        initialViewPage.GetClickUploadButton().click();
        Thread.sleep(5000);

    }





}
