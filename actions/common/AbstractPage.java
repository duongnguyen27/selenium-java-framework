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
	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}
public void clickElement(String locName, By locator) {
		Log.info("Click [" + locName + "]");
		driver.findElement(locator).click();
	}
	public void sendkeyToElement(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
	public void inputTextToElement(String locName, By locator, String text) {
		Log.info("Clear text from [" +  locName + "]");
		driver.findElement(locator).clear();
		Log.info("Input text [" + text + "] to [" +  locName + "]");
		driver.findElement(locator).sendKeys(text);
	}
	public void selectItemInDropdown(By locator, String text) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(text);
	}

	public String getAttributeValue(By locator, String text) {
		return driver.findElement(locator).getAttribute(text);
	}

	public String getTextElement(By locator) {
		return driver.findElement(locator).getText();
	}

	public int getSizeElement(By locator) {
		int size = 0;
		List<WebElement> elementsList = driver.findElements(locator);
		size = elementsList.size();
		return size;
	}

	public void checkTheCheckBox(By locator) {
		WebElement checkbox = driver.findElement(locator);
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public void uncheckTheCheckBox(By locator) {
		WebElement checkbox = driver.findElement(locator);
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public Boolean isControlDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public Boolean isControlSelected(By locator) {
		return driver.findElement(locator).isSelected();
	}

	public Boolean isControlEnable(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendkeyToAlert(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}
	
	public String getElementText(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}
		
	public String getElementText(String locName, By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}
	public Boolean isElementVisible(By locator) {
		return true;
	}
		public Boolean isElementVisible(String locName, By locator) {
		return true;
	}
	public void inputTextToElement(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
}
