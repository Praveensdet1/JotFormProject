package com.testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageClasses.formFillingPage;
import com.pageClasses.jotFormPage;



public class TC_03_Verify_Jotform_by_submitting_only_few_mandatory_fields{

	public WebDriver driver;

	@Test
	public void testJotFormApp() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jotform.com/");
		Thread.sleep(5000);
	
		
		jotFormPage pg = new jotFormPage(driver);
		formFillingPage fg = new formFillingPage(driver);
		//pg.launchApplication();
		pg.loginToApplication();
		Thread.sleep(5000);
		pg.clickOnCreateForm();
		pg.clickOnStartFromScratch();
		pg.clickOnClassicForm();
		pg.clickOnCloseIcon();
		pg.clickOnAddFormElement();
		
		pg.clickOnHeader();
		pg.clickOnHeaderSettings();
		pg.clearInputText();
		pg.ChangeFieldName("STUDENT REGISTRATION FORM");
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
	
		pg.clickOnFullName();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("FULL NAME");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnEmail();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("EMAIL");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnPhone();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("PHONE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnDatePicker();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("BIRTH DATE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnDropdown();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("COUNTRY");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnSingleChoice();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("GENDER");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnMultipleChoice();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("LANGUAGES KNOWN");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnFileUpload();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("UPLOAD IMAGE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnAddress();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("ADDRESS");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
		
		Thread.sleep(3000);
		
		pg.clickOnSignature();
		Thread.sleep(3000);
		pg.clickOnSettingsIcon();
		pg.clearInputText();
		pg.ChangeFieldName("SIGNATURE");
		pg.clickOnMandataryField();
		pg.closeSettingsIcon();
		pg.clickOnAddFormElement();
	
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
		
		Thread.sleep(10000);
		
		fg.enterfirstname();
		fg.enterlasttname();
		fg.enterEmail();
		
		//3) scroll page till end of the page.
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		pg.submitForm();
		Thread.sleep(3000);
		
		String erroscount = driver.findElement(By.xpath("(//*[.='8'])[1]")).getText();
		System.out.print(erroscount);
		Assert.assertEquals(erroscount, "8");
		
		Thread.sleep(3000);
		driver.quit();		
        
	    
		
		
	}}


