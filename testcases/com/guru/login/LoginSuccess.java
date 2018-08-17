package com.guru.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.AbstractTest;
import page.DashboardPage;
import page.LoginPage;

public class LoginSuccess extends AbstractTest {
	
	WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeClass
	public void tearUp() {
		setUp(driver, "ff", "google.com");
	}
 	
	@Test
	public void TestLoginSuccess() {
		DashboardPage dashboardPage = loginPage.loginPage("John", "Secret");
		Assert.assertTrue(dashboardPage.verifyWelcomeMsgDisplay());
	}
	
	@AfterClass
	public void tearDown() {
		tearDown(driver);
	}
}
