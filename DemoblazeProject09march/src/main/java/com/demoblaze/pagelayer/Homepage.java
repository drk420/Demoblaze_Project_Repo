package com.demoblaze.pagelayer;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class Homepage extends Testbase{
		
		
		@FindBy(xpath="//a[@id='login2']")
		private WebElement login_link;
		
		@FindBy(xpath="//a[contains(text(),'Phones')]")
		private WebElement phones_link;
		
		@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
		private WebElement samsung_galaxy_s6_link;
		
		@FindBy(xpath="//a[@id='cartur']")
		private WebElement cart_link;
		
		// ------------- Action methods -----------
		public void clickOnLoginLink()
		{
			login_link.click();
		}
		
		public void clickOnPhonesLink()
		{
			phones_link.click();
		}
		
		public void clickOnSamsungGalaxyS6Link()
		{
			samsung_galaxy_s6_link.click();
		}
		public void clickOnCartLink()
		{
			cart_link.click();
		}
	

		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void verifyloginlink() {
			
			login_link.click();
			
		}
		
		
		
		
		

	}


