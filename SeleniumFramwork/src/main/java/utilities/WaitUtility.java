package utilities;

import org.openqa.selenium.WebElement;

public interface WaitUtility {
	public void waitUntilClick(WebElement element);
	public void waitUntilVisible(WebElement element);
	public void waitForAlert(WebElement element);
	
}
