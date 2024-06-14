package com.demoblaze.pagelayer;


	


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class Loginpage extends Testbase{

		
		@FindBy(xpath="//input[@id='loginusername']")
		private WebElement username_textbox;
		
		
		@FindBy(xpath="//input[@id='loginpassword']")
		private WebElement password_textbox;
		
		@FindBy(xpath="//button[contains(text(),'Log in')]")
		private WebElement ligib_button;
		
		public Loginpage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		public void verifyusername() {
			username_textbox.sendKeys("kinikar dnyaneshwar");
			
		}
		
		public void verifypassword() {
			password_textbox.sendKeys("high");
		}
		
		public void verifyloginbutton() {
			ligib_button.click();
			
		}
	}

	
	
	
	
	
	
	


