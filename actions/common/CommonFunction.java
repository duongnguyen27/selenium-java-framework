package common;

import java.util.Random;
import java.util.UUID;

public class CommonFunction {
	public static String RandomString() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		char c = alphabet.charAt(random.nextInt(26));
		String s = "" + c;
		return s;
	}

	public static String RandomNumber() {
		int randomInt;
		String random;
		Random rg = new Random();
		randomInt = rg.nextInt(4);
		random = Integer.toString(randomInt);
		return random;
	}

	public static String createRandomEmail() {
		String uuid = UUID.randomUUID().toString();
		String email = uuid + "@gmail.com";
		return email;
	}
	 
	public static String randomPassword()
	{
		return RandomString() + RandomNumber();
	}
}
