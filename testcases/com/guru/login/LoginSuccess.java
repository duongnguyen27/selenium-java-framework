package com.guru.login;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constants;
import page.DashboardPage;
import page.LoginPage;

public class LoginSuccess extends AbstractTest {
	
	@BeforeClass
	public void beforeClass() {
		setUp("gc", Constants.GURU_URL);
	}

	@Test
	public void TestLoginSuccess() {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage = loginPage.login("mngr150300", "UnAqEgY");
		Assert.assertTrue(dashboardPage.verifyWelcomeMsgDisplay());
	}

	@AfterClass
	public void afterClass() {
		tearDown();
	}
}
