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
		ob.enterEmail("johncena34534@gmail.com");
	}
	@Test(priority = 4)
	public void clickOnFillPass() {
		ob.fillPassword("JohnCena@25869");
	}
	@Test(priority = 5)
	public void clickOnDate() {
		ob.selectDay("3");
		ob.selectMonth("January");
		ob.selectYear("2020");
	}
	@Test(priority = 6)
	public void fillDetails() {
		ob.firstN("John");
		ob.lastN("Wick");
		ob.companyN("ABC Company Ltd");
		ob.addOne("Sector 140, Greater Noida");
		ob.addTwo("UP, 123455");
		ob.countryN("India");
		ob.stateN("UP");
		ob.cityN("Greater Noida");
		ob.zipC("123456");
		ob.mobileN("5678765435");
		
	}
	@Test(priority = 7)
	public void createA() {
		ob.createAccount();
	}
	@Test(priority = 8)
	public void AccCreated() {
		ob.AccountCreated();
	}
	
	
}
