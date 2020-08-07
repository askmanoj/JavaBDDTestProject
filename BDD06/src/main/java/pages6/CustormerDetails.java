package pages6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.TestBase;

public class CustormerDetails extends TestBase {

	public void firstName() {
		driver.findElement(By.xpath("//input[@name='billing_first_name']")).sendKeys(prop.getProperty("firstName"));
	}

	public void LastName() {
		driver.findElement(By.xpath("//input[@name='billing_last_name']")).sendKeys(prop.getProperty("LastName"));

	}

	public void selectCountry() throws InterruptedException {
		WebElement countryDropDown = driver.findElement(By.xpath("//span[@title='United Kingdom (UK)']"));
		countryDropDown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='select2-billing_country-results'] //li[contains(text(),'Iceland')]"))
				.click();

	}

	public void address() {
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("123 abcd street");
	}

	public void city() {
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("london");
	}

	public void postCode() {
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("HS12 1HS");
	}

	public void phoneNumber() {
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("07888888888");
	}

	public void email() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("manojkumarbotta@gmail.com");
	}

	public void termsNconditions() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(2000);
	}

	public void checkOut() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='button alt']")).submit();
		Thread.sleep(3000);
		driver.quit();
	}
}
