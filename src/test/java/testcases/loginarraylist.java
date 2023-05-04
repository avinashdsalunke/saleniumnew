package testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Rsources.baseclass;
import Rsources.constant;
import pageobjectmodel.Loginpageobject;

public class loginarraylist extends baseclass {
	 @Test
	/* public void login() throws IOException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  constant constant = new constant();
	  constant.userpass();

	  for (int i = 0; i < constant.userpass().get(0).size(); i++) {

		  Loginpageobject LPO = new Loginpageobject(driver);
	   LPO.enterusername().sendKeys(constant.userpass().get(0).get(i)); // Get username from the current index of
	                    // both ArrayLists
	   LPO.enterpassword().sendKeys(constant.userpass().get(1).get(i)); // Get password from the current index of
	                    // the password ArrayList
	   LPO.clicklogin().click();

	   String expectedtext = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	   String actualtext = driver.findElement(By.xpath("//div[@class='loginError']")).getText();
	   System.out.println(actualtext);

	   SoftAssert assertion = new SoftAssert();
	   assertion.assertEquals(actualtext, expectedtext);
	   System.out.println("done");

	  }*/
	 public void login() throws IOException {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  ArrayList<String> name1 = new ArrayList<String>(); // this is blank not null
		  ArrayList<String> pass = new ArrayList<String>();

		  constant constant = new constant(name1, pass);

		  for (int i = 0; i < name1.size(); i++) {

		   Loginpageobject LPO = new Loginpageobject(driver);

		   LPO.enterusername().sendKeys(name1.get(i)); // Get username from the current index of
		              // both ArrayLists
		   LPO.enterpassword().sendKeys(pass.get(i)); // Get password from the current index of
		              // the password ArrayList
		   LPO.clicklogin().click();

		   String expectedtext =constant.loginexpectedMessage;
		   String actualtext = LPO.errortext().getText();
		   System.out.println(actualtext);

		   SoftAssert assertion = new SoftAssert();
		   assertion.assertEquals(actualtext, expectedtext);
		   System.out.println("done");

		  }
		 }
		
	}