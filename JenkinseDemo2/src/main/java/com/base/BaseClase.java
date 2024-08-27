package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClase {
	WebDriver driver;	
	
	@BeforeMethod
	public void launch() {
		
	if(System.getProperty("browser").equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
	else if(System.getProperty("browser").equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();

	
	}
  @AfterMethod
  public void terdown() {
	  
	 driver.close();
	  
  }
}
