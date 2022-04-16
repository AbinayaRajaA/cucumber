package org.sample;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Facebook;
import pom.ForPass;

public class StepDefinition extends BaseClass{
	public WebDriver driver;
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	   launchBrowser();
	   launchUrl("https://www.facebook.com/");
	   maxWindow(); 
	    
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
	   Facebook f=new Facebook();
	   getInput(f.getTxtEmail(), "greens123@gmail.com");
	   getInput(f.getTxtPass(), "abi123");
	   }
	
	


	@When("User click the login button")
	public void user_click_the_login_button() {
		 Facebook f=new Facebook();
		 btnClick(f.getBtnLogin());
	}

	@Then("User should be in a invalid credential page")
	public void user_should_be_in_a_invalid_credential_page() {
		
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("To check the the Url", url.contains("https://www.facebook.com/"));
	}
	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> as = d.asMaps();
		Facebook f=new Facebook();
	    getInput(f.getTxtEmail(),as.get(1).get("Mail"));
	    getInput(f.getTxtPass(), as.get(1).get("Phone"));
		   
		   
	}
	@When("user have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
		ForPass p=new ForPass();
		btnClick(p.getForPass());
		
	}
	@When("user have to enter email or mobile number")
	public void user_have_to_enter_email_or_mobile_number() {
		ForPass p=new ForPass();
		getInput(p.getTxtMail(), "8675874885");
		
		
		
	}
	@When("User enter Invalid username and Invalid password")
	public void userEnterInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		Facebook f=new Facebook();
		Map<String, String> a= d.asMap(String.class,String.class);
		   getInput(f.getTxtEmail(), a.get("Mail"));
		   getInput(f.getTxtPass(), a.get("Phone"));
	}

	@Then("user have to click the search button")
	public void user_have_to_click_the_search_button() {
		ForPass p=new ForPass();
	    btnClick(p.getBtnSearch());
}
	@Then("User is in invalid credential page")
	public void userIsInInvalidCredentialPage() {
	    String url = getUrl();
	    assertTrue("Check the url", url.contains("https://www.facebook.com/"));
	}

}
