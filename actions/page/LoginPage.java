package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.LoginUI;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public DashboardPage loginPage(String username, String password) {
		inputTextToElement(LoginUI.txtUsername, username);
		inputTextToElement(LoginUI.txtPassword, password);
		clickElement(LoginUI.btnLogin);
		return (DashboardPage) InstanceManager.getInstance(driver, "DashboardPage");
	}
}
