package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Page.Loginpom;
import com.Utility.BaseClass;

public class Test2 extends BaseClass{

	@Test
	
	public void Test1() {
		
		//WebElement pagefactory . after  4 no option
		//
		
		Loginpom login = PageFactory.initElements(driver, Loginpom.class); 
		login.getSignIn().click();
		login.getphone().sendKeys("8668575861");
		login.getcont().click();
		login.getpassword().sendKeys("99999");
		login.getsignin().click();
		
	}
}
