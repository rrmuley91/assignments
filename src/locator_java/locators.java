package locator_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	ChromeDriver driver = new ChromeDriver();
//	ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//id locator for searching mobile in amazon
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	//xpath locator for add to cart 1 mobile
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']"));
	driver.findElement(By.xpath("//*[@id='a-autoid-1-announce']")).sendKeys(Keys.ENTER);
//	driver.findElement(By.cssSelector("#nav-cart-count-container > span.nav-cart-icon.nav-sprite")).click();
//	driver.findElement(By.className("nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content")).click();
	Thread.sleep(3000);
	//xpath locator for clicking on cart icon
	driver.findElement(By.xpath("//*[@id ='nav-cart-count-container']")).click();
	//name locator for checkout
	driver.findElement(By.name("proceedToRetailCheckout")).click();
//	driver.findElement(By.name("email")).sendKeys("rontya0801a@gmail.com");
	//emailField.sendKeys("rontya0801a@gmail.com");
	//implicit wait for loading login page	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("rontya0801a@gmail.com");
	//classname locator for clicking contineu after entering email	
	driver.findElement(By.className("a-button-input")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//link text locator for clicking forgot password	
	driver.findElement(By.linkText("Forgot password?")).click();
	}
}
