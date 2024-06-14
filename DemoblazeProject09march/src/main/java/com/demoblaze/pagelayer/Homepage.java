package com.demoblaze.pagelayer;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class Homepage extends Testbase{
		
		
		@FindBy(xpath="//a[@id='login2']")
		private WebElement login_link;
		
		
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void verifyloginlink() {
			
			login_link.click();
			
		}
		
		
		
		
		

	}


