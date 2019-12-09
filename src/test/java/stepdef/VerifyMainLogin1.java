package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;

public class VerifyMainLogin1 {

    LoginPages loginpages = new LoginPages();

    @Given("^I am on the home page for weglobal training$")
    public void i_am_on_the_home_page_for_weglobal_training() throws Throwable {
       loginpages.launchUrl();
    }

    @When("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_enter_as(String data, String value) throws Throwable {
     if (data.equalsIgnoreCase("username")){
         loginpages.usernameRegEx(value);
     }
     if (data.equalsIgnoreCase("password")){
         loginpages.passwordRegEx(value);
     }
     else {
         System.out.println("Values not found");
     }
    }

    @When("^Click login button$")
    public void click_login_button() throws Throwable {
        loginpages.clickButton();
    }

    @Then("^Home page should is displayed$")
    public void home_page_should_is_displayed() throws Throwable {
      loginpages.homePage();
    }

}
