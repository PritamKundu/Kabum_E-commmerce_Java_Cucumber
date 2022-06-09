package pages.Budget;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
//import org.openqa.selenium.support.PageFactory;


public class InitialViewPage {

    WebDriver driver;


    By budgetMenu = By.xpath("//a[@title='Budget']");

    By allBudget = By.xpath("//*[@id=\"main-wrapper\"]/app-nav-menu/aside[2]/div/div/div/app-sub-menu/div[1]/div[2]/ul/li[1]/a");


    By viewAllUnitsCheckbox= By.xpath ("//label[@class='custom-control-label']");


    By verifyUnitManagerTitle=By.xpath("//span[@class='ng-star-inserted'][contains(text(),'Unit Manager')]");


    By verifyButtonSecondary = By.id("laneButton");


    By verifySearchOption = By.xpath("//input[@id='searchButton']");


    By verifySearch = By.xpath("//div[@class='no-data-message ng-star-inserted']");


    By unitManagerDropdown =By.xpath("/html/body/app-root/div/app-header/section/div/div/all-budgets-sub/div/span[2]/kendo-dropdownlist");


    By threeDotButton = By.xpath( "/html/body/app-root/div/app-header/section/div/div/all-budgets-sub/div/div[2]");


    By newBudgetAccount = By.xpath("//a[contains(text(),'New Budget Account')]");


    By newGlCode = By.xpath("//a[contains(text(),'New GL Code')]");

    By newBudgetAccountTitle = By.xpath("//div[@class='k-window-title ng-star-inserted']");

    By newBudgetAccountTitleBox = By.id( "budgetAccountTitle");


    By planningUnitDropdown = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/div/form/div[2]/div/kendo-dropdownlist/span");


    By planningUnitDropdownOption = By.xpath("//span[normalize-space()='Accounting & Financial Services']");


    By functionDropdownOption = By.xpath("//span[normalize-space()='Contingencies & Transfers']");

    By detailButtonPrimary = By.xpath ("//button[@id='detailButton']");

    By editIcon=By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/div/form/div[3]/div/span[1]");


    By budgetFunctionNumber = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/kendo-window/div[1]/app-function-table/div/div/app-function-table-detail/div/div/dynamic-form/div/div/div/div/form/div[3]/div/kendo-numerictextbox");


    By budgetCategory = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/kendo-window/div[1]/app-function-table/div/div/app-function-table-detail/div/div/dynamic-form/div/div/div/div/form/div[4]/div/kendo-dropdownlist/span");


    By budgetCategoryDescription = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/kendo-window/div[1]/app-function-table/div/div/app-function-table-detail/div/div/dynamic-form/div/div/div/div/form/div[5]/div/textarea");


    By budgetFunctionNumberDecreaseButton = By.xpath("//span[@title='Decrease value']");


    By budgetFunctionDetailsPageSaveButton = By.xpath("(//button[@class='btn btn-yellow btn-system ng-star-inserted'])[2]");

    //sp 35
    By SearchBar = By.xpath("//*[@id=\"searchButton\"]");


    By draftIcon = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/budget-detail-subheader-tab/div/div[2]/div/button/span[2]");
    // sp 36
    By clkPlusBtn = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/budget-grid/div[1]/div[3]/span[2]");

    // sp 37
    By AddRemoveGLCodeToBudgetSelectCheckBox = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/select-glcode/div/div[2]/div[1]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/input");

    By ClickTheSaveButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/select-glcode/div/div[2]/div[2]/button[2]");


    //SP 47
    By ClickOnAttachmentsTab = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/budget-detail-subheader-tab/div/system-layout-tab/div/button[2]");

    By ClickOnDocumentRepositoryPlusBtn = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[1]/div[1]/div[1]");

    // SP 48
//    By MouseRightClkOnBudgetDocuments = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/left-menu/div/span/span");

    By SetCreateANewDirectory = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/left-menu/contex-menu/kendo-popup/div/section/div");

    By clickBlueColorUPLOADButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/doc-content/div[1]/div/button[2]");
//    @FindBy(xpath ="//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/doc-content/div[1]/div/button[2]" )


    By clickbudgetdocument = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/left-menu/div/span/span");

    By SelectNewDirectoryFolder = By.xpath( "//span[@id='span_1037']");

    By ClickOnSelectFile = By.xpath( "/html/body/app-root/div/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/doc-content/kendo-popup/div/div[2]/kendo-upload/div/div[1]");

   By ClickUploadButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/doc-content/kendo-popup/div/div[2]/kendo-upload/kendo-upload-action-buttons/button[2]");
//@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/doc-content/kendo-popup/div/div[2]/kendo-upload/kendo-upload-action-buttons/button[2]")
//WebElement ClickUploadButton;
    public InitialViewPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement setBudgetMenu(){
        return driver.findElement(budgetMenu) ;
    }

    public WebElement setAllBudget(){return  driver.findElement(allBudget);
    }

    public WebElement clickOnAllUnit(){
        return driver.findElement(viewAllUnitsCheckbox);
    }

    public WebElement verifyUnitManagerPageTitle(){
        return driver.findElement(verifyUnitManagerTitle);
    }

    public WebElement clickButtonSecondary(){
        return driver.findElement(verifyButtonSecondary);
    }

    public WebElement verifySearchOnData(){
        return driver.findElement(verifySearchOption);
    }

    public WebElement verifySearchNoRecords(){
        return driver.findElement(verifySearch) ;
    }

    public WebElement clickUnitManagerDropdown(){
        return driver.findElement(unitManagerDropdown);
    }

    public WebElement clickThreeDotButton(){
        return driver.findElement(threeDotButton);
    }

    public WebElement verifyNewBudgetAccount(){
        return driver.findElement(newBudgetAccount);
    }

    public WebElement verifyNewGlCode(){
        return driver.findElement(newGlCode);
    }

    public WebElement verifyNewBudgetAccountTitle(){
        return driver.findElement(newBudgetAccountTitle);
    }

    public WebElement verifyNewBudgetAccountTitleBox(){
        return driver.findElement(newBudgetAccountTitleBox);
    }

    public WebElement verifyPlanningUnitDropdown(){
        return driver.findElement(planningUnitDropdown);
    }

    public WebElement clickPlanningUnitDropdownOption(){
        return driver.findElement(planningUnitDropdownOption);
    }

//    public WebElement clickFunctionDropdown(){
//        return  functionDropdown;
//    }

    public WebElement clickFunctionDropdownOption(){
        return driver.findElement(functionDropdownOption);
    }

    public WebElement clickEditIcon(){
        return  driver.findElement(editIcon);
    }

    public WebElement verifyBudgetFunctionNumber(){
        return driver.findElement(budgetFunctionNumber);
    }

    public WebElement verifyBudgetCategory(){
        return driver.findElement(budgetCategory);
    }

    public WebElement verifyBudgetCategoryDescription(){
        return driver.findElement(budgetCategoryDescription);
    }

    public WebElement getBudgetFunctionNumberDecreaseButton(){
        return driver.findElement(budgetFunctionNumberDecreaseButton);
    }

    public WebElement getBudgetFunctionDetailsPageSaveButton(){
        return driver.findElement(budgetFunctionDetailsPageSaveButton);
    }
    // sp 35 to 38
    public WebElement getSearchBar()
    {return driver.findElement(SearchBar);
    }
    public WebElement getDraftIcon()
    {return driver.findElement(draftIcon) ;}

    public WebElement setDetailButtonPrimary(){
        return driver.findElement(detailButtonPrimary);
//        detailButtonPrimary.isDisplayed();
    }

    public WebElement SetClkPlusBtn(){ return driver.findElement(clkPlusBtn);}

    public WebElement setAddRemoveGLCodeToBudgetSelectCheckBox() {return driver.findElement(AddRemoveGLCodeToBudgetSelectCheckBox);}

    public WebElement SetClickTheSaveButton()
    {
        return driver.findElement(ClickTheSaveButton);
    }

    public WebElement SetClickOnAttachmentsTab(){return driver.findElement(ClickOnAttachmentsTab);}

    public WebElement SetClickOnDocumentRepositoryPlusBtn(){return driver.findElement(ClickOnDocumentRepositoryPlusBtn);}

    public WebElement SetOnCreateANewDirectory(){return driver.findElement(SetCreateANewDirectory);}

    public WebElement SetClickBlueColorUPLOADButton(){return driver.findElement (clickBlueColorUPLOADButton);}
    public WebElement GetSelectNewDirectoryFolder(){return driver.findElement (SelectNewDirectoryFolder);}

    public WebElement GetClickUploadButton(){return driver.findElement(ClickUploadButton);
    }

    public void setclickbudgetdocument() {

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(clickbudgetdocument)).build().perform();

    }


    public void clickOnSelectFilesAndSelectAnyFileFromYourDeviceAndClickUpload() throws IOException {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(ClickOnSelectFile)).perform();
            Runtime.getRuntime().exec("C:\\Users\\arouf\\Desktop\\New folder\\fileuploadonetwo.exe");

        }
}

