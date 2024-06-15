package com.demoblaze.pagelayer;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class ContactPage {

	public ContactPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//input[@id=\"recipient-email\"]")
		private WebElement contactemail_textbox;
		
		@FindBy(xpath="//input[@id=\"recipient-name\"]")
		private WebElement contactname_textbox;
		@FindBy(xpath="//textarea[@id=\"message-text\"]")
		private WebElement message_textbox;
		@FindBy(xpath="//button[text()=\"Send message\"]")
		private WebElement sendmessage_button;
		public void entercontactemail(String email) {
			contactemail_textbox.sendKeys(email);
		}
		public void entercontactname(String name) {
			contactname_textbox.sendKeys(name);
		}
		public void entermessage(String message) {
			message_textbox.sendKeys(message);
			}
		public void clickonsendmessage() {
			sendmessage_button.click();
			}
		public void  gettextalert(WebDriver driver) {
				String text	= driver.switchTo().alert().getText();
		     if(text.equals("Thanks for the message!!")) {
					driver.switchTo().alert().accept();
					System.out.println("test is passed");
					}
		     else {
		    	 System.out.println("test is failed"); }}}
		
		
		
		
		
		
		




