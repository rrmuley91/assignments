package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchprod  {


	
	WebDriver driver;

	
	@FindBy(id= "twotabsearchtextbox")
	WebElement search;

	public searchprod(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
	
		// TODO Auto-generated method stub
//		super(driver);
		public void searchprod(String prodname)
		{
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		search.sendKeys(prodname);
//		WebElementdriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		search.sendKeys(Keys.ENTER);
		}
		


}

	

