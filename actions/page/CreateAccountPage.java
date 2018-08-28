package page;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.CommonFunction;
import guru.CreateAccountUI;

public class CreateAccountPage extends AbstractPage{
	
	public CreateAccountPage(WebDriver driver) {
		super.driver = driver;
	}
	
	public MyDashboardPage createAnAccount()
	{
		MyDashboardPage myDashboard = new MyDashboardPage(driver);
		String firstName = CommonFunction.RandomString();
		String lastName = CommonFunction.RandomString();
		String emailAddress = CommonFunction.createRandomEmail();
		String password = CommonFunction.randomPassword();
		
		sendkeyToElement(CreateAccountUI.firstNametxt,firstName);
		sendkeyToElement(CreateAccountUI.lastNametxt,lastName);
		sendkeyToElement(CreateAccountUI.emailAddresstxt,emailAddress);
		sendkeyToElement(CreateAccountUI.passwordtxt,password);
		sendkeyToElement(CreateAccountUI.confirmPasswordtxt,password);
		clickElement(CreateAccountUI.registerbtn);
		
		return myDashboard;
		
	}

}
