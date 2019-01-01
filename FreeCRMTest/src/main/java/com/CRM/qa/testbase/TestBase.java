package com.CRM.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.qa.Util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	

	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream(
					"C:\\Users\\Srilatha\\eclipse-workspace\\FreeCRMTest\\"
					+ "src\\main\\java\\com\\CRM\\qa\\Config\\Config.properties");
			   
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

}


public static void initilization() {
	
//String browsername = prop.getProperty("browser");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https:www.freecrm.com");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	
}
String username = prop.getProperty("username");
String password = prop.getProperty("password");
}
	
