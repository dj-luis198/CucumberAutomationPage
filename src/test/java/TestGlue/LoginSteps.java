package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;


public class LoginSteps extends TestBase {

	@Given("El usuario esta en login page")
	public void elUsuarioEstaEnLoginPage() {
	    loginPage.goToLoginPage();
	    Assert.assertTrue("No esta en la home page", loginPage.verifyPage());
	}
	

	@When("Se logea {string} {string}")
	public void seLogea(String email, String passwd) {
		loginPage.login(email,passwd);
	}

	@Then("^Deveria ser redirigido a la pagina My Account$")
	public void deveriaSerRedirigidoALaPaginaMyAccount() {
		Assert.assertTrue("No esta en la pagina My account - My Store", myAccountPage.checkPage());
	}

	@Then("Deveria Mostrar un mensaje de {string}")
	public void deveriaMostrarUnMensajeDeError(String error){
		Assert.assertTrue("No se mostro mensaje de error!", loginPage.verifyErrorLogin(error));

	}
}
