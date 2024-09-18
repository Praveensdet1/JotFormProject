package com.testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.pageClasses.jotFormPage;



public class JotForm{

	public WebDriver driver;

	@Test
	public void testJotFormApp() throws InterruptedException {
		
		 driver = new ChromeDriver();//initialize chrome driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.jotform.com/");
		Thread.sleep(5000);
	
		
		
		/*driver.findElement(By.xpath("//li[@aria-label='Login']")).click();
		driver.findElement(By.id("username")).sendKeys("praveenreddy2531@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Praveen7013@");
		driver.findElement(By.id("signinButton")).click();
		*/
		
		jotFormPage pg = new jotFormPage(driver);
		//pg.launchApplication();
		pg.loginToApplication();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@title=\"reCAPTCHA\"]")));
		Thread.sleep(5000);
		driver.findElement(By.id("recaptcha-anchor-label")).click();
		driver.findElement(By.id("signinButton")).click();
		Thread.sleep(5000);
		pg.clickOnCreateForm();
		pg.clickOnStartFromScratch();
		pg.clickOnClassicForm();
		pg.clickOnCloseIcon();
		pg.clickOnAddFormElement();
		
		pg.clickOnHeader();
		pg.clickOnHeaderSettings();
		pg.clearInputText();
		pg.ChangeFieldName("StudentRegistrationForm");
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
	/*
		pg.clickOnFullName();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("FUllNAME");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnEmail();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("EMAIL");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnPhone();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("PHONE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnDatePicker();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("BIRTHDATE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnDropdown();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("COUNTRY");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnSingleChoice();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("GENDER");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnMultipleChoice();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("LANGUAGESKNOWN");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnFileUpload();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("UPLOADIMAGE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnAddress();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("ADDRESS");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		
		Thread.sleep(3000);
		
		pg.clickOnSignature();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("SIGNATURE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
	*/
		Thread.sleep(5000);
		 System.out.println(driver.getCurrentUrl());
		
		
	    pg.navigateToSettingsTab();
	    Thread.sleep(30000);
	    pg.changeTitleName();
	    pg.clickOnPublish();
	    Thread.sleep(30000);
	    pg.openInNewTab();
	    
	    
	   
	   //code to navigate to another window and fill the form
		
Set<String> windowIDs=driver.getWindowHandles();
		
		//Appoach1
		List<String> windowList=new ArrayList(windowIDs);
		
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		//switch to child window
		driver.switchTo().window(childID);
		
		
		driver.findElement(By.id("input_2")).click();
		Thread.sleep(3000);
		
        
	    
		
		
	}}


