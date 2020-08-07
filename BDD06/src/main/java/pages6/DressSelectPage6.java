package pages6;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TestBase;

public class DressSelectPage6 extends TestBase {
	
	public DressSelectPage6() {
		PageFactory.initElements(driver, this);
		
	}
	
  @FindBy(xpath="//div[@class='noo-product-inner'] //h3")
  WebElement xxxxx;
  
  @FindBy(xpath="//select[@id='pa_color']")
  WebElement qqqqq;
  
  @FindBy(xpath="//select[@id='pa_size']")
  WebElement wwwww;
  
  @FindBy(xpath="//*[@id=\"product-1473\"]/div[1]/div[2]/form/div/div[2]/button")
  WebElement eeeee;
  
  		
  		
	
	

	public void dressSelect() throws InterruptedException {
	
		xxxxx.click();
		
	
		

	}

	public void selectColorAndSize() {
		
		Select dropdown1 = new Select(qqqqq);
		dropdown1.selectByVisibleText("White");
		
		
		//Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='pa_size']")));
		Select dropdown2 = new Select(wwwww);
		dropdown2.selectByVisibleText("Medium");
	}

	public void productToCart() {
		//driver.findElement(By.xpath("//*[@id=\"product-1473\"]/div[1]/div[2]/form/div/div[2]/button")).click();
		eeeee.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "white milkmaid hook and eye bodycon midi dress – ToolsQA Demo Site");
	}
}
