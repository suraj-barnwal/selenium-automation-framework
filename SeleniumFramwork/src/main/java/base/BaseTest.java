package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected WebDriver driver;
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://automationexercise.com/");
	}
	
	public void tearDown() {
		driver.quit();
	}

}
