package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step - browser is open");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path "+ projectPath);
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
//		driver.manage().window().maximize();
//		
//		}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("user enters (.*) and (.*)")
//	public void user_enters_username_and_password() {
//		driver.findElement(By.id("name")).sendKeys("Arin");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		
//	}
//	@And("user click on login")
//	public void user_click_on_login() {
//		driver.findElement(By.id("login")).click();
//	}
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(5000);
//		
//		driver.close();
//		driver.quit();
//	}
}
