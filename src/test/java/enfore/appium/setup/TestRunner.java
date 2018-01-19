package enfore.appium.setup;

import java.net.MalformedURLException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import enfore.appium.pages.LoginPage;
import enfore.appium.pages.StartPage;
import io.appium.java_client.AppiumDriver;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/enfore/appium/tests/regression.feature"
		,glue= {"enfore.appium.setup"}
		)
 
public class TestRunner extends AppiumSetup{
	
}
