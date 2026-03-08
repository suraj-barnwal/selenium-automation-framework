package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	LoginPage ob;
	
	@BeforeTest
	public void UrlLaunch() {
		launchURL();
		ob = new LoginPage(driver);
	}
	@Test(priority = 1)
	public void clickOnLogin() {
		ob.login();
	}
	@Test(priority = 2)
	public void clickOnName() {
		ob.enterName("John Wick");
	}
	@Test(priority = 3)
	public void clickOnEmail() {
		ob.enterEmail("johnwick1234@gmail.com");
	}
	@Test(priority = 4)
	public void clickOnSubmit() {
		ob.submitBtm();
	}
	
	
}
