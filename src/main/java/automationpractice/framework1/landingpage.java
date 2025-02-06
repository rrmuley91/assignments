package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class landingpage {
	WebDriver driver;
	String url = "https://www.amazon.in/";
	@BeforeClass
	public void  landingpage(WebDriver driver)
	{
		String url = "https://www.amazon.in/";
		
		this.driver = driver;
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void searchprod(String productname) {
		// TODO Auto-generated method stub
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		search.sendKeys(productname);
//		WebElementdriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		search.sendKeys(Keys.ENTER);	
	}
}
