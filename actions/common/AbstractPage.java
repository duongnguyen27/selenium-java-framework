package common;

import org.openqa.selenium.By;

public class AbstractPage extends DriverSettings {
	
	public void clickElement(String locName, By locator) {
		Log.info("Click [" + locName + "]");
		driver.findElement(locator).click();
	}
	
	public void inputTextToElement(String locName, By locator, String text) {
		Log.info("Clear text from [" +  locName + "]");
		driver.findElement(locator).clear();
		Log.info("Input text [" + text + "] to [" +  locName + "]");
		driver.findElement(locator).sendKeys(text);
	}
	
	public String getElementText(String locName, By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}
	
	public Boolean isElementVisible(String locName, By locator) {
		return true;
	}
}
