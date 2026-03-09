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
	
	@FindBy(id = "id_gender1") private WebElement gender;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "days") private WebElement day;
	@FindBy(id = "months") private WebElement month;
	@FindBy(id = "years") private WebElement year;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[2]") private WebElement checkBoxTwo;
	@FindBy(id = "first_name") private WebElement firstName;
	@FindBy(id = "last_name") private WebElement lastName;
	@FindBy(id = "company") private WebElement company;
	
	@FindBy(css = "input[data-qa=\"address\"]") private WebElement addressOne;
	@FindBy(css = "input[data-qa=\"address2\"]") private WebElement addressTwo;
	@FindBy(id = "country") private WebElement country;
	@FindBy(id = "state") private WebElement state;
	@FindBy(id = "city") private WebElement city;
	@FindBy(id = "zipcode") private WebElement zipcode;
	@FindBy(id = "mobile_number") private WebElement mobile_number;
	@FindBy(css = "button[data-qa=\"create-account\"]") private WebElement createAcc;
	
	public void login() {
		waitUntilClick(login);
	}
	public void enterName(String Name) {
		waitUntilVisible(name);
		name.sendKeys(Name);
	}
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
		waitUntilClick(submit);
	}
	public void fillPassword(String pass) {
		waitUntilClick(gender);
		waitUntilVisible(password);
		password.sendKeys(pass);
	}
	public void selectDay(String date) {
		selectByVisibleText(day, date);
	}
	public void selectMonth(String monthName) {
		selectByVisibleText(month, monthName);
	}
	public void selectYear(String yearName) {
		selectByVisibleText(year, yearName);
		checkBoxTwo.click();
	}
	public void firstN(String detail) {
		firstName.sendKeys(detail);
	}
	public void lastN(String detail) {
		lastName.sendKeys(detail);
	}
	public void companyN(String detail) {
		company.sendKeys(detail);
	}
	public void addOne(String detail) {
		addressOne.sendKeys(detail);
	}
	public void addTwo(String detail) {
		addressTwo.sendKeys(detail);
	}
	public void countryN(String detail) {
		selectByVisibleText(country, detail);
	}
	public void stateN(String detail) {
		state.sendKeys(detail);
	}
	public void cityN(String detail) {
		city.sendKeys(detail);
	}
	public void zipC(String detail) {
		zipcode.sendKeys(detail);
	}
	public void mobileN(String detail) {
		mobile_number.sendKeys(detail);
	}
	public void createAccount() {
		waitUntilClick(createAcc);
	}
}
