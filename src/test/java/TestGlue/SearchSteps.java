package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class SearchSteps extends TestBase {
	
	@Given("^El usuario esta en la home page$")
	public void elUsuarioEstaEnLaHomePage() {
		homePage.goToHomePage();
		Assert.assertTrue("No esta en la home page", homePage.verifyPage());

	}

	@When("realiza la busqueda de un producto {string}")
	public void realizaLaBusquedaDeUnProducto(String criterio) {
		homePage.searchProduct(criterio);
	}

	@Then("deveria de mostrar un listado de productos encontrados {string}")
	public void deveriaDeMostrarUnListadoDeProductosEncontrados(String resp_esperada) {

		Assert.assertTrue("No se encuentra en la pagina de resultados de busquedas!", searchPage.verifyPage());
		Assert.assertEquals("la cantidad de resultados no es la esperada: Esperada: " + "" + resp_esperada
				+ " obtenida: " + searchPage.resultSearch(), searchPage.resultSearch(), resp_esperada);
	}
}
