package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import Rsources.baseclass;
import pageobjectmodel.Loginpageobject;
import pageobjectmodel.common;
import pageobjectmodel.signupPageobject;

public class verifysignup extends baseclass {
	@Test
	public void signup() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Loginpageobject LPO = new Loginpageobject(driver);
		LPO.tryforFree().click();
		
		signupPageobject SPO = new signupPageobject(driver);
		
		SPO.firstname().sendKeys("avinash");
		SPO.lastname().sendKeys("salunke");
		SPO.workemail().sendKeys("avinashsalunke1993@gmail.com");
		SPO.companyname().sendKeys("logixtech pvt ltd");
		SPO.phonenumber().sendKeys("8830666253");
		SPO.checkbox().click();

		/*Select s = new Select(SPO.jobtitle());
		s.selectByIndex(2);

		Select s1 = new Select(SPO.region());

		s1.selectByIndex(2);
		
		Select s2=new Select(SPO.employee());
		s2.selectByIndex(2);*/

		common.commonselect(SPO.jobtitle(), "Sales Manager");
		common.commonselect(SPO.region(), "India");
		common.commonselect(SPO.employee(), "16 - 50 employees");
		
		
		
		
		
		
		
		
		
		
	}
}