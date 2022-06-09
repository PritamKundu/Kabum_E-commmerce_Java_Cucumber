package pages.Budget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BudgetApprovalPage {
    WebDriver driver;

    By clickallunitbox = By.xpath( "//*[@id=\"main-wrapper\"]/app-header/section/div/div/all-budgets-sub/div/div[1]/label");


    By inputsearchbox = By.xpath( "//input[@id=\"searchButton\"]");


    By clickbudgetunit = By.xpath( "//div[@class=\"div-col-title displayNoneWhenEmpty budget-item-title dt-title-overflow-wrap budget-item-hover ng-star-inserted\"]");


    By clickplusbtn = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/budget-grid/div[1]/div[3]/span[2]");

    By inputvalue = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/select-glcode/div/div[2]/div[1]/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input");


    By clicksavebtn = By.xpath ("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/select-glcode/div/div[2]/div[2]/button[2]");


    By clickshkbox = By.xpath( "//input[@id=\"checkAll\"]");



    By clickexpenditures = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/budget-grid/div[2]/div/div[2]/div[3]");

    By clickthreedot = By.xpath( "//span[@id=\"dropdownMenuButton\"]");


    By clickdeletebtn = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/budget-summary/div[1]/div/div[2]/div/div/a[1]");



    By clickconfirmdlt = By.xpath( "//button[@class=\"btn btn-yellow btn-system ng-star-inserted\"]");

    // Sp 39
   By ClickTheCancelButton = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div[2]/div/select-glcode/div/div[2]/div[2]/button[1]");

    //sp 45
    By FavouriteStarIcon = By.xpath( "//*[@id=\"main-wrapper\"]/app-header/section/div/div/budget-detail-subheader-tab/div/div[1]/span[1]/i");

    By findPreviousCreatedBudgetTest = By.xpath("/html/body/app-root/div/div[1]/div/budget-details-unit-manager/budget-details/div/div/div/section/budget-data-table/div/div/budget-data-table/div/div/div[1]");



    public BudgetApprovalPage (WebDriver driver) {this.driver = driver;
    }


    public WebElement getActiveCheckBox(){return driver.findElement(clickallunitbox);}

    public WebElement setinputsearchbox(){return driver.findElement( inputsearchbox);}

    public WebElement setclickbudgetunit(){return driver.findElement(clickbudgetunit);}

    public WebElement setclickplusbtn(){return driver.findElement(clickplusbtn);}

    public WebElement setinputvalue(){return driver.findElement( inputvalue);}


    public WebElement setclicksavebtn(){return driver.findElement(clicksavebtn);}


    public WebElement setclickshkbox(){return driver.findElement(clickshkbox);}

    public WebElement setclickexpenditures(){return driver.findElement( clickexpenditures);}

    public WebElement setclickthreedot(){return driver.findElement(clickthreedot);}

    public WebElement setclickdeletebtn(){
        return driver.findElement(clickdeletebtn);
    }

    public WebElement setclickconfirmdlt(){
        return driver.findElement( clickconfirmdlt);
    }
    // sp 39
    public WebElement SetClickCancelBtn(){ return driver.findElement(ClickTheCancelButton);}
    // sp 45
    public WebElement SetFavouriteStarIcon(){return driver.findElement(FavouriteStarIcon);}

    public WebElement SetFindPreviousCreatedBudgetTest(){return driver.findElement(findPreviousCreatedBudgetTest);}
}
