package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.BankGuruUI;

public class BankGuruPage extends AbstractPage{
	public BankGuruPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public NewCustomerPage goToNewCustomerPage()
	{
		clickElement("New Customer", BankGuruUI.btnNewCustomer);
		return (NewCustomerPage) InstanceManager.getInstance(driver, "NewCustomerPage");
	}
	

}
