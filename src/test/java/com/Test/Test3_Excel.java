package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Page.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test3_Excel extends BaseClass {

	@Test
	public void verifyTest1( ) {
		
		//generic method
		
		// Library using send data and click 
		
	Loginpom login = PageFactory.initElements(driver, Loginpom.class);
	
	Library.custom_click(login.getSignIn(), "Sign In");
	Library.custom_sendkeys(login.getphone(), excel.getStringData("Sheet1", 0, 0), "Phone");
	Library.custom_click(login.getcont(), "Continue");
	Library.custom_sendkeys(login.getpassword(), excel.getStringData("Sheet1", 0, 1), "Password");
	Library.custom_click(login.getsignin(), "Login");
	
	//verify
	Assert.assertTrue(false);
	}
}
