package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriver;
import org.openqa.selenium.*;

public class homePage {

	protected WebDriver driver;
	
	private By txt_electronic_gencategory_button = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
	private By txt_smartphone_and_acc_category_button = By.xpath("//*[@id=\"s0-16-12-0-1[0]-0-0-27[1]-0-toggle-button\"]/span");
	private By txt_search_button = By.id("gh-btn");
	public homePage(WebDriver driver){
		this.driver = driver;
	}
		
	public void clickGeneralCategory_button() {	
		WebElement ele = driver.findElement(txt_electronic_gencategory_button);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	
	public void clickCategory_button() {	
		WebElement ele = driver.findElement(txt_smartphone_and_acc_category_button);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	

	public void entertext(){
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Macbook");
	}
	
	public void selectCategory() {
		Select category = new Select(driver.findElement(By.id("gh-cat")));
		category.selectByVisibleText("Computers/Tablets & Networking");
	}
	
	public void clickSearch_button() {
		WebElement search = driver.findElement(txt_search_button);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", search);
	}
	
}
