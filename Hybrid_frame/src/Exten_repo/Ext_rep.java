package Exten_repo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext_rep {
		@Test
		public void test1()
		{
			//step1
			
			ExtentReports rep = new ExtentReports
					("./reports/r.html",false);
			//step2
			ExtentTest t1=rep.startTest("tc1");
			//step3
			t1.log(LogStatus.PASS,"passedtc");
			t1.log(LogStatus.FAIL,"failedtc");
			t1.log(LogStatus.SKIP,"skipped");
			//step4
			rep.endTest(t1);
			//step5
			rep.flush();
			
			
			
		}

		}



