package com.cheapoair.ca;

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
	driver.manage().window().maximize();
	
	
	System.out.println("One line removed from the code and new line added here");
	System.out.println("Changes MAde in the Main brnach Now");
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	}


