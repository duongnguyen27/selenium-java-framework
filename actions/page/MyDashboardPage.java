package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import guru.DashboardUI;
import guru.MyDashboardUI;

public class MyDashboardPage extends AbstractPage {
	
	public MyDashboardPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public boolean verifyCreateAccSuccess()
	{
		return isElementVisible(MyDashboardUI.thankYoutxt);
	}

}
