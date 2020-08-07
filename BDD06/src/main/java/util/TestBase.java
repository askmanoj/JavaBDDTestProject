package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static void initialization() {

		try {
			prop = new Properties();
			
			String myProject = System.getProperty("user.dir");
			FileInputStream ip = new FileInputStream(myProject + "/config6.properties");
			prop.load(ip);
			
			
		} catch (IOException e) {
		
			e.printStackTrace();

		}
          openBrowser();
	}

	    public static void openBrowser() {
	
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
       
}
