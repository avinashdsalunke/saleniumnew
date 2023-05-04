package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import Rsources.baseclass;
import pageobjectmodel.Loginpageobject;
import pageobjectmodel.signupPageobject;


public class preone extends baseclass{
	@Test
	public void signup() throws IOException{
	
		initializeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		Loginpageobject LPO =new Loginpageobject(driver);
		LPO.tryforFree().click();
		signupPageobject SPO=new signupPageobject(driver);
		
		SPO.firstname().sendKeys("asd");
		SPO.lastname().sendKeys("1234");
		//SPO.jobtitle().sendKeys("QA");
		//SPO.companyname().clear();
		SPO.companyname().sendKeys("asdf");
		
			
		
		
		
		
		
		
	}}

	