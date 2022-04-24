package BrowserManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverManager extends DriverManager{

	@Override
	public void createDriver() {
		//System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\drivers\\geckdriver\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
}
