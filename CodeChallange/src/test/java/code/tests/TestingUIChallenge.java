package code.tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.drivers.BaseClass;

import pageObjects.ArticlesPage;

public class TestingUIChallenge extends BaseClass{
	
	String validItem = "chiffon";
	String invalidItem = "sdfsdf";
	
	
	@Test(priority = 1)
	public void AddingItemtoCartfromWomen() throws InterruptedException {
		ArticlesPage apage = new ArticlesPage(driver);
		int value = apage.selectingfromWomen();
		Assert.assertNotNull(value, "No items were selected");
	}
	
	@Test(priority = 0) 
	public void RemovingItem() throws InterruptedException {
		ArticlesPage apage = new ArticlesPage(driver);
		apage.removingItemfroCart();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(apage.getMessageCart()));
		String textmsg = apage.printingMsg();
		Assert.assertEquals(textmsg, "Your shopping cart is empty.", "There is some product into Shopping cart");
	}
	
	@Test
	public void SearchItems() throws InterruptedException {
		ArticlesPage apage = new ArticlesPage(driver);
		String msgResult = apage.searchingItem(validItem);
		Assert.assertEquals(msgResult, "2 results have been found.", "The search found 0 results");
	}
	
	@Test
	public void SearchInvalidItem() throws InterruptedException {
		ArticlesPage apage = new ArticlesPage(driver);
		String msgRes = apage.searchingItem(invalidItem);
		Assert.assertEquals(msgRes, "0 results have been found.", "The search found results");
	}
	
	@Test
	public void ScrollingtoFooter() throws InterruptedException {
		ArticlesPage apage = new ArticlesPage(driver);
		String email = apage.gettingEmail();
		Assert.assertNotEquals(email, "", "You have not reached out the footer");
	}
	
	
	

}
