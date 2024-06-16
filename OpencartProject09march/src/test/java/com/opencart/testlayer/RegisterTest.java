package com.opencart.testlayer;



	import org.testng.Assert;
	import org.testng.annotations.Test;

	
import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.pagelayer.RegisterPage;


	public class RegisterTest extends com.opencart.testbase.TestBase {

		@Test
		public void verifyRegisterTestWithValidDetails()
		{
			String expected_result = "Your Account Has Been Created!";
			
			HomePage homepage_obj = new HomePage(driver);
			RegisterPage registerpage_obj = new RegisterPage(driver);
			
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			registerpage_obj.enterFirstName("david");
			registerpage_obj.enterLastName("test4");
			registerpage_obj.enterEmail("davidtest4@gmail.com");
			registerpage_obj.entertelephone("54654646");
			registerpage_obj.enterPassword("Test@1234");
			registerpage_obj.enterConfirmPassword("Test@1234");
			registerpage_obj.clickOnPrivacyPolicyCheckbox();
			registerpage_obj.clickOnContinueButton();
			
			String actual_result = registerpage_obj.getSuccessfulMessage();
			System.out.println("Actual Result is :- " + actual_result);
			
			Assert.assertEquals(actual_result, expected_result);
			
		}
		
		@Test
		public void verifyRegisterTestWithExistingAccountDetails()
		{
			String expected_result = "Warning: E-Mail Address is already registered!";
			
			HomePage homepage_obj = new HomePage(driver);
			RegisterPage registerpage_obj = new RegisterPage(driver);
			LoginPage loginpage_obj = new LoginPage(driver);
			
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			registerpage_obj.enterFirstName("david");
			registerpage_obj.enterLastName("test4");
			registerpage_obj.enterEmail("davidtest4@gmail.com");
			registerpage_obj.entertelephone("54654646");
			registerpage_obj.enterPassword("Test@1234");
			registerpage_obj.enterConfirmPassword("Test@1234");
			registerpage_obj.clickOnPrivacyPolicyCheckbox();
			registerpage_obj.clickOnContinueButton();
			
			String actual_result = loginpage_obj.geterrormsg();
			System.out.println("Actual Result is :- " + actual_result);
			
			Assert.assertEquals(actual_result, expected_result);
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

