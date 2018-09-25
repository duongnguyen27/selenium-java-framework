package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class NewCustomerPage extends AbstractPage{
	public NewCustomerPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public void SendKeyValueField(String locName, By locator, String text)
	{
		inputTextToElement(locName,locator,text);
	}

}
