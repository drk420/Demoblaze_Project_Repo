package utilities;


	

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

import com.demoblaze.tastebase.Testbase;

	

	public class Listenersetup extends Testbase implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {
			
			logger.info("test is started");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
		logger.info("test is successed");
		}

		@Override
		public void onTestFailure(ITestResult result) {

		logger.info("test is failed");
		util_obj.screenshot(result.getName()+System.currentTimeMillis());
		logger.info("Take Screenshot");

		}

		@Override
		public void onTestSkipped(ITestResult result) {

			logger.info("test is skipped");

		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			

		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
		
		
		}

		@Override
		public void onStart(ITestContext context) {


		}

		@Override
		public void onFinish(ITestContext context) {

			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


