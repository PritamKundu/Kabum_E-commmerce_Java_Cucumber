package stepDefinitions.Credentialing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Credentialing.CredentialingPage;
import utils.TestContextSetup;
import org.openqa.selenium.JavascriptExecutor;

public class CredentialingSteps {

    WebDriver driver;
    TestContextSetup testContextSetup;
    CredentialingPage credentialingPage;


    public CredentialingSteps(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.credentialingPage = testContextSetup.pageObjectManager.getCredentialingPage();

    }

    @Given("Click on the credentialing and landing on the credentialing page")
    public void clickOnTheCredentialingAndLandingOnTheCredentialingPage() throws InterruptedException {  Thread.sleep(5000);credentialingPage.setCredentialingMenu().click();
        Thread.sleep(5000);
    }

    @And("Click All Credentials")
    public void clickAllCredentials() throws InterruptedException {credentialingPage.setallCredentialing().click();
        Thread.sleep(5000);
    }

    @Then("All Faculty tab displayed and drop down with Faculty name displayed")
    public void allFacultyTabDisplayedAndDropDownWithFacultyNameDisplayed() throws InterruptedException {
        credentialingPage.SetAllFaculty().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetAllFaculty().click();
        Thread.sleep(5000);
    }

    @Then("All Disciplines Selected tab displayed and drop down with Disciplines name displayed")
    public void allDisciplinesSelectedDisplayed() throws InterruptedException {
        credentialingPage.SetAllDisciplines().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetAllDisciplines().click();
        Thread.sleep(5000);

    }

    @Then("All Status tab displayed and drop down with Status displayed")
    public void allStatusTabDisplayed() throws InterruptedException {
        credentialingPage.SetAllStatus().isDisplayed();
        Thread.sleep(2000);
        credentialingPage.SetAllStatus().click();
        Thread.sleep(5000);
        credentialingPage.SetStatusDisplay().isDisplayed();
        Thread.sleep(5000);

    }

    @Then("Courses Taught displayed and selecting the button")
    public void coursesTaughtDisplayedAndSelect() throws InterruptedException {
        credentialingPage.SetClkCoursesCheckbox().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetClkCoursesCheckbox().click();
        Thread.sleep(5000);
    }

    @And("semesters tab drop down")
    public void semestersTabDropDown() throws InterruptedException {credentialingPage.SetClickCoursesDropdown().click();
        Thread.sleep(5000);
    }

    @Then("Clicking right 3 dots")
    public void Clickingright3dots() throws InterruptedException {credentialingPage. getThreeDotIcon().click();
        Thread.sleep(5000);
    }

    @And("selecting the new Faculty")
    public void selectingTheNewFaculty() throws InterruptedException {credentialingPage.getNewFaculty().click();
        Thread.sleep(5000);
    }

    @Then("SPOL User tab displayed with drop down")
    public void spolUserTabDisplayedWithDropDown() throws InterruptedException {
        credentialingPage.SetSPOLUserDropdown().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetSPOLUserDropdown().click();
        Thread.sleep(5000);
    }

    @Then("the Prefix tab is displayed and filled")
    public void thePrefixTabIsDisplayedAndFilled() throws InterruptedException {
        credentialingPage.SetPrefixTab().isDisplayed();
        Thread.sleep(2000);
        credentialingPage.SetPrefixTab().sendKeys("Mr.");
        Thread.sleep(2000);
    }

    @Then("Verify First name")
    public void verifyFirstName() throws InterruptedException {
        credentialingPage.SetFirstName().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetFirstName().sendKeys("Tony");
        Thread.sleep(5000);
    }

    @And("Verify Middle Name")
    public void verifyMiddleName() throws InterruptedException {
        credentialingPage.SetMiddleName().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetMiddleName().sendKeys("Null");
    Thread.sleep(5000);
    }

    @Then("Verify Last name")
    public void verifyLastName() throws InterruptedException {
        credentialingPage.SetLastName().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetLastName().sendKeys("Adam");
    Thread.sleep(4000);
    }

    @Then("Verify Employee number tab is displayed and filled")
    public void EmployeeNumberTabIsDisplayedAndFilled() throws InterruptedException {
        credentialingPage. SetEmployeeNumber().isDisplayed();
        Thread.sleep(4000);
        credentialingPage. SetEmployeeNumber().sendKeys("1234");
        Thread.sleep(4000);
    }

    @Then("Verify Email tab is filled and displayed")
    public void verifyEmailTabIsFilledAndDisplayed() throws InterruptedException {credentialingPage.SetEmail().sendKeys("aadamtx@yahoo.com");
        Thread.sleep(4000);
    }
    @Then("verify email tab displayed")
    public void verifyEmailTabDisplayed() throws InterruptedException {credentialingPage.SetEmail().isDisplayed();
        Thread.sleep(4000);
    }


    @Then("Verify Faculty Rank tab filled and displayed with drop down")
    public void FacultyRankTabFilledAndDisplayed() throws InterruptedException {
        credentialingPage.SetFacultyRank().isDisplayed();
        Thread.sleep(4000);
        credentialingPage.SetFacultyRank().click();
        Thread.sleep(5000);
    }

    @Then("Verify Employment type tab is filled and displayed with drop down")
    public void EmploymentTypeTabIsFilledAndDisplayed() throws InterruptedException {
        credentialingPage.SetEmploymentType().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetEmploymentType().click();
        Thread.sleep(44000);
    }

    @Then("Verify Active button is verified")
    public void verifyActiveButtonIsVerified() throws InterruptedException {credentialingPage.SetActiveCheckBox().click();
        Thread.sleep(5000);
    }

    @And("Verify Cancel button is Working")
    public void verifyCancelButtonIsWorking() throws InterruptedException {credentialingPage.SetCancelButton().click();
        Thread.sleep(5000);
    }

    @And("Verify New Credentials certificate tab is open by clicking New Credentials")
    public void NewCredentialsCertificateTabOpenAndClickingNewCredentials() throws InterruptedException {credentialingPage.SetNewCredentials().click();
        Thread.sleep(5000);
    }

    @Then("Verify Selecting the Faculty name")
    public void verifySelectingTheFacultyName() throws InterruptedException {credentialingPage.SetClickFacultyName().click();
      Thread.sleep(5000);
    }

    @And("Select A Faculty name")
    public void selectAFacultyName() throws InterruptedException {credentialingPage.SetSelectFacultyName().click();
        Thread.sleep(5000);

    }

    @And("Select A Faculty name from Adding new Credentials")
    public void selectAFacultyNameVerifyAddingNewCredentials() throws InterruptedException {credentialingPage.SetAddingNewCredentials().click();
        Thread.sleep(5000);
    }


    @Then("Adding the date to the new certificate")
    public void addingTheDateToTheNewCertificate() throws InterruptedException {
        credentialingPage.SetAddingDateOnNewCertificate().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetAddingDateOnNewCertificate().click();
        Thread.sleep(5000);
    }

    @And("Select A Date")
    public void selectADate() throws InterruptedException {credentialingPage.SetSelectADate().click();
        Thread.sleep(5000);
    }

    @Then("Click on  Discipline bar")
    public void ClickOnDisciplineBar() throws InterruptedException {credentialingPage.SetClkDisciplineDropDown().click();
        Thread.sleep(5000);
    }

    @And("Select A Discipline")
    public void selectADiscipline() throws InterruptedException {credentialingPage.SetSelectADiscipline().click();
        Thread.sleep(5000);

    }

    @And("Click on save button")
    public void clickOnSaveButton() throws InterruptedException {credentialingPage.SetSaveButton().click();
        Thread.sleep(5000);
    }

    @Then("Click on cancel Button")
    public void clickOnCancelButton() throws InterruptedException {credentialingPage.SetCancelButtonOfCredentials().click();
        Thread.sleep(4000);
    }

    @Then("Click on Course CheckBox")
    public void clickOnCourseCheckBox() throws InterruptedException {credentialingPage.SetCourseCheckBox().click();
        Thread.sleep(4000);
    }

    @And("Click on Relevant Credentials CheckBox")
    public void clickOnRelevantCredentialsCheckBox() throws InterruptedException {credentialingPage.SetRelevantCredentialsCheckBox().click();
        Thread.sleep(4000);
    }

    @When("Primary button is displayed is not selected")
    public void primaryButtonIsDisplayedIsNotSelected() throws InterruptedException {
        credentialingPage.SetSelectPrimaryCheckBox().isDisplayed();
        Thread.sleep(4000);
        credentialingPage.SetSelectPrimaryCheckBox().click();
        Thread.sleep(4000);

    }

    @And("Select Before Created SPOL User")
    public void selectBeforeCreatedSPOLUser() throws InterruptedException {credentialingPage.SetSPOLUserSelect().click();
        Thread.sleep(4000);
    }

    @Then("Search created Employee number")
    public void searchCreatedEmployeeNumber() throws InterruptedException {
        Thread.sleep(5000); credentialingPage.SetSearchEmployeeWithNumber().sendKeys("1234");
        Thread.sleep(5000);
    }

    @And("Open Before Created Faculty tony Adam")

    public void openBeforeCreatedFacultyTonyAdam() throws InterruptedException

    {Thread.sleep(5000);
        credentialingPage.SetSelectFaculty().click();
        Thread.sleep(5000);
    }

    @Then("Verify Degree and Relevant Courses are displayed and Adding the info")
    public void verifyDegreeAndRelevantCourses() throws InterruptedException {
        credentialingPage.SetAddDegreeAndRelevantCourses().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetAddDegreeAndRelevantCourses().click();
        Thread.sleep(5000);
    }

    @And("Verify Degrees and Relevant Courses info tab is displayed with Highest Degree Earned with select box")
    public void RelevantCoursesDisplayedWithHighestDegree() throws InterruptedException
    {
        credentialingPage.SetHighestDegreeEarnedSelectBox().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetHighestDegreeEarnedSelectBox().click();
        Thread.sleep(5000);
    }

    @And("Earned Degree with the drop down")
    public void earnedDegreeWithTheDropDown() throws InterruptedException {credentialingPage.ClkEarnedDegreeDropdown().click();
        Thread.sleep(5000);
    }

    @Then("select the option from down")
    public void selectTheOptionFromDown() throws InterruptedException {
        credentialingPage.SetSelectEarnedDegree().click();
        Thread.sleep(4000);
    }

    @Then("Click on plus icon or Add or Edit option")
    public void clickOnPlusIconOrAddOrEditOption() throws InterruptedException {credentialingPage.SetClickOnAddOrEdit().click();
        Thread.sleep(5000);
    }

    @And("Add Degree Acronym")
    public void addDegreeAcronym() throws InterruptedException {credentialingPage.SetAddDegreeAcronym().sendKeys("new test");
        Thread.sleep(5000);
    }


    @Then("Enter a Degree Title")
    public void enterADegreeTitle() throws InterruptedException {credentialingPage.SetAddDegreeTitle().sendKeys("scientific");
        Thread.sleep(5000);
    }


    @When("Mark Is Terminal check Box")
    public void markIsTerminalCheckBox() throws InterruptedException {credentialingPage.SetMarkIsTerminaCheckBox().click();
        Thread.sleep(5000);
    }


    @And("Mark a Active Check Box")
    public void markAActiveCheckBox() throws InterruptedException {
        credentialingPage.SetMarkActiveCheckBox().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetMarkActiveCheckBox().click();
        Thread.sleep(5000);
    }

    @Then("Verify Make sure Save Button is working")
    public void verifyMakeSureSaveButtonIsWorking() throws InterruptedException {credentialingPage.SetClkSaveButton().click();
        Thread.sleep(5000);
    }

    @And("Verify Make sure Cancel Button is working")
    public void verifyMakeSureCancelButtonIsWorking() throws InterruptedException {credentialingPage.SetClkOnCancelButton().click();
        Thread.sleep(5000);
    }
    @And("Granting Institution with the drop down")
    public void grantingInstitutionWithTheDropDown() throws InterruptedException {credentialingPage.ClkGrantingInstitution().click();
        Thread.sleep(5000);
    }
    @Then("Click on plus icon or Add option")
    public void clickOnPlusIconOrAddOption() throws InterruptedException {credentialingPage.SetClkAddIcon().click();
        Thread.sleep(5000);
    }
    @Then("Verify Institution name is displayed and filled")
    public void InstitutionNameIsDisplayedAndFilled() throws InterruptedException {
        credentialingPage.GetSelectInstituteTest().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.GetSelectInstituteTest().click();
        Thread.sleep(5000);
    }
    @Then("Again Click on plus icon or Add option")
    public void againClickOnPlusIconOrAddOption() throws InterruptedException {credentialingPage.SetclkOnAddIcon().click();
        Thread.sleep(4000);
    }
    @And("Add Accrediting body Acronym")
    public void addAccreditingBodyAcronym() throws InterruptedException {credentialingPage.SetAccreditingBodyAcronym().clear();
                                            credentialingPage.SetAccreditingBodyAcronym().sendKeys("Testing ");
                                            Thread.sleep(4000);
    }
    @Then("Add Accrediting body name")
    public void addAccreditingBodyName() throws InterruptedException {credentialingPage.SetAddAccreditingBodyName().clear();
                                         credentialingPage.SetAddAccreditingBodyName().sendKeys("Purpose ");
                                         Thread.sleep(4000);
    }
    @And("Select on  Active Checkbox")
    public void selectOnActiveCheckbox() throws InterruptedException {credentialingPage.SetActiveCheckBox2().click();
        Thread.sleep(4000);
    }

    @Then("selected with save button")
    public void selectedWithSaveButton() throws InterruptedException {credentialingPage.SetClickOnSaveButton().click();
        Thread.sleep(4000);
    }
    //TC 53
    @And("Click on Attachment Tab")
    public void SetClickAttachmentbtn() throws InterruptedException {credentialingPage.GetClickAttachmentbtn().click();
        Thread.sleep(4000);
    }
    //TC 54
    @And("Click on document repository button")
    public void SetClickDocRepository() throws InterruptedException {credentialingPage.GetClickDocRepository().click();
        Thread.sleep(4000);
    }
    //TC 55
    @And("Displayed download")
    public void SetDisplayedDownloads() throws InterruptedException {credentialingPage.GetDisplayedDownloads().isDisplayed();
        Thread.sleep(4000);
    }
    //TC 55
    @And("Displayed Upload")
    public void SetDisplayedUpload() throws InterruptedException {credentialingPage.GetDisplayedUpload().isDisplayed();
        Thread.sleep(5000);
    }
    //TC 55
    @And("Displayed Delete")
    public void SetDisplayedDelete() throws InterruptedException {credentialingPage.GetDisplayedDelete().isDisplayed();
        Thread.sleep(5000);
    }
    //TC 55
    @And("Displayed Version")
    public void SetDisplayedVersion() throws InterruptedException {credentialingPage.GetDisplayedVersion().isDisplayed();
        Thread.sleep(5000);
    }
    //TC 56
    @And("Click on the Document and the assign document change to remove document")
    public void SetClickDocument() throws InterruptedException {credentialingPage.GetClickDocument().click();
        Thread.sleep(5000);
    }
    //TC 57
    @And("Click on History Button")
    public void SetClickHistory() throws InterruptedException {credentialingPage.GetClickHistory().click();
        Thread.sleep(5000);
    }
    //TC 58
    @And("focus on action button that is show all Info")
    public void SetDisplayedAction() throws InterruptedException {credentialingPage.GetDisplayedAction().isDisplayed();
        Thread.sleep(5000);
    }

    @And("Enter Address 1")
    public void enterAddress1() throws InterruptedException {credentialingPage.SetEnterAddress1().sendKeys("Bd,City");
        Thread.sleep(5000);
    }

    @Then("Enter Address 2")
    public void enterAddress2() throws InterruptedException {credentialingPage.SetEnterAddress2().sendKeys("City,CD");
        Thread.sleep(5000);
    }

    @And("Click on country")
    public void clickOnCountry() throws InterruptedException {credentialingPage.SetClickOnCountryBar().click();
        Thread.sleep(5000);
    }

    @And("Add Country")
    public void addCountry() throws InterruptedException {credentialingPage.SetAddCountryName().click();
        Thread.sleep(5000);
    }

    @And("Click on State")
    public void clickOnState() throws InterruptedException {credentialingPage.SetClkOnStateBar().click();
        Thread.sleep(5000);
    }

    @Then("Then Add State")
    public void thenAddState() throws InterruptedException {credentialingPage.SetThenAddState().click();
        Thread.sleep(5000);
    }

    @And("Add City")
    public void addCity() throws InterruptedException {credentialingPage.SetAddCityNam().sendKeys("KPL");
        Thread.sleep(5000);
    }

    @Then("Add Zip code")
    public void addZipCode() throws InterruptedException {credentialingPage.SetAddZipcode().sendKeys("9000");
        Thread.sleep(5000);
    }

    @Then("Click on Accredited checkbox")
    public void clickOnAccreditedCheckbox() throws InterruptedException {credentialingPage.SetMarkAccredited().click();
        Thread.sleep(5000);
    }


    @Then("Again Click on plus icon or Add option 2")
    public void againClickOnPlusIconOrAddOption2() throws InterruptedException {
        credentialingPage.SetClkOnAddIcon2().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetClkOnAddIcon2().click();
        Thread.sleep(5000);
    }

    @And("Enter Discipline Title")
    public void enterDisciplineTitle() throws InterruptedException {
        credentialingPage.SetEnterDisciplineTitle().isDisplayed();
        Thread.sleep(5000);
        credentialingPage.SetEnterDisciplineTitle().sendKeys("test");
        Thread.sleep(5000);
    }

    @And("Verify Relevant course credit Earned is displayed and adding plus press")
    public void RelevantCourseCreditEarnedIsDisplayedAndAddingPlusPress() throws InterruptedException {credentialingPage.SetAddRelevantCourseCredit().click();
        Thread.sleep(2000);
    }

    @Then("Add Course Number")
    public void addCourseNumber() throws InterruptedException {credentialingPage.SetAddCourseNumber().sendKeys("20");
        Thread.sleep(5000);

    }

    @And("Add Course Title")
    public void addCourseTitle() throws InterruptedException {credentialingPage.SetAddCourseTitle().sendKeys("Test");
        Thread.sleep(4000);

    }

    @Then("Add Hours Earned")
    public void addHoursEarned() throws InterruptedException {credentialingPage.SetAddHoursEarned().sendKeys("200");
        Thread.sleep(4000);
    }

    @And("Select hours Type with drop down")
    public void selectHoursTypeWithDropDown() throws InterruptedException {credentialingPage.SetSelectHoursType().click();
        Thread.sleep(4000);

    }
    @And("Select hours Type")
    public void selectHoursType() throws InterruptedException {credentialingPage.SetSelectHoursTypes().click();
        Thread.sleep(4000);
    }

    @And("Click on Relevant Course Credit Earned save button")
    public void clickOnRelevantCourseCreditEarnedSaveButton() throws InterruptedException {credentialingPage.SetRelevantCourseSaveButton().click();
        Thread.sleep(4000);
    }
    //48
    @And("Click And Professional Experience")
    public void SetClickProfessionalExp() throws InterruptedException {credentialingPage.GetClickProfessionalExp().click();
        Thread.sleep(4000);
    }

    //49
    @And("Displayed Employer")
    public void SetDisplayedEmployer() throws InterruptedException {credentialingPage.GetDisplayedEmployer().click();
        Thread.sleep(5000);
    }
    //49
    @And("Displayed Location")
    public void SetDisplayedLocation() throws InterruptedException {credentialingPage.GetDisplayedLocation().isDisplayed();
        Thread.sleep(5000);
    }
    //49
    @And("Displayed Begin Date")
    public void SetDiplayedBeginDate() throws InterruptedException {credentialingPage.GetDiplayedBeginDate().isDisplayed();
        Thread.sleep(5000);
    }
    //49
    @And("Displayed End date")
    public void SetDisplayedEndDate() throws InterruptedException {credentialingPage.GetDisplayedEndDate().isDisplayed();
        Thread.sleep(5000);
    }
    //49
    @And("Displayed Descriptions")
    public void SetDisplayedDescription() throws InterruptedException {credentialingPage.GetDisplayedDescription().isDisplayed();
        Thread.sleep(5000);
    }
    //49
    @And("Displayed SAVE Button")
    public void SetDisplayedSave() throws InterruptedException {credentialingPage.GetDisplayedSave().isDisplayed();
        Thread.sleep(5000);
    }
    //50
    @And("Click on Licensures and Certifications")
    public void SetClickLicAndCer() throws InterruptedException {credentialingPage.GetClickLicAndCer().click();
        Thread.sleep(5000);
    }
    //51
    @And("Displayed Awarde dy")
    public void SetDisplayedAwaredby() throws InterruptedException {credentialingPage.GetDisplayedAwaredby().isDisplayed();
        Thread.sleep(4000);
    }
    //52
    @And("Click on Other Scholarly Activities")
    public void SetClickOtherScolary() throws InterruptedException {credentialingPage.GetClickOtherScolary().click();
        Thread.sleep(4000);
    }
    //52
    @And("Click On Activity Type")
    public void SetClickOnActivityType() throws InterruptedException {credentialingPage.GetClickOnActivityType().click();
        Thread.sleep(4000);
    }
    //52
    @And("Select On activity Type")
    public void SetSelectOnActivityType() throws InterruptedException {credentialingPage.GetSelectOnActivityType().click();
        Thread.sleep(4000);
    }
    //52
    @And("Click Activity Date")
    public void SetClickActivityDate() throws InterruptedException {credentialingPage.GetClickActivityDate().click();
        Thread.sleep(2000);
    }
    //52
    @And("Set on Activity Date")
    public void SetSelectActivityDate() throws InterruptedException {credentialingPage.GetSelectActivityDate().click();
        Thread.sleep(2000);
    }
    @And("Click Description on Follow Up on other")
    public void SetClickDescriptions() throws InterruptedException {credentialingPage.GetClickDescriptions().click();
        Thread.sleep(3000);
    }
    @And("Input on Sponsor")
    public void SetInputSponsor() throws InterruptedException {credentialingPage.GetInputSponsor().sendKeys("test");
        Thread.sleep(4000);
    }

    @And("Click on Save Button")
    public void ClickOnSaveButton() throws InterruptedException {
        credentialingPage.SetClickOnSaveBtn().isDisplayed();
        Thread.sleep(4000);
        credentialingPage.SetClickOnSaveBtn().click();
        Thread.sleep(4000);
    }

    @Then("click detail  secondary option")
    public void clickDetailSecondaryOption() throws InterruptedException {credentialingPage.SetSecondaryOption().click();
        Thread.sleep(5000);
    }

    @And("Drop down with Disciplines name displayed")
    public void dropDownWithDisciplinesNameDisplayed() throws InterruptedException {credentialingPage.SetDisciplinesNameDisplayed().isDisplayed();
        Thread.sleep(4000);
    }

    @Then("Verify the Faculty Details info")
    public void verifyTheFacultyDetailsInfo() throws InterruptedException {credentialingPage.SetFacultyDetailsDisplay().isDisplayed();
        Thread.sleep(4000);
    }

    @When("Relevant Courses are displayed")
    public void relevantCoursesAreDisplayed() throws InterruptedException {credentialingPage.SetRelevantCoursesDisplayed().isDisplayed();
        Thread.sleep(4000);
    }



    //New TC
    @Given("search notebook")
    public void searchNotebook() throws InterruptedException {
        credentialingPage.setSearchBox().sendKeys("Notebook");
        Thread.sleep(3000);
        credentialingPage.setSearch().click();
        Thread.sleep(3000);

    }

    @When("click first notebook")
    public void clickFirstNotebook() throws InterruptedException {
        credentialingPage.setFirstNotebook().get(1).click();
        Thread.sleep(5000);
    }

    @And("enter zip code & print shipping values")
    public void enterZipCodePrintShippingValues() throws InterruptedException {
  /*      WebElement myelement = driver.findElement(By.xpath("//input[@id='inputCalcularFrete']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", myelement);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", myelement);
        Thread.sleep(3000);
*/


       /* WebElement inputField =  driver.findElement(By.xpath("//input[@id='inputCalcularFrete']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='57955000';", inputField);
        Thread.sleep(2000);*/

        credentialingPage.setZipCodeBox().click();
        Thread.sleep(5000);


//        credentialingPage.setZipCodeBox().sendKeys("57955-000");
//        Thread.sleep(7000);
//        credentialingPage.setzipCodeOkButton().click();
//        Thread.sleep(5000);
        credentialingPage.scrollDown();
//        credentialingPage.zipFunction();
        Thread.sleep(10000);
    }
}
