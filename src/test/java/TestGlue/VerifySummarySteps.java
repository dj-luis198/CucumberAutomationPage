package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class VerifySummarySteps extends TestBase {

	@When("^Presiona en el boton Check out$")
	public void presionaEnElBotonCheckOut() {
		viewPage.clicBtnProceedToCheckout();
	}

	@Then("^deberia redirigir a la pagina Order$")
	public void deberiaRedirigirALaPaginaOrder() {
		Assert.assertTrue("No nos encontramos en la pagina Order", orderPage.verifyOrderPage());
	}

	@And("el total de la compra deberia ser igual al total esperado {string}")
	public void elTotalDeLaCompraDeberiaSerIgualAlTotalEsperado(String totalEsperado) {
		Assert.assertEquals("el total no es el esperado", totalEsperado, orderPage.totalCompra());
	}

}
