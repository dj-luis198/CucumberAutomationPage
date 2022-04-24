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
	protected WebDriver driver = Hooks.getDriver();
	protected HomePage homePage = new HomePage(driver);
	protected LoginPage loginPage = new LoginPage(driver);
	protected MyAccountPage myAccountPage = new MyAccountPage(driver);
	protected SearchPage searchPage = new SearchPage(driver);
	protected ViewPage viewPage = new ViewPage(driver);
	protected OrderPage orderPage = new OrderPage(driver);
	protected AddressesPage addressPage = new AddressesPage(driver);
	protected ShippingPage shippingPage = new ShippingPage(driver);
	protected YourPaymentMethodPage yourPaymentMethodPage = new YourPaymentMethodPage(driver);
	protected OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
	protected BankWirePaymentPage bankWirePaymentPage = new BankWirePaymentPage(driver);
	protected CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);
}
