package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.TodayDeals;

public class TodayDealsTestcases extends Testbase{
	
	TodayDeals todayDeals;
	
	public TodayDealsTestcases() {
		super();
		
	}
	
	@BeforeClass
	public void setUp() {
		intialization();
		todayDeals = new TodayDeals();
		
	}
	@Test(priority=1)
	public void verifySearchbox() {
		Assert.assertTrue(todayDeals.validateSearchBox(), "Searchbox Should be Enabled");
	}
	
	@Test(priority=2)
	public void verifySearchboxbtn() {
		Assert.assertTrue(todayDeals.validateSearchBoxbtn(),"Searchbox Button should be Enable");
	}
	
	@Test(priority=3)
	public void verifyPrimebtn() {
		
		Assert.assertTrue(todayDeals.validatePrimeimg(), "Prime Button should be Displayed");
		
	}
	@AfterClass
	public void tear() {
		tearDown();
		
		
	}
	
	

}
