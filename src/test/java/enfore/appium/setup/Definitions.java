package enfore.appium.setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import enfore.appium.pages.LoginPage;
import enfore.appium.pages.StartPage;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class Definitions extends AppiumSetup{
	@Given("^I am on login screen")
	public void i_am_on_login_screen() throws Throwable {
		
	}

	@When("^I login with a valid user$")
	public void i_login_with_a_valid_user() throws Throwable {
		
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
