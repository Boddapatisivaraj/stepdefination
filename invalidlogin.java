package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidlogin {
	
	WebDriver driver;
	
	@Given("Outlook Url at chrome")
	public void outlook_url_at_chrome() {
		driver=new ChromeDriver();
		driver.get("https://outlook.com/owa/");
		driver.manage().window().setSize(new Dimension(789,540));
	}
	@Given("click on SignIn button")
	public void click_on_sign_in_button() {
	   driver.findElement(By.linkText("Sign in")).click();
	}
	@When("User enter valid username")
	public void user_enter_valid_username() throws Exception {
		driver.findElement(By.id("i0116")).sendKeys("sastryboddapativnsss@gmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
	}
	@When("enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.id("i0118")).sendKeys("dsfdsfdffdsfdf");
		driver.findElement(By.id("idSIButton9")).click();
	   
	}
	@Then("verify error message displayed")
	public void verify_error_message_displayed() {
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("passwordError"),"Your account or password is incorrect. If you don’t remember your password"));
	}


}
