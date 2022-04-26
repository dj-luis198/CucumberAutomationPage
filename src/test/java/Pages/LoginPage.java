package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private String emailLocator = "//*[@id=\"email\"]";
	private String passwdLocator = "//*[@id=\"passwd\"]";
	private String signInButtonLocator = "//*[@id=\"SubmitLogin\"]";
	private String alertErrorLocator = "//*[@id=\"center_column\"]/div[1]/ol";
	private String alertErrorAccountLocator = "//*[@id=\"create_account_error\"]/ol";
	private String emailAccountLocator = "//*[@id=\"email_create\"]";
	private String btnAccountLocator = "//*[@id=\"SubmitCreate\"]";
	private String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	private String titleLoginPage="Login - My Store";
	
	public void goToLoginPage() {
		get(url);
	}
	
	public Boolean verifyPage() {
		LOGGER.log(Level.INFO,"Comprobando el titulo de la pagina");
		if (titleLoginPage.equals(getTitle())) {
			LOGGER.log(Level.INFO,"Comprobacion exitosa: se encuentra en la pagina "+titleLoginPage);
			return true;
		}else {
			LOGGER.log(Level.SEVERE,"Comprobacion fallida: No se encuentra en la pagina "+titleLoginPage);
			return false;
		}
	}

	public void sendEmail(String email) {
		LOGGER.log(Level.INFO,"Ingresando email: "+email);
		sendKeys(emailLocator, email);
	}

	public void sendPasswd(String passwd) {
		LOGGER.log(Level.INFO,"Ingresando passwd: "+passwd);
		sendKeys(passwdLocator, passwd);
	}

	public void clicButtonSignIn() {
		LOGGER.log(Level.INFO,"Clic en boton Sign In");
		clic(signInButtonLocator);
	}

	public Boolean verifyErrorLogin() throws Exception {
		if (isDisplayedError(alertErrorAccountLocator)) {
			System.out.println("Mensaje de error mostrado: " + getText(alertErrorAccountLocator));
			return true;
		}
		return false;
	}

	public Boolean verifyErrorLogin(String error) throws InterruptedException {
		if (isDisplayed(alertErrorLocator) && getText(alertErrorLocator).equals(error)) {
			System.out.println("Mensaje de error mostrado: " + getText(alertErrorLocator));
			return true;
		}
		return false;
	}

	public void emailAccount(String email) {
		LOGGER.log(Level.INFO,"Ingresando email: "+email);
		sendKeys(emailAccountLocator, email);
	}

	public void clicButtonCreate() {
		LOGGER.log(Level.INFO,"Clic en boton Create Account");
		clic(btnAccountLocator);
	}

}
