package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class AddToCartSteps extends TestBase {

	@And("Selecciona el producto {string}")
	public void seleccionaElProducto(String nombre) {
		searchPage.clicTextProduct(nombre);
	}

	@And("agrega el producto al carrito {string} {string} {string}")
	public void agregaElProductoAlCarrito(String cantidad, String talle, String color) {
		viewPage.quantity(cantidad);
		viewPage.size(talle);
		viewPage.selectColor(color);
		viewPage.clicAddToCart();
	}

	@Then("deveria mostrar un mensaje de confirmacion {string}")
	public void deveriaMostrarUnMensajeDeConfirmacion(String resp_esperada) {
		Assert.assertTrue("La respuesta obtenida no es la esperada, " + "respuesta esperada: " + resp_esperada + " "
				+ "respuesta obtenida: " + viewPage.respObtenida(), viewPage.msjAddToCart(resp_esperada));
	}

	@Then("deveria mostrar un mensaje de error {string}")
	public void deveriaMostrarUnMensajeDeError(String resp_esperada) {
		Assert.assertTrue("La respuesta obtenida no es la esperada, " + "respuesta esperada: " + resp_esperada + " "
				+ "respuesta obtenida: " + viewPage.respErrorQuantity(), viewPage.errorQuantity(resp_esperada));
	}

}
