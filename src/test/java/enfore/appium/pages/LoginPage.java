package enfore.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage{
	
    public LoginPage(AppiumDriver<WebElement> driver) {
    	super(driver);
	}

    @FindBy(id = "frg_auth_enter_login_field")
    private WebElement emailField;
    
    @FindBy(id = "frg_auth_enter_pass_field")
    private WebElement passField;
    
    @FindBy(id = "frg_auth_enter_button")
    private WebElement loginButton;
    
    public void setUserName(String username) {
    	System.out.println("Setting username as: " + username);
        this.emailField.clear();
    	this.emailField.sendKeys(username);
    }
    
    public StartPage loginAndExpectSuccess(String username, String password) {
    	System.out.println("performing login to app and expecting to move to start page);
    	setUserName(username);
    	setPassword(password);
    	this.loginButton.click();
    	return new StartPage(driver);
    }
    
    public StartPage loginWithValidUser() {
    	return loginAndExpectSuccess("test", "1234");
    }
	private void setPassword(String password) {
    	System.out.println("Setting password as: " + password);
	      this.passField.clear();
	  	  this.passField.sendKeys(password);		
	}
    
}
