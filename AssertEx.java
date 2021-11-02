package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx
{
	WebDriver driver;
	  @Test
	  public void CheckTitle()
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\eclipse-workspace\\TestNgDemo\\Driver\\geckodriver.exe");
		  	driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
			String Expectedtitle= "Facebook – log in or sign Up";
			  String Actualtitle = driver.getTitle();
			 //Assert.assertEquals(Actualtitle, Expectedtitle);
			 //System.out.println("Test Case Passed");
			  SoftAssert sassert = new SoftAssert();
			  sassert.assertEquals(Actualtitle, Expectedtitle);
			  
			  System.out.println("Test failed");
			  sassert.assertAll();
			
	  }
	@Test 
	void tearDown()
	{
		driver.close();
	}
}
