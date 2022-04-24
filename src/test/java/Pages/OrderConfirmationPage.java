package Pages;

import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends Base {

	private String titleOrderConfirmationPage = "Order confirmation - My Store";

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyPage() {
		if (titleOrderConfirmationPage.equals(getTitle())) {
			return true;
		}
		return false;
	}

}
