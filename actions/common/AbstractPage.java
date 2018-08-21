package common;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AbstractPage {
	protected static WebDriver driver;

	// webbrowser
	public static void openAnyUrl(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public static String getPageSource() {
		return driver.getPageSource();
	}

	public static void backPage() {
		driver.navigate().back();
	}

	public static void forwardPage() {
		driver.navigate().forward();
	}

	public static void refreshPage() {
		driver.navigate().refresh();
	}

	// webelement
	public static void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public static void sendkeyToElement(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void selectItemInDropdown(By locator, String text) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(text);
	}

	public static String getAttributeValue(By locator, String text) {
		return driver.findElement(locator).getAttribute(text);
	}

	public static String getTextElement(By locator) {
		return driver.findElement(locator).getText();
	}

	public static int getSizeElement(By locator) {
		int size = 0;
		List<WebElement> elementsList = driver.findElements(locator);
		size = elementsList.size();
		return size;
	}

	public static void checkTheCheckBox(By locator) {
		WebElement checkbox = driver.findElement(locator);
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public static void uncheckTheCheckBox(By locator) {
		WebElement checkbox = driver.findElement(locator);
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public static Boolean isControlDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public static Boolean isControlSelected(By locator) {
		return driver.findElement(locator).isSelected();
	}

	public static Boolean isControlEnable(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public static void sendkeyToAlert(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}
}
