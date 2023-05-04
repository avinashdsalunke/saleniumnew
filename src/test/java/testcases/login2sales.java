package testcases;

import java.io.IOException;
import java.util.HashMap;

import Rsources.baseclass;
import Rsources.constant;
import pageobjectmodel.Loginpageobject;

public class login2sales extends baseclass{
	
	public void log() throws IOException {
		initializeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	
			Loginpageobject LPO= new Loginpageobject(driver);
			
				
			
	LPO.enterusername().sendKeys("asdzxcxv");
	LPO.enterusername().sendKeys("123456");
	LPO.clicklogin().click();
		
	
	}
	}

