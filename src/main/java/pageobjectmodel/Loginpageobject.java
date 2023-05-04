package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {

	public WebDriver driver;

private	By username = By.xpath("//input[@id='username']");

private By password = By.xpath("//input[@id='password']");

private By login = By.xpath("//input[@id='Login']");

private By tryforfree = By.xpath("//a[@class='button secondary']");

private By errortext = By.xpath("//div[@id='error']");

	public Loginpageobject(WebDriver driver) { // constructor
		this.driver = driver;
	}

	public WebElement enterusername() {
		return driver.findElement(username);

	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement clicklogin() {
		return driver.findElement(login);
	}

	public WebElement tryforFree() {
		return driver.findElement(tryforfree);
	}
	public WebElement errortext() {
		return driver.findElement(errortext);
	}
	
}
