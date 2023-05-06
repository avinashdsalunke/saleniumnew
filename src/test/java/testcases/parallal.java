package testcases;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import Rsources.baseclass;

public class parallal {
	WebDriver driver;	  
		@Test
		  public void method1() throws IOException {
		  ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
	   driver=new ChromeDriver(options);
		    driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getCurrentUrl());
		      }
		@Test
		  public void method2() throws IOException{

		  FirefoxOptions options= new FirefoxOptions();
		options.addArguments("--headless");
		driver=new FirefoxDriver(options);
		    driver.get("https://rahulshettyacademy.com/");
		    System.out.println(driver.getCurrentUrl());
}
		
		@Test
		public void method3() throws Exception {

  Robot r = new Robot();

		   String path = "C:\\Users\\dell\\Desktop\\screnshot\\test175"+ ".png";
		   Rectangle capture = 
		   new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		   BufferedImage Image = r.createScreenCapture(capture);
		   ImageIO.write(Image, "jpg", new File(path));
		   System.out.println("Screenshot saved");
		}


		}

