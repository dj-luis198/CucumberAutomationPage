package Pages;

import org.openqa.selenium.WebDriver;

public class ShippingPage extends Base {

	private String checkTermsLocator = "//*[@id=\"cgv\"]";
	private String btnCheckoutLocator = "//button[@name=\"processCarrier\"]";

	public ShippingPage(WebDriver driver) {
		super(driver);
	}

	public void checkTernsOfService() {
		clic(checkTermsLocator);
	}

	public void clicProceedToCheckoutBtn() {
		clic(btnCheckoutLocator);
	}

}
