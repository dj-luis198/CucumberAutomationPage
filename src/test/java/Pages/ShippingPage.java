package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class ShippingPage extends Base {

	private final String checkTermsLocator = "//*[@id=\"cgv\"]";
	private final String btnCheckoutLocator = "//button[@name=\"processCarrier\"]";

	public ShippingPage(WebDriver driver) {
		super(driver);
	}

	public void checkTernsOfService() {
		LOGGER.log(Level.INFO,"Aceptando terminos");
		clic(checkTermsLocator);
	}

	public void clicProceedToCheckoutBtn() {
		LOGGER.log(Level.INFO,"Clic en boton Checkout");
		clic(btnCheckoutLocator);
	}

}
