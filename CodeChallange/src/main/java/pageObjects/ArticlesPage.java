package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.drivers.Commands;



public class ArticlesPage extends Commands {
	
	WebDriver driver;
	
	public ArticlesPage(WebDriver driver) {
		super(driver);
	}
	
	By linkWomen = By.linkText("WOMEN");
	By firstWomenItem = By.xpath("//img[@alt='Blouse']");
	By secondWomenItem = By.xpath("//img[@alt='Printed Chiffon Dress']");
	By AddWomentoCart1 = By.xpath("//div[@class='button-container']/a[@data-id-product='2']");
	By AddWomentoCart2 = By.xpath("//div[@class='button-container']/a[@data-id-product='7']");
	By closePopupWindow = By.xpath("//div[@class='button-container']/span[@title='Continue shopping']");
	By buttonCart = By.xpath("//div[@class='shopping_cart']/a[@title='View my shopping cart']");
	By listItems = By.xpath("//div[@id='order-detail-content']/table/tbody");
	By searchingBox = By.id("search_query_top");
	By buttonSearch = By.xpath("//button[@name='submit_search']");
	By removeItem = By.xpath("//div/a[@class='cart_quantity_delete']");
	By messageCart = By.xpath("//p[@class='alert alert-warning']");
	By emailInfo = By.xpath("//*[@id='block_contact_infos']/div/ul/li/span/a");
	By messageResult = By.xpath("//span[@class='heading-counter']");
	
	
		
	public int selectingfromWomen() throws InterruptedException {
		click(linkWomen);
		moveTo(firstWomenItem);
		click(AddWomentoCart1);
		closePopup(closePopupWindow);
		moveTo(secondWomenItem);
		click(AddWomentoCart2);
		closePopup(closePopupWindow);
		click(buttonCart);
		return findElements(listItems).size();
		
	}	
	
	public void removingItemfroCart() throws InterruptedException {
		click(linkWomen);
		moveTo(firstWomenItem);
		click(AddWomentoCart1);
		closePopup(closePopupWindow);
		click(buttonCart);
		click(removeItem);
	}
	
	public String printingMsg() {
		String msg = getText(messageCart);
		System.out.println("Message: "+msg);
		return msg;
	}
	
	public By getMessageCart() {
		return messageCart;
	}

	public String searchingItem(String item) throws InterruptedException {
		type(item, searchingBox);
		click(buttonSearch);
		return getText(messageResult);
		
	}
	
	public String gettingEmail() throws InterruptedException {
		moveTo(emailInfo);
		return getText(emailInfo);
	}
}
