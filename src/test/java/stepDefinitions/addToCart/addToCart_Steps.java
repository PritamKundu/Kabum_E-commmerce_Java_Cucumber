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

    /*Constructor*/
    public addToCart_Steps(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.addToCartPage = testContextSetup.pageObjectManager.getCredentialingPage();
    }

    /*Search Notebook*/
    @Given("search notebook")
    public void searchNotebook() throws InterruptedException {
        addToCartPage.setCookieAccept().click();
        Thread.sleep(5000);

        /*need to run firefox browser*/
        addToCartPage.setNotificationDecline().click();
        Thread.sleep(5000);

        addToCartPage.setSearchBox().sendKeys("Notebook");
        Thread.sleep(3000);
        addToCartPage.setSearch().click();
        Thread.sleep(3000);
    }

    /*Click First Notebook*/
    @When("click first notebook")
    public void clickFirstNotebook() throws InterruptedException {
        addToCartPage.scrollDown();
        Thread.sleep(3000);
        addToCartPage.setFirstNotebook().get(0).click();
        Thread.sleep(3000);
        productName = addToCartPage.setProductName().getText();
        Thread.sleep(3000);
    }

    /*Enter Zip Code & Print Shipping Values*/
    @And("enter zip code & print shipping values")
    public void enterZipCodePrintShippingValues() throws InterruptedException {
        addToCartPage.scrollDown();
        addToCartPage.zipFunction();
        Thread.sleep(3000);
        addToCartPage.setZipCodeOkButton().click();
        Thread.sleep(3000);
        addToCartPage.printShippingValue();
        Thread.sleep(3000);
        }

    /*Close the shipping modal box*/
    @When("close the shipping modal box")
    public void closeTheShippingModalBox() throws InterruptedException {
        addToCartPage.setCloseModal().click();
        Thread.sleep(3000);
    }

    /*Click on purchase button*/
    @And("click on purchase button")
    public void clickOnPurchaseButton() throws InterruptedException {
        addToCartPage.setPurchaseButton().click();
        Thread.sleep(5000);
    }

    /*Select warranty 12 months*/
    @When("select warranty +{int} months")
    public void selectWarrantyMonths(int arg0) throws InterruptedException {
        addToCartPage.scrollDown();
        Thread.sleep(3000);
        addToCartPage.setProductWarranty().click();
        Thread.sleep(3000);
    }

    /*Click on add to cart icon*/
    @And("click on add to cart icon")
    public void clickOnAddToCartIcon() throws InterruptedException {
        addToCartPage.setAddToCartIcon().click();
        Thread.sleep(3000);
    }

    /*Validate this product available in this cart*/
    @Then("validate this product available in this cart")
    public void validateThisProductAvailableInThisCart() throws InterruptedException {
        addToCartPage.scrollDown();
        Thread.sleep(3000);
        Assert.assertEquals(addToCartPage.setAddToCartProductVerify().getText(), productName);
        System.out.println("Add to cart product name: " + addToCartPage.setAddToCartProductVerify().getText());
        Thread.sleep(3000);
        System.out.println("First Notebook Name: "+productName);
        Thread.sleep(3000);
    }

}

