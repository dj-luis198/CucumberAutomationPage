package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class MyAccountPage extends Base {

	private final String nameAccountLocator = "//a[@class=\"account\"]";
	private final String titleMyAccountPage = "My account - My Store";

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public Boolean checkPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleMyAccountPage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleMyAccountPage);
			return true;
		}else {
			LOGGER.log(Level.SEVERE,"Comprobacion fallida: No se encuentra en la pagina "+titleMyAccountPage);
			return false;
		}
	}

	public boolean verifyNameAccount(String text) {
		LOGGER.log(Level.INFO,"Comprobando nombre de usuario");
		if (text.equals(getText(nameAccountLocator))) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa, nombre de usuario: "+text);
			return true;
		}else {
			LOGGER.log(Level.WARNING, "Comprobacion fallida, nombre de usuario incorrecto: " + getText(nameAccountLocator));
			return false;
		}
	}

}
