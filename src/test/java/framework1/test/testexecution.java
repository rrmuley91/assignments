package framework1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import automationpractice.framework1.baseclass;
import automationpractice.framework1.searchprod;


public class testexecution extends baseclass {

	

	String path = System.getProperty("user.dir")+"\\reports\\extend.html";

	searchprod prod;

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	 
	 ExtentReports extent = new ExtentReports();


	@BeforeClass
	public void declare ()
	{
		 prod = new searchprod(driver);
		

	}
	@BeforeTest
	public void extendreportconfig()
	{
		reporter.config().setReportName("Amazon Automation");
		reporter.config().setDocumentTitle("Results");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rohit Muley");
	}
	
	@Test
	public void Initialization()
	{
		
		extent.createTest("First Test");
		prod.searchproduct();
		extent.flush();
	}
}
