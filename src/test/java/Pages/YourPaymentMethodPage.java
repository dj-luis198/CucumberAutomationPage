package Pages;

import org.openqa.selenium.WebDriver;

public class YourPaymentMethodPage extends Base {
	private String payByBankWireText = "Pay by bank wire (order processing will be longer)";
	private String payByCheckText = "Pay by check (order processing will be longer)";

	public YourPaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	public void clicBankWire() {
		clicLinkText(payByBankWireText);
	}

	public void clicPayByCheck() {
		clicLinkText(payByCheckText);
	}
}
