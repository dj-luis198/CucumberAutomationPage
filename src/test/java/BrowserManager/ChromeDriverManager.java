package BrowserManager;

import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverManager extends DriverManager{

	
	@Override
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel\\eclipse-workspace\\CucumberAutomationPage\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
}
