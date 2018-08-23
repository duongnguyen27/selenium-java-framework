package common;

import org.openqa.selenium.By;

public class AbstractPage extends DriverSettings {
	
	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}
	
	public void inputTextToElement(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public String getElementText(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}
	
	public Boolean isElementVisible(By locator) {
		return true;
	}
}
