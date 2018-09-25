package common;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AbstractPage extends DriverSettings {
	protected WebDriver driver;

	// webbrowser
	public void openAnyUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void backPage() {
		driver.navigate().back();
	}

	public void forwardPage() {
		driver.navigate().forward();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	// webelement
	public void clickElement(String locName, By locator) {
		Log.info("Click [" + locName + "]");
		driver.findElement(locator).click();
	}

	public void inputTextToElement(String locName, By locator, String text) {
		Log.info("Clear text from [" + locName + "]");
		driver.findElement(locator).clear();
		Log.info("Input text [" + text + "] to [" + locName + "]");
		driver.findElement(locator).sendKeys(text);
	}

	public void selectItemInDropdown(String locName, By locator, String text) {
		Log.info("Select [" + locName + "]");
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(text);
	}

	public String getAttributeValue(String locName, By locator, String text) {
		Log.info("Get value [" + locName + "]");
		return driver.findElement(locator).getAttribute(text);
	}

	public String getTextElement(String locName, By locator) {
		Log.info("Get text [" + locName + "]");
		return driver.findElement(locator).getText();
	}

	public int getSizeElement(String locName, By locator) {
		Log.info("Get size [" + locName + "]");
		int size = 0;
		List<WebElement> elementsList = driver.findElements(locator);
		size = elementsList.size();
		return size;
	}

	public void checkTheCheckBox(String locName, By locator) {
		Log.info("Select the check box [" + locName + "]");
		WebElement checkbox = driver.findElement(locator);
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public void uncheckTheCheckBox(String locName, By locator) {
		Log.info("Unselect the check box [" + locName + "]");
		WebElement checkbox = driver.findElement(locator);
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public Boolean isControlDisplayed(String locName, By locator) {
		Log.info("Verify that [" + locName + "] is displayed");
		return driver.findElement(locator).isDisplayed();
	}

	public Boolean isControlSelected(String locName, By locator) {
		Log.info("Verify that [" + locName + "] is selected ");
		return driver.findElement(locator).isSelected();
	}

	public Boolean isControlEnable(String locName, By locator) {
		Log.info("Verify that [" + locName + "] is enable");
		return driver.findElement(locator).isEnabled();
	}

	public void acceptAlert(String locName) {
		Log.info("Accepted [" + locName + "]");
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert(String locName) {
		Log.info("Cancel [" + locName + "]");
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert(String locName) {
		Log.info("Get text [" + locName + "]");
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendkeyToAlert(String locName, String text) {
		Log.info("Input value [" + locName + "] to alert");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

	public Boolean isElementVisible(String locName, By locator) {
		Log.info("Click [" + locName + "]");
		return true;
	}

}
