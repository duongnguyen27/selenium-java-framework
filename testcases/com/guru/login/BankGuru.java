package com.guru.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constants;
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
		// Login page
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage = loginPage.login(userName, password);
		//Thread.sleep(10000);
		
		// New Customer 
		NewCustomerPage newCustomerPage =  dashboardPage.goToNewCustomerPage();
		
	}

	@AfterClass
	public void afterClass() {
		tearDown();
	}
}
