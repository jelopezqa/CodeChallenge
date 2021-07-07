package code.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.drivers.BaseClass;

import pageObjects.ArticlesPage;


public class AddingItemsTest extends BaseClass {
	//WebDriver driver;

	@Test(enabled=false)
	public void AddingItemtoCartFromIndex() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.firstIndexItem);
		Thread.sleep(1000);
		act.moveToElement(ipage.firstIndexItem).perform();
		Thread.sleep(1000);
		ipage.AddtoIndexCart1.click();
		Thread.sleep(1000);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		jse.executeScript("arguments[0].scrollIntoView();", ipage.secondtIndexItem);
		Thread.sleep(1000);
		act.moveToElement(ipage.secondtIndexItem).perform();
		ipage.AddtoIndexCart2.click();
		Thread.sleep(1000);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		ipage.buttonCart.click();
	}
	
	@Test(enabled=false) 
	public void AddingItemtoCartfromDresses() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		ipage.linkDresses.click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.firstDresstItem);
		act.moveToElement(ipage.firstDresstItem).perform();
		ipage.AddtoDressCart1.click();
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		Thread.sleep(1000);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.secondDressItem);
		act.moveToElement(ipage.secondDressItem).perform();
		ipage.AddtoDressCart2.click();
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		ipage.buttonCart.click();
	}
	
	@Test(enabled=false) 
	public void AddingItemtoCartfromWomen() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		ipage.linkWoman.click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.firstWomenItem);
		act.moveToElement(ipage.firstWomenItem).perform();
		ipage.AddWomentoCart1.click();
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		Thread.sleep(1000);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.secondWomenItem);
		act.moveToElement(ipage.secondWomenItem).perform();
		Thread.sleep(1000);
		ipage.AddWomentoCart2.click();
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		ipage.buttonCart.click();
		
	}
	
	@Test(enabled=true)
	public void addingItemCartfromTshirt() throws InterruptedException {
		ArticlesPage ipage = new ArticlesPage(driver);
		ipage.linkTShirts.click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", ipage.firstTshirtItem);
		act.moveToElement(ipage.firstTshirtItem).perform();
		ipage.AddTshirttoCart.click();
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]")));
		ipage.closePopupWindow.click();
		ipage.buttonCart.click();
	}
	

	
	

}
