package pages;

import org.openqa.selenium.WebDriver;

import pages.addToCart.addToCart_Page;


public class PageObjectManager {


    public WebDriver driver;


    public addToCart_Page addToCartPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    public addToCart_Page getCredentialingPage() {
        addToCartPage = new addToCart_Page(driver);
        return addToCartPage;
    }
}
