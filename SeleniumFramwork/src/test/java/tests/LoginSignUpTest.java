package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginSignUpPage;

public class LoginSignUpTest extends BaseTest{
	LoginSignUpPage ob;
	@BeforeTest
	public void openURL() {
		launchURL();
		ob= new LoginSignUpPage(driver);
	}
	@Test(priority = 1)
	public void clickOnLogin() {
		ob.loginBtn();
	}
	@Test(priority = 2)
	public void clickOnEmail() {
		ob.enterEmail("johnwick589745@gmail.com");
	}
	@Test(priority = 3)
	public void clickOnPassword() {
		ob.enterPassword("Johdffn@1458579");
	}
	@Test(priority = 4)
	public void clickOnLoginBtn() {
		ob.loginButton();
	}
}
