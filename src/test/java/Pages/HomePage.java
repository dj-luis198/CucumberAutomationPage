package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class HomePage extends Base {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private final String titleHomePage = "My Store";
	//private final String signInText = "Sign in";
	private final String searchTopLocator = "//*[@id=\"search_query_top\"]";
	private final String urlHomePage="http://automationpractice.com/index.php";
	
	public void goToHomePage() {
		get(urlHomePage);
	}

	/*public void clicSignIn() {
		clicLinkText(signInText);
	}*/

	public Boolean verifyPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleHomePage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleHomePage);
			return true;
		} else {
			LOGGER.log(Level.SEVERE,"Comprobacion fallida: No se encuentra en la pagina "+titleHomePage);
			return false;
		}
	}

	public void searchProduct(String criterio) {
		LOGGER.log(Level.INFO,"Ingresando producto a buscar: "+criterio);
		sendKeys(searchTopLocator, criterio);
		LOGGER.log(Level.INFO,"Buscando producto: "+criterio);
		submit(searchTopLocator);
	}
}