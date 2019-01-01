package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
		//page factory OR
		
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginbutton;
		
		@FindBy(xpath="//button[contains(text(),'sign up')]")
		WebElement signupbutton;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmlogo;
		
		
		//inittilizing the page objects
		public  LoginPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		// Actions
		
		public String validateLoginPagetitle() {
			return driver.getTitle();
		}
		
		public boolean validateCRMImage() {
			return crmlogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbutton.click();
			
			return new HomePage();
		}
		

	
		
	}
		
		


