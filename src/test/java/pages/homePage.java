package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriver;
import org.openqa.selenium.*;

public class homePage {

	protected WebDriver driver;
	
//	private By txt_search_button = By.xpath("//button[@class='site-header_button site-header_button--search flex js-toggle-search']");
//	private By txt_search_button = By.cssSelector("div > .site-header_button site-header_button--search flex js-toggle-search");
	private By txt_search_button = By.xpath("//button[@aria-label=\"Open Search\"]");
//	private By txt_entertext = By.id("search-input--desktop");

	public homePage(WebDriver driver){
		this.driver = driver;
	}
		
	public void clickSearch() {	
//		driver.findElement(txt_search_button).click();
		WebElement ele = driver.findElement(txt_search_button);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
//	public void entertext(){
//		WebElement ele = driver.findElement(txt_entertext);
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].sendKeys();", ele);
//	}
	
}
