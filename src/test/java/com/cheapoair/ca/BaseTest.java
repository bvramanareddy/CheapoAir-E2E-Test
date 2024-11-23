package com.cheapoair.ca;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
 protected	WebDriver driver;
	

 public BaseTest() {}
 

	@BeforeClass
	
	public void setUp()
	{
	driver=  new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)));
	
	
	System.out.println("One line removed from the old code and new line added here");
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	}


