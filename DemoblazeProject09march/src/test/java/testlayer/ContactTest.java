package testlayer;



	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

import com.demoblaze.pagelayer.ContactPage;
import com.demoblaze.pagelayer.Homepage1;
import com.demoblaze.tastebase.Testbase;




	public class ContactTest extends Testbase {

		@Test
	    public  void contacttest()  {
			
	       WebDriver driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/index.html#carouselExampleIndicators");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			Homepage1 homepage_obj = new Homepage1 (driver);
			
			homepage_obj.clickoncontact();
		
			ContactPage contactpage_obj = new ContactPage(driver);
		
			contactpage_obj.entercontactemail("warner1@gmail.com");
			contactpage_obj.entercontactname("Warner");
			contactpage_obj.entermessage("I have sent message");
			contactpage_obj.clickonsendmessage();
			contactpage_obj.gettextalert(driver);
			logger.info("new code is added");
			
			logger.info("new codw is added to merge");
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	

