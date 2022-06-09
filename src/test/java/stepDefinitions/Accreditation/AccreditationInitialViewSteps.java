package stepDefinitions.Accreditation;

        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import pages.Accreditation.AccreditationInitialViewPage;
        import utils.TestContextSetup;


public class AccreditationInitialViewSteps {

    //    WebDriver driver;
    TestContextSetup testContextSetup;
    AccreditationInitialViewPage accreditionInitialViewPage;

    public AccreditationInitialViewSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.accreditionInitialViewPage = testContextSetup.pageObjectManager.getAccreditionInitialViewPage();

    }
    @Given("Click on Accreditation option")
    public void clickOnAccredition() throws InterruptedException {accreditionInitialViewPage.setaccreditionoption().click();
        Thread.sleep(2000);
    }

    @When("Click on the All Accreditation")
    public void clickOnAllAccreditation() throws InterruptedException {accreditionInitialViewPage.SetClickAllAccrerition().click();
        Thread.sleep(2000);
    }

    @Then("Click detail primary button on accreditation page")
    public void SetClickPrimaryButton() throws InterruptedException {accreditionInitialViewPage.GetClickPrimaryButton().click();
        Thread.sleep(2000);

    }

    @Then("Click detail Secondary button on accreditation page")
    public void SetClickSecondaryButton() throws InterruptedException {accreditionInitialViewPage.GetClickSecondaryButton().click();
        Thread.sleep(5000);
    }

    @Then("Click on Source code bar dropdown")
    public void SetSourceCodeBar() throws InterruptedException {accreditionInitialViewPage.GetSourceCodeBar().click();
        Thread.sleep(3000);
    }

    @Then("Click on test Accre Cycle")
    public void SetClicktestAccreCycle() throws InterruptedException {accreditionInitialViewPage.GetClicktestAccreCycle().click();
        Thread.sleep(3000);
    }
    //    SA 6
    @Then("Click on Focus on Assigned Standard dropdown")
    public void SetClickAssignedStandard() throws InterruptedException {accreditionInitialViewPage.GetClickAssignedStandard().click();
    Thread.sleep(3000);
    }

    //    SA 7
    @Then("Click on Focus on View All Standard checkbox")
    public void SetClickStandardCheckbox() throws InterruptedException {accreditionInitialViewPage.GetClickStandardCheckbox().click();
        Thread.sleep(3000);
    }
    //    SA 8
    @Then("Click on Focus on Collapse All checkbox")
    public void SetClickCollapseCheckbox() throws InterruptedException {accreditionInitialViewPage.GetClickCollapseCheckbox().click();
        Thread.sleep(3000);
    }

    //    SA 9
    @Then("Click on Focus on publish button")
    public void SetClickPublishButton() throws InterruptedException {accreditionInitialViewPage.GetClickPublishButton().click();
        Thread.sleep(3000);
    }
    //    SA 10
    @Then("Focus on three dot box")
    public void SetfocusOnThreeDot() throws InterruptedException {accreditionInitialViewPage.GetfocusOnThreeDot().isDisplayed();
        Thread.sleep(3000);
    }
    //    SA 11
    @Then("Click on three dot box")
    public void SetClickOnThreeDot() throws InterruptedException {accreditionInitialViewPage.GetClickOnThreeDot().click();
        Thread.sleep(3000);
    }
    //    SA 12
    @And("click on New Section")
    public void SetClickOnNewSection() throws InterruptedException {accreditionInitialViewPage.GetClickOnNewSection().click();
        Thread.sleep(3000);
    }
    //SA 13
    @And("version dropdown should be displayed")
    public void SetdisplayedVersion() throws InterruptedException {accreditionInitialViewPage.GetdisplayedVersion().isDisplayed();
        Thread.sleep(3000);
    }
    //SA 14
    @And("Section Number should be displayed")
    public void SetdisplayedSectionNumber() throws InterruptedException {accreditionInitialViewPage.GetdisplayedSectionNumber().isDisplayed();
        Thread.sleep(3000);
    }
    //SA 15
    @And("Section Title should be displayed")
    public void SetdisplayedSectionTitle() throws InterruptedException {accreditionInitialViewPage.GetdisplayedSectionTitle().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 16
    @And("Input value on report header")
    public void SetinputOnReportHeader() throws InterruptedException {accreditionInitialViewPage.GetinputOnReportHeader().sendKeys("test");
        Thread.sleep(3000);
    }

    //SAC 17
    @And("Sort Order Should be Displayed")
    public void SetDisplayedSortOrder() throws InterruptedException {accreditionInitialViewPage.GetDisplayedSortOrder().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 18
    @And("Parent section Should be Displayed")
    public void SetDisplayedParentSection() throws InterruptedException {accreditionInitialViewPage.GetDisplayedParentSection().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 19
    @And("displayed on save button")
    public void SetDisplayedSaveButton() throws InterruptedException {accreditionInitialViewPage.GetDisplayedSaveButton().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 20
    @And("displayed Cancel button")
    public void SetDisplayedCancelButton() throws InterruptedException {accreditionInitialViewPage.GetDisplayedCancelButton().isDisplayed();
        Thread.sleep(3000);
    }
    //SA 21
    @And("Click Section Number Field")
    public void SetClickSectionNumber() throws InterruptedException {accreditionInitialViewPage.GetdisplayedSectionNumber().click();
        Thread.sleep(3000);
    }
    //SA 22
    @And("Click Section Title Field")
    public void SetClickSectionTitle() throws InterruptedException {
        accreditionInitialViewPage.GetdisplayedSectionTitle().click();
        Thread.sleep(3000);

    }
    //SAC 23
    @And("Input Section Title Field")
    public void SetInputSectionTitle() throws InterruptedException {accreditionInitialViewPage.GetdisplayedSectionTitle().sendKeys("test1");
        Thread.sleep(3000);
    }
    //SA 23
    @And("Input Section Number Field")
    public void SetInputSectionNumber() throws InterruptedException {accreditionInitialViewPage.GetdisplayedSectionNumber().sendKeys("test2");
        Thread.sleep(3000);
    }
    //SA 23
    @And("click on save button")
    public void SetClickSaveButton() throws InterruptedException {accreditionInitialViewPage.GetDisplayedSaveButton().click();
        Thread.sleep(3000);
    }
    //SA 24
    @And("Click on New Standard")
    public void SetClickNewStandard() throws InterruptedException {accreditionInitialViewPage.GetClickNewStandard().click();
        Thread.sleep(3000);
    }
    //SA 25
    @And("focus on Standard Number")
    public void SetFocusStandardNumber() throws InterruptedException {accreditionInitialViewPage.GetFocusStandardNumber().isDisplayed();
        Thread.sleep(3000);
    }
    //SA 26
    @And("focus on Sort Order")
    public void SetFocusSortOrder() throws InterruptedException {accreditionInitialViewPage.GetFocusSortOrder().isDisplayed();
        Thread.sleep(3000);
    }
    //SA 27
    @And("focus on parent section on new standard")
    public void SetFocusOnParentSEction() throws InterruptedException {accreditionInitialViewPage.GetFocusOnParentSEction().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 28
    @And("focus on standard summary")
    public void SetFocusOnStandardSummary() throws InterruptedException {accreditionInitialViewPage.GetFocusOnStandardSummary().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 29
    @And("Input On Sort Order")
    public void SetInputClear() throws InterruptedException {
        accreditionInitialViewPage.GetFocusSortOrder().clear();
        Thread.sleep(2000);
        accreditionInitialViewPage.GetFocusSortOrder().sendKeys("012");
        Thread.sleep(3000);
    }
    //SAC 30
    @And("Click on SAVE button")
    public void SetClickSaveBtn() throws InterruptedException {accreditionInitialViewPage.GetClickSaveBtn().click();
        Thread.sleep(3000);
    }
    //SAC 31
    @And("Click on Cancel button")
    public void SetClickCancelBtn() throws InterruptedException {accreditionInitialViewPage.GetClickCancelBtn().click();
        Thread.sleep(3000);
    }
    //SA 32
    @And("Input on Standard Number")
    public void SetinputStandardNumber() throws InterruptedException {
        accreditionInitialViewPage.GetFocusStandardNumber().sendKeys("123");
        Thread.sleep(3000);
    }
    //SA 32
    @And("click on parent section")
    public void SelectParentSEction() throws InterruptedException {accreditionInitialViewPage.GetFocusOnParentSEction().click();
        Thread.sleep(3000);
    }
    //SAC 32
    @And("select mission on parent section")
    public void SetselectMission() throws InterruptedException {accreditionInitialViewPage.GetselectMission().click();
        Thread.sleep(3000);
    }
    //SAC 32
    @And("select Standard Summary")
    public void SetSelectStandardSummary() throws InterruptedException {accreditionInitialViewPage.GetFocusOnStandardSummary().sendKeys("test2");
        Thread.sleep(3000);
    }
    //SAC 32
    @And("Enter value into Standard Description")
    public void SetInputOnStandardDescription() throws InterruptedException {accreditionInitialViewPage.GetInputOnStandardDescription().sendKeys("test standard description");
        Thread.sleep(3000);
    }
    //SAC 32
    @And("click save on new standard")
    public void SetSaveButtonOnNewStandard() throws InterruptedException {accreditionInitialViewPage.GetSaveButtonOnNewStandard().click();
        Thread.sleep(3000);
    }
    //SAC 33
    @When("Click on the Plan a New Cycle")
    public void SetClickPlanANewCycle() throws InterruptedException {accreditionInitialViewPage.GetClickPlanANewCycle().click();
        Thread.sleep(3000);
    }
    //SAC 34
    @Then("Focus on Select step cycle icon")
    public void SetClickOnSelect() throws InterruptedException {accreditionInitialViewPage.GetClickOnSelect().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 35
    @Then("Click on Select Source Acronym")
    public void SetClickOnSourceAcronym() throws InterruptedException {accreditionInitialViewPage.GetClickOnSourceAcronym().click();
        Thread.sleep(3000);
    }
    //SAC 36
    @Then("Select One On Source Acronym")
    public void SetSelectOneSourceAcronym() throws InterruptedException {accreditionInitialViewPage.GetSelectOneSourceAcronym().click();
        Thread.sleep(3000);
    }
    //SAC 36
    @And("Click on Next Button")
    public void SetClickOnNext() throws InterruptedException {accreditionInitialViewPage.GetClickOnNext().click();
        Thread.sleep(3000);
    }
    //SAC 37
    @And("Input Value On Accreditation Cycle Title")
    public void SetInputAccreditationCycleTitle() throws InterruptedException {accreditionInitialViewPage.GetInputAccreditationCycleTitle().click();
        Thread.sleep(3000);
    }
    //SAC 38
    @And("Click On Accreditation Cycle Title")
    public void SetClickAccreditationCycleTitle() throws InterruptedException {accreditionInitialViewPage.GetInputAccreditationCycleTitle().click();
        Thread.sleep(3000);
    }
    //SAC 38
    @And("Click On Begin Date")
    public void SetClickBeginDate() throws InterruptedException {accreditionInitialViewPage.GetClickBeginDate().click();
        Thread.sleep(3000);
    }
    //SAC 39
    @And("Input On Accreditation Cycle Title")
    public void SetInputValueAccreditationCycleTitle() throws InterruptedException {accreditionInitialViewPage.GetInputAccreditationCycleTitle().sendKeys("test");
        Thread.sleep(3000);
    }
    //SAC 40
    @And("Focus on Reporting cycle")
    public void SetFocusOnReporting() throws InterruptedException {accreditionInitialViewPage.GetFocusOnReporting().isDisplayed();
        Thread.sleep(3000);
    }


    //SAC 41
    @And("Focus on Select a BaseLine")
    public void SetfocusBaseline() throws InterruptedException {accreditionInitialViewPage.GetfocusBaseline().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 41
    @And("Focus on Source")
    public void SetfocusSource() throws InterruptedException {accreditionInitialViewPage.GetfocusSource().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 41
    @And("Focus on Accreditation Cycle Title")
    public void SetfocusSAccCycleTitle() throws InterruptedException {accreditionInitialViewPage.GetfocusSAccCycleTitle().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 41
    @And("Focus on Version")
    public void SetfocusVersion() throws InterruptedException {accreditionInitialViewPage.GetfocusVersion().isDisplayed();
        Thread.sleep(3000);
    }
    //SAC 42
    @And("Click on Radio Button in Reporting Cycle")
    public void SetClickOnSelectReporting() throws InterruptedException {accreditionInitialViewPage.GetClickOnSelectReporting().click();
        Thread.sleep(3000);
    }
    //SAC 44
    @And("Click on Chairman planning unit")
    public void SetClickchairman() throws InterruptedException {accreditionInitialViewPage.GetClickchairman().click();
        Thread.sleep(3000);
    }
    //SAC 45
    @And("Select a planning unit")
    public void Setselectplanningunit() throws InterruptedException {accreditionInitialViewPage.Getselectplanningunit().click();
        Thread.sleep(3000);
    }
    //SAC 46
    @And("Click on Select Standard to include in Cycle")
    public void SetSelectStandard() throws InterruptedException {accreditionInitialViewPage.GetSelectStandard().click();
        Thread.sleep(3000);
    }
    //SAC 48
    @When("Click on the Publish a New Cycle")
    public void SetClickPublishCycle() throws InterruptedException {accreditionInitialViewPage.GetClickPublishCycle().click();
        Thread.sleep(3000);
    }
    //SAC 49
    @And("Click Source on publish")
    public void SetClickSourceDropdown() throws InterruptedException {accreditionInitialViewPage.GetClickSourceDropdown().click();
        Thread.sleep(3000);
    }
    //SAC 49
    @And("Select Source on Publish")
    public void SetSelectSource() throws InterruptedException {accreditionInitialViewPage.GetSelectSource().click();
        Thread.sleep(3000);
    }
     //SAC 49
    @And("Click Select a Cycle")
    public void SetClickSelectACycle() throws InterruptedException {accreditionInitialViewPage.GetClickSelectACycle().click();
    Thread.sleep(3000);
    }
    //SAC 49
    @And("Click Report DropDown")
    public void SetClickReportDropdown() throws InterruptedException {accreditionInitialViewPage.GetClickReportDropdown().click();
        Thread.sleep(3000);
    }
    //SAC 50
    @And("Focus on Publish")
    public void SetFocusOnPublish() throws InterruptedException {accreditionInitialViewPage.GetFocusOnPublish().isDisplayed();
        Thread.sleep(3000);
    }
    //51
    @And("Click on Publish Button")
    public void SetClickOnPublish() throws InterruptedException {accreditionInitialViewPage.GetFocusOnPublish().click();
        Thread.sleep(3000);
    }
    //51
    @And("Select on SelectaCycle")
    public void SetSelectOnSelectCycle() throws InterruptedException {accreditionInitialViewPage.GetSelectOnSelectCycle().click();
        Thread.sleep(3000);
    }
    //55
    @And("Select Generic Report Dropdown")
    public void SetSelectReport() throws InterruptedException {accreditionInitialViewPage.GetSelectReport().click();
        Thread.sleep(3000);
    }
    //57
    @And("Click On Standard")
    public void SetClickOnStandard() throws InterruptedException {accreditionInitialViewPage.GetClickOnStandard().click();
        Thread.sleep(3000);
    }
    //57
    @And("Standard page displayed")
    public void SetStandardDetailsDisplayed() throws InterruptedException {accreditionInitialViewPage.GetStandardDetailsDisplayed().click();
        Thread.sleep(3000);
    }
    //58
    @And("Info Page Displayed")
    public void SetDisplayInfo() throws InterruptedException {accreditionInitialViewPage.GetDisplayInfo().isDisplayed();
        Thread.sleep(3000);
    }
    //58
    @And("Response Page Displayed")
    public void SetDisplayResponse() throws InterruptedException {accreditionInitialViewPage.GetDisplayResponse().isDisplayed();
        Thread.sleep(3000);
    }
    //58
    @And("Associations Page Displayed")
    public void SetDisplayAssociation() throws InterruptedException {accreditionInitialViewPage.GetDisplayAssociation().isDisplayed();
        Thread.sleep(3000);
    }
    //58
    @And("Attachment Page Displayed")
    public void SetDisplayAttachment() throws InterruptedException {accreditionInitialViewPage.GetDisplayAttachment().isDisplayed();
        Thread.sleep(3000);
    }
    //58
    @And("History Page Displayed")
    public void SetDisplayHistory() throws InterruptedException {accreditionInitialViewPage.GetDisplayHistory().isDisplayed();
        Thread.sleep(3000);
    }
    //59
    @And("Displayed Follow Up")
    public void SetDisplayFollowUp() throws InterruptedException {accreditionInitialViewPage.GetDisplayFollowUp().isDisplayed();
        Thread.sleep(3000);
    }
    //59
    @And("Displayed Planning Units")
    public void SetDisplayPlanningUnit() throws InterruptedException {accreditionInitialViewPage.GetDisplayPlanningUnit().isDisplayed();
        Thread.sleep(3000);
    }
    //60
    @And("Click Follow Up")
    public void SetClickFollowUp() throws InterruptedException {accreditionInitialViewPage.GetDisplayFollowUp().click();
        Thread.sleep(3000);
    }
    //61
    @And("Click Format on Follow Up")
    public void SetClickFormat() throws InterruptedException {accreditionInitialViewPage.GetClickFormat().click();
        Thread.sleep(3000);
    }
    //61
    @And("Select A Format On Follow Up")
    public void SetSelectFormat() throws InterruptedException {accreditionInitialViewPage.GetSelectFormat().click();
        Thread.sleep(3000);
    }
    //62
    @And("Focus on SAVE Button")
    public void SetFocusOnSAVE() throws InterruptedException {accreditionInitialViewPage.GetFocusOnSAVE().isEnabled();
        Thread.sleep(3000);
    }
    //62
    @And("Focus on CANCEL Button")
    public void SetFocusOnCANCEL() throws InterruptedException {accreditionInitialViewPage.GetFocusOnCANCEL().isEnabled();
        Thread.sleep(3000);
    }
    //63
    @And("Click Description on Follow Up")
    public void SetClickDescriptions() throws InterruptedException {accreditionInitialViewPage.GetClickDescriptions().click();
        Thread.sleep(3000);
    }
}
