package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;

public class InstanceManager {

	private static DashboardPage dashboardPage;
	private static LoginPage loginPage;

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

		default:
			return null;
		}
	}
}
