package com.mit.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.mit.common.GoogleBase;
import com.mit.pages.GoogleHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase {
	
	//public WebDriver driver;
	GoogleHome gH;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() { 
		LaunchBrowser();
		
	} 

	@When("I enter search {string}")
	public void i_enter_search(String string) { 
		gH = new GoogleHome(driver);
		gH.enterSearch(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		gH.clickSearch();
		
		
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		CloseBrowser();
	  
	}
	
	

}
