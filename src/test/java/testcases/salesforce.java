package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rsources.baseclass;

public class salesforce extends baseclass {
@BeforeTest
	public void salesforce() throws IOException {
	initializeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

@Test
public void username() {
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
String Actual="xyz@gmail.com";
String expected="xyz@gmail.com";
Assert.assertEquals(Actual, expected);


}
@Test
public void pw(){
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	String Actual="123456";
	String expected="123456";
	Assert.assertEquals(Actual, expected);}

@AfterTest
public void login() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();

}


}


