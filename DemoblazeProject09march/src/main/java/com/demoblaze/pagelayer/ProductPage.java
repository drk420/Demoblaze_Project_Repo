package com.demoblaze.pagelayer;



	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class ProductPage extends Testbase{

		public ProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//-------------- Obj repo -----------------
		
		@FindBy(xpath="//a[contains(text(),'Add to cart')]")
		private WebElement add_to_cart_btn;
		
		// ------------- Action methods -----------
		public void clickOnAddToCartButton()
		{
			add_to_cart_btn.click();
		}
		
		
		
		
	}


