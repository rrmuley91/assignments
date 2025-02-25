package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class username {

	WebDriver driver;
	public username(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}	
	
	@FindBy(xpath = "//*[@id='ap_email_login']" )
	WebElement email;
	
	@FindBy(className = "a-button-input")
	WebElement clickcontineu;
	
public void enterusername()
{
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("rontya0801a@gmail.com");
	email.sendKeys("rontya0801a@gmail.com");
//	driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("rontya0801a@gmail.com");
//	driver.findElement(By.className("a-button-input")).click();
	clickcontineu.click();
}
	
	
}
