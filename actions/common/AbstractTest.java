package common;

import org.testng.Assert;

public class AbstractTest extends DriverSettings {

	public void openBrowser(String browser, String url) {
		setUpDriver(browser);
		Log.info("Open [" + url + "]");
		driver.get(url);
	}

	public void closeBrowser() {
		Log.info("Close browser");
		try {
			String osName = System.getProperty("os.name").toLowerCase();
			String cmd = "";
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				if (osName.toLowerCase().contains("mac")) {
					cmd = "pkill chromedriver";
				} else {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				}
			}

			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
			}

			if (driver.toString().toLowerCase().contains("gecko")) {
				cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
			}

			Process process = Runtime.getRuntime().exec(cmd);
			process.waitFor();
			Log.info("Close browser successfully");
		} catch (Exception e) {
			Log.info(e.toString());
			System.out.println(e.getMessage());
		}
	}
	
	public void verifyEqual(String expected, String actual) {
		try {
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
