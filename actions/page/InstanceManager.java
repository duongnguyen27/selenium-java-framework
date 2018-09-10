package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class InstanceManager {

	private static DashboardPage dashboardPage;
	private static LoginPage loginPage;
	private static NewCustomerPage newCustomer;
	
	public static AbstractPage getInstance(WebDriver driver, String page) {
		switch (page) {
		case "LoginPage":
			if (loginPage == null) {
				loginPage = new LoginPage(driver);
			}
			return loginPage;

		case "DashboardPage":
			if (dashboardPage == null) {
				dashboardPage = new DashboardPage(driver);
			}
			return dashboardPage;
		case "NewCustomer":
			if (newCustomer == null) {
				newCustomer = new NewCustomerPage(driver);
			}
			return dashboardPage;
		default:
			return null;
		}
	}
}
