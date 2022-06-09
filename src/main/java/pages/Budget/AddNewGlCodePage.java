package pages.Budget;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

public class AddNewGlCodePage {
    WebDriver driver;




    By addNewGlCode = By.xpath( "//*[@id=\"dropdownMenuButton\"]/div/a[2]");
    By glCodeTextBox = By.xpath ( "//*[@id=\"glcode\"]");
    By saveButtonInGlCodeDetailPage = By.xpath ( "//button[@class=\"btn btn-yellow btn-system ng-star-inserted\"]");
    By selectCategory = By.xpath( "(//*[@class=\"k-input\"])[2]");
    By selectCategoryItem = By.xpath("/html[1]/body[1]/app-root[1]/kendo-popup[1]/div[1]/kendo-list[1]/div[1]/ul[1]/li[1]");
    By minimumAmount = By.id( "minAmount");
    By maximumAmount = By.id( "maxAmount");

    By description = By.xpath(  "//*[@id=\"description\"]");

    By activeCheckBox = By.xpath("//*[@id=\"active\"]");

    public AddNewGlCodePage(WebDriver driver) {this.driver = driver;}


    public WebElement clickAddNewGlCode(){return driver.findElement(addNewGlCode);}

    public WebElement sendGlCodeTextBox(){return driver.findElement( glCodeTextBox);}

    public WebElement getSaveButtonInGlCodeDetailPage(){return driver .findElement(saveButtonInGlCodeDetailPage);}

    public WebElement getSelectCategory(){return driver.findElement(selectCategory);}

    public WebElement getSelectCategoryItem(){return driver.findElement(selectCategoryItem);}

    public WebElement getMinimumAmount(){return driver.findElement( minimumAmount);}

    public WebElement getMaximumAmount(){return driver.findElement( maximumAmount);}

    public WebElement getDescription(){return driver.findElement( description);}

    public WebElement getActiveCheckBox(){return driver.findElement(activeCheckBox);}



}
