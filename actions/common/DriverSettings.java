package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSettings {
	protected WebDriver driver;

	public void setUpDriver(String browser) {
		switch (browser) {
		case "gc":
			Log.info("Starting Chrome driver");
			WebDriverManager.chromedriver().setup();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			break;

		case "ff":
			Log.info("Starting Firefox driver");
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
					System.getProperty("user.dir") + "\\FirefoxLog.txt");
//			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver();
			break;

		case "ie":
			Log.info("Starting Chrome driver");
			WebDriverManager.iedriver().setup();
			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, true);
			capability.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			capability.setCapability("ignoreProtectedModeSettings", true);
			capability.setCapability("ignoreZoomSetting", true);
			capability.setCapability("requireWindowFocus", true);
			capability.setJavascriptEnabled(true);

			capability.setCapability("enableElementCacheCleanup", true);
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
			driver = new InternetExplorerDriver(capability);
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
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
