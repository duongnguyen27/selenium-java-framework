package com.guru.login;

import org.openqa.selenium.remote.server.handler.GetElementText;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constants;
import guru.NewCustomerUI;
import page.DashboardPage;
import page.LoginPage;
import page.NewCustomerPage;

public class BankGuru extends AbstractTest {
	String userName = "mngr152551";
	String password = "derybev";
	
	@BeforeClass
	public void beforeClass() {
		setUp("gc", Constants.GURU_URL);
	}

	@Test
	public void TC01_NameCannotEmpty() throws InterruptedException {
		String textIsDisplayed = "";
		// Login page
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage = loginPage.login(userName, password);
				
		// New Customer 
		NewCustomerPage newCustomerPage =  dashboardPage.goToNewCustomerPage();
		newCustomerPage.SendKeyValueField("empty", NewCustomerUI.txtCustomerName, "");
		
		//textIsDisplayed = getTextElement("Customer Name", NewCustomerUI.txtCustomerNameVerify);
		Thread.sleep(10000);
	}

	@AfterClass
	public void afterClass() {
		tearDown();
	}
}
