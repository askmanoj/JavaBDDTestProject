package pages6;

import org.openqa.selenium.By;

import util.TestBase;

public class ProceedPage extends TestBase {

	
	
	
	public void proceedPage () {
		
		driver.findElement(By.xpath("//span[@class='cart-name-and-total']")).click();
	}
	
	public void proceedPage1() {
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
	}
}
