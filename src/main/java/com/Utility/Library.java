package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	//sendkeys
	public static void custom_sendkeys(WebElement element, String value, String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+ "Value Succesfully send==" +value);
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}

	// click
	public static void custom_click(WebElement element, String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "Click Succesfully==" +fieldname);
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
}
