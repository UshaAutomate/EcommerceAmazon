package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class Homepage extends Testbase{
	
	
	@FindBy (id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy (id="nav-search-submit-button")
	WebElement searchBtn;
	
	@FindBy(xpath = "//span[@class=\"action-inner\"]")
	WebElement signInbtn;

	String title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	@FindBy (xpath="//a[contains(text(),\"Today's Deals\")]")
	WebElement dealsLink;
	
	@FindBy (xpath="//a[contains(text(),\"Best Sellers\")]")
	WebElement bestsellersLink;
	
	@FindBy (xpath="//a[contains(text(),\"Mobiles\")]")
	WebElement mobilesLink;
	
	@FindBy (xpath="//a[contains(text(),\"Customer Service\")]")
	WebElement custserviceLink;
	
	@FindBy (xpath="//a[contains(text(),\"Fashion\")]")
	WebElement fashionLink;
	
	@FindBy (xpath="//a[contains(text(),\" Electronics \")]")
	WebElement electronicsLink;
	
	@FindBy (xpath="//a[contains(text(),\"Home & Kitchen\")]")
	WebElement homekitchenLink;
	
	@FindBy (xpath="//a[contains(text(),\"New Releases\")]")
	WebElement newReleaseLink;
	
	@FindBy (xpath="//a[contains(text(),\"Amazon Pay\")]")
	WebElement amazonpayLink;
	
	
	
	public Homepage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public TodayDeals clickonDeals() {
		dealsLink.click();
		return new TodayDeals();
	}
	
	public Electronicspage clickonElectronics() {
		dealsLink.click();
		return new Electronicspage();
	}
	
	
	
	
	public MobilesPage clickonMobiles() {
		dealsLink.click();
		return new MobilesPage();
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean searchboxValiddate() {
		return searchBox.isEnabled();
	}
	
	public boolean searchboxBtnValidate() {
		return searchBtn.isEnabled();
	}
	
	public boolean signInbtnValidate() {
		return signInbtn.isDisplayed();
	}
}
