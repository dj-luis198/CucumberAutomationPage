package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class OrderPage extends Base {

	private String titleOrderPage = "Order - My Store";
	private String totalPriceLocator = "//*[@id=\"total_price\"]";
	private String ProceedToCheckoutText = "Proceed to checkout";

	public OrderPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOrderPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleOrderPage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleOrderPage);
			return true;
		}else {
			LOGGER.log(Level.SEVERE, "Comprobacion fallida: No se encuentra en la pagina " + titleOrderPage);
			return false;
		}
	}

	public String totalCompra() {
		LOGGER.log(Level.INFO,"Capturando monto total");
		return getText(totalPriceLocator);
	}

	public void clicBtnProceedToCheckout() {
		LOGGER.log(Level.INFO,"Clic en boton Proceed To Checkout");
		clicLinkText(ProceedToCheckoutText);
	}
}
