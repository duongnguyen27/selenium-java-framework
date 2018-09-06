package com.guru.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constants;
import page.CreateAccountPage;
import page.DashboardPage;
import page.MyDashboardPage;

public class CreateAccount extends AbstractTest{
	WebDriver driver;
	CreateAccountPage createAcc = new CreateAccountPage(driver);
	MyDashboardPage myDashboard = new MyDashboardPage(driver);
	@BeforeClass
	public void tearUp() {
		setUp("gc", Constants.GURU_URL);
	}
 	
	@Test
	public void TC01_CreateAccount() {
		createAcc.createAnAccount();
		Assert.assertTrue(myDashboard.verifyCreateAccSuccess());
	}
	
	@AfterClass
	public void tearDown() {
		tearDown();
	}
}
