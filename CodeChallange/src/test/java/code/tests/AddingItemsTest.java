package code.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ArticlesPage;

public class AddingItemsTest{

	private WebDriver driver;
	private static String url = "http://automationpractice.com/index.php";
	ArticlesPage ipage;
	
	@BeforeTest
	public void setUp() throws Exception {
		ipage = new ArticlesPage(driver);
		driver = ipage.chromeDriverConnection();
		ipage.visitPage(url);
	}

	@Test(enabled=true)
	public void AddingItemtoCartFromIndex() throws InterruptedException {
		ipage.selectingfromIndex();
	}
	
	@Test(enabled=true)
	public void AddingItemtoCartfromDresses() throws InterruptedException {
		ipage.selectingfromDresses();
	}
	
	@Test(enabled=true) 
	public void AddingItemtoCartfromWomen() throws InterruptedException {
		ipage.selectingfromWomen();
	
	}
	
	@Test(enabled=true)
	public void addingItemCartfromTshirt() throws InterruptedException {
		ipage.selectingfromTshirs();
	}
	
	@AfterTest
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
