package com.demoblaze.pagelayer;



	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.demoblaze.tastebase.Testbase;

	

	public class ConfirmationPage extends Testbase {

		public ConfirmationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//----------- Obj repo ------------------
		@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
		private WebElement status_msg;
		
		public String getStatus()
		{
			return status_msg.getText();
		}
	}


