package testlayer;



	
	

	import org.testng.annotations.Test;
	import org.testng.annotations.Test;

import com.demoblaze.tastebase.Testbase;







	public class Testlayer extends Testbase{
			
	  @Test
	  public void verifylogin() {
		  
		  home_obj.verifyloginlink();
		  logger.info("login link is verified");
		  login_obj.verifyusername();
		  
		  login_obj.verifypassword();
		  login_obj.verifyloginbutton();
	  }
	}


	
	
	
	
	
	

