package com.demoblaze.pagelayer;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	public class Homepage1 extends Testbase{

	public Homepage1 (WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//a[text()=\"Contact\"]")
		private WebElement contact_link;
		
		
		public void clickoncontact () {
			
			contact_link.click();
			
		}
		
		
		
		
		
		
	}
		



	
	
	
	
	
	
	
	
	

