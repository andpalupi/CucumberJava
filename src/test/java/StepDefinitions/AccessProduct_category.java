package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.CellPhone_and_AccessoriesPage;
import pages.homePage;
import org.testng.asserts.SoftAssert;

public class AccessProduct_category {

	WebDriver driver = null;
	homePage home;
	CellPhone_and_AccessoriesPage CellPhone_and_Accessories;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path "+ projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();

		home = new homePage(driver);
		CellPhone_and_Accessories = new CellPhone_and_AccessoriesPage(driver);
	}

	@And("user is on home web page")
	public void user_is_on_home_web_page() throws InterruptedException {
		System.out.println("Inside step - user is on home web page");
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(5000);
	}

	@When("user click the general category button")
	public void user_click_the_general_category_button() throws InterruptedException {
		System.out.println("Inside step - user click general category button");
		home.clickGeneralCategory_button();
		Thread.sleep(3000);
	}
	
	@And("user click the category button")
	public void user_click_the_category_button() throws InterruptedException {
		System.out.println("Inside step - user click category button");
		home.clickCategory_button();
		Thread.sleep(3000);
	}

	@And("user click the sub category button")
	public void user_click_the_subcategory_button() throws InterruptedException {
		System.out.println("Inside step - user click sub category button");
		CellPhone_and_Accessories.clickSubCategory_button();
		Thread.sleep(2000);
		
	}

	@When("user click filter button")
	public void clickAllFilters_button() throws InterruptedException {
		System.out.println("Inside step - user click all filter button");		
		CellPhone_and_Accessories.clickAllFilters_button();
		Thread.sleep(5000);
				
	}

	@And("user select the filter")
	public void selectFilters_button() throws InterruptedException {
		System.out.println("Inside step - user select filter button");
		
		CellPhone_and_Accessories = new CellPhone_and_AccessoriesPage(driver);		
		CellPhone_and_Accessories.selectFilters_button();
				
	}

	@When("user is navigated to filter results")
	public void user_is_navigated_to_filter_results() throws InterruptedException {
		System.out.println("Inside step - user is navigated to search results");
		Thread.sleep(4000);

	}
	
	@Then("verify filter result")
	public void verify_filter_result() throws InterruptedException {
		System.out.println("Inside step - verify search results");
		SoftAssert softAssert = new SoftAssert();
	    
		List<WebElement> products = driver.findElements(By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-0\"]/ul/li[1]"));
		for(WebElement product : products) {

			String x = "phone";
			Boolean actualtext = (driver.getPageSource().contains(x));
			softAssert.assertTrue(actualtext, x + " string is not present");   
			softAssert.assertAll();
	        
	    }
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	      
	}
	
	
}
