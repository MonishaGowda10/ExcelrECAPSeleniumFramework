package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.DashboardPage;
import com.excelr.pages.LoginPage;

public class DashboardPageTest extends DashboardPage {
	
	LoginPage lp;
	DashboardPage dp;
	
	@BeforeMethod
	public void browsersetup() {
		initialization();
		lp=new LoginPage();
	}
	@Test
	public void validateQuickLaunchSection() {
		dp=lp.login();
		Assert.assertTrue(dp.quicklaunch());
	}
	
	@Test
	public void validateMyActionsSection() {
		dp=lp.login();
		Assert.assertTrue(dp.myActionSection());
	}
	@AfterMethod
	public void closesetup() {
		teardown();
	}

}
