package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSettings {
	protected WebDriver driver;

	public void setUpDriver(String browser) {
		switch (browser) {
		case "ff":
			Log.info("Starting Firefox driver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "gc":
			Log.info("Starting Chrome driver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "ie":
			Log.info("Starting Chrome driver");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "edge":
			Log.info("Starting Chrome driver");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			Log.info("Starting Chrome driver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
