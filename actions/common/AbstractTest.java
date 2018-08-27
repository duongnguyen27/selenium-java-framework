package common;

public class AbstractTest extends DriverSettings {

	public void setUp(String browser, String url) {
		setUpDriver(browser);
		Log.info("Open [" + url + "]");
		driver.get(url);
	}

	public void tearDown() {
		Log.info("Close browser");
		driver.quit();
	}
}
