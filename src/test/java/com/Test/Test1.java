package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Page.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{
	
	@Test
	public void verifyTest1( ) {
		
		//generic method
		
		// Library using send data and click 
		
	Loginpom login = PageFactory.initElements(driver, Loginpom.class);
	
	Library.custom_click(login.getSignIn());
	Library.custom_sendkeys(login.getphone(), "8668575861");
	Library.custom_click(login.getcont());
	Library.custom_sendkeys(login.getpassword(), "999999");
	Library.custom_click(login.getsignin());
	
	}
}