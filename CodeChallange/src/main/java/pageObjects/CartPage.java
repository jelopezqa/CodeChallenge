package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.drivers.BaseClass;

public class CartPage extends BaseClass{
	
	public CartPage(WebDriver driver) {

	}
	
	@FindBy(xpath="//*[@id=\"product_3_13_0_0\"]/td[7]/div")
	public WebElement removeItem;
	
	@FindBy(id="total_product")
	public WebElement totalProduct;

}
