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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	System.out.println("One line removed from the code and new line added here");
	System.out.println("Changes MAde in the Main brnach Now");

	System.out.println("Making changess when IM in Branch1");

	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	}


