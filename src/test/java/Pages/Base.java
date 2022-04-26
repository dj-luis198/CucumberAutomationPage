package Pages;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LogHelper;

public class Base {
	private static WebDriver driver;
	protected static final Logger LOGGER = LogHelper.getLogger();

	public Base(WebDriver driver) {
		Base.driver = driver;
	}
	
	

	/************************************* findElement	 *********************************/

	private static WebElement findElement(String locator) {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("El locator " + locator + " no fue encontrado");
		}
	}

	private static WebElement findElementLinkText(String locator) {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("El locator " + locator + " no fue encontrado");
		}
	}

	protected static List<WebElement> findElements(String locator) {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("El locator " + locator + " no fue encontrado");
		}
	}

	private static List<WebElement> findElementsName(String locator) {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("WebElement " + locator + " no encontrado: " + e);

		}
	}

	/********************************* clic ********************************/

	protected static void clic(String locator) {
		findElement(locator).click();
	}

	protected static void clicLinkText(String locator) {
		findElementLinkText(locator).click();
	}

	protected static void clicRadioButton(String locator, String text) {
		List<WebElement> radioButton = findElementsName(locator);
		for (WebElement r : radioButton) {
			if (r.getAttribute("value").equalsIgnoreCase(text)) {
				if (!r.isSelected()) {
					r.click();
				}
			}
		}
	}

	/********************************* get ********************************/
	protected void get(String url) {
		driver.get(url);
	}

	protected static int getSizeListWebElements(String locator) {
		return findElements(locator).size();
	}

	protected static String getTitle() {
		return driver.getTitle();
	}

	protected static String getText(String locator) {
		return findElement(locator).getText();
	}

	/**************************** isDisplayed, isVisibility, isSelected,isDisplayedError ***************************/

	protected static Boolean isDisplayedError(String locator) throws Exception {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).isDisplayed();
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	protected static Boolean isDisplayed(String locator) {
		return findElement(locator).isDisplayed();
	}

	protected static WebElement isVisibility(String locator) {
		try {
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
			throw new Error("El locator " + locator + " no fue encontrado");
		}
	}

	protected static Boolean isSelected(String locator) {
		return findElement(locator).isSelected();
	}

	protected static Boolean isEnabled(String locator) {
		return findElement(locator).isEnabled();
	}

	/**************************** select, selectByValue, selectByText **************************/

	protected static void select(String locator, String text) {
		Select select = new Select(findElement(locator));
		select.selectByVisibleText(text);
	}

	protected static void selectByValue(String locator, String value) {
		new Select(findElement(locator)).selectByValue(value);
	}

	protected static void selectByText(String locator, String text) {
		new Select(findElement(locator)).selectByVisibleText(text);
	}

	/********************************* otros *********************************/

	private static void clear(String locator) {
		findElement(locator).clear();
	}

	protected static Boolean verifyAttributeValue(String locator, String text) {
		if (findElement(locator).getAttribute("value").equals(text)) {
			return true;
		} else {
			return false;
		}
	}

	protected static void selectCheckbox(String locator) {
		findElement(locator).click();
	}

	protected static void sendKeys(String locator, String text) {
		clear(locator);
		findElement(locator).sendKeys(text);
	}

	protected static void submit(String locator) {
		findElement(locator).submit();
	}

}
