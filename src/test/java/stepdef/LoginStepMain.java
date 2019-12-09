package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPages;
import util.DriverUtil;

public class LoginStepMain {

    WebDriver driver;
    LoginPages loginpages = new LoginPages();
    DriverUtil driverutil = new DriverUtil();

    @Before
    public void startSession(){
        driverutil.setDriver("chrome");
    }
    @Given("^I am on the Landing page$")
    public void i_am_on_the_Landing_page() throws Throwable {
        loginpages.launchUrl();
    }
    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
       loginpages.username();
       loginpages.password();
    }
    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        loginpages.clickButton();
    }
    @Then("^I should be on the Homepage$")
    public void i_should_be_on_the_Homepage() throws Throwable {
        loginpages.homePage();
    }
    @After
    public void closeSession(){
        driverutil.tearDown();
    }
}
