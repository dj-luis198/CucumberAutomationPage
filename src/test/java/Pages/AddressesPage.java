package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class AddressesPage extends Base {

	private String btnProceedToCheckoutLocator = "//button[@name=\"processAddress\"]";

	public AddressesPage(WebDriver driver) {
		super(driver);
	}

	public void clicProceedToCheckoutBtn() {
		LOGGER.log(Level.INFO,"Clic en boton Proceed To Checkout");
		clic(btnProceedToCheckoutLocator);
	}
}
