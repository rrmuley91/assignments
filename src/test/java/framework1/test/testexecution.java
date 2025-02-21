package framework1.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import automationpractice.framework1.addtocart;
import automationpractice.framework1.baseclass;
import automationpractice.framework1.checkout;
import automationpractice.framework1.searchprod;
import automationpractice.framework1.username;


public class testexecution extends baseclass {

	String path = System.getProperty("user.dir")+"\\reports\\extend.html";

	searchprod prod;
	addtocart cart;
	checkout check;
	username uname;
	
	
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	 
	 ExtentReports extent = new ExtentReports();


	@BeforeClass
	public void declare ()
	{
		 prod = new searchprod(driver);
		 cart = new addtocart(driver);
		 check = new checkout(driver);
		 uname = new username(driver);
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
	public void Initialization() throws InterruptedException
	{
		
		extent.createTest("First Test");
		prod.searchproduct();
		Thread.sleep(5000);
		cart.addtocart();
		Thread.sleep(5000);
		check.checkouting();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		uname.enterusername();
		extent.flush();
	}
}
