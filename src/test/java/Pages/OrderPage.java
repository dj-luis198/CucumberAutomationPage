package Pages;

import org.openqa.selenium.WebDriver;

public class OrderPage extends Base {

	private String titleOrderPage = "Order - My Store";
	private String totalPriceLocator = "//*[@id=\"total_price\"]";
	private String ProceedToCheckoutText = "Proceed to checkout";

	public OrderPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOrderPage() {
		if (titleOrderPage.equals(getTitle())) {
			return true;
		}
		return false;
	}

	public String totalCompra() {
		return getText(totalPriceLocator);
	}

	public void clicBtnProceedToCheckout() {
		clicLinkText(ProceedToCheckoutText);
	}
}
