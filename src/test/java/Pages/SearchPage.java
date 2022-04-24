package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends Base {
	private String titleSearchPage = "Search - My Store";
	private String headingCounterLocator = "//span[@class=\"heading-counter\"]";

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public Boolean verifyPage() {
		if (titleSearchPage.equals(getTitle())) {
			return true;
		}
		return false;
	}

	public String resultSearch() {
		return getText(headingCounterLocator);
	}

	public void clicTextProduct(String text) {
		clicLinkText(text);
	}

}
