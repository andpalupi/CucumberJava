package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pages.homePage;

public class GoogleSearchSteps {

	WebDriver driver = null;
	homePage home;
	
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
		
	}

	@And("user is on Verint page")
	public void user_is_on_verint_search_page() throws InterruptedException {
		System.out.println("Inside step - user is on google search page");
		driver.navigate().to("https://www.verint.com/");
		Thread.sleep(3000);
		
	}

	@When("users click the search button")
	public void users_click_the_search_button() throws InterruptedException {
		System.out.println("Inside step - user click search button");
		
		home = new homePage(driver);
		
		home.clickSearch();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.cssSelector("#site-header > div > div.site-header__container > div > div.site-header__mobile.flex > div > button")).click();
	}
	
	@When("users enters a text in search box")
	public void users_enters_a_text_in_search_box() {
		System.out.println("Inside step - user enters a text in search box");
		driver.findElement(By.id("search-input--desktop")).sendKeys("Customer Solution");
//		WebElement searchlist = driver.findElement(By.id("search-input--desktop"));
//		searchlist.sendKeys("Customer Solution");
//		home.entertext();
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside step - hits enter");
		driver.findElement(By.id("search-input--desktop")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@When("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside step - users is navigated to search results");
		Thread.sleep(5000);

	}
	
	@Then("verify search result")
	public void verify_search_result() throws InterruptedException {
		System.out.println("Inside step - verify search result");

	    List<WebElement> results = driver.findElements(By.xpath("//article[@class=\"gray-card gray-card--arrow flex\"]"));

	    for(WebElement each : results)
	    {
			String t = "Customer Solution";
		      if (driver.getPageSource().contains("Customer Solution"))
		      {
		         System.out.println("Text: " + t + " is present. ");
		      } 
		      else 
		      {
		         System.out.println("Text: " + t + " is not present. ");
		      }
	    }
	    
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	      
	}
	
	
}
