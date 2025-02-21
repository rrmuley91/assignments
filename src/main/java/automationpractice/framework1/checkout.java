package automationpractice.framework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkout {

	WebDriver driver;
	public checkout(WebDriver driver)
	{
		this.driver= driver;
		}	
	public void checkouting()
	{
		driver.findElement(By.name("proceedToRetailCheckout")).click();
	}
	
}
