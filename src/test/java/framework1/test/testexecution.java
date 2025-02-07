package framework1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automationpractice.framework1.baseclass;

public class testexecution extends baseclass {

	
	
	public testexecution(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test(WebDriver driver)
	{
		baseclass base = new baseclass(driver);

	}
}
