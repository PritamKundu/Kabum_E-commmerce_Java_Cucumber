package pages.Budget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JiraTicketBudgetPage {
    WebDriver driver;

    By ClickSearchHooter = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/budget-details-unit-manager[1]/budget-details[1]/div[1]/div[1]/div[1]/section[1]/budget-data-table[1]/div[1]/div[1]/budget-data-table[1]/div[1]/div[1]/div[1]");
    By RightSideNameAssert = By.xpath("//span[contains(text(),'-- DRAFT --')]");

    public JiraTicketBudgetPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickSearchDataHooter(){
        return driver.findElement(ClickSearchHooter) ;
    }

    public WebElement assertRightSideName(){
        return driver.findElement(RightSideNameAssert) ;
    }


}
