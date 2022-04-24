package Pages;

import org.openqa.selenium.WebDriver;

public class BankWirePaymentPage extends Base {
	private String btnSubmitLocator = "//*[@class=\"button btn btn-default button-medium\"]";

	public BankWirePaymentPage(WebDriver driver) {
		super(driver);
	}

	public void clicIConfirmMyOrder() {
		clic(btnSubmitLocator);
	}

}
