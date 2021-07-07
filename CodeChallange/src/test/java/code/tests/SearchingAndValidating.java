package code.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.drivers.BaseClass;

import pageObjects.ArticlesPage;

public class SearchingAndValidating extends BaseClass{
		
	@Test(enabled=false)
	public void SearchItems() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		ipage.searchingBox.sendKeys("chiffon");
		Thread.sleep(1000);
		ipage.buttonSearch.click();
		Thread.sleep(2000);
		String result = ipage.textResult.getText();
		System.out.println("Result: "+result);
		result = result.substring(0,1);
		System.out.println("Result: "+result);
		Assert.assertNotEquals(result, 0, "The search found 0 results");
	}
	
	@Test(enabled=false)
	public void SearchInvalidItem() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		ipage.searchingBox.sendKeys("sdfsdf");
		Thread.sleep(1000);
		ipage.buttonSearch.click();
		Thread.sleep(2000);
		String result = ipage.textNoResult.getText();
		System.out.println("Result: "+result);
		result = result.substring(0,10);
		System.out.println("Result: "+result);
		Assert.assertEquals(result, "No results", "The search found results");
	}
	
	@Test(enabled=true)
	public void ScrollingtoFooter() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", ipage.emailInfo);
		String email= ipage.emailInfo.getText();
		System.out.println("Email info: "+email);
		Assert.assertNotEquals(email, "", "You have not reached out the footer");
	}

}
