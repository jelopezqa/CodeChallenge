package code.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ArticlesPage;

public class RemovingItemfromCart {
	
	private WebDriver driver;
	private static String url = "http://automationpractice.com/index.php";
	ArticlesPage ipage;
	
	@BeforeTest
	public void setUp() throws Exception {
		ipage = new ArticlesPage(driver);
		driver = ipage.chromeDriverConnection();
		ipage.visitPage(url);
	}
	
	@Test
	public void RemovingItem() throws InterruptedException {
		ipage.removingItemfroCart();
	}
	
	@AfterTest
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
