package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.LoginUI;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public DashboardPage loginPage(String username, String password) {
		inputTextToElement("Username textbox", LoginUI.txtUsername, username);
		inputTextToElement("Password textbox", LoginUI.txtPassword, password);
		clickElement("Login button", LoginUI.btnLogin);
		return (DashboardPage) InstanceManager.getInstance(driver, "DashboardPage");
	}
}
