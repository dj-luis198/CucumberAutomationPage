package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class OrderConfirmationPage extends Base {

	private String titleOrderConfirmationPage = "Order confirmation - My Store";

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleOrderConfirmationPage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleOrderConfirmationPage);
			return true;
		}else {
			LOGGER.log(Level.SEVERE, "Comprobacion fallida: No se encuentra en la pagina " + titleOrderConfirmationPage);
			return false;
		}
	}

}
