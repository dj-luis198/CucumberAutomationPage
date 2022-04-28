package Pages;

import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class ViewPage extends Base {
	private final String quantityLocator = "//*[@id=\"quantity_wanted\"]";
	private final String sizeLocator = "//*[@id=\"group_1\"]";
	private final String colorLocator = "//*[@name=";
	private final String btnAddToCartLocator = "//*[@id=\"add_to_cart\"]/button";
	private final String msjLocator = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2";
	private final String cartLocator = "//*[@id=\"layer_cart\"]";
	private final String fancyboxLocator = "//*[@id=\"product\"]/div[2]/div";
	private final String btnCheckoutText = "Proceed to checkout";

	public ViewPage(WebDriver driver) {
		super(driver);
	}

	public void quantity(String cantidad) {
		LOGGER.log(Level.INFO,"Ingresando la cantidad: "+cantidad);
		sendKeys(quantityLocator, cantidad);
	}

	public void size(String talle) {
		LOGGER.log(Level.INFO,"Seleccionando talle: "+talle);
		select(sizeLocator, talle);
	}

	public void selectColor(String color) {
		LOGGER.log(Level.INFO,"Seleccionando color: "+color);
		clic(colorLocator + "\"" + color + "\"]");
	}

	public void clicAddToCart() {
		LOGGER.log(Level.INFO,"Clic en boton Add To Cart");
		clic(btnAddToCartLocator);
	}

	public String respObtenida() {
		if (isVisibility(cartLocator)){
			return getText(msjLocator);
		}
		return "El elemento no se desplego";
	}

	public Boolean msjAddToCart(String resp_esperada) {
		LOGGER.log(Level.INFO,"comprobando respuesta");
		if (resp_esperada.equals(respObtenida())) {
			return true;
		}
		return false;
	}

	public String respErrorQuantity() {
		if(isVisibility(fancyboxLocator)){
			return getText(fancyboxLocator);
		}
		return "El elemento no se desplego";
	}

	public Boolean errorQuantity(String resp_esperada) {
		if (resp_esperada.equals(respErrorQuantity())) {
			return true;
		}
		return false;
	}

	public void clicBtnProceedToCheckout() {
		LOGGER.log(Level.INFO,"Clic en boton Checkout");
		clicLinkText(btnCheckoutText);
	}

	public void addToCart(String cantidad, String talle, String color){
		quantity(cantidad);
		size(talle);
		selectColor(color);
		clicAddToCart();
	}
}
