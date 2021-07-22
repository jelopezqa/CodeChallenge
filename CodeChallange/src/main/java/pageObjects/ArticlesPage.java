package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.drivers.BaseClass;

public class ArticlesPage extends BaseClass{
	
	
	public ArticlesPage(WebDriver driver) {
		super(driver);
	}
	
	By linkBestSeller = By.linkText("BEST SELLERS");
	By linkWomen = By.linkText("WOMEN");
	By linkDresses = By.linkText("DRESSES");
	By linkTShirts = By.linkText("T-SHIRTS");
	By firstIndexItem = By.xpath("//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']");
	By secondtIndexItem = By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']");
	By AddtoIndexCart1 = By.xpath("//div[@class='button-container']/a[@data-id-product='3']");
	By AddtoIndexCart2 = By.xpath("//div[@class='button-container']/a[@data-id-product='4']");
	By firstDresstItem = By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']");
	By secondDressItem = By.xpath("//img[@src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']");
	By firstWomenItem = By.xpath("//img[@src='http://automationpractice.com/img/p/7/7-home_default.jpg']");
	By AddtoDressCart1 = By.xpath("//div[@class='button-container']/a[@data-id-product='4']");
	By AddtoDressCart2 = By.xpath("//div[@class='button-container']/a[@data-id-product='6']");
	By secondWomenItem = By.xpath("//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']");
	By AddWomentoCart1 = By.xpath("//div[@class='button-container']/a[@data-id-product='2']");
	By AddWomentoCart2 = By.xpath("//div[@class='button-container']/a[@data-id-product='5']");
	By firstTshirtItem = By.xpath("//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']");
	By AddTshirttoCart = By.xpath("//div[@class='button-container']/a[@data-id-product='1']");
	By closePopupWindow = By.xpath("//div[@class='button-container']/span[@title='Continue shopping']");
	By buttonCart = By.xpath("//div[@class='shopping_cart']/a[@title='View my shopping cart']");
	By listItems = By.xpath("//div[@id='order-detail-content']/table/tbody");
	By searchingBox = By.id("search_query_top");
	By buttonSearch = By.xpath("//button[@name='submit_search']");
	By removeItem = By.xpath("//div/a[@class='cart_quantity_delete']");
	By messageCart = By.xpath("//p[@class='alert alert-warning']");
	By emailInfo = By.xpath("//*[@id='block_contact_infos']/div/ul/li/span/a");
	By messageResult = By.xpath("//span[@class='heading-counter']");
	
	public void selectingfromIndex() throws InterruptedException {
		if(isDisplayed(firstIndexItem)) {
			moveTo(firstIndexItem);
			click(AddtoIndexCart1);
			closePopup(closePopupWindow);
			Thread.sleep(1000);
			moveTo(secondtIndexItem);
			click(AddtoIndexCart2);
			closePopup(closePopupWindow);
			Thread.sleep(1000);
		}else {
			System.out.println("No element found");
		}
		click(buttonCart);
		Assert.assertNotNull(findElements(listItems).size(), "No items were selected");
	}
	
	public void selectingfromDresses() throws InterruptedException {
		click(linkDresses);
		moveTo(firstDresstItem);
		click(AddtoDressCart1);
		closePopup(closePopupWindow);
		Thread.sleep(1000);
		moveTo(secondDressItem);
		click(AddtoDressCart2);
		closePopup(closePopupWindow);
		Thread.sleep(1000);
		click(buttonCart);
		Assert.assertNotNull(findElements(listItems).size(), "No items were selected");
	}
	
	public void selectingfromWomen() throws InterruptedException {
		click(linkWomen);
		if(isDisplayed(firstWomenItem)) {
			moveTo(firstWomenItem);
			click(AddWomentoCart1);
			closePopup(closePopupWindow);
			Thread.sleep(1000);
			moveTo(secondWomenItem);
			click(AddWomentoCart2);
			closePopup(closePopupWindow);
			Thread.sleep(1000);
		}else {
			System.out.println("No such element");
		}
		click(buttonCart);
		Assert.assertNotNull(findElements(listItems).size(), "No items were selected");
	}
	
	public void selectingfromTshirs() throws InterruptedException {
		click(linkTShirts);
		moveTo(firstTshirtItem);
		click(AddTshirttoCart);
		closePopup(closePopupWindow);
		Thread.sleep(1000);
		click(buttonCart);
		Assert.assertNotNull(findElements(listItems).size(), "No items were selected");
	}
	
	public void removingItemfroCart() throws InterruptedException {
		moveTo(firstIndexItem);
		click(AddtoIndexCart1);
		closePopup(closePopupWindow);
		click(buttonCart);
		click(removeItem);
		Thread.sleep(1000);
		System.out.println("Message: "+getText(messageCart));
		Assert.assertEquals(getText(messageCart), "Your shopping cart is empty.", "There is some product into Shopping cart");
	}
	
	public String searchingItem(String item) throws InterruptedException {
		type(item, searchingBox);
		Thread.sleep(1000);
		click(buttonSearch);
		Thread.sleep(1000);
		return getText(messageResult);
		
	}
	
	public String gettingEmail() throws InterruptedException {
		moveTo(emailInfo);
		Thread.sleep(2000);
		return getText(emailInfo);
	}
}
