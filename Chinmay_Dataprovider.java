package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

public class Chinmay_Dataprovider {
  @Test(dataProvider = "kite")
  public void f(String user, String password)
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\eclipse-workspace\\July 2021\\Driver\\chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-arguments");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//form[@method=\"post\"]//child::div[2]//input")).sendKeys(user);
		driver.findElement(By.xpath("//form[@method=\"post\"]//child::div[3]//input")).sendKeys(password);
		driver.findElement(By.xpath("//form[@method=\"post\"]//child::div[4]//button")).click();
		System.out.println("Thread ID is" +Thread.currentThread().getId());
  }

  @DataProvider(name="kite",parallel=true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ABCD", "nachiket" },
      new Object[] { "pqrd", "chinmay" },
      
    };
  }
}
