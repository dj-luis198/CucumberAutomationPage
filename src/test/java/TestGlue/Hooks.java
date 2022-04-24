package TestGlue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BrowserManager.DriverManager;
import BrowserManager.DriverManagerFactory;
import BrowserManager.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static WebDriver driver;
	private DriverManager driverManager;

	@Before
	public void setUp() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent, "image/png", "image" + scenario.getId());
		}
		driverManager.quitDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}