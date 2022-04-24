package Pages;

import org.openqa.selenium.WebDriver;

public class AddressesPage extends Base {

	private String btnProceedToCheckoutLocator = "//button[@name=\"processAddress\"]";

	public AddressesPage(WebDriver driver) {
		super(driver);
	}

	public void clicProceedToCheckoutBtn() {
		clic(btnProceedToCheckoutLocator);
	}
}
