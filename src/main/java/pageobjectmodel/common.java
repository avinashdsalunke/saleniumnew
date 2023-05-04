package pageobjectmodel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import Rsources.baseclass;

public class common extends baseclass {

	
	   public static void commonselect(WebElement dropdownElement, String optionText) {
	  
	      Select dropdown = new Select(dropdownElement);
	      dropdown.selectByVisibleText(optionText);
	  }

	public static void assersion(String at,String et,String Msg) {
	
	SoftAssert assertions =new SoftAssert();
	assertions.assertEquals(at, et, Msg);
	//assertions.assertAll();
}
	
}
	

	
