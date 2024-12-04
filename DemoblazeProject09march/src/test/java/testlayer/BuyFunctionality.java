package testlayer;



	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.demoblaze.tastebase.Testbase;


	public class BuyFunctionality extends Testbase {
		
	
		
		
		@Test
		public void verifyBuyFunctionalityWithLogin() throws InterruptedException
		{
			String expected_output = "Thank you for your purchase!";
			//------------------------------
			home_obj.verifyloginlink();
			login_obj.verifyusername();
			login_obj.verifypassword();
			login_obj.verifyloginbutton();
			Thread.sleep(4000);
			
			home_obj.clickOnPhonesLink();
			home_obj.clickOnSamsungGalaxyS6Link();
			productpage_obj.clickOnAddToCartButton();
			Thread.sleep(2000);
			logger.info("Product added to cart");
			utilclass_obj.acceptAlert();
			home_obj.clickOnCartLink();
			cartpage_obj.clickOnPlaceOrderButton();
		//	cartpage_obj.fillDetails();
		//	logger.info("Order placed successfully");
			//-------------------------------------
		//	String actual_output = confirm_obj.getStatus();
		//	Assert.assertEquals(actual_output, expected_output);	
		}

	}


