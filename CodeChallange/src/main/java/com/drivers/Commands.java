package com.drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands {
	
	public WebDriver driver;
	
	public Commands(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();		
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;						
		}
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void moveTo(By locator) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement((By)locator));
		act.moveToElement(driver.findElement((By) locator)).perform();
		
	}
	
	public void closePopup(By locator) {
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(locator));
		click(locator);
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(inputText);
	}

}
