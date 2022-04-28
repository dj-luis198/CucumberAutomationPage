package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class BankWirePaymentPage extends Base {
	private final String btnSubmitLocator = "//*[@class=\"button btn btn-default button-medium\"]";

	public BankWirePaymentPage(WebDriver driver) {
		super(driver);
	}

	public void clicIConfirmMyOrder() {
		LOGGER.log(Level.INFO,"Clic en boton Confirm My Order");
		clic(btnSubmitLocator);
	}

}
