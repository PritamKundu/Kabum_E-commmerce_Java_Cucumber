
package pages.Budget;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BudgetAttachmentPage {

    WebDriver driver;

   By clickattchmentplusbtn = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/div/div[1]/div[1]");

   By clickrightbtn = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/div/span/span");

   By clickrightbufourop = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/tree-view/ul/tree-node[2]/li/div/span");

   By rightclicknewdict = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/contex-menu/kendo-popup/div/section/div");

    By rightclickonmouse = By.xpath( "//span[@id=\"span_1037\"]");

    By clickDeleteButtonOnRightButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/div[1]/div/div/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/left-menu/contex-menu/kendo-popup/div/section/div[2]");

    By ClickDeletePlusYes = By.xpath( "//*[@id=\"main-wrapper\"]/kendo-window/div[1]/div/div/button[2]");

    By ClickCrossIcon = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[1]/doc-table/div[2]/doc-management/div/kendo-window/kendo-window-titlebar/button[3]/span");

    By ClickdictForeditButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/tree-view/ul/tree-node[5]/li/div/span");

    By ClickEditBlueButton = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/div[1]/div/button[3]");

    By ClickLinkName = By.xpath( "//input[@id=\"linkName\"]");

    By RemoveAndPutNewLink = By.xpath("//*[@id=\"linkUrl\"]");

    By InputLinkDescription = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/link-form/kendo-window/div[1]/div[1]/dynamic-form/div/div/div/div/form/div[3]/div/textarea");

    By ClickOnSaveButton = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/link-form/kendo-window/div[1]/div[2]/button[2]");

    By ClickOnDeleteButton = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/div[1]/div/button[4]");

    By ClickOnYesButton = By.xpath("//*[@id=\"main-wrapper\"]/kendo-window/div[1]/div/div/button[2]");

    By ClickOnXIcon = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/kendo-window-titlebar/button[3]/span");

    By ClickOnNEWButton = By.xpath( "//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/div[1]/div/button[2]");

    By SelectOnCreatedDirectory = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/tree-view/ul/tree-node[5]/li/div/span");

    By ClickOnBlueColorNEWIcon = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[2]/div/link-content/div[1]/div/button[1]");

    By RenameDirectoryClick = By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/budget-detail-home/div/div/div/div[2]/link-management-table/link-management/div/kendo-window/div[1]/kendo-splitter/kendo-splitter-pane[1]/kendo-splitter/kendo-splitter-pane[1]/div/link-left-menu/contex-menu/kendo-popup/div/section/div[3]");

    By RenameDirectory = By.xpath( "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/budget-detail-home[1]/div[1]/div[1]/div[1]/div[2]/link-management-table[1]/link-management[1]/div[1]/kendo-window[1]/div[1]/kendo-splitter[1]/kendo-splitter-pane[1]/kendo-splitter[1]/kendo-splitter-pane[1]/div[1]/link-left-menu[1]/tree-view[1]/ul[1]/tree-node[2]/li[1]/div[1]/input[1]");

    public BudgetAttachmentPage(WebDriver driver) {this.driver = driver;
    }

    public WebElement setclickattchmentplusbtn() {return driver.findElement( clickattchmentplusbtn);}

    public WebElement setclickrightbtn() {return driver.findElement(clickrightbtn);}

    public WebElement setrightclicknewdict() {return driver.findElement(rightclicknewdict);}

    public WebElement setclickrightbufourop() {return driver.findElement(clickrightbufourop);}

    public WebElement setrightclickonmouse() {return driver.findElement(rightclickonmouse);}

    public WebElement SetclickDeleteButtonOnRightButton() {return driver.findElement (clickDeleteButtonOnRightButton);}

    public WebElement SetClickDeletePlusYes() {return driver.findElement (ClickDeletePlusYes);}

    public WebElement SetClickCrossIcon() {return driver.findElement (ClickCrossIcon);}

    public WebElement setClickdictForeditButton() {return driver.findElement (ClickdictForeditButton);}

    public WebElement SETClickEditBlueButton() {return driver.findElement (ClickEditBlueButton);}

    public WebElement SETClickLinkName() {return driver.findElement (ClickLinkName);}

    public WebElement SetRemoveAndPutNewLink(){return driver.findElement (RemoveAndPutNewLink);}

    public WebElement SetInputLinkDescription(){return driver.findElement (InputLinkDescription);}

    public WebElement SetClickOnSaveButton(){return driver.findElement (ClickOnSaveButton);}

    public WebElement SetClickOnDeleteButton(){return driver.findElement (ClickOnDeleteButton);}

    public WebElement SetClickOnYesButton(){return driver.findElement(ClickOnYesButton);}

    public WebElement SetClickOnXIcon(){return driver.findElement (ClickOnXIcon);}

    public WebElement SetClickOnNEWButton(){return driver.findElement(ClickOnNEWButton);}

    public WebElement SetSelectOnCreatedDirectory(){return driver.findElement(SelectOnCreatedDirectory);}

    public WebElement SetClickOnBlueColorNEWIcon(){return driver.findElement (ClickOnBlueColorNEWIcon);}

    public WebElement SetRenameDirectoryClick(){return driver.findElement (RenameDirectoryClick);}

    public WebElement SetRenameDirectory(){return driver.findElement (RenameDirectory);}
}
