package pages.Budget;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddNewBudgetAccountPage {

    WebDriver driver;


    By allBudget = By.xpath("//*[@id=\"main-wrapper\"]/app-nav-menu/aside[2]/div/div/div/app-sub-menu/div[1]/div[2]/ul/li[1]/a");


    By functionPlusIcon = By.xpath("//span[@class='header-icon fas fa-plus ng-star-inserted']");


    By functionDropdown = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/div/form/div[3]/div/kendo-dropdownlist/span");

    By saveButtonInBudgetFunctionDetails = By.xpath("(//button[@class='btn btn-yellow btn-system ng-star-inserted'])[2]");


    By clickBudgetCategory = By.xpath("(//span[@class='k-input'])[4]");


    By budgetFunctionDescription = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-details-unit-manager/budget-details/kendo-window/div[1]/app-budget-account-edit/kendo-window/div[1]/app-function-table/div/div/app-function-table-detail/div/div/dynamic-form/div/div/div/div/form/div[5]/div/textarea");

    By accountNumberFirstBox = By.xpath("//input[@formcontrolname='stateOrg']");

    By accountNumberSecondBox = By.xpath("//input[@formcontrolname='stateOrg']");


    By textAccountNumber = By.xpath("//input[@formcontrolname='stateOrg']");


    By saveButtonInBudgetAccountDetail = By.xpath("(//button[@class='btn btn-yellow btn-system ng-star-inserted'])[1]");



    By clickallunitbok = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-budgets-sub/div/div[1]/label");



    public AddNewBudgetAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFunctionPlusIcon(){
        return driver.findElement(functionPlusIcon);
    }

    public WebElement clickFunctionDropdown(){
        return  driver.findElement(functionDropdown);
    }

    public WebElement clickSaveButtonInBudgetFunctionDetails(){
        return driver.findElement(saveButtonInBudgetFunctionDetails);
    }

    public WebElement clickBudgetCategory(){
        return  driver.findElement(clickBudgetCategory);
    }

    public WebElement setBudgetFunctionDescription(){
        return  driver.findElement(budgetFunctionDescription);
    }

    public WebElement clickAccountNumberFirstBox(){
        return  driver.findElement(accountNumberFirstBox);
    }

    public WebElement clickAccountNumberSecondBox(){
        return driver.findElement(accountNumberSecondBox);
    }

    public WebElement displayTextAccountNumber(){
        return driver.findElement(textAccountNumber);
    }

    public WebElement clickSaveButtonInBudgetAccountDetail(){
        return driver.findElement(saveButtonInBudgetAccountDetail) ;
    }

    public WebElement setclickallunitbok(){
        return driver.findElement(clickallunitbok) ;
    }



}
