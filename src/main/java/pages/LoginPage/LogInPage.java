package pages.LoginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogInPage {

    public WebDriver driver;

    By userName = By.xpath("//input[@id='Username']");
    By passWord = By.xpath("//input[@id='Password']");
    By login = By.xpath("//button[contains(text(),'Login')]");


    public LogInPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public WebElement setLogin() {
        return driver.findElement(login);
    }

    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passWord).sendKeys(password);
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

}
