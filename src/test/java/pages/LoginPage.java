package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;


public class LoginPage extends BaseClass {
	 // Constructor to initialize elements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	 // Locators
    @FindBy(id = "username")
    private WebElement txtUsername;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(id = "login")
    private WebElement btnLogin;
    
    // Actions
    public void login(String username, String password) {
    	WaitForElement(txtUsername, 10);
    	txtUsername.clear();
    	sendkeys(txtUsername, username);
    	WaitForElement(txtPassword, 10);
    	txtPassword.clear();
    	sendkeys(txtPassword, password);
    	click(btnLogin);
    	
    }

}
