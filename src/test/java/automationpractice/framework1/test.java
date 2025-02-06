package automationpractice.framework1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		String productname = "mobile";
		// TODO Auto-generated method stub
//		String productname = "mobile";
		WebDriver driver = new ChromeDriver();
		landingpage login = new landingpage();
		login.landingpage(driver);
		login.searchprod(productname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addtocart cart = new addtocart();
		cart.addtocart(driver);
//	searchproduct product = new searchproduct();
//		product.searchprod();
	}

	
}
