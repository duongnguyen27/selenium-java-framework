package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	
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
	
	public Boolean isElementInVisible(By locator) {
		// test commit 
		return true;
	}
}
