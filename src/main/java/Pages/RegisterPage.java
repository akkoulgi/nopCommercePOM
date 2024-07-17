package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	WebDriver driver;
	
	// constructor - Special method - Class name is same as method name. -
	//To Initialise Data members
	
	
	
	public RegisterPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver) 
		// All the elements in this class are being initialised.
		
		
	}
	
	// Defining my Page objects
	
	// Encapsulating our locators/ objects.

	
	@FindBy(id = "gender-male") 
	private WebElement maleradiobtn; 
	

	@FindBy(id = "gender-female") 
	private WebElement femaleradiobtn;
	
	
	@FindBy(linkText = "Wishlist") 
	private WebElement wishlistlink;
	
	@FindBy(className = "ico-register")
	private WebElement registerlink;
	
	
	@FindBy(name = "FirstName")
	private WebElement firstnametext;
	
	
	@FindBy(name = "LastName")
	private WebElement Lasttname;
	
	@FindBy(name = "DateOfBirthDay")
	private WebElement daydropdown;
		
	@FindBy(name = "DateOfBirthMonth")
	private WebElement monthdropdown;

	
	@FindBy(name = "DateOfBirthYear")
	private WebElement yeardropdown;
	
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailtext;
	
	@FindBy(css = "#Company")
	private WebElement companyname;
	
	
	@FindBy(css = "#Password")
	private WebElement password;
	
	
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;
	
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement registerbutton;
	
	
	
	
	// Getters Methods for all my Webelements

	
	public WebElement getMaleradiobtn() {
		return maleradiobtn;
	}

	public WebElement getFemaleradiobtn() {
		return femaleradiobtn;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getFirstnametext() {
		return firstnametext;
	}

	public WebElement getLasttname() {
		return Lasttname;
	}

	public WebElement getDaydropdown() {
		return daydropdown;
	}

	public WebElement getMonthdropdown() {
		return monthdropdown;
	}

	public WebElement getYeardropdown() {
		return yeardropdown;
	}

	public WebElement getEmailtext() {
		return emailtext;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	// Business methods
	
	
	
	public void checkorder(String orderid, String emailid) {
		
		// Entering order id, email id and then clicking on continue
		
		firstnametext.sendKeys(orderid);
	}
	
	Select s;
	public void registeruser(String firstname,String lastnamev,String daytext,String monthtext,String yeartext,String email,String passwordv,String conform) throws InterruptedException {
		
		femaleradiobtn.click();
		firstnametext.sendKeys(firstname);
		Lasttname.sendKeys(lastnamev);
		s= new Select(daydropdown);
		s.selectByVisibleText(daytext);
		
		Thread.sleep(1000);
		
		s = new Select(monthdropdown);
		
		s.selectByVisibleText(monthtext);
		
		Thread.sleep(1000);

		s= new Select(yeardropdown);

		Thread.sleep(1000);

		s.selectByVisibleText(yeartext);

		emailtext.sendKeys(email);
		password.sendKeys(passwordv);
		confirmpassword.sendKeys(conform);
		registerbutton.click();
	}
	
	
	
	
}
