package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageobject {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='UserFirstName']");

	private	By lastname = By.xpath("//input[@name='UserLastName']");

	private	By workemail = By.xpath("//input[@name='UserEmail']");

	
	private	By jobtitle = By.xpath("//select[@name='UserTitle']");

	private	By companyname = By.xpath("//input[@name='CompanyName']");

	private	By companyemployee = By.xpath("//select[@name='CompanyEmployees']");

	private	By phone = By.xpath("//input[@name='UserPhone']");

	private	By countryregion = By.xpath("//select[@name='CompanyCountry']");

	private	By agreecheckbox = By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	private	By commonselect = By.xpath("//select[@required='true']");
	

	public signupPageobject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement workemail() {
		return driver.findElement(workemail);
	}

	public WebElement jobtitle() {
		return driver.findElement(jobtitle);
	}
	
	public WebElement companyname() {
		return driver.findElement(companyname);
	}

	public WebElement employee() {
		return driver.findElement(companyemployee);
	}

	public WebElement phonenumber() {
		return driver.findElement(phone);
	}

	public WebElement region() {
		return driver.findElement(countryregion);
	}

	public WebElement checkbox() {
		return driver.findElement(agreecheckbox);
	
}
	public List<WebElement> commonselect(int i) {
		return driver.findElements(commonselect);
	}
	}
