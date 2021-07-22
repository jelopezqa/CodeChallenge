package code.tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ArticlesPage;

public class SearchingAndValidating{
	
	private WebDriver driver;
	private static String url = "http://automationpractice.com/index.php";
	ArticlesPage ipage;
	String validItem = "chiffon";
	String invalidItem = "sdfsdf";
	
	@BeforeTest
	public void setUp() throws Exception {
		ipage = new ArticlesPage(driver);
		driver = ipage.chromeDriverConnection();
		ipage.visitPage(url);
	}
	
		
	@Test
	public void SearchItems() throws InterruptedException {
		String msgResult = ipage.searchingItem(validItem);
		Assert.assertEquals(msgResult, "2 results have been found.", "The search found 0 results");
	}
	
	@Test
	public void SearchInvalidItem() throws InterruptedException {
		String msgRes = ipage.searchingItem(invalidItem);
		Assert.assertEquals(msgRes, "0 results have been found.", "The search found results");
	}
	
	@Test
	public void ScrollingtoFooter() throws InterruptedException {
		String email = ipage.gettingEmail();
		Assert.assertNotEquals(email, "", "You have not reached out the footer");
	}
	
	@AfterTest
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
