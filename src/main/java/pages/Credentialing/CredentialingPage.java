package pages.Credentialing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CredentialingPage {

    WebDriver driver;

    By CredentialingUnit = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside[1]/div/nav/ul[1]/li[5]/a/i");

    By allCredentialing = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside[2]/div/div/div/app-sub-menu/div[1]/div[2]/ul/li[1]/a");


    // New Ecommerce

    By searchBox = By.xpath( "//input[@id='input-busca']");
    By search = By.xpath( "//header/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]");

    By firstNotebook = By.xpath( "//body/div[@id='__next']/main[@id='listing']/article[1]/section[1]/div[3]/div[1]/main[1]/div");
    By zipCodeBox = By.xpath( "//input[@id='inputCalcularFrete']");
    By zipCodeOkButton = By.xpath( "//button[@id='botaoCalcularFrete']");














    ///Displayed xpath/////

    By DisciplinesNameDisplayed = By.xpath("//span[@class=\"popup-text\"]");
    By StatusDisplay = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/div[1]");
    By FacultyDetailsDisplay = By.xpath("//*[@class=\"k-window-title ng-star-inserted\"]");
    By RelevantCoursesDisplayed = By.xpath("(//*[@class=\"section-title\"])[1]");

    /////////////////////////////

    By AllFaculty = By.xpath("(//*[@class=\"fas fa-caret-down\"or style=\"width: 100%;\"])[1]");

    By SearchEmployeeWithNumber = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/section[1]/div[1]/div[1]/all-credentialing-sub[1]/div[1]/span[2]/div[1]/input[1]");

    By AllDisciplines = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-credentialing-sub/div/span[3]/button");

    By AllStatus = By.xpath("(//*[@unselectable=\"on\"or class=\"k-icon k-i-arrow-s\"])[3]");

    By ClkCoursesCheckbox = By.xpath("//span[contains(text(),'Courses Taught')]");

    By SelectFaculty = By.xpath("(//*[@class=\"displayNoneWhenEmpty\" or xpath=\"1\" ])");

    By AddDegreeAndRelevantCourses = By.xpath("(//*[@class=\"table-heading obj-dtl-item ng-star-inserted\" or xpath=\"1\"])[1]");

    By AddRelevantCourseCredit = By.xpath("(//*[@ class=\"fal fa-plus add-item\"])");

    //TC_47
    By AddCourseNumber = By.xpath("(//*[@formcontrolname=\"courseNum\" or id=\"'courseNum_'0\" ])");
    By AddCourseTitle  = By.xpath("(//*[@id=\"'courseTitle_'0\" ])");
    By AddHoursEarned  = By.xpath("(//*[@id=\"'hours_'0\"])");
    By SelectHoursType  = By.xpath("(//*[@class=\"k-dropdown-wrap\"])[4]");
    By SelectHourType = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[3]");
    By RelevantCourseSaveButton = By.xpath("(//*[@class=\"btn btn-yellow btn-system ng-star-inserted\"])");




    By ClickOnAddOrEdit  = By.xpath("(//*[@ class=\"header-icon fas fa-plus ng-star-inserted\"])[1]");

    By ClkAddIcon  = By.xpath("(//*[@ class=\"header-icon fas fa-plus ng-star-inserted\"])[2]");

    By clkOnAddIcon = By.xpath("(//*[@ class=\"header-icon fas fa-plus ng-star-inserted\"])[4]");

    By ClkOnAddIcon2 = By.xpath("(//*[@ class=\"header-icon fas fa-plus ng-star-inserted\"])[3]");

    By EnterDisciplineTitle = By.xpath("(//*[@ id=\"disciplineTitle\"])");

    //TC 42

    By EnterAddress1 = By.xpath("(//*[@id=\"address1\"or xpath=\"1\"])");
    By EnterAddress2 = By.xpath("(//*[@id=\"address2\"or xpath=\"1\"])");
    By ClickOnCountryBar = By.xpath("(//*[@class=\"k-icon k-i-arrow-s\" or xpath=\"1\"])[5]");
    By AddCountryName = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[20]");
    By ClkOnStateBar = By.xpath("(//*[@class=\"k-icon k-i-arrow-s\" or xpath=\"1\"])[6]");
    By ThenAddState = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[4]");
    By AddCityNam = By.xpath("(//*[@id=\"city\" or type=\"text\"])");
    By AddZipcode = By.xpath("(//*[@id=\"zipCode\"or type=\"text\"])");
    By MarkAccredited =  By.xpath("//input[@id='isAccredited']");
    //////////////////////////////////////////////////////////////////
    By SecondaryOption = By.xpath("//*[@id=\"detailButton\"]");

    By AccreditingBodyAcronym = By.xpath("(//*[@id=\"accreditingBodyAcronym\"])");

    By AddAccreditingBodyName = By.xpath("(//*[@id=\"accreditingBodyName\"])");

    By AddDegreeAcronym = By.xpath("//input[@id='degreeAcronym']");

    By AddDegreeTitle = By.xpath("//input[@id='degreeTitle']");

    By MarkIsTerminaCheckBox = By.xpath("(//*[@ type=\"checkbox\" or class=\"k-checkbox k-checkbox-border ng-pristine ng-valid ng-star-inserted ng-touched\"])[2]");

    By MarkActiveCheckBox = By.xpath("//*[@id=\"active\"]");

    By ClkOnCancelButton = By.xpath("(//*[@class=\"btn btn-light btn-system\"])[2]");

    By ClkSaveButton = By.xpath("(//*[@ class=\"btn btn-yellow btn-system ng-star-inserted\"])[2]");

    By HighestDegreeEarnedSelectBox = By.xpath("//*[@id=\"isHighestDegree\" or formcontrolname=\"isHighestDegree\" or type=\"checkbox\"]");

    By EarnedDegreeDropdown = By.xpath("(//*[@class=\"k-icon k-i-arrow-s\"])[1]");

    By GrantingInstitution = By.xpath("(//*[@class=\"k-icon k-i-arrow-s\"])[2]");

    By SelectInstituteTest = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[87]");

    By SelectEarnedDegree = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[2]");

    By ClickCoursesDropdown = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-credentialing-sub/div/span[5]/button/i");

    By threeDotIcon = By.xpath("(//*[@class=\"far fa-ellipsis-v\"])");

    By newFaculty = By.xpath("//*[@id=\"dropdownMenuButton\"]/div/a[1]/span");

    By SPOLUserDropdown = By.xpath("(//*[@unselectable=\"on\" or ass=\"k-icon k-i-arrow-s\"])[7]");

    By SPOLUserSelect = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[6]");

    By PrefixTab = By.xpath("//input[@id='prefix']");

    By FirstName = By.xpath("//*[@id=\"firstName\"]");

    By MiddleName = By.xpath("//*[@id=\"middleName\"]");

    By LastName = By.xpath("//*[@id=\"lastName\"]");

    By EmployeeNumber = By.xpath("//*[@id=\"empNumber\"]");

    By Email = By.xpath( "//*[@id=\"email\"]");

    By FacultyRank = By.xpath("(//*[@unselectable=\"on\" or class=\"k-icon k-i-arrow-s\"])[11]");

    By EmploymentType = By.xpath("(//*[@unselectable=\"on\" or class=\"k-icon k-i-arrow-s\"])[15]");

    By ActiveCheckBox = By.xpath("(//*[@id=\"active\"or type=\"checkbox\"])");

    By ActiveCheckBox2 = By.xpath("(//*[@id=\"active\"or type=\"checkbox\" or class=\"k-checkbox k-checkbox-border ng-valid ng-star-inserted ng-touched ng-dirty\"])[2]");

    By CancelButton = By.xpath("//button[contains(text(),'Cancel')]");

    By NewCredentials = By.xpath("//span[contains(text(),'New Certificate')]");

    By ClickFacultyName = By.xpath("(//*[@unselectable=\"on\" or class=\"k-input \"or xpath=\"1\"])[5]");

    By SelectFacultyName = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[4]");

    By AddingNewCredentials  = By.xpath("//*[@ class=\"plus-icon fas fa-plus float-right ng-star-inserted\"or xpath=\"1\"]");

    By SelectPrimaryCheckBox = By.xpath("(//*[@type=\"checkbox\" or id=\"isHighestCertificate\"or class=\"form-check-input ng-pristine ng-valid ng-touched\"])[2]");

    By AddingDateOnNewCertificate = By.xpath("//*[@class=\"k-icon k-i-calendar\" or xpath=\"1\"]");
    By ClickHistory= By.xpath("//button[contains(text(),'History')]");


    By ClickDocRepository = By.xpath("//span[contains(text(),'Document Repository')]");

    By SelectADate =  By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-calendar[1]/kendo-calendar-viewlist[1]/kendo-virtualization[1]/table[1]/tbody[1]/tr[2]/td[6]/span[1]");

    By ClkDisciplineDropDown = By.xpath("(//*[@class=\"k-icon k-i-arrow-s\"or xpath=\"1\"])[2]");

    By SelectADiscipline = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[4]");

    By SaveButtonOfCredentials = By.xpath("//*[@class=\"btn btn-yellow btn-system\" or xpath=\"1\"]");

    By ClickOnSaveBtn = By.xpath("//div[@class='text-right']//button[@class='btn btn-yellow btn-system ng-star-inserted'][contains(text(),'Save')]");

    By DisplayedDelete = By.xpath("//button[contains(text(),'DELETE')]");

    By ClickOnSaveButton = By.xpath("(//*[@class=\"btn btn-yellow btn-system ng-star-inserted\" or xpath=\"1\"])[3]");
    By DisplayedVersion = By.xpath("//button[contains(text(),'VERSION')]");


    By CancelButtonOfCredentials = By.xpath("//button[@class='btn btn-light btn-system']");

    By ClickDocument = By.xpath("(//span[contains(text(),'test')])[1]");


    By CourseCheckBox = By.xpath("(//*[@type=\"checkbox\"or class=\"float-left relevant-credentials ng-valid ng-dirty ng-touched\"])[3]");

    By RelevantCredentialsCheckBox = By.xpath("(//*[@type=\"checkbox\"or class=\"float-left relevant-credentials ng-valid ng-dirty ng-touched\"])[4]");

    By ClickAttachmentbtn = By.xpath("//button[contains(text(),'Attachments')]");

    By DisplayedDownloads = By.xpath("//button[contains(text(),'DOWNLOAD')]");

    By DisplayedUpload = By.xpath("//button[contains(text(),'UPLOAD')]");

    By DisplayedAction= By.xpath("//div[contains(text(),'Action')]");

    By ClickProfessionalExp= By.xpath("//span[contains(text(),'Professional Experience')]");
    //49
    By DisplayedEmployer= By.xpath("//input[@formcontrolname=\"employer\"]");
    By DisplayedLocation= By.xpath("//input[@formcontrolname=\"location\"]");
    By DiplayedBeginDate= By.xpath("(//span[@class=\"k-icon k-i-calendar\"])[1]");
    By DisplayedEndDate= By.xpath("(//span[@class=\"k-icon k-i-calendar\"])[2]");
    By DisplayedDescription= By.xpath("//label[contains(text(),'Description:')]");
    By DisplayedSave= By.xpath("//button[contains(text(),'Save')]");
    //50
    By ClickLicAndCer= By.xpath("//span[contains(text(),'Licensures and Certifications ')]");
    By DisplayedAwaredby= By.xpath("//input[@formcontrolname=\"awardedBy\"]");
    By ClickOtherScolary= By.xpath("//span[contains(text(),'Other Scholarly Activities')]");

    By ClickOnActivityType= By.xpath("(//span[@class=\"k-icon k-i-arrow-s\"])[1]");
    By SelectOnActivityType= By.xpath("//li[contains(text(),'Pre')]");
    By ClickActivityDate= By.xpath("//span[@class=\"k-icon k-i-calendar\"]");
    By SelectActivityDate= By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-calendar[1]/kendo-calendar-viewlist[1]/kendo-virtualization[1]/table[1]/tbody[1]/tr[2]/td[6]/span[1]");
    By Iframe_xpath = By.xpath("//iframe[@class=\"k-iframe\"]");
    By ClickDescriptions= By.xpath( "/html/body/div");
    By InputSponsor= By.xpath( "//input[@formcontrolname=\"activitySponsor\"]");


    //Ecommerce
    public WebElement setSearchBox(){return driver.findElement(searchBox);}
    public WebElement setSearch(){return driver.findElement(search);}
    public List <WebElement> setFirstNotebook(){return driver.findElements(firstNotebook);}
    public WebElement setZipCodeBox(){return driver.findElement(zipCodeBox);}
    public WebElement setzipCodeOkButton(){return driver.findElement(zipCodeOkButton);}

    public void zipFunction(){
        WebElement element = driver.findElement(By.xpath("//input[@id='inputCalcularFrete']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }












    public CredentialingPage(WebDriver driver) {this.driver = driver;}

    public WebElement setCredentialingMenu(){return driver.findElement(CredentialingUnit) ;}

    public WebElement setallCredentialing(){return  driver.findElement(allCredentialing);}

    //display option/////
    public WebElement SetDisciplinesNameDisplayed(){return driver.findElement(DisciplinesNameDisplayed);}
    public WebElement SetStatusDisplay(){return driver.findElement(StatusDisplay);}
    public WebElement SetFacultyDetailsDisplay(){return driver.findElement(FacultyDetailsDisplay);}
    public WebElement SetRelevantCoursesDisplayed(){return driver.findElement(RelevantCoursesDisplayed);}




    public WebElement SetAllFaculty(){return driver.findElement(AllFaculty);}

    public WebElement SetSearchEmployeeWithNumber(){return driver.findElement(SearchEmployeeWithNumber);}

    public WebElement SetAllDisciplines(){return driver.findElement(AllDisciplines);}

    public WebElement SetAllStatus(){return driver.findElement(AllStatus);}

    public WebElement SetClkCoursesCheckbox(){return driver.findElement(ClkCoursesCheckbox);}

    public WebElement SetSelectFaculty(){return driver.findElement(SelectFaculty);}

    public WebElement SetAddDegreeAndRelevantCourses(){return driver.findElement(AddDegreeAndRelevantCourses);}

    public WebElement SetAddRelevantCourseCredit(){return driver.findElement(AddRelevantCourseCredit);}

    public WebElement SetAddCourseNumber(){return driver.findElement(AddCourseNumber);}

    public WebElement SetAddCourseTitle(){return driver.findElement(AddCourseTitle);}

    public WebElement SetAddHoursEarned(){return driver.findElement(AddHoursEarned);}

    public WebElement SetSelectHoursType(){return driver.findElement(SelectHoursType);}

    public WebElement SetSelectHoursTypes(){return driver.findElement(SelectHourType);}

    public WebElement SetRelevantCourseSaveButton(){return driver.findElement(RelevantCourseSaveButton);}

    public WebElement SetClickOnAddOrEdit(){return driver.findElement(ClickOnAddOrEdit);}

    public WebElement SetClkAddIcon(){return driver.findElement(ClkAddIcon);}

    public WebElement SetclkOnAddIcon(){return driver.findElement(clkOnAddIcon);}

    public  WebElement SetClkOnAddIcon2(){return driver.findElement(ClkOnAddIcon2);}

    public WebElement SetEnterDisciplineTitle(){return driver.findElement(EnterDisciplineTitle);}



    public  WebElement  SetEnterAddress1(){return driver.findElement(EnterAddress1);}

    public  WebElement  SetEnterAddress2(){return driver.findElement(EnterAddress2);}

    public  WebElement  SetClickOnCountryBar(){return driver.findElement(ClickOnCountryBar);}

    public  WebElement  SetAddCountryName(){return driver.findElement(AddCountryName);}

    public  WebElement  SetClkOnStateBar(){return driver.findElement(ClkOnStateBar);}

    public  WebElement  SetThenAddState(){return driver.findElement(ThenAddState);}

    public  WebElement  SetAddCityNam(){return driver.findElement(AddCityNam);}

    public  WebElement  SetAddZipcode(){return driver.findElement(AddZipcode);}

    public  WebElement  SetMarkAccredited(){return driver.findElement(MarkAccredited);}

    public WebElement SetSecondaryOption(){return driver.findElement(SecondaryOption);}

    public WebElement SetAccreditingBodyAcronym(){return driver.findElement(AccreditingBodyAcronym);}

    public WebElement SetAddAccreditingBodyName(){return driver.findElement(AddAccreditingBodyName);}

    public WebElement SetAddDegreeAcronym(){return driver.findElement(AddDegreeAcronym);}

    public WebElement SetAddDegreeTitle(){return driver.findElement(AddDegreeTitle);}

    public WebElement SetMarkIsTerminaCheckBox(){return driver.findElement(MarkIsTerminaCheckBox);}

    public WebElement SetMarkActiveCheckBox(){return driver.findElement(MarkActiveCheckBox);}

    public WebElement SetClkOnCancelButton(){return driver.findElement(ClkOnCancelButton);}

    public WebElement SetClkSaveButton(){return driver.findElement(ClkSaveButton);}

    public WebElement SetHighestDegreeEarnedSelectBox(){return driver.findElement(HighestDegreeEarnedSelectBox);}

    public WebElement ClkEarnedDegreeDropdown(){return driver.findElement(EarnedDegreeDropdown);}

    public WebElement ClkGrantingInstitution(){return driver.findElement(GrantingInstitution);}

    public WebElement GetSelectInstituteTest(){return driver.findElement(SelectInstituteTest);}

    public WebElement SetSelectEarnedDegree(){return driver.findElement(SelectEarnedDegree);}

    public WebElement SetClickCoursesDropdown(){return driver.findElement(ClickCoursesDropdown);}

    public WebElement getThreeDotIcon(){return driver.findElement(threeDotIcon);}

    public WebElement getNewFaculty(){return driver.findElement(newFaculty);}

    public WebElement SetSPOLUserDropdown(){return driver.findElement(SPOLUserDropdown);}

    public WebElement SetSPOLUserSelect(){return driver.findElement(SPOLUserSelect);}

    public WebElement SetPrefixTab(){return driver.findElement(PrefixTab);}

    public WebElement SetFirstName(){return driver.findElement(FirstName);}

    public  WebElement SetMiddleName(){return driver.findElement(MiddleName);}

    public WebElement SetLastName(){return driver.findElement(LastName);}

    public WebElement SetEmployeeNumber(){return driver.findElement( EmployeeNumber);}

    public WebElement SetEmail(){return driver.findElement(Email);}

    public WebElement SetFacultyRank(){return driver.findElement(FacultyRank);}

    public WebElement SetEmploymentType(){return driver.findElement(EmploymentType);}

    public WebElement SetActiveCheckBox(){return driver.findElement(ActiveCheckBox);}

    public WebElement SetActiveCheckBox2(){return driver.findElement(ActiveCheckBox2);}

    public WebElement SetCancelButton(){return driver.findElement(CancelButton);}

    public WebElement SetNewCredentials(){return driver.findElement(NewCredentials);}

    public WebElement SetClickFacultyName(){return driver.findElement(ClickFacultyName);}

    public WebElement SetSelectFacultyName(){return driver.findElement(SelectFacultyName);}

    public WebElement SetAddingNewCredentials(){return driver.findElement(AddingNewCredentials);}

    public WebElement SetSelectPrimaryCheckBox(){return driver.findElement(SelectPrimaryCheckBox);}

    public WebElement SetAddingDateOnNewCertificate(){return driver.findElement(AddingDateOnNewCertificate);}

    public WebElement SetSelectADate(){return driver.findElement(SelectADate);}

    public WebElement SetClkDisciplineDropDown(){return driver.findElement(ClkDisciplineDropDown);}

    public WebElement SetSelectADiscipline(){return driver.findElement(SelectADiscipline);}

    public WebElement GetClickDescriptions(){driver.switchTo().frame(driver.findElement(Iframe_xpath));return driver.findElement(ClickDescriptions);}
    public WebElement SetSaveButton(){return driver.findElement(SaveButtonOfCredentials);}

    public WebElement SetClickOnSaveBtn(){return driver.findElement(ClickOnSaveBtn);}

    public WebElement SetClickOnSaveButton(){return driver.findElement(ClickOnSaveButton);}

    public WebElement SetCancelButtonOfCredentials(){return driver.findElement(CancelButtonOfCredentials);}

    public WebElement SetCourseCheckBox(){return driver.findElement(CourseCheckBox);}

    public WebElement SetRelevantCredentialsCheckBox(){return driver.findElement(RelevantCredentialsCheckBox);}

    public WebElement GetClickAttachmentbtn(){return driver.findElement(ClickAttachmentbtn);}

    public WebElement GetClickDocRepository(){return driver.findElement(ClickDocRepository);}

    public WebElement GetDisplayedDownloads(){return driver.findElement(DisplayedDownloads);}

    public WebElement GetDisplayedUpload(){return driver.findElement(DisplayedUpload);}

    public WebElement GetDisplayedDelete(){return driver.findElement(DisplayedDelete);}

    public WebElement GetDisplayedVersion(){return driver.findElement(DisplayedVersion);}

    public WebElement GetClickDocument(){return driver.findElement(ClickDocument);}

    public WebElement GetClickHistory(){return driver.findElement(ClickHistory);}

    public WebElement GetDisplayedAction(){return driver.findElement(DisplayedAction);}

    public WebElement GetClickProfessionalExp(){return driver.findElement(ClickProfessionalExp);}

    public WebElement GetDisplayedEmployer(){return driver.findElement(DisplayedEmployer);}

    public WebElement GetDisplayedLocation(){return driver.findElement(DisplayedLocation);}

    public WebElement GetDiplayedBeginDate(){return driver.findElement(DiplayedBeginDate);}

    public WebElement GetDisplayedEndDate(){return driver.findElement(DisplayedEndDate);}

    public WebElement GetDisplayedDescription(){return driver.findElement(DisplayedDescription);}

    public WebElement GetDisplayedSave(){return driver.findElement(DisplayedSave);}

    public WebElement GetClickLicAndCer(){return driver.findElement(ClickLicAndCer);}

    public WebElement GetDisplayedAwaredby(){return driver.findElement(DisplayedAwaredby);}

    public WebElement GetClickOtherScolary(){return driver.findElement(ClickOtherScolary);}

    public WebElement GetClickOnActivityType(){return driver.findElement(ClickOnActivityType);}

    public WebElement GetSelectOnActivityType(){return driver.findElement(SelectOnActivityType);}

    public WebElement GetClickActivityDate(){return driver.findElement(ClickActivityDate);}

    public WebElement GetSelectActivityDate(){return driver.findElement(SelectActivityDate);}

    public WebElement GetInputSponsor(){return driver.findElement(InputSponsor);}
}
