package stepDefinitions.Budget;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Budget.AddNewBudgetAccountPage;
import pages.Budget.InitialViewPage;
import utils.TestContextSetup;

import java.sql.Time;


public class AddNewBudgetAccountSteps{

    WebDriver driver;
    TestContextSetup testContextSetup;
    AddNewBudgetAccountPage addNewBudgetAccountPage;
    InitialViewPage initialViewPage;

    public AddNewBudgetAccountSteps(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.addNewBudgetAccountPage =testContextSetup.pageObjectManager.getAddNewBudgetAccountPage();
        this.driver = testContextSetup.driver;
        this.initialViewPage = testContextSetup.pageObjectManager.getInitialViewPage();
    }

    @Given("click budget option from left menu")
    public void clickBudgetOptionFromLeftMenu() throws InterruptedException {
        Thread.sleep(5000);
        initialViewPage.setBudgetMenu().click();
        Thread.sleep(5000);
    }

    @When("click on all budget")
    public void clickOnAllBudget() throws InterruptedException {
        initialViewPage.setAllBudget().click();
        Thread.sleep(5000);
    }

    @And("verify unit manager page is available")
    public void verifyUnitManagerPageIsAvailable() {
        String text = initialViewPage.verifyUnitManagerPageTitle().getText();
        Assert.assertEquals("Unit Manager", text);
    }

    @Then("Click On Save Button in budget function details")
    public void clickOnSaveButtonInBudgetFunctionDetails() {
        initialViewPage.getBudgetFunctionDetailsPageSaveButton().click();
    }

    @Then("validation function dropdown available")
    public void validationFunctionDropdownAvailable() throws InterruptedException {
        addNewBudgetAccountPage.clickFunctionDropdown().isDisplayed();
        Thread.sleep(3000);
    }

    @And("click on add icon above function dropdown")
    public void clickOnAddIconAboveFunctionDropdown() throws InterruptedException {
        addNewBudgetAccountPage.getFunctionPlusIcon().click();
        Thread.sleep(3000);
    }

    @And("click function unit dropdown")
    public void clickFunctionUnitDropdown() {
        addNewBudgetAccountPage.clickFunctionDropdown().click();
    }

    @Then("click on sava button in budget function detail page")
    public void clickOnSavaButtonInBudgetFunctionDetailPage() throws InterruptedException {
        Thread.sleep(3000);
        addNewBudgetAccountPage.clickSaveButtonInBudgetFunctionDetails().click();

    }

    @And("select budget category")
    public void selectBudgetCategory() {
        addNewBudgetAccountPage.clickBudgetCategory().click();
    }

    @And("write description in budget function description")
    public void writeDescriptionInBudgetFunctionDescription() {
        addNewBudgetAccountPage.setBudgetFunctionDescription().sendKeys("Test Automation Testing Tools");
    }

    @Then("focus on account number")
    public void focusOnAccountNumber() {
//        getAddNewBudgetAccountPage().clickAccountNumberFirstBox().click();
        addNewBudgetAccountPage.displayTextAccountNumber().isDisplayed();
    }

    @Then("click on second text box")
    public void clickOnSecondTextBox() throws InterruptedException {
        addNewBudgetAccountPage.clickAccountNumberSecondBox().click();
        Thread.sleep(3000);
    }


    @And("click on first text box")
    public void clickOnFirstTextBox() {
        addNewBudgetAccountPage.clickAccountNumberFirstBox().click();
    }

    @And("put {string} in first text box")
    public void putInFirstTextBox(String value) throws InterruptedException {
        addNewBudgetAccountPage.clickAccountNumberFirstBox().sendKeys(value);
        Thread.sleep(3000);
    }

    @Then("click on save button in budget account details page")
    public void clickOnSaveButtonInBudgetAccountDetailsPage() {
        addNewBudgetAccountPage.clickSaveButtonInBudgetAccountDetail().click();
    }

    @Then("click All unit box in budget unit manager")
    public void clickallunitbtn() {
        addNewBudgetAccountPage.setclickallunitbok().click();
    }

    // SP 35
    @Given("Click Budget option")
    public void ClickOnBudgetOption() throws InterruptedException {initialViewPage.setBudgetMenu().click();
    Thread.sleep(2000);
    }

    @Then("Click on the All Budget from left menu items")
    public void clickOnTheAllBudgetFromLeftMenuItems() throws InterruptedException {initialViewPage.setAllBudget().click();
        Thread.sleep(2000);
    }

    @And("Click on All Unit CheckBox")
    public void clickOnAllUnitCheckBox() throws InterruptedException {initialViewPage.clickOnAllUnit().click();
        Thread.sleep(2000);

    }

    @Then("Click on Search bar write a value of your previous making Budget Account")
    public void clickOnSearchBarWriteAValueOfYourPreviousMakingBudgetAccount() throws InterruptedException {initialViewPage.getSearchBar().sendKeys("test");
        Thread.sleep(2000);

    }

    @Then("click on DRAFT")
    public void ClickOnDRAFT() throws InterruptedException {initialViewPage.getDraftIcon().click();
        Thread.sleep(3000);
    }

    // SP 36
    @Given("Click on Budget option")
    public void ClickBudgeOption() throws InterruptedException {initialViewPage.setBudgetMenu().click();
        Thread.sleep(2000);
    }

    @When ("Click on the All Budget from left menu item")
    public void ClkOnAllBudgetFromLeftMenuItems() throws InterruptedException {initialViewPage.setAllBudget().click();
        Thread.sleep(2000);
    }

    @Then ("Click on All Units CheckBox")
    public void ClickOnAllUnitCheckBox() throws InterruptedException {initialViewPage.clickOnAllUnit().click();
        Thread.sleep(2000);

    }

    @And ("Search Bar Write AValue Of Your Previous Making Budget Account")
    public void SearchBarWriteAValueOfYourPreviousMakingBudgetAccount() throws InterruptedException {
        initialViewPage.getSearchBar().sendKeys("test");
        Thread.sleep(2000);

    }

    @Then("Click on plus button")
    public void clickOnPlusButton() throws InterruptedException {initialViewPage.SetClkPlusBtn().click();
        Thread.sleep(2000);
    }

    // SP 37

    @Given("Click on Budget options")
    public void clickOnBudgetOptions() throws InterruptedException  {initialViewPage.setBudgetMenu().click();
        Thread.sleep(2000);
    }

    @Then("Click the all Budget from left menu item")
    public void clickOnTheAllBudgetFromLeftMenuItem() {initialViewPage.setAllBudget().click();

    }

    @And("click All Unit CheckBox")
    public void ClickAllUnitCheckBox() throws InterruptedException {initialViewPage.clickOnAllUnit().click();
        Thread.sleep(2000);
    }

    @Then("Click Search bar write a value of your previous making Budget Account")
    public void clickOnSearchBarWrite_A_ValueOfYourPreviousMakingBudgetAccount() throws InterruptedException {initialViewPage.getSearchBar().sendKeys("test");
    Thread.sleep(3000);
    }

    @Then("Click on plus  button")
    public void click_On_PlusButton() throws InterruptedException {initialViewPage.SetClkPlusBtn().click();
    Thread.sleep(3000);
    }

    @And("Select A value from Add or Remove GL Code to Budget form select option")
    public void selectAValueFromAddOrRemoveGLCodeToBudgetFormSelectOption() throws InterruptedException {initialViewPage.getSearchBar().sendKeys("test");
        Thread.sleep(2000);
    }

    @Then("Click on Plus  button")
    public void ClickOnPlusButton() throws InterruptedException {initialViewPage.SetClkPlusBtn().click();
        Thread.sleep(2000);
    }

    @And("Select A value from Add and Remove GL Code to Budget form select option")
    public void selectAValueFromAddAndRemoveGLCodeToBudgetFormSelectOption() throws InterruptedException {initialViewPage.setAddRemoveGLCodeToBudgetSelectCheckBox().click();
        Thread.sleep(3000);
    }

    //SP 38
    @Given("Click On Budget option")
    public void clickOnBudgetOption() throws InterruptedException {initialViewPage.setBudgetMenu().click();
        Thread.sleep(2000);
    }

    @Then("Click All Budget from left menu items")
    public void clickAllBudgetFromLeftMenuItems() throws InterruptedException {initialViewPage.setAllBudget().click();
        Thread.sleep(2000);

    }

    @And("click On all Unit CheckBox")
    public void setClickOnAllUnitCheckBox() throws InterruptedException {initialViewPage.clickOnAllUnit().click();
        Thread.sleep(3000);
    }


    @Then("Click Search Bar write a value of your previous making Budget Account")
    public void SetClickSearchBarWriteAValueOfYourPreviousMakingBudgetAccount() throws InterruptedException {initialViewPage.getSearchBar().sendKeys("test");
        Thread.sleep(2000);
    }

    @And("Click OnPlus Button")
    public void SetClickOnPlusButton() throws InterruptedException {initialViewPage.SetClkPlusBtn().click();
        Thread.sleep(2000);
    }

    @Then("Select A value From Add Remove GL Code to Budget form select option")
    public void selectAValueFromAddRemoveGLCodeToBudgetFormSelectOption() throws InterruptedException {initialViewPage.setAddRemoveGLCodeToBudgetSelectCheckBox().click();
        Thread.sleep(2000);
    }
    @Then("Click the Save Button")
    public void SetClickTheSaveButton() throws InterruptedException {initialViewPage.SetClickTheSaveButton().click();
        Thread.sleep(2000);
    }

    @And("Click the Cancel Button")
    public void clickTheCancelButton() {
//        getBudgetApprovalPage().SetClickCancelBtn().click();
    }

}
