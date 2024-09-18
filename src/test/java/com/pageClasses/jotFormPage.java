package com.pageClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class jotFormPage {
	
public WebDriver driver;
	
	//constructor
	public jotFormPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); // MANDATORY
	}
	
	//Locators 

	
	@FindBy(xpath="//li[@aria-label='Login']")  
	WebElement LoginBtn;
	
	@FindBy(id="username")  
	WebElement Uname;
	
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="signinButton")
	WebElement signinbtn;
	
	@FindBy(xpath="//span[.='Create Form']")
	WebElement createform;
	
	@FindBy(xpath="//*[.='Start From Scratch']")
	WebElement stratFromScratch;
	
	@FindBy(xpath="//*[.='Classic Form']")
	WebElement classicForm;
	
	@FindBy(xpath="//*[@aria-label='CANCEL']")
	WebElement closeIcon;
	
	@FindBy(xpath="//*[@id='toogleLeftPanel']")
	WebElement addFormElement;
	
	@FindBy(xpath="//*[.='Full Name']")
	WebElement FullName;
	
	@FindBy(xpath="//li[@id='field_item_control_email']")
	WebElement Email;
	
	@FindBy(xpath="//*[.='Phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[.='Date Picker']")
	WebElement date;
	
	@FindBy(xpath="//*[.='Dropdown']")
	WebElement dropdown;
	
	@FindBy(xpath="//*[.='Single Choice']")
	WebElement singleChoice;
	
	@FindBy(xpath="//*[.='Multiple Choice']")
	WebElement multiChoice;
	
	@FindBy(xpath="//*[.='File Upload']")
	WebElement fileUpload;
	
	@FindBy(xpath="//*[.='Address']")
	WebElement address;
	
	@FindBy(xpath="//*[@id='field_item_control_signature']")
	WebElement signature;

	
	@FindBy(xpath="//*[@id='text']")
	WebElement textBox;
	
	@FindBy(xpath="//*[@class='flipSwitch-slider']")
	WebElement MandatoryField;
	
	@FindBy(id="question-settings-close-btn")
	WebElement closeSettings;
	
	@FindBy(id="header_1")
	WebElement header;
	
	@FindBy(xpath="//*[starts-with(@class,'btn sc-Properties')]")
	WebElement settingsIcon;
	
	@FindBy(xpath="//a[.='Settings']")
	WebElement SettingsTab;
	
	@FindBy(xpath="//input[@id='title' and @class='inpt injectCSSPrevention ']")
	WebElement FormTitle;
	
	@FindBy(xpath="//*[.='Publish']")
	WebElement publish;
	
	@FindBy(xpath="//*[.='Copy Link']")
	WebElement CopyLink;
	
	@FindBy(xpath="//*[.='Open in new tab']")
	WebElement OpenInNewTab;
	
	
	
	
	
	
		
	//Action methods
	
	public void launchApplication() {
		
		WebDriver driver = new ChromeDriver();//initialize chrome driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://www.jotform.com/");
	}
	
	public void loginToApplication()
	{
		LoginBtn.click();
		Uname.sendKeys("praveenreddy3112@gmail.com");
		pwd.sendKeys("Praveen7013@");
		signinbtn.click();
		
		
	}
	
	public void clickOnCreateForm() {
		createform.click();
	}
	
	public void clickOnStartFromScratch() {
		stratFromScratch.click();
	}
	public void clickOnClassicForm() {
		classicForm.click();
	}
	public void clickOnCloseIcon() {
		closeIcon.click();
	}
	public void clickOnAddFormElement() {
		addFormElement.click();
	}
	public void clickOnFullName() {
		FullName.click();
	}
	public void clickOnEmail() {
		Email.click();
	}
	public void clickOnPhone() {
		phone.click();
	}
	public void clickOnDatePicker() {
		date.click();
	}
	public void clickOnDropdown() {
		dropdown.click();
	}
	public void clickOnSingleChoice() {
		singleChoice.click();
	}
	public void clickOnMultipleChoice() {
		multiChoice.click();
	}
	public void clickOnFileUpload() {
		fileUpload.click();
	}
	public void clickOnAddress() {
		address.click();
	}
	public void clickOnSignature() {
		signature.click();
	}
	public void clickOnSettingsIcon() {
		settingsIcon.click();
	}
	public void clearInputText() {
		textBox.clear();
	}
	public void ChangeFieldName(String fieldName) {
		textBox.sendKeys(fieldName);;
	}
	public void clickOnMandataryField() {
		MandatoryField.click();
	}

	public void closeSettingsIcon() {
		closeSettings.click();
	}
	public void clickOnHeader() {
		header.click();
	}
	public void clickOnHeaderSettings() {
		settingsIcon.click();
	}
	public void navigateToSettingsTab() {
		SettingsTab.click();
	}
	public void changeTitleName() {
		FormTitle.sendKeys("Student Registartion Form");
	}
	public void clickOnPublish() {
		publish.click();
	}
	public void clickOnCopyLink() {
		CopyLink.click();
	}
	public void openInNewTab() {
		OpenInNewTab.click();
	}
	
	
}







