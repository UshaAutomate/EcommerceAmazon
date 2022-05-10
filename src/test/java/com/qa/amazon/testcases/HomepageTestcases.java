package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.Homepage;

public class HomepageTestcases extends Testbase{
	
	Homepage homepage;
	SoftAssert asert;
	public HomepageTestcases(){
		super();
		
	}
	
	@BeforeClass
	public void setUp() {
		
		intialization();
		homepage = new Homepage();
		
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		Assert.assertEquals(homepage.validateTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//asert.assertAll();
	}
	
	@Test(priority=2)
	public void veriftySearchBox() {
		boolean flag = homepage.searchboxBtnValidate();
		Assert.assertTrue(flag);
		//asert.assertAll();
	}
	@Test(priority =3)
	public void verifySearchBoxbtn() {
		boolean flag = homepage.searchboxValiddate();
		
		Assert.assertTrue(flag);
		//asert.assertAll();
	}
	
	@Test(priority=4 , enabled=false)
	public void verifySignbtn() {
		boolean flag = homepage.signInbtnValidate();
		Assert.assertTrue(flag);
		//asert.assertAll();
	}
	
	@AfterClass
	public void tear() {
		tearDown();
	}
	

}
