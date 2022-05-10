package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.qa.util.TestUtil;

public class Testbase {
	
	public static Properties prop;
	public static WebDriver driver;
	TestUtil tesutil;
	
	public Testbase() {
		 
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Lucky\\eclipse-workspace\\AmazonEcommerce\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void intialization() {
		
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\eclipse-workspace\\AmazonEcommerce\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
			
		} else if(browserName == "internetexplorer") {
			
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoad, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
	public static void tearDown() {
		driver.close();
	}

}
