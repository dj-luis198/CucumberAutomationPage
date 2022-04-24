package Pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Base {

	private String nameAccountLocator = "//a[@class=\"account\"]";

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	private String pageTitle = "My account - My Store";

	public Boolean checkPage() {
		if (pageTitle.equals(getTitle())) {
			return true;
		}
		return false;
	}

	public boolean verifyNameAccount(String text) {
		if (text.equals(getText(nameAccountLocator))) {
			return true;
		}
		return false;
	}

}
