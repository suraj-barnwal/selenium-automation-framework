package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "a[href=\"/login\"]") private WebElement login;
	@FindBy(name = "name") private WebElement name;
	@FindBy(css = "input[data-qa=\"signup-email\"]") private WebElement email;
	@FindBy(xpath = "//button[text()='Signup']") private WebElement submit;
	
	public void login() {
		waitUntilClick(login);
	}
	public void enterName(String Name) {
		waitUntilVisible(name);
		name.sendKeys(Name);
	}
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
	}
	public void submitBtm() {
		waitUntilClick(submit);
	}
	
}
