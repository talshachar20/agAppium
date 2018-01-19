package enfore.appium.setup;

import java.net.MalformedURLException;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/enfore/appium/tests/regression.feature"
		,glue= {"enfore.appium.setup"}
		)
 
public class TestRunner extends AppiumSetup {

}
