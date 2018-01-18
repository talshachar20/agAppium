package enfore.appium.setup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumSetup {
	
	public AppiumDriver<WebElement> driver;
	
	public void setupCaps() throws MalformedURLException {
			
	  File testApp = new File("src/apps/com.loyverse.sale.apk");  

	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "test");
	  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  cap.setCapability(MobileCapabilityType.APP, testApp.getAbsolutePath());
	  cap.setCapability("udid", "192.168.57.101:5555");
	  
	  driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	}
}
