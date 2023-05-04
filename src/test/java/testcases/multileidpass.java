package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Rsources.baseclass;

public class multileidpass extends baseclass{
@Test
	public ArrayList<String> username() {
		List<String> name = new ArrayList<String>();
		name.add("avi");
		name.add("ram");
		return (ArrayList<String>) name;

	}
@Test

		public List<String> password() {

		List<String> pass = new ArrayList<String>();
		pass.add("123");
		pass.add("456");
		
		return pass;
		}
@Test

	public void login() throws IOException {
	    // List<String>name =username();
	   //  List<String> pass= password();

		initializeDriver();
		for(int i=0;i<username().size();i++) {
			
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username().get(i));

	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password().get(i));

	    driver.findElement(By.xpath("//input[@id='Login']")).click();

		
	}}
}
