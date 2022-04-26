package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class YourPaymentMethodPage extends Base {
	private String payByBankWireText = "Pay by bank wire (order processing will be longer)";
	private String payByCheckText = "Pay by check (order processing will be longer)";

	public YourPaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	public void clicBankWire() {
		LOGGER.log(Level.INFO,"Seleccionando metodo de pago By Bank Wire");
		clicLinkText(payByBankWireText);
	}

	public void clicPayByCheck() {
		LOGGER.log(Level.INFO,"Seleccionando metodo de pago By Check");
		clicLinkText(payByCheckText);
	}
}
