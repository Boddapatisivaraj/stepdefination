package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	@Given("Enter facebook site url")
	public void enter_facebook_site_url() {
	  System.out.println("facebook page is opened"); 
	}
	@When("user enter valid mobilenumber")
	public void user_enter_valid_mobilenumber() {
	    System.out.println("valid mobile number entered");
	}
	@When("wait for OTP")
	public void wait_for_otp() {
	    System.out.println("timeout for otp generation");
	}
	@When("Enter valid OTP")
	public void enter_valid_otp() {
	   System.out.println("valid otp entered");
	}
	@When("Click on Create Account Button")
	public void click_on_create_account_button() {
	    System.out.println("create account button clicked");
	}
	@Then("verify registration successful message displayed")
	public void verify_registration_successful_message_displayed() 
	{
	   System.out.println("message displayed");
	}



}
