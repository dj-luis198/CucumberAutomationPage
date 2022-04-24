package BrowserManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverManager extends DriverManager{

	
	@Override
	public void createDriver() {
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
}
