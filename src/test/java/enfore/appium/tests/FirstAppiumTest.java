package enfore.appium.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import enfore.appium.pages.LoginPage;
import enfore.appium.pages.StartPage;
import enfore.appium.setup.AppiumSetup;
//import scenarios.AndroidSetup;

public class FirstAppiumTest extends AppiumSetup {
	
  @BeforeClass 
  public void setup() throws MalformedURLException {
	  setupCaps();
  }
  
  @AfterClass
  public void tearDown() throws Exception {
      driver.quit();
  }
  	
  @Test
  public void SimpleTest() {
	  LoginPage loginPage = new LoginPage(driver);
	  StartPage startPage = loginPage.loginWithValidUser();
  }
  
}
