package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.TestBase;
import utils.TestContextSetup;

public class Hooks{

    TestContextSetup testContextSetup;
	//public WebDriver driver;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException
	{
		testContextSetup.testBase.WebDriverManager().quit();
	}

	/*@Before("@baseURL")
	public void startTest() throws InterruptedException {
		driver.get("https://google.com");
	}*/
//
//	@AfterStep
//	public void AddScreenshot(Scenario scenario) throws IOException
//	{
//		WebDriver driver =testContextSetup.testBase.WebDriverManager();
//		if(scenario.isFailed())
//		{
//		//screenshot
//		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
//		scenario.attach(fileContent, "image/png", "image");
//
//		}
//
//	}
	
}
