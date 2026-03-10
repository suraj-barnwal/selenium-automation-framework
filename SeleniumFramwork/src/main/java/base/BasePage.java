package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SelectUtility;
import utilities.WaitUtility;

public class BasePage implements WaitUtility, SelectUtility{
	
	WebDriver driver;
	WebDriverWait wait;
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Override
	public void waitUntilClick(WebElement element) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

	@Override
	public void waitUntilVisible(WebElement element) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	@Override
	public void waitForAlert(WebElement element) {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.alertIsPresent());
	}

	@Override
	public void selectByVisibleText(WebElement element, String text) {
		// TODO Auto-generated method stub
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	@Override
	public void selectByValue(WebElement element, String text) {
		// TODO Auto-generated method stub
		Select sel = new Select(element);
		sel.selectByValue(text);
	}

	@Override
	public void selectByIndex(WebElement element, int indexValue) {
		// TODO Auto-generated method stub
		Select sel = new Select(element);
		sel.deselectByIndex(indexValue);
	}

}
