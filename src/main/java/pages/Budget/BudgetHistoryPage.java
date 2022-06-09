package pages.Budget;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BudgetHistoryPage {
WebDriver driver;

    By BudgetMenu = By.xpath("//a[@title='Budget']");

    By allBdget = By.xpath( "//*[@id=\"main-wrapper\"]/app-nav-menu/aside[2]/div/div/div/app-sub-menu/div[1]/div[2]/ul/li[1]/a");

    By clickAllUnItBox = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-budgets-sub/div/div[1]/label");

    By SearChBar = By.xpath("//*[@id=\"searchButton\"]");

    By findPreviousCreatedBudgEtTest = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/div/div/div/section/budget-data-table/div/div/budget-data-table/div/div/div[1]");

    By ClickOnHistoryTab = By.xpath("//*[@id=\"main-wrapper\"]/app-header/section/div/div/budget-detail-subheader-tab/div/system-layout-tab/div/button[3]");

    By ClickAllViewAllIcon = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div/page-history/div[1]/div/div[3]/span");

   public BudgetHistoryPage(WebDriver driver) {this.driver = driver;}

    public WebElement seBudgetMenu(){
        return driver.findElement (BudgetMenu);
    }
    public WebElement seAllBudget(){
        return driver.findElement (allBdget);
    }

    public WebElement SeClickAllUnitBox(){return driver.findElement (clickAllUnItBox);}

    public WebElement SeSearchBar(){return driver.findElement(SearChBar);}

    public WebElement SeFindPreviousCreatedBudgetTest(){return driver.findElement(findPreviousCreatedBudgEtTest);}

    public WebElement SetClickOnHistoryTab(){return driver.findElement (ClickOnHistoryTab);}

    public WebElement SetClickAllViewAllIcon(){return driver.findElement(ClickAllViewAllIcon);}

}
