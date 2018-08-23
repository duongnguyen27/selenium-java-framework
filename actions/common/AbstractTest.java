package common;

public class AbstractTest extends DriverSettings {

	public void setUp(String browser, String url) {
		setUpDriver(browser);
		driver.get(url);
	}

	public void tearDown() {
		driver.quit();
	}
}
