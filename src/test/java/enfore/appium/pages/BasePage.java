package enfore.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	public AppiumDriver<WebElement> driver;
 
    //Constructor
    public BasePage(AppiumDriver<WebElement> driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
}
