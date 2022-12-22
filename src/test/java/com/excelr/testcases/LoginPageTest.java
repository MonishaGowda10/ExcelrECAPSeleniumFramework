package com.excelr.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.DashboardPage;
import com.excelr.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class LoginPageTest extends LoginPage{
	
	
      //validate Title
	//Validate Login
	/*
	 * Problems:
	 * 1.Driver code is repeated
	 * 2.Hard coding the data
	 * 3.Mixing of code with test case
	 */
	
	LoginPage lp;
	DashboardPage dp;
	
	@BeforeMethod
	public void browsersetup() {
		initialization();
		lp=new LoginPage();
		
		
	}
	@Test
	public void validateTitleTest() {
		
		String exptitle="OrangeHRM";
		String acttitle=lp.getTitle();
		Assert.assertEquals(exptitle, acttitle);
		
		
	}
	
	@Test
	public void validateLoginTest() {
		dp=lp.login();
		Assert.assertTrue(dp.dashboardLeftMenu());
		
		
	}
	@AfterMethod
	public void closesetup() {
		teardown();
	}
	
}
