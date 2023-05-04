package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import Rsources.baseclass;
import Rsources.constant;
import pageobjectmodel.Loginpageobject;
import pageobjectmodel.common;

public class veifylogin1 extends baseclass{
	@Test
	public void login() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Loginpageobject LPO=new Loginpageobject(driver);
		
		LPO.enterusername().sendKeys(constant.username);
		Thread.sleep(2000);
		LPO.enterpassword().sendKeys(constant.password);
		LPO.clicklogin().click();
		
		String actualtext=LPO.errortext().getText();
		String expectedtext=constant.loginexpectedMessage;
		common.assersion(expectedtext, actualtext, "invalid data");

	
	
}
}