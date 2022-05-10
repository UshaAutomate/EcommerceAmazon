package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class TodayDeals extends Testbase{
	
	@FindBy (xpath="//a[contains(text(),\"Today's Deals\")]")
	WebElement dealsLink;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBoxfield;
	
	@FindBy (id ="nav-search-submit-button")
	WebElement searchBoxbtn;
	
	//span[@class="nav-cart-icon nav-sprite"]
	
	@FindBy(xpath="//a[@class=\"nav-imageHref\"]")
	WebElement primeImg;
	
	public TodayDeals(){
	
		PageFactory.initElements(driver, this);
	}

	public boolean validateSearchBox() {
		return searchBoxfield.isEnabled();
	}
	
	public boolean validateSearchBoxbtn() {
		return searchBoxbtn.isEnabled();
	}
	public boolean validatePrimeimg() {
		return primeImg.isDisplayed();
	}
	
}
