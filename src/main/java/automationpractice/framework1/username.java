package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class username {

	WebDriver driver;
	public username(WebDriver driver)
	{
		this.driver= driver;
		}	
public void enterusername()
{
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("rontya0801a@gmail.com");
//	driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("rontya0801a@gmail.com");
	driver.findElement(By.className("a-button-input")).click();
}
	
	
}
