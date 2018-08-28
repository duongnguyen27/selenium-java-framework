package guru;

import org.openqa.selenium.By;

public class CreateAccountUI {
	public static final By firstNametxt = By.xpath("//input[@id='firstname']");
	public static final By lastNametxt = By.xpath("//input[@id='lastname']");
	public static final By emailAddresstxt = By.xpath("//input[@id='email_address']");
	public static final By passwordtxt = By.xpath("//input[@id='password']");
	public static final By confirmPasswordtxt = By.xpath("//input[@id='confirmation']");
	public static final By registerbtn = By.xpath("//button[@title='Register']");

}
