package utilities;

import org.openqa.selenium.WebElement;

public interface SelectUtility {
	public void selectByVisibleText(WebElement element, String text);
	public void selectByValue(WebElement element, String text);
	public void selectByIndex(WebElement element, int indexValue);
}
