package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_main_page {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	private WebElement SignIn;
	
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	private WebElement CreateAmazonAccount;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	private WebElement Name;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='ap_password_check']")
	private WebElement PasswordRecheck;
	
	@FindBy(xpath ="//input[@class=\"a-button-input\"]\r\n")
	private WebElement VerifyEmail;



	
	public Amazon_main_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void signin() {
		SignIn.click();
	}

    public void createamazonac() {
		CreateAmazonAccount.click();
	
    }
    public void name()
    {
    	Name.sendKeys("rakhi");
    }
    public void email_id()
    {
    	EmailId.sendKeys("tayaderakhi11@gmail.com");
    }
    public void password()
    {
    	password.sendKeys("automation@24");
    }
    public void passwordreck()
    {
    	PasswordRecheck.sendKeys("automation@24");
    }
    
    public void verifyemail()
    {
    	VerifyEmail.click();
    }



}
