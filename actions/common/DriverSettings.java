package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSettings {
	protected WebDriver driver;
	
	public void setUpDriver(String browser) {
		switch (browser) {
		case "ff":
			System.setProperty("webdriver.firefox.driver", "./webdriver/geckodriver.exe");
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
