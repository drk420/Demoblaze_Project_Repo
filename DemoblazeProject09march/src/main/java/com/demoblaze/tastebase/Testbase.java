package com.demoblaze.tastebase;





	import java.time.Duration;

	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

import com.demoblaze.pagelayer.Homepage;
import com.demoblaze.pagelayer.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;
	
	
import utilities.Utility;

	public class Testbase {
		public static Logger logger;
		public Homepage home_obj;
		public Loginpage login_obj;
		public Utility util_obj;
		public static  WebDriver driver;
		

			
			@BeforeClass
			public void start() {
				logger = Logger.getLogger("Demoblaze automationframework is started");
				PropertyConfigurator.configure("Lo4jfile.properties");
				logger.info("framework is stated");
			}
			
			@AfterClass
			public void stop() {
				
				logger.info("framework stopped");
			}
			
		//	@Parameters("browser")
			@BeforeMethod
			public void setup() {
			 String br = "chrome";
			
			if(br.equalsIgnoreCase("chrome")) {
				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				//driver.get("https://www.demoblaze.com/index.html");
			//	driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				
			}
			else if(br.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
			else if(br.equalsIgnoreCase("edge")) {
			//	WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				
				
			}
			else {
				System.out.println("please provide current driver");
			}
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			logger.info("Browser launches,maximize,wait");
			home_obj = new Homepage(driver);
			login_obj = new Loginpage(driver);
			util_obj = new Utility();
			logger.info("object is created");
		}
		    @AfterMethod
			public void teardown() {
				driver.quit();
			logger.info("browser is closed");
		}
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

