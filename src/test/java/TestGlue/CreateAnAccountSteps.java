package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class CreateAnAccountSteps extends TestBase {

	@And("Ingresa a la pagina Create an account {string}")
	public void ingresaALaPaginaCreateAnAccount(String email){
		loginPage.goToCreateAccount(email);
		Assert.assertFalse("Se a desplegado un mensaje de error", loginPage.verifyErrorLogin());
	}

	@When("Ingresa los datos personales {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void ingresaLosDatosPersonales(String genero, String nombre, String apellido, String email, String passwd,
			String diaNac, String mesNac, String anioNac, String newsletter, String offers) {

		createAnAccountPage.yourPersonalInformation(genero,nombre,apellido,email, passwd,diaNac,mesNac,anioNac,newsletter,offers);
	}

	@And("Ingresa datos de domicilio {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void ingresaDatosDeDomicilio(String nombre, String apellido, String compania, String direccion1,
			String direccion2, String pais, String estado, String ciudad, String codPostal, String infoAdicional,
			String telefono, String celular, String alias) {

		createAnAccountPage.yourAddress(nombre,apellido,compania,direccion1,direccion2,pais,estado,ciudad,
				codPostal,infoAdicional,telefono,celular,alias);
	}

	@And("^presiona el boton de registro$")
	public void presionaElBotonDeRegistro() {
		createAnAccountPage.clicButtonRegister();
	}

	@Then("^deberia ser redirigido a la pagina My account$")
	public void deberiaSerRedirigidoALaPaginaMyAccount() {
		Assert.assertTrue("No se encuentra en My Account Page", myAccountPage.checkPage());
	}

	@And("deberia mostrar mi apelledo y nombre {string} {string}")
	public void deberiaMostrarMiApelledoYNombre(String nombre, String Apellido) {
		Assert.assertTrue("El nombre en la cuenta no es correcto",
				myAccountPage.verifyNameAccount(nombre + " " + Apellido));
	}

	@When("Ingresa los datos personales {string} {string} {string} {string}")
	public void ingresaLosDatosPersonales(String nombre, String apellido, String email, String passwd) {

		createAnAccountPage.yourPersonalInformation(nombre,apellido,email,passwd);
	}

	@When("Ingresa datos de domicilio {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void ingresa_datos_de_domicilio(String nombre, String apellido, String direccion1, String pais,
			String estado, String ciudad, String codPostal, String celular, String alias) {

		createAnAccountPage.yourAddress(nombre,apellido,direccion1,pais,estado,ciudad,codPostal,celular,alias);
	}

	@Then("deberia mostrar un mensaje de error {string}")
	public void deberiaMostrarUnMensajeDeErrorFirstnameIsInvalid(String error){
		Assert.assertTrue("No se mostro mensaje de error!", createAnAccountPage.verifyErrorCreateAccount(error));
	}
	




}
