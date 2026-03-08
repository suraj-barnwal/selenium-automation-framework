package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtility;

public class BasePage implements WaitUtility{
	
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

}
