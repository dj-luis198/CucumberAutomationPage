package TestGlue;

import org.openqa.selenium.WebDriver;

import Pages.AddressesPage;
import Pages.BankWirePaymentPage;
import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.OrderConfirmationPage;
import Pages.OrderPage;
import Pages.SearchPage;
import Pages.ShippingPage;
import Pages.ViewPage;
import Pages.YourPaymentMethodPage;

public class TestBase {
	protected final WebDriver driver = Hooks.getDriver();
	protected final HomePage homePage = new HomePage(driver);
	protected final LoginPage loginPage = new LoginPage(driver);
	protected final MyAccountPage myAccountPage = new MyAccountPage(driver);
	protected final SearchPage searchPage = new SearchPage(driver);
	protected final ViewPage viewPage = new ViewPage(driver);
	protected final OrderPage orderPage = new OrderPage(driver);
	protected final AddressesPage addressPage = new AddressesPage(driver);
	protected final ShippingPage shippingPage = new ShippingPage(driver);
	protected final YourPaymentMethodPage yourPaymentMethodPage = new YourPaymentMethodPage(driver);
	protected final OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
	protected final BankWirePaymentPage bankWirePaymentPage = new BankWirePaymentPage(driver);
	protected final CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);
}
