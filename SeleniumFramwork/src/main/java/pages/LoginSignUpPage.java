package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginSignUpPage extends BasePage{
	WebDriver driver;
	public LoginSignUpPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href=\"/login\"]") private WebElement login;
	@FindBy(css = "input[data-qa=\"login-email\"]") private WebElement email;
	@FindBy(css = "input[data-qa=\"login-password\"]") private WebElement pass;
	@FindBy(css = "button[data-qa=\"login-button\"]") private WebElement loginBtn;
	
	public void loginBtn() {
		waitUntilClick(login);
	}
	public void enterEmail(String eMail) {
		email.sendKeys(eMail);
	}
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	public void loginButton() {
		waitUntilClick(loginBtn);
	}
}
