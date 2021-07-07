package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.drivers.BaseClass;

public class ArticlesPage extends BaseClass{
	
	public ArticlesPage(WebDriver driver) {
	}
	
	@FindBy(xpath="//ul[@id='home-page-tabs']/li/a[@class='blockbestsellers']")
	public WebElement linkBestSeller;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/a[@title='Women']")
	public WebElement linkWoman;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/a[@title='Dresses']")
	public WebElement linkDresses;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']")
	public WebElement linkTShirts;
	
	@FindBy(xpath="//ul[@id='homefeatured']/li/div/div/div/a[@class='product_img_link' and @title='Printed Dress']")
	public  WebElement firstIndexItem;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")
	public WebElement secondtIndexItem;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='3']")
	public WebElement AddtoIndexCart1;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='4']")
	public WebElement AddtoIndexCart2;	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
	public WebElement firstDresstItem;
		
	@FindBy(xpath="//div[@class='product-container']/div/div/a/img[@title='Printed Chiffon Dress']")
	public WebElement secondDressItem;
	
	@FindBy(xpath="//div[@class='product-image-container']/a/img[@title='Blouse']")
	public WebElement firstWomenItem;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img")
	public WebElement secondWomenItem;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='2']")
	public WebElement AddWomentoCart1;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='5']")
	public WebElement AddWomentoCart2;
	
	@FindBy(xpath="//div[@class='product-image-container']/a/img[@title='Faded Short Sleeve T-shirts']")
	public WebElement firstTshirtItem;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='1']")
	public WebElement AddTshirttoCart;
	
	@FindBy(xpath="//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='3' and xpath='1']")
	public WebElement firstAddtoCartItem;
	
	@FindBy(xpath="//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='4' and @xpath='1']")
	public WebElement seconAddtoCartdItem;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='6']")
	public WebElement AddtoDressCart1;
	
	@FindBy(xpath="//div[@class='button-container']/a[@data-id-product='7']")
	public WebElement AddtoDressCart2;
	
	@FindBy(xpath="//div[@class='shopping_cart']/a[@title='View my shopping cart']")
	public WebElement buttonCart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	public WebElement closePopupWindow;
	
	@FindBy(id="search_query_top")
	public WebElement searchingBox;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	public WebElement textResult;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p")
	public WebElement textNoResult;
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li/span/a")
	public WebElement emailInfo;
	
	
		
	
	

}
