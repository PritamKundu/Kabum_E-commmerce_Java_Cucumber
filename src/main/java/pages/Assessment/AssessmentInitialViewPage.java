package pages.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssessmentInitialViewPage{

    WebDriver driver;

    By assessmentUnit = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside/div/nav/ul[1]/li[4]/a/i");

    By allAssessment = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside[2]/div/div/div/app-sub-menu/div[1]/div[2]/ul/li[1]/a");

    By allAssessmentText = By.xpath("//*[@id=\"dropdownMenuButton\"]/span[3]");

    By detailButtonPrimary = By.xpath( "//*[@id=\"laneButton\"]");

    By detailButtonSecondary = By.xpath("//*[@id=\"detailButton\"]/i");

    By search = By.xpath("//*[@id=\"searchButton\"]");

    By cornerSearch = By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/div/div[2]/ul/li[3]/span/i");

    By programManagerDropdown = By.xpath( "/html/body/app-root/div/app-header/section/div/div/all-assessment-sub/div/span[2]/kendo-dropdownlist/span/span[1]");

    By OutcomeTypeDropdown = By.xpath("/html/body/app-root/div/app-header/section/div/div/all-assessment-sub/div/span[3]/kendo-dropdownlist/span/span[1]");

    By viewAllProgram = By.xpath( "//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-assessment-sub/div/div[1]/label");

    By viewCollapseAll = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-assessment-sub/div/div[2]/label");

    By threeDotIcon = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/section[1]/div[1]/div[1]/all-assessment-sub[1]/div[1]/div[3]/span[1]");

    By newProgram = By.xpath("//*[@id=\"dropdownMenuButton\"]/span/a[1]/span");

    By newOutcome = By.xpath( "//*[@id=\"dropdownMenuButton\"]/span/a[2]/span");

    By byCourseBtn= By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/div/div[1]/div/all-assessment-top/div/span/div/div/a[1]/span");

    By byServiceArea = By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/div/div[1]/div/all-assessment-top/div/span/div/div/a[2]");

    By AlertIcon = By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/div/div[2]/ul/li[4]/span/i[1]");

    public AssessmentInitialViewPage(WebDriver driver) {this.driver = driver;}


    public WebElement setAssessmentMenu(){return driver.findElement(assessmentUnit) ;}

    public WebElement setAllAssessment(){return  driver.findElement(allAssessment);}

    public WebElement allAssessmentText(){return driver.findElement(allAssessmentText);}

    public WebElement detailButtonPrimary(){return driver.findElement(detailButtonPrimary);}

    public WebElement getDetailButtonSecondary(){return driver.findElement(detailButtonSecondary);}

    public WebElement getsSearch(){return driver.findElement(search);}

    public WebElement getCornerSearch(){return driver.findElement(cornerSearch);}

    public WebElement getProgramManagerDropdown(){return driver.findElement(programManagerDropdown);}

    public WebElement getOutcomeTypeDropdown(){return driver.findElement(OutcomeTypeDropdown);}

    public WebElement getViewAllProgram(){return driver.findElement(viewAllProgram);}

    public WebElement getViewCollapseAll(){return driver.findElement(viewCollapseAll);}

    public WebElement getThreeDotIcon(){return driver.findElement(threeDotIcon);}

    public WebElement getNewProgram(){return driver.findElement(newProgram);}

    public WebElement getnewOutcome(){return driver.findElement(newOutcome);}

    public WebElement getbyCourseBtn(){return driver.findElement(byCourseBtn);}

    public WebElement getbyServiceArea(){return driver.findElement(byServiceArea);}

    public WebElement getAlertIcon(){return driver.findElement(AlertIcon);}

}
