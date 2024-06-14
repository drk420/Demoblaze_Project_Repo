package utilities;



	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.io.FileHandler;

import com.demoblaze.tastebase.Testbase;


	

	public  class Utility extends Testbase {


		
		public  void screenshot(String filename) {
			
			
			String path  = "D:\\velocity training\\ECLIPS-2022-26\\ECLIPS_WORKSPACE\\DemoBlaze27AugProject\\screenshots\\";
			
	try {
			
			TakesScreenshot  ts =  (TakesScreenshot)driver;
			File src =  ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+".png");
			

			
			FileHandler.copy(src, des);}
			catch(IOException e){
				System.out.println("File not found - Please provide correct path");
			
			e.printStackTrace();

			
			
		}
		}}
		
		
		
			
		
		
		



