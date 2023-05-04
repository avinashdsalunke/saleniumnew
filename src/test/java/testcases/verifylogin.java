package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rsources.baseclass;

public class verifylogin extends baseclass {

	
		 @BeforeTest
		 public void login() throws IOException {
		  
		  initializeDriver() ;
		  driver.get("https://amazon.in");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 }
		 
		 
		 @Test
		 public void verifytitle() {
			 String actualtitle=driver.getTitle();
			 String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			 Assert.assertEquals(actualtitle, expectedtitle);
		 }
		 
		 
		  @AfterTest
		  public void teardown() {
			  driver.quit();
		  }
		 }
	
		 
		 
		 

		