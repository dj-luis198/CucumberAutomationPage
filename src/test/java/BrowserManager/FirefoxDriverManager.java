package BrowserManager;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverManager extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\drivers\\geckdriver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
}
