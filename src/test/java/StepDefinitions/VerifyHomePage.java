package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyHomePage {

	WebDriver driver = null;
	
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
	   
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :" +projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.manage().timeouts().wait(6000);
		driver.manage().window().maximize();
		 System.out.println("The Browser is opened");
	}

	@When("the user enters the url for the given website")
	public void the_user_enters_the_url_for_the_given_website() {
	   
		driver.navigate().to("https://www.calculator.net/carbohydrate-calculator.html");		
	    System.out.println("The web page is loaded");
	    
	}

	@Then("the user verifies the home page of the website")
	public void the_user_verifies_the_home_page_of_the_website() {
	   
		driver.findElement(By.xpath("//h1[normalize-space()='Carbohydrate Calculator']"));
		 System.out.println("The web page is does not have any errors");	
		 driver.close();
		 driver.quit();
		 
	}

	
}
