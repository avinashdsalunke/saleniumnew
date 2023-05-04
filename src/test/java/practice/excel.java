package practice;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Rsources.ExcelData;
import Rsources.baseclass;
import Rsources.constant;
import pageobjectmodel.Loginpageobject;

public class excel extends baseclass {
	SoftAssert assertions = new SoftAssert();

	@Test
	public void loginexcel() throws IOException, InterruptedException {
		
	//	String path = System.getProperty("user.dir");
		//String otherFolder = path + "\\other";
		

		String xlpath = "F:\\data chale.xlsx";
		String sheet = "Sheet1";


		ExcelData ex = new ExcelData(xlpath, sheet);

		Loginpageobject LPO = new Loginpageobject(driver);

		for (int i = 2; i <= ex.rowcount(); i++) {
			Thread.sleep(2000);
			LPO.enterusername().sendKeys(ex.getdata(i, 5));
			LPO.enterpassword().sendKeys("ex.getdata(i,6)");
			LPO.clicklogin().click();
			Thread.sleep(1000);
			String a = LPO.errortext().getText();
			String b = constant.loginexpectedMessage;
			
			assertions.assertEquals(a, b, "Data should be invalid");

			// common.assersion(a, b, "Data should be invalid");

			ExcelData ex1 = new ExcelData(xlpath, i, 8, 0, a);

		}
		assertions.assertAll();
	}
}