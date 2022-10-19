package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;

	// configData object
	
	@BeforeSuite
	public void BS() throws Exception {
		config = new ConfigDataProvider();
	    excel = new ExcelDataProvider();
		
	}
	
	
	
	@Parameters("BrowserName")
	
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge")){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//config Data provide hence used
		
		//driver.get(config.getQA1_Url());
		
		driver.get(config.getBaseUrl());
	
		//without config Data
		
		//	driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	@AfterSuite
	public void AS() {
		
	}
}