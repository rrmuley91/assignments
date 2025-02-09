package framework1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationpractice.framework1.baseclass;
import automationpractice.framework1.searchprod;

public class testexecution extends baseclass {

	
//	WebDriver driver;
//	public searchprod prod;
//	@BeforeClass
	@Test
	public void Initialization()
	{
		searchprod prod = new searchprod(driver);
 
		prod.searchproduct();
	}
}
