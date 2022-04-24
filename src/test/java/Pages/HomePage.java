package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private String titleHomePage = "My Store";
	private String signInText = "Sign in";
	private String searchTopLocator = "//*[@id=\"search_query_top\"]";
	private String urlHomePage="http://automationpractice.com/index.php";
	
	public void goToHomePage() {
		get(urlHomePage);
	}

	public void clicSignIn() {
		clicLinkText(signInText);
	}

	public Boolean verifyPage() {
		if (titleHomePage.equals(getTitle())) {
			return true;
		}
		return false;
	}

	public void searchProduct(String criterio) {
		sendKeys(searchTopLocator, criterio);
		submit(searchTopLocator);
	}
}