package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class addtocart {
	WebDriver driver;
	public addtocart(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath = "//*[@id='a-autoid-1-announce']")
	WebElement addtocart;
	
	@FindBy(xpath = "//*[@id ='nav-cart-count-container']")
	WebElement carticon;
	
	public void addtocart()
	{
//	driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
//	WebElement addtocart = driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
	addtocart.sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement carticon = driver.findElement(By.xpath("//*[@id ='nav-cart-count-container']"));
	carticon.click();
	}
}
