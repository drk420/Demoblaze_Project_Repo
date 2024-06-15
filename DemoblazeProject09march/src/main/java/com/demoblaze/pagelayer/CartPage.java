package com.demoblaze.pagelayer;
	

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class CartPage extends Testbase {

		public CartPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//-------------- Obj repo -----------------
		
		@FindBy(xpath="//button[contains(text(),'Place Order')]")
		private WebElement place_order_btn;
		
		@FindBy(xpath="//input[@id='name']")
		private WebElement username_txtbox;
		
		@FindBy(xpath="//input[@id='country']")
		private WebElement country_txtbox;
		
		@FindBy(xpath="//input[@id='city']")
		private WebElement city_txtbox;
		
		@FindBy(xpath="//input[@id='card']")
		private WebElement credit_card_txtbox;
		
		@FindBy(xpath="//input[@id='month']")
		private WebElement month_txtbox;
		
		@FindBy(xpath="//input[@id='year']")
		private WebElement year_txtbox;
		
		@FindBy(xpath="//button[contains(text(),'Purchase')]")
		private WebElement purchase_btn;
		
		// ------------- Action methods -----------
		public void clickOnPlaceOrderButton()
		{
			place_order_btn.click();
		}	}
		
	//	public void fillDetails()
		//{
		//	username_txtbox.sendKeys(read_data.readData("UserDetails", 2, 0));
		//	country_txtbox.sendKeys(read_data.readData("UserDetails", 2, 1));
		//	city_txtbox.sendKeys(read_data.readData("UserDetails", 2, 2));
		//	credit_card_txtbox.sendKeys(read_data.readData("UserDetails", 2, 3));

	//	}}