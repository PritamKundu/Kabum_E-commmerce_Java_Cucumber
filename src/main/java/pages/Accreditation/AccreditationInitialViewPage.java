package pages.Accreditation;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class AccreditationInitialViewPage {

    WebDriver driver;

    By accreditionoption = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside/div/nav/ul[1]/li[6]");
    By ClickAllAccreditation = By.xpath( "//a[contains(text(),'All Accreditation')]");

    By ClickPrimaryButton = By.xpath( "//*[@id=\"detailButton\"]");

    By ClickSecondaryButton = By.xpath( "//*[@id=\"laneButton\"]");

    By ClickSourceCodeBar = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/section[1]/div[1]/div[1]/all-accreditation-sub[1]/div[1]/span[1]/kendo-dropdownlist[1]/span[1]/span[2]/span[1]");

    By ClicktestAccreCycle = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/section[1]/div[1]/div[1]/all-accreditation-sub[1]/div[1]/span[2]/kendo-dropdownlist[1]/span[1]/span[2]/span[1]");
//    sa6
    By ClickAssignedStandard = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/section[1]/div[1]/div[1]/all-accreditation-sub[1]/div[1]/span[3]/kendo-dropdownlist[1]/span[1]/span[2]/span[1]");

    //    sa 7
    By ClickStandardCheckbox = By.xpath( "//span[contains(text(),'View All Standards')]");
    //    sa 8
    By ClickCollapseCheckbox = By.xpath( "//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-accreditation-sub/div/div[2]/label/span");
    //    sa 9
    By ClickPublishButton = By.xpath( "//button[@class=\"btn btn-primary btn-accreditation-publish\"]");
    //    SA 10
    By focusOnThreeDot = By.xpath( "//i[@class=\"far fa-ellipsis-v\"]");
    //    SA 11
    By ClickOnThreeDot = By.xpath( "//i[@class=\"far fa-ellipsis-v\"]");
    //SA 12
    By ClickOnNewSection = By.xpath( "//*[@id=\"dropdownMenuButton\"]/div/a[1]");
    //SA 13
    By displayedVersion = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/all-accreditation[1]/kendo-window[1]/div[1]/popup-section-edit[1]/div[1]/form[1]/div[1]/kendo-dropdownlist[1]/span[1]/span[2]/span[1]");
    //SAC 14 //21
    By displayedSectionNumber = By.xpath( "//input[@formcontrolname=\"sectionNumber\"]");
    //SAC 15
    By displayedSectionTitle = By.xpath( "//input[@formcontrolname=\"sectionTitle\"]");
    //SAC 16
    By inputOnReportHeader = By.xpath( "//input[@formcontrolname=\"reportHeader\"]");
    //SAC 17
    By DisplayedSortOrder = By.xpath( "//input[@role=\"spinbutton\"]");
    //SAC 18
    By DisplayedParentSection = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/all-accreditation/kendo-window/div[1]/popup-section-edit/div/form/div[4]/div");
    //SAC 19
    By DisplayedSaveButton = By.xpath( "//button[contains(text(),'Save')]");
    //SAC 20
    By DisplayedCancelButton = By.xpath( "//button[contains(text(),'Cancel')]");
    //SAC 24
    By ClickNewStandard = By.xpath( "//a[contains(text(),'New Standard')]");
    //SAC 25
    By FocusStandardNumber = By.xpath( "//input[@formcontrolname=\"standardNumber\"]");
    //SAC 26
    By FocusSortOrder = By.xpath( "//input[@role=\"spinbutton\"]");
    //SAC 27
    By FocusOnParentSEction = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/all-accreditation/kendo-window/div[1]/popup-standard-edit/div/form/div[2]/div");
    //SAC 28
    By FocusOnStandardSummary = By.xpath( "//input[@formcontrolname=\"standardSummary\"]");
    //SAC 30
    By ClickSaveBtn = By.xpath( "//button[contains(text(),'Save')]");
    //SAC 31
    By ClickCancelBtn = By.xpath( "//button[contains(text(),'Cancel')]");
    //SAC 32
    By selectMission = By.xpath( "//*[contains(text(),'MISSION')]");
    //SAC 32
    By InputOnStandardDescription = By.xpath( "//textarea[@formcontrolname=\"standardDescr\"]");
    //SAC 32
    By SaveButtonOnNewStandard = By.xpath( "//button[contains(text(),'Save')]");
    //SAC 33
    By ClickPlanANewCycle = By.xpath( "//a[contains(text(),'Plan a New Cycle')]");
    //SAC 34
    By ClickOnSelect = By.xpath( "//span[contains(text(),'Select')]");
    //SAC 35
    By ClickOnSourceAcronym = By.xpath( "//span[contains(text(),'Source Acronym')]");
    //SAC 36
    By SelectOneSourceAcronym = By.xpath( "//input[@id='2']");
    //SAC 36
    By ClickOnNext = By.xpath( "//Button[contains(text(),'Next')]");
    //SAC 37
    By InputAccreditationCycleTitle = By.xpath( "//input[@id='accreditationCycleTitle']");
    //SAC 38
    By ClickBeginDate = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/accreditation-cycle-home/div/div/div/div[1]/app-cycle-info/div/form/div[2]/div[2]/kendo-datepicker/span/span/span");
    //SAC 40
    By FocusOnReporting = By.xpath( "(//div[contains(text(),'Reporting Cycle')])[2]");

    //SAC 41
    By focusBaseline = By.xpath( "(//div[contains(text(),'Select a Baseline')])[1]");
    //SAC 41
    By focusSource = By.xpath( "//div[contains(text(),'Source:')]");
    //SAC 41
    By focusSAccCycleTitle = By.xpath( "//div[contains(text(),'Accreditation Cycle Title:')]");
    //SAC 41
    By focusVersion = By.xpath( "//div[contains(text(),'Version:')]");
    //SAC 42
    By ClickOnSelectReporting = By.xpath( "//input[@id='1008']");
    //SAC 44
    By Clickchairman = By.xpath( "(//span[@class=\"k-icon k-i-arrow-s\"])[1]");
    //SAC 45
    By selectplanningunit = By.xpath( "//span[normalize-space()='Academic Affairs']");
    //SAC 46
    By selectStandard = By.xpath( "//*[@id=\"includedCycle\"]");
    //SAC 48
    By ClickPublishCycle = By.xpath( "//a[normalize-space()='Publish a Cycle']");
    //SAC 49
    By ClickSourceDropdown = By.xpath( "(//*[@class=\"k-icon k-i-arrow-s\"])[1]");
    //SAC 49
    By SelectSource= By.xpath( "/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[2]");
    //SAC 49
    By ClickSelectACycle= By.xpath( "(//*[@class=\"k-icon k-i-arrow-s\"])[2]");
    //SAC 49
    By ClickReportDropdown= By.xpath( "(//*[@class=\"k-icon k-i-arrow-s\"])[3]");
    //SAC 50
    By FocusOnPublish= By.xpath( "//button[contains(text(),'Publish')]");
    //SAC 52
    By SelectOnSelectCycle= By.xpath( "/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[1]");
    //SAC 55
    By SelectReport= By.xpath( "/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[1]");
    //SAC 57
    By ClickOnStandard= By.xpath( "//div[contains(text(),'1.1.1 - Integrity')]");
    //SAC 57
    By StandardDetailsDisplayed= By.xpath( "//span[contains(text(),'Standard Details')]");
    //SAC 58
    By DisplayInfo= By.xpath( "//button[contains(text(),'Info')]");
    //SAC 58
    By DisplayResponse= By.xpath( "//button[contains(text(),'Response')]");
    //SAC 58
    By DisplayAssociation= By.xpath( "//button[contains(text(),'Associations')]");
    //SAC 58
    By DisplayAttachment= By.xpath( "//button[contains(text(),'Attachments')]");
    //SAC 58
    By DisplayHistory= By.xpath( "//button[contains(text(),'History')]");
    //SAC 59
    By DisplayFollowUp= By.xpath( "//span[contains(text(),'Suggested Follow Up')]");
    //SAC 59
    By DisplayPlanningUnit= By.xpath( "//span[contains(text(),'Assigned Planning Units')]");
    //SAC 61
    By ClickFormat= By.xpath( "//span[@class=\"k-icon k-i-arrow-s\"]");
    //SAC 61
    By SelectFormat= By.xpath( "//span[@class='ng-star-inserted'][normalize-space()='Heading 5']");
    //SAC 62
    By FocusOnSAVE= By.xpath( "//button[contains(text(),'Save')]");
    //SAC 62
    By FocusOnCANCEL= By.xpath( "//button[contains(text(),'Cancel')]");
    //SAC 63
    By ClickDescriptions= By.xpath( "/html/body/div");

    By Iframe_xpath = By.xpath("//iframe[@class=\"k-iframe\"]");





    public AccreditationInitialViewPage(WebDriver driver) {this.driver = driver;}


    public WebElement setaccreditionoption(){return driver.findElement(accreditionoption) ;}
    public WebElement SetClickAllAccrerition(){return driver.findElement(ClickAllAccreditation) ;}
    public WebElement GetClickPrimaryButton(){return driver.findElement(ClickPrimaryButton) ;}

    public WebElement GetClickSecondaryButton(){return driver.findElement(ClickSecondaryButton) ;}
    public WebElement GetSourceCodeBar(){return driver.findElement(ClickSourceCodeBar) ;}
    public WebElement GetClicktestAccreCycle(){return driver.findElement(ClicktestAccreCycle) ;}
    //    sa 6
    public WebElement GetClickAssignedStandard(){return driver.findElement(ClickAssignedStandard) ;}
    //    sa 7
    public WebElement GetClickStandardCheckbox(){return driver.findElement(ClickStandardCheckbox) ;}
//    SA 8
    public WebElement GetClickCollapseCheckbox(){return driver.findElement(ClickCollapseCheckbox) ;}
    //    SA 9
    public WebElement GetClickPublishButton(){return driver.findElement(ClickPublishButton) ;}
    //    SA 10
    public WebElement GetfocusOnThreeDot(){return driver.findElement(focusOnThreeDot) ;}
    //    SA 11
    public WebElement GetClickOnThreeDot(){return driver.findElement(ClickOnThreeDot) ;}
    //    SA 12
    public WebElement GetClickOnNewSection(){return driver.findElement(ClickOnNewSection) ;}
    //    SA 13
    public WebElement GetdisplayedVersion(){return driver.findElement(displayedVersion) ;}
    //SAC 14 //21
    public WebElement GetdisplayedSectionNumber(){return driver.findElement(displayedSectionNumber) ;}
    //SAC 15
    public WebElement GetdisplayedSectionTitle(){return driver.findElement(displayedSectionTitle) ;}
    //SAC 16
    public WebElement GetinputOnReportHeader(){return driver.findElement(inputOnReportHeader) ;}
    //SAC 17
    public WebElement GetDisplayedSortOrder(){return driver.findElement(DisplayedSortOrder) ;}
    //SAC 18
    public WebElement GetDisplayedParentSection(){return driver.findElement(DisplayedParentSection) ;}
    //SAC 19
    public WebElement GetDisplayedSaveButton(){return driver.findElement(DisplayedSaveButton) ;}
    //SAC 20
    public WebElement GetDisplayedCancelButton(){return driver.findElement(DisplayedCancelButton) ;}
    //SAC 24
    public WebElement GetClickNewStandard(){return driver.findElement(ClickNewStandard) ;}
    //SAC 25
    public WebElement GetFocusStandardNumber(){return driver.findElement(FocusStandardNumber) ;}
    //SAC 26
    public WebElement GetFocusSortOrder(){return driver.findElement(FocusSortOrder) ;}
    //SAC 27
    public WebElement GetFocusOnParentSEction(){return driver.findElement(FocusOnParentSEction) ;}
    //SAC 28
    public WebElement GetFocusOnStandardSummary(){return driver.findElement(FocusOnStandardSummary) ;}
    //SAC 30
    public WebElement GetClickSaveBtn(){return driver.findElement(ClickSaveBtn) ;}
    //SAC 31
    public WebElement GetClickCancelBtn(){return driver.findElement(ClickCancelBtn) ;}
    //SAC 32
    public WebElement GetselectMission(){return driver.findElement(selectMission) ;}
    //SAC 32
    public WebElement GetInputOnStandardDescription(){return driver.findElement(InputOnStandardDescription) ;}
    //SAC 32
    public WebElement GetSaveButtonOnNewStandard(){return driver.findElement(SaveButtonOnNewStandard) ;}

    //plan a New Cycle
    //SAC 33
    public WebElement GetClickPlanANewCycle(){return driver.findElement(ClickPlanANewCycle) ;}
    //SAC 34
    public WebElement GetClickOnSelect(){return driver.findElement(ClickOnSelect) ;}
    //SAC 35
    public WebElement GetClickOnSourceAcronym(){return driver.findElement(ClickOnSourceAcronym) ;}
    //SAC 36
    public WebElement GetSelectOneSourceAcronym(){return driver.findElement(SelectOneSourceAcronym) ;}
    //SAC 36
    public WebElement GetClickOnNext(){return driver.findElement(ClickOnNext) ;}
    //SAC 37
    public WebElement GetInputAccreditationCycleTitle(){return driver.findElement(InputAccreditationCycleTitle) ;}
    //SAC 38
    public WebElement GetClickBeginDate(){return driver.findElement(ClickBeginDate) ;}
    //SAC 40
    public WebElement GetFocusOnReporting(){return driver.findElement(FocusOnReporting) ;}
    //SAC 41
    public WebElement GetfocusBaseline(){return driver.findElement(focusBaseline) ;}
    //SAC 41
    public WebElement GetfocusSource(){return driver.findElement(focusSource) ;}
    //SAC 41
    public WebElement GetfocusSAccCycleTitle(){return driver.findElement(focusSAccCycleTitle) ;}
    //SAC 41
    public WebElement GetfocusVersion(){return driver.findElement(focusVersion) ;}
    //SAC 42
    public WebElement GetClickOnSelectReporting(){return driver.findElement(ClickOnSelectReporting) ;}
    //SAC 44
    public WebElement GetClickchairman(){return driver.findElement(Clickchairman) ;}
    //SAC 45
    public WebElement Getselectplanningunit(){return driver.findElement(selectplanningunit) ;}
    //SAC 46
    public WebElement GetSelectStandard(){return driver.findElement(selectStandard) ;}
    //SAC 48
    public WebElement GetClickPublishCycle(){return driver.findElement(ClickPublishCycle) ;}
    //SAC 49
    public WebElement GetClickSourceDropdown(){return driver.findElement(ClickSourceDropdown) ;}
    //SAC 49
    public WebElement GetSelectSource(){return driver.findElement(SelectSource) ;}
    //SAC 49
    public WebElement GetClickSelectACycle(){return driver.findElement(ClickSelectACycle) ;}
    //SAC 49
    public WebElement GetClickReportDropdown(){return driver.findElement(ClickReportDropdown) ;}
    //SAC 50
    public WebElement GetFocusOnPublish(){return driver.findElement(FocusOnPublish) ;}
    //SAC 52
    public WebElement GetSelectOnSelectCycle(){return driver.findElement(SelectOnSelectCycle) ;}
    //SAC 55
    public WebElement GetSelectReport(){return driver.findElement(SelectReport) ;}
    //SAC 57
    public WebElement GetClickOnStandard(){return driver.findElement(ClickOnStandard) ;}
    //SAC 57
    public WebElement GetStandardDetailsDisplayed(){return driver.findElement(StandardDetailsDisplayed) ;}
    //SAC 58
    public WebElement GetDisplayInfo(){return driver.findElement(DisplayInfo) ;}
    //SAC 58
    public WebElement GetDisplayResponse(){return driver.findElement(DisplayResponse) ;}
    //SAC 58
    public WebElement GetDisplayAssociation(){return driver.findElement(DisplayAssociation) ;}
    //SAC 58
    public WebElement GetDisplayAttachment(){return driver.findElement(DisplayAttachment) ;}
    //SAC 58
    public WebElement GetDisplayHistory(){return driver.findElement(DisplayHistory) ;}
    //SAC 59
    public WebElement GetDisplayFollowUp(){return driver.findElement(DisplayFollowUp) ;}
    //SAC 59
    public WebElement GetDisplayPlanningUnit(){return driver.findElement(DisplayPlanningUnit) ;}
    //SAC 61
    public WebElement GetClickFormat(){return driver.findElement(ClickFormat) ;}
    //SAC 61
    public WebElement GetSelectFormat(){return driver.findElement(SelectFormat) ;}
    //SAC 62
    public WebElement GetFocusOnSAVE(){return driver.findElement(FocusOnSAVE) ;}
    //SAC 62
    public WebElement GetFocusOnCANCEL(){return driver.findElement(FocusOnCANCEL) ;}
    //SAC 63
    public WebElement GetClickDescriptions(){
        driver.switchTo().frame(driver.findElement(Iframe_xpath));
        return driver.findElement(ClickDescriptions);
    }
}
