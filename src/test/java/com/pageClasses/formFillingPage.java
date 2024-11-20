package com.pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class formFillingPage {
	
public WebDriver driver;

	//constructor
	public formFillingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); 
	}
	
	
	//Locators 

	

	
	@FindBy(xpath="//input[@id='first_3']")
	WebElement firstName;

	@FindBy(xpath="//input[@id='last_3']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input_4']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input_5_null']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='lite_mode_6']")
	WebElement date;
	
	@FindBy(xpath="//input[@id='input_7']")
	WebElement dropdownselect;
	
	
	@FindBy(xpath="//input[@id='label_input_8_0']")
	WebElement singlechoice;
	
	
	@FindBy(xpath="//input[@id='label_input_9_0']")
	WebElement multichoice1;
	

	@FindBy(xpath="//input[@id='label_input_9_1']")
	WebElement multichoice2;
	

	@FindBy(xpath="//input[@id='label_input_9_2']")
	WebElement multichoice3;
	

	@FindBy(xpath="//input[@id='label_input_9_3']")
	WebElement multichoice4;
	
	
	@FindBy(xpath="//input[@id='input_10']")
	WebElement fileupload;
	
	@FindBy(id="input_11_addr_line1']")
	WebElement streetaddress;
	
	@FindBy(xpath="//input[@id='input_11_addr_line2']")
	WebElement streetaddressline2 ;
	
	@FindBy(xpath="//input[@id='input_11_city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='input_11_state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='input_11_postal']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id='sig_pad_12']")
	WebElement signature;
		
	@FindBy(xpath="//*[text()='Your submission has been received.']")
	WebElement confirmMessage;
	
	@FindBy(xpath="//button[text()='Continue'][2]")
	WebElement continubtn;
	
	@FindBy(xpath="//*[text()='Sign Document']")
	WebElement signDoc;
	
	

	public void moveToElement(WebElement data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", data);
		
	}
	public void enterfirstname() {
		
		firstName.sendKeys("Praveen");
	}
	public void enterlasttname() {
		lastName.sendKeys("Reddy");
	}
	public void enterEmail()
	{
		email.sendKeys("praveenreddy3112@gmail.com");
	}
	public void enterPhone() {

		moveToElement(phone);
		phone.sendKeys("7013869139");
	}
	public void enterdate() {
		moveToElement(date);
		date.sendKeys("09/09/2024");
	}
	public void enteraddress()
	{
		moveToElement(streetaddress);
		streetaddress.sendKeys("ST colony");
		moveToElement(streetaddressline2);
		streetaddressline2.sendKeys("Khajipalli");
		moveToElement(city);
		city.sendKeys("kadapa");
		moveToElement(state);
		state.sendKeys("Andhra Pradesh");
		moveToElement(zipcode);
		zipcode.sendKeys("516002");
	}
	public void entersignature()
	{
		moveToElement(signature);
		signature.click();
		
	}
	
	public void selectOptionFromDropdown() {
		moveToElement(dropdownselect);
		Select dropdown = new Select(dropdownselect);
		dropdown.selectByIndex(0);
	}
	
	public void uploadTheFile() {
		moveToElement(fileupload);
		fileupload.sendKeys("C:\\Users\\nimmakayala.reddy\\Downloads\\files\\AADHAR");
	}
	
	public void singlechoice() {
		moveToElement(singlechoice);
		singlechoice.click();
	}
	
	
	public void multichoice() {
		moveToElement(multichoice1);
		multichoice1.click();
		moveToElement(multichoice2);
		multichoice2.click();
		moveToElement(multichoice3);
		multichoice3.click();
		moveToElement(multichoice4);
		multichoice4.click();
	}
	public void clickonContinue() {
		moveToElement(continubtn);
		continubtn.click();
	}
		
		public void clickonsignDoc() {
			moveToElement(signDoc);
			signDoc.click();
		
		
	}
	public void confirmationMessage() {
		moveToElement(confirmMessage);
		boolean actual =confirmMessage.isDisplayed();
		Assert.assertEquals(actual, true);
		
	}
}
