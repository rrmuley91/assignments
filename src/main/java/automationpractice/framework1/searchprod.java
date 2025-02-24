package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchprod  {


	
	WebDriver driver;

	
//	@FindBy(id= "twotabsearchtextbox")
//	WebElement search;

	public searchprod(WebDriver driver)
	{
		this.driver= driver;
		}
	
		// TODO Auto-generated method stub
//		super(driver);
		public void searchprod(String prodname)
		{
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		search.sendKeys(prodname);
//		WebElementdriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		search.sendKeys(Keys.ENTER);
		}
		


}

	

