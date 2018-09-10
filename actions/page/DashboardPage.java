package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.DashboardUI;

public class DashboardPage extends AbstractPage {

	public DashboardPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public Boolean verifyWelcomeMsgDisplay() {
		return isElementVisible(null, DashboardUI.lblWelcomeMsg);
	}
		
	public NewCustomerPage goToNewCustomerPage()
	{
		clickElement("New Customer", DashboardUI.btnNewCustomer);
		return (NewCustomerPage) InstanceManager.getInstance(driver, "NewCustomerPage");
	}
}
