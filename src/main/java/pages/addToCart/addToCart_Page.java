package pages.addToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class addToCart_Page {

    WebDriver driver;

    /*Locators*/

    By searchBox = By.xpath("//input[@id='input-busca']");
    By search = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]");
    By firstNotebook = By.xpath("//body/div[@id='__next']/main[@id='listing']/article[1]/section[1]/div[3]/div[1]/main[1]/div");
    By zipCodeOkButton = By.xpath("//button[@id='botaoCalcularFrete']");
    By printValue = By.xpath("/html/body/div[2]/main/article/section/div[2]/div/div[1]/div[3]/div/div/div[2]/div/div");
    By closeModal = By.xpath("//*[@data-testid=\"btnClose\"]");
    By purchaseButton = By.xpath("//body/div[@id='__next']/main[1]/article[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/*[1]");
    By addToCartIcon = By.xpath("//a[@title=\"Carrinho\"]");
    By productName = By.xpath("//*[@id=\"__next\"]/main/article/section/div[2]/h1");
    By addToCartProductVerify = By.xpath("//*[@id=\"sellersContainer\"]/div/div/div/div[1]/div[1]/a");
    By cookieAccept = By.xpath("//button[@id='onetrust-accept-btn-handler']");



    public addToCart_Page(WebDriver driver){
        this.driver= driver;
    }

    public WebElement setSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement setSearch() {
        return driver.findElement(search);
    }

    public List<WebElement> setFirstNotebook() {
        return driver.findElements(firstNotebook);
    }


    public WebElement setZipCodeOkButton() {
        return driver.findElement(zipCodeOkButton);
    }

    public List<WebElement> setPrintValue() {
        return driver.findElements(printValue);
    }

    public void zipFunction() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('inputCalcularFrete').setAttribute('value', '57955-000')");
        Thread.sleep(2000);
    }

    public void printShippingValue(){
        List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"listaOpcoesFrete\"]/div"));
        for (int i = 0; i < links.size(); i++) {
            System.out.println("Shipping Charges: " + links.get(i).getText());
        }
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public WebElement setCloseModal() {
        return driver.findElement(closeModal);
    }

    public WebElement setPurchaseButton() {
        return driver.findElement(purchaseButton);
    }

    public WebElement setAddToCartIcon() {
        return driver.findElement(addToCartIcon);
    }

    public WebElement setProductName() {
        return driver.findElement(productName);
    }

    public WebElement setAddToCartProductVerify() {
        return driver.findElement(addToCartProductVerify);
    }

    public WebElement setCookieAccept() {
        return driver.findElement(cookieAccept);
    }

}







    