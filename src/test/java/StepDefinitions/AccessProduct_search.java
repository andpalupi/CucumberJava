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

public class AccessProduct_search {

	WebDriver driver = null;
	homePage home;
	CellPhone_and_AccessoriesPage CellPhone_and_Accessories;
	
	@Given("open browser")
	public void open_browser() {
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

	@And("home web page")
	public void home_web_page() throws InterruptedException {
		System.out.println("Inside step - user is on home web page");
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(5000);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step - user enters a text in search box");
		home.entertext();
		Thread.sleep(3000);
	}
	
	@And("user select category")
	public void user_select_catgory() throws InterruptedException {
		System.out.println("Inside step - user select category button");
		home.selectCategory();
		Thread.sleep(3000);
	}
	
	@And("user click the search button")
	public void user_click_the_category_button() throws InterruptedException {
		System.out.println("Inside step - user click the search button");
		home.clickSearch_button();
		Thread.sleep(3000);				
	}

	@When("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside step - user is navigated to search results");
		Thread.sleep(4000);

	}
	
	@Then("verify search result")
	public void verify_search_result() throws InterruptedException {
		System.out.println("Inside step - verify search results");
		SoftAssert softAssert = new SoftAssert();
	    
		List<WebElement> products = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]"));
		for(WebElement product : products) {

			String x = "Macbook";
			Boolean actualtext = (driver.getPageSource().contains(x));
			softAssert.assertTrue(actualtext, x + " string not is present"); 
			softAssert.assertAll();
	        
	    }
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	      
	}
	
	
}
