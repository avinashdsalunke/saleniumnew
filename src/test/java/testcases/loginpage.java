package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rsources.baseclass;

public class loginpage extends baseclass {
	
@BeforeTest
	public void openurl() throws IOException {
	initializeDriver();
	
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(priority=1)
	public void Username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xyz@gmail.com");	
		String actual="xyz@gmail.com";
		String expected="xyz@gmail.com";
		Assert.assertEquals(actual, expected);
	}
	@Test (priority=2)
	public void pw() {
	
		driver.findElement(By.xpath("//form[@method='post']/input[2]")).sendKeys("123456");
		String actual="123456";
		String expected="123456";
		Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority=3)
	public void login() {
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		WebElement a=driver.findElement(By.xpath("//div[@id='error']"));
		String c=a.getText();
        System.out.println(c);
		String actualmsg=c; 
		String Expectedmsg="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualmsg, Expectedmsg);
	}
	
	
	
	
	

}

