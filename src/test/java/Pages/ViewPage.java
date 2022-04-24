package Pages;

import org.openqa.selenium.WebDriver;

public class ViewPage extends Base {
	private String quantityLocator = "//*[@id=\"quantity_wanted\"]";
	private String sizeLocator = "//*[@id=\"group_1\"]";
	private String colorLocator = "//*[@name=";
	private String btnAddToCartLocator = "//*[@id=\"add_to_cart\"]/button";
	private String msjLocator = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2";
	private String cartLocator = "//*[@id=\"layer_cart\"]";
	private String fancyboxLocator = "//*[@id=\"product\"]/div[2]/div";
	private String btnCheckoutText = "Proceed to checkout";

	public ViewPage(WebDriver driver) {
		super(driver);
	}

	public void quantity(String cantidad) {
		sendKeys(quantityLocator, cantidad);
	}

	public void size(String talle) {
		select(sizeLocator, talle);
	}

	public void selectColor(String color) {
		clic(colorLocator + "\"" + color + "\"]");
	}

	public void clicAddToCart() {
		clic(btnAddToCartLocator);
	}

	public String respObtenida() {
		isVisibility(cartLocator);
		return getText(msjLocator);
	}

	public Boolean msjAddToCart(String resp_esperada) {
		if (resp_esperada.equals(respObtenida())) {
			return true;
		}
		return false;
	}

	public String respErrorQuantity() {
		isVisibility(fancyboxLocator);
		return getText(fancyboxLocator);
	}

	public Boolean errorQuantity(String resp_esperada) {
		if (resp_esperada.equals(respErrorQuantity())) {
			return true;
		}
		return false;
	}

	public void clicBtnProceedToCheckout() {
		clicLinkText(btnCheckoutText);
	}
}
