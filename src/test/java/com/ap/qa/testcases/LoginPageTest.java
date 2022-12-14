package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setup() {
		launchApplication();
	}

	@Test
	public void loginTest() {
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignInLinkAction();
		homepage = loginpage.loginAction();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
