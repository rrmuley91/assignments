package automationpractice.framework1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreportconfig {
	
	String path = System.getProperty("user.dir")+"\\reports\\extend.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	ExtentReports extent = new ExtentReports();
	
	public void extendreportconfig()
	{
		reporter.config().setReportName("Amazon Automation");
		reporter.config().setDocumentTitle("Results");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rohit Muley");
	}
	
}
