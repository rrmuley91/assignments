package locator_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ChromeDriver driver = new ChromeDriver();
//	ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}
