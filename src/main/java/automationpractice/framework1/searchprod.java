package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchprod  {
//public searchprod(WebDriver driver) {
	//	super(driver);
		// TODO Auto-generated constructor stub
	//}

	//		super(driver);
	WebDriver driver;
//	WebDriver driver;
	public searchprod(WebDriver driver)
	{
		this.driver= driver;
		}
	public void searchproduct() {
		// TODO Auto-generated method stub
//		super(driver);

		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		search.sendKeys("mobile");
//		WebElementdriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		search.sendKeys(Keys.ENTER);	
	}
}

	

