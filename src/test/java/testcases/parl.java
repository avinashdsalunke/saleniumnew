package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class parl {
	WebDriver driver;

	@Test
	public void method1() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getCurrentUrl());

	}
}