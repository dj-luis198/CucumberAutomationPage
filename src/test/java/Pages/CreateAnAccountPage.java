package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class CreateAnAccountPage extends Base {

	private String radioButtonGenderLocator = "id_gender";
	private String firstNameLocator = "//*[@id=\"customer_firstname\"]";
	private String lastNameLocator = "//*[@id=\"customer_lastname\"]";
	private String emailLocator = "//*[@id=\"email\"]";
	private String passwdLocator = "//*[@id=\"passwd\"]";
	private String daysLocator = "//*[@id=\"days\"]";
	private String monthsLocator = "//*[@id=\"months\"]";
	private String yearsLocator = "//*[@id=\"years\"]";
	private String checkboxNewsletter = "//*[@id=\"newsletter\"]";
	private String checkboxOptin = "//*[@id=\"optin\"]";
	private String companyLocator = "//*[@id=\"company\"]";
	private String address1Locator = "//*[@id=\"address1\"]";
	private String address2Locator = "//*[@id=\"address2\"]";
	private String cityLocator = "//*[@id=\"city\"]";
	private String countryLocator = "//*[@id=\"id_country\"]";
	private String stateLocator = "//*[@id=\"id_state\"]";
	private String postalCodeLocator = "//*[@id=\"postcode\"]";
	private String additionalInfoLocator = "//*[@id=\"other\"]";
	private String phoneLocator = "//*[@id=\"phone\"]";
	private String phoneMobileLocator = "//*[@id=\"phone_mobile\"]";
	private String aliasAddressLocator = "//*[@id=\"alias\"]";
	private String registerButtonLocator = "//*[@id=\"submitAccount\"]";
	private String firstNameVerifyLocator = "//*[@id=\"firstname\"]";
	private String lastNameVerifyLocator = "//*[@id=\"lastname\"]";
	private String alertErrorLocator = "//*[@id=\"center_column\"]/div/ol";

	public CreateAnAccountPage(WebDriver driver) {
		super(driver);
	}

	public Boolean verifyErrorCreateAccount(String error) throws InterruptedException {
		LOGGER.log(Level.INFO,"Comprobando si hay errores");
		if (isDisplayed(alertErrorLocator)) {
			String text = getText(alertErrorLocator).replaceAll("\\r|\\n", "").replaceAll(" ", "");
			String errorExp = error.replaceAll("\\r|\\n", "").replaceAll(" ", "");
			if (text.equals(errorExp)) {
				System.out.println("Mensaje de error mostrado: " + getText(alertErrorLocator));
				return true;
			} else {
				System.out.println("Mensaje de error mostrado: " + getText(alertErrorLocator));
				return false;
			}
		} else {
			System.out.println("Mensaje de error mostrado: " + getText(alertErrorLocator));
			System.out.println("Mensaje de error esperado: " + error);
			return false;
		}

	}

	public void selectGender(String gender) {
		LOGGER.log(Level.INFO,"Seleccionando genero: "+gender);
		String genderMr = "Mr.";
		if (gender.equals(genderMr)) {
			clicRadioButton(radioButtonGenderLocator, "1");
		} else {
			clicRadioButton(radioButtonGenderLocator, "2");
		}
	}

	public void sendFirstName(String firstName) {
		LOGGER.log(Level.INFO,"Ingresando nombre: "+firstName);
		sendKeys(firstNameLocator, firstName);
	}

	public void sendLastName(String lastName) {
		LOGGER.log(Level.INFO,"Ingresando apellido: "+lastName);
		sendKeys(lastNameLocator, lastName);
	}

	public void verifyEmail(String email) {
		LOGGER.log(Level.INFO,"Comprobando email: "+email);
		if (!verifyAttributeValue(emailLocator, email)) {
			throw new Error("La cuenta ingesada no es igual a la mostrada");
		} else
			LOGGER.log(Level.INFO,"Los emails coinciden");
	}

	public void verifyFirstName(String firstName) {
		LOGGER.log(Level.INFO,"Comprobando nombre: "+firstName);
		if (!verifyAttributeValue(firstNameVerifyLocator, firstName)) {
			throw new Error("El nombre ingesado no es igual a la mostrado");
		} else
			LOGGER.log(Level.INFO,"Los nombres coinciden");
	}

	public void verifyLastName(String lastName) {
		LOGGER.log(Level.INFO,"Comprobando apellido: "+lastName);
		if (!verifyAttributeValue(lastNameVerifyLocator, lastName)) {
			throw new Error("El apellido ingesado no es igual a la mostrado");
		} else
			LOGGER.log(Level.INFO,"Los apellidos coinciden");
	}

	public void sendPasswd(String passwd) {
		LOGGER.log(Level.INFO,"Ingresando passwd: "+passwd);
		sendKeys(passwdLocator, passwd);
	}

	public void selectDateOfBirth(String day, String month, String year) {
		LOGGER.log(Level.INFO,"Ingresando fecha de nacimiento: "+day+"-"+month+"-"+year);
		selectByValue(daysLocator, day);
		selectByValue(monthsLocator, month);
		selectByValue(yearsLocator, year);
	}

	public void selectCheckboxs(String check1, String check2) {
		LOGGER.log(Level.INFO,"Seleccionando checkboxs");
		String yes = "yes";
		if (check1.equals(yes) && check2.equals(yes)) {
			if (!isSelected(checkboxNewsletter)) {
				selectCheckbox(checkboxNewsletter);
			}
			if (!isSelected(checkboxOptin)) {
				selectCheckbox(checkboxOptin);
			}

		} else {
			if (check1.equals(yes)) {
				if (!isSelected(checkboxNewsletter)) {
					selectCheckbox(checkboxNewsletter);
				}
			} else {
				if (check2.equals(yes)) {
					if (!isSelected(checkboxOptin)) {
						selectCheckbox(checkboxOptin);
					}
				}
			}
		}
	}

	public void sendCompany(String company) {
		LOGGER.log(Level.INFO,"Ingresando compania: "+company);
		sendKeys(companyLocator, company);
	}

	public void sendAddress1(String address) {
		LOGGER.log(Level.INFO,"Ingresando direccion: "+address);
		sendKeys(address1Locator, address);
	}

	public void sendAddress2(String address) {
		LOGGER.log(Level.INFO,"Ingresando detalle de direccion: "+address);
		sendKeys(address2Locator, address);
	}

	public void sendCity(String city) {
		LOGGER.log(Level.INFO,"Ingresando ciudad: "+city);
		sendKeys(cityLocator, city);
	}

	public void selectCountry(String country) {
		LOGGER.log(Level.INFO,"Seleccionando pais: "+country);
		selectByText(countryLocator, country);
	}

	public void selectState(String state) {
		LOGGER.log(Level.INFO,"Seleccionando estado: "+state);
		selectByText(stateLocator, state);
	}

	public void sendPostalCode(String postalCode) {
		LOGGER.log(Level.INFO,"Ingresando codigo postal: "+postalCode);
		sendKeys(postalCodeLocator, postalCode);
	}

	public void sendAdditionalInformation(String addInfo) {
		LOGGER.log(Level.INFO,"Ingresando informacion adicional: "+addInfo);
		sendKeys(additionalInfoLocator, addInfo);
	}

	public void sendPhone(String phone) {
		LOGGER.log(Level.INFO,"Ingresando telefono fijo: "+phone);
		sendKeys(phoneLocator, phone);
	}

	public void sendPhoneMobile(String phoneMobile) {
		LOGGER.log(Level.INFO,"Ingresando celular: "+phoneMobile);
		sendKeys(phoneMobileLocator, phoneMobile);
	}

	public void sendAliasAddress(String aliasAddress) {
		LOGGER.log(Level.INFO,"Ingresando alias: "+aliasAddress);
		sendKeys(aliasAddressLocator, aliasAddress);
	}

	public void clicButtonRegister() {
		LOGGER.log(Level.INFO,"Clic en boton Register");
		clic(registerButtonLocator);
	}

}
