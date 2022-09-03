package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class CellPhone_and_AccessoriesPage {

	protected WebDriver driver;
	
	private By txt_cellphone_and_smartphone_subcategory_button = By.xpath("//*[@id=\"s0-16-12-0-1[0]-0-0-27[1]-0\"]/ul/li[6]/a");
	private By txt_click_All_filters = By.xpath("//*[@id=\"s0-27_2-9-0-1[0]-0-0\"]/section/ul[1]/li[9]/button");
	private By txt_filter_screensize = By.xpath("//*[@id=\"c3-mainPanel-Screen%20Size\"]");
	private By screen_40_44_inch = By.xpath("//*[@id=\"c3-subPanel-Screen%20Size_4.0%20-%204.4%20in_cbx\"]");
	private By txt_filter_price = By.xpath("//*[@id=\"c3-mainPanel-price\"]");
	private By min_price = By.xpath("//*[@id=\"c3-subPanel-_x-price-textrange\"]/div/div[1]/div/input");
	private By max_price = By.xpath("//*[@id=\"c3-subPanel-_x-price-textrange\"]/div/div[2]/div/input");
	private By txt_filter_location = By.xpath("//*[@id=\"c3-mainPanel-location\"]");
	private By Asia = By.xpath("//*[@id=\"c3-subPanel-location_Asia\"]/span/span/input");
	
	private By ApplyFilter = By.xpath("//*[@id=\"x-overlay__form\"]/div[3]/div[2]/button");
	
	public CellPhone_and_AccessoriesPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickSubCategory_button() throws InterruptedException {	
		WebElement ele = driver.findElement(txt_cellphone_and_smartphone_subcategory_button);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(10000);
	}

	public void clickAllFilters_button() throws InterruptedException {	
		WebElement ele = driver.findElement(txt_click_All_filters);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(8000);
	}

	public void selectFilters_button() throws InterruptedException {	
		WebElement filter_screensize = driver.findElement(txt_filter_screensize);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", filter_screensize);
		
		Thread.sleep(3000);
		
		WebElement screensize1 = driver.findElement(screen_40_44_inch);
		executor.executeScript("arguments[0].click();", screensize1);
		
		Thread.sleep(2000);
		
		WebElement filter_price = driver.findElement(txt_filter_price);
		executor.executeScript("arguments[0].click();", filter_price);
		
		Thread.sleep(2000);
		
		driver.findElement(min_price).sendKeys("5000000");
		Thread.sleep(1000);
		driver.findElement(max_price).sendKeys("15000000");
		
		Thread.sleep(5000);
		
		WebElement filter_location = driver.findElement(txt_filter_location);
		executor.executeScript("arguments[0].click();", filter_location);
		
		Thread.sleep(2000);
		
		WebElement location1 = driver.findElement(Asia);
		executor.executeScript("arguments[0].click();", location1);		
		
		Thread.sleep(2000);
		
		//click Apply
		WebElement apply = driver.findElement(ApplyFilter);
		executor.executeScript("arguments[0].click();", apply);
		
		Thread.sleep(2000);
	}
	
}
