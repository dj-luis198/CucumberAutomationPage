package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class SearchPage extends Base {
	private String titleSearchPage = "Search - My Store";
	private String headingCounterLocator = "//span[@class=\"heading-counter\"]";

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public Boolean verifyPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleSearchPage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleSearchPage);
			return true;
		}else {
			LOGGER.log(Level.SEVERE, "Comprobacion fallida: No se encuentra en la pagina " + titleSearchPage);
			return false;
		}
	}

	public String resultSearch() {
		LOGGER.log(Level.INFO,"Comprobando resultado de la busqueda");
		return getText(headingCounterLocator);
	}

	public void clicTextProduct(String text) {
		LOGGER.log(Level.INFO,"Clic en el producto: "+text);
		clicLinkText(text);
	}

}
