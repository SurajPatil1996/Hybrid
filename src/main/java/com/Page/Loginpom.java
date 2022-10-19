package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	
	//Encapsulation used
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Hello, sign in']")
	private WebElement SignIn1c;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_email']")
	private WebElement phone2s;
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	private WebElement cont3c;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
	private WebElement password4s;
	
	@FindBy(how=How.XPATH,using="//input[@id='signInSubmit']")
	private WebElement submit5c;
	
	public WebElement getSignIn() {
		return SignIn1c;
	}
	
	public WebElement getphone() {
		return phone2s;
	}
    
	public WebElement getcont() {
		return cont3c;
	}
	
	public WebElement getpassword() {
		return password4s;
	}
	public WebElement getsignin() {
		return submit5c;
	}
}
