package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "")
	WebElement userName;
	
	@FindBy(id= "")
	WebElement password;
	
	public void login(String uName,String pwd) {
		userName.sendKeys(uName);
		password.sendKeys(pwd);
	}

}
