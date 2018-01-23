package enfore.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage{
	
    public LoginPage(AppiumDriver<WebElement> driver) {
    	super(driver);
    	WebDriverWait wait = new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("frg_auth_enter_login_field"))); 
    	//check for element to verify that we are in the current screen
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
    	System.out.println("performing login to app");
    	setUserName(username);
    	setPassword(password);
    	this.loginButton.click();
    	return new StartPage(driver);
    }
    
    public StartPage loginWithValidUser() {
    	return loginAndExpectSuccess("tazos123@gmail.com", "testpass");
    }
	private void setPassword(String password) {
    	System.out.println("Setting password as: " + password);
	      this.passField.clear();
	  	  this.passField.sendKeys(password);		
	}
    
}
