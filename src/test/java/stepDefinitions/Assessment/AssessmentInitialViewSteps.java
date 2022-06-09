package stepDefinitions.Assessment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Assessment.AssessmentInitialViewPage;
import utils.TestContextSetup;


public class AssessmentInitialViewSteps {

    //    WebDriver driver;
    TestContextSetup testContextSetup;
    AssessmentInitialViewPage assessmentInitialViewPage;

    public AssessmentInitialViewSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.assessmentInitialViewPage = testContextSetup.pageObjectManager.getAssessmentInitialViewPage();

    }


    @Given("Click on Assessments option")
    public void clickOnAssessmentsOption() throws InterruptedException {assessmentInitialViewPage.setAssessmentMenu().click();
        Thread.sleep(2000);

    }


    @When("Click on the All Assessments")
    public void clickOnTheAllAssessments() throws InterruptedException {assessmentInitialViewPage.setAllAssessment().click();
        Thread.sleep(2000);
    }

    @Given("click Assessment option from left menu")
    public void clickAssessmentOptionFromLeftMenu() throws InterruptedException {assessmentInitialViewPage.setAssessmentMenu().click();
        Thread.sleep(2000);
    }


    @When("click on all Assessment")
    public void clickOnAllAssessment() throws InterruptedException {assessmentInitialViewPage.setAllAssessment().click();
        Thread.sleep(2000);

    }

    @Given("click detail Primary Button")
    public void clickDetailPrimaryButton() throws InterruptedException {assessmentInitialViewPage.detailButtonPrimary().click();
    Thread.sleep(3000);
    }

    @Then("click detail  secondary button")
    public void clickDetailSecondaryButton() throws InterruptedException {assessmentInitialViewPage.getDetailButtonSecondary().click();
        Thread.sleep(2000);
    }

    @When("Search Field Check")
    public void searchFieldCheck() throws InterruptedException {assessmentInitialViewPage.getsSearch().sendKeys("test");
        Thread.sleep(2000);
    }

    @And("Click on Program Manager Dropdown")
    public void clickOnProgramManagerDropdown() throws InterruptedException {assessmentInitialViewPage.getProgramManagerDropdown().click();
        Thread.sleep(2000);
    }

    @And("Click on Outcome Type dropdown Bar")
    public void clickOnOutcomeTypeDropdownBar() throws InterruptedException {assessmentInitialViewPage.getOutcomeTypeDropdown().click();
        Thread.sleep(2000);
    }

    @Then("Click on View All Programs CheckBox and mark it")
    public void clickOnViewAllProgramsCheckBoxAndMarkIt() throws InterruptedException {assessmentInitialViewPage.getViewAllProgram().click();
        Thread.sleep(2000);
    }

    @And("Click on Collapse All CheckBox and mark it")
    public void clickOnCollapseAllCheckBoxAndMarkIt() throws InterruptedException {assessmentInitialViewPage.getViewCollapseAll().click();
        Thread.sleep(3000);
    }

    @And("click Detail Button_Secondary button")
    public void clickDetailButton_SecondaryButton() throws InterruptedException {assessmentInitialViewPage.getDetailButtonSecondary().click();
        Thread.sleep(3000);
    }

    @Then("Click on Search bar write a value")
    public void clickOnSearchBarWriteAValue() throws InterruptedException {assessmentInitialViewPage.getsSearch().sendKeys("test");
        Thread.sleep(2000);
    }

    @Then("click on All Assessments by Program text bar")
    public void clickOnAllAssessmentsByProgramTextBar() throws InterruptedException {assessmentInitialViewPage.allAssessmentText().click();
        Thread.sleep(2000);
    }

    @And("Click on by Course")
    public void clickOnByCourse() throws InterruptedException {assessmentInitialViewPage.getbyCourseBtn().click();
        Thread.sleep(2000);
    }

    @Then("click on Alert Icon")
    public void clickOnAlertIcon() throws InterruptedException {assessmentInitialViewPage.getAlertIcon().click();
        Thread.sleep(2020);
    }

    @And("Click on Program Faculty Dropdown")
    public void clickOnProgramFacultyDropdown() throws InterruptedException {assessmentInitialViewPage.getProgramManagerDropdown().click();
        Thread.sleep(2000);
    }

    @And("Click on View All Courses CheckBox and mark it")
    public void clickOnViewAllCoursesCheckBoxAndMarkIt() throws InterruptedException {assessmentInitialViewPage.getViewAllProgram().click();
        Thread.sleep(3000);
    }


    @And("Click on Three dot Icon")
    public void clickOnThreeDotIcon()throws InterruptedException {assessmentInitialViewPage.getThreeDotIcon().click();
        Thread.sleep(2000);
    }

    @And("Click on by Service Area")
    public void clickOnByServiceArea() throws InterruptedException {assessmentInitialViewPage.getbyServiceArea().click();
        Thread.sleep(2000);
    }

    @And("click on right side top corner search Bar")
    public void clickOnRightSideTopCornerSearchBar() throws InterruptedException {assessmentInitialViewPage.getCornerSearch().click();
        Thread.sleep(2000);

    }

    @Then("click Detail Button_Primary button")
    public void clickDetailButton_PrimaryButton() throws InterruptedException {assessmentInitialViewPage.detailButtonPrimary().click();
        Thread.sleep(2000);
    }

    @Then("Click on Service Area Manager Dropdown")
    public void clickOnServiceAreaManagerDropdown() throws InterruptedException {assessmentInitialViewPage.getProgramManagerDropdown().click();
        Thread.sleep(2000);
    }


    @And("Click on View All Service Areas CheckBox and mark it")
    public void clickOnViewAllServiceAreasCheckBoxAndMarkIt() throws InterruptedException {assessmentInitialViewPage.getViewAllProgram().click();
        Thread.sleep(2000);
    }
}
