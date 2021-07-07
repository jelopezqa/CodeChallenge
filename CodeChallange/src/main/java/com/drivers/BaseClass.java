package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.enums.Browser;

public class BaseClass {
	
	protected WebDriver driver;
	
	private static String pathFormat = System.getProperty("user.dir")+"\\src\\main\\resources\\%s";
	
	@BeforeMethod
	public void setUpApplication() {
		Browser browser = Browser.chrome; 
		if(Browser.chrome == browser) {
			System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "chromedriver.exe"));
			driver = new ChromeDriver();
		}else if (Browser.firefox == browser){
			System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "geckodriver.exe"));
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@AfterMethod
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
