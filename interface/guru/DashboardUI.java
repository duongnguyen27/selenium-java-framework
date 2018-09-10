package guru;

import org.openqa.selenium.By;

public class DashboardUI {

	public static final By myAccBtn = By.xpath(".//div[@class='footer-container']//a[contains(@title,'My Account')]");
	public static final By createAccBtn = By.xpath("//a[@title='Create an Account']//span[contains(.,'Create an Account')]");
	public static final By lblWelcomeMsg = By.className("heading3");
	
	public static final By btnNewCustomer = By.className("heading3");
}
