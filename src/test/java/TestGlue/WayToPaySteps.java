package TestGlue;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class WayToPaySteps extends TestBase {

	@When("^Presiona el boton Proceed to checkout desde order page$")
	public void presionaElBotonProceedToCheckoutDesdeOrderPage() {
		orderPage.clicBtnProceedToCheckout();
	}

	@And("^Presiona el boton Proceed to checkout desde Addresses page$")
	public void presionaElBotonProceedToCheckoutDesdeAddressesPage() {
		addressPage.clicProceedToCheckoutBtn();
	}

	@And("^Presiona el boton Proceed to checkout desde Shipping page$")
	public void presionaElPotonProceedToCheckoutDesdeShippingPage() {
		shippingPage.checkTernsOfService();
		shippingPage.clicProceedToCheckoutBtn();
	}

	@And("^Selecciona la opcion Pay by bank wire$")
	public void seleccionaLaOpcionPayByBankWire() {
		yourPaymentMethodPage.clicBankWire();
	}

	@And("^Presiona el boton I confirm my order$")
	public void presionaElBotonIConfirmMyOrder() {
		bankWirePaymentPage.clicIConfirmMyOrder();
	}

	@Then("^Es redireccionado a la pagina Order Confirmation$")
	public void esRedireccionadoALaPaginaOrderConfirmation() {
		Assert.assertTrue("No esta en la Order Confirmation Page", orderConfirmationPage.verifyPage());
	}

	@And("^Selecciona la opcion Pay by check$")
	public void seleccionaLaOpcionPayByCheck() {
		yourPaymentMethodPage.clicPayByCheck();
	}
}
