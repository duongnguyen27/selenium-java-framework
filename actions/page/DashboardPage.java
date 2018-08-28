package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.DashboardUI;

public class DashboardPage extends AbstractPage {

	public DashboardPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public Boolean verifyWelcomeMsgDisplay() {
		return isElementVisible(DashboardUI.lblWelcomeMsg);
	}
	
	public CreateAccountPage createAnAccount()
	{
		CreateAccountPage createAcc = new CreateAccountPage(driver);
		clickElement(DashboardUI.myAccBtn);
		clickElement(DashboardUI.createAccBtn);
		return createAcc;
	}
}
