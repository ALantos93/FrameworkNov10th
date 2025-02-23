package com.mit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	public WebDriver driver;
	
	public GoogleHome(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//1) FIND/LOCATE ELEMENT
	//WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchBox;
	
	
	public void enterSearch(String string) {
	searchBox.sendKeys(string);	
	}
	
	
	//	WebElement searchBtn = driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	
	
	public void clickSearch() {
		searchBtn.click();
		
		
	}
	
	
	
}
	


