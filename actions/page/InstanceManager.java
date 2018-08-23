package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class InstanceManager {

	private static DashboardPage dashboardPage;
	private static LoginPage loginPage;

	public static AbstractPage getInstance(WebDriver driver, String page) {
		if (page == "LoginPage") {
			if (loginPage == null) {
				loginPage = new LoginPage(driver);
			}
			return loginPage;
		}
		else if (page == "DashboardPage") {
			if (dashboardPage == null) {
				dashboardPage = new DashboardPage(driver);
			}
			return dashboardPage;
		}
		else {
			return null;
		}
	}
}
