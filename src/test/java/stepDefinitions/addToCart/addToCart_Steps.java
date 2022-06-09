package stepDefinitions.addToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.addToCart.addToCart_Page;
import utils.TestContextSetup;


public class addToCart_Steps {

    String productName = "";

    TestContextSetup testContextSetup;
    addToCart_Page addToCartPage;


    public addToCart_Steps(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.addToCartPage = testContextSetup.pageObjectManager.getCredentialingPage();
    }

    @Given("search notebook")
    public void searchNotebook() throws InterruptedException {
        addToCartPage.setCookieAccept().click();
        Thread.sleep(2000);
        addToCartPage.setSearchBox().sendKeys("Notebook");
        Thread.sleep(2000);
        addToCartPage.setSearch().click();
        Thread.sleep(2000);
    }


    @When("click first notebook")
    public void clickFirstNotebook() throws InterruptedException {
        addToCartPage.setFirstNotebook().get(1).click();
        Thread.sleep(2000);
        productName = addToCartPage.setProductName().getText();
    }

    @And("enter zip code & print shipping values")
    public void enterZipCodePrintShippingValues() throws InterruptedException {
        addToCartPage.scrollDown();
        addToCartPage.zipFunction();
        Thread.sleep(2000);
        addToCartPage.setZipCodeOkButton().click();
        Thread.sleep(2000);
        addToCartPage.printShippingValue();
        Thread.sleep(2000);
        }

    @When("close the shipping modal box")
    public void closeTheShippingModalBox() throws InterruptedException {
        addToCartPage.setCloseModal().click();
        Thread.sleep(2000);
    }

    @And("click on purchase button")
    public void clickOnPurchaseButton() throws InterruptedException {
        addToCartPage.setPurchaseButton().click();
        Thread.sleep(2000);
    }

    @When("click on add to cart icon")
    public void clickOnAddToCartIcon() throws InterruptedException {
        addToCartPage.setAddToCartIcon().click();
        Thread.sleep(2000);
    }

    @Then("validate this product available in this cart")
    public void validateThisProductAvailableInThisCart() throws InterruptedException {
        addToCartPage.scrollDown();
        Thread.sleep(2000);
        Assert.assertEquals(addToCartPage.setAddToCartProductVerify().getText(), productName);
        System.out.println("Add to cart product name: " + addToCartPage.setAddToCartProductVerify().getText());
        System.out.println("First Notebook Name: "+productName);
        Thread.sleep(3000);
    }

}

