package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AbstractTest {

	public void setUp(WebDriver driver, String browser, String url) {
		switch (browser) {
		case "ff":
			System.setProperty("webdriver.firefox.driver", "./webdriver/geckodriver.exe");
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void tearDown(WebDriver driver) {
		driver.quit();
	}
}
