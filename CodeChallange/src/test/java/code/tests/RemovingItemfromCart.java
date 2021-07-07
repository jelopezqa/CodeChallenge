package code.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.drivers.BaseClass;

import pageObjects.CartPage;
import pageObjects.ArticlesPage;

public class RemovingItemfromCart extends BaseClass {
	
	@Test
	public void RemovingItem() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.firstIndexItem);
		Thread.sleep(1000);
		act.moveToElement(ipage.firstIndexItem).perform();
		Thread.sleep(1000);
		ipage.AddtoIndexCart1.click();
		Thread.sleep(1000);
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		act.moveToElement(ipage.secondtIndexItem).perform();
		Thread.sleep(1000);
		ipage.AddtoIndexCart2.click();
		Thread.sleep(1000);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		ipage.buttonCart.click();
		Thread.sleep(2000);
		CartPage cpage = new CartPage(driver);
		cpage.removeItem.click();
	}

}
