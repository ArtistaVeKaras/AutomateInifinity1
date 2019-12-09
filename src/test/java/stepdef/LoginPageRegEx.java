package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPages;

public class LoginPageRegEx {

    LoginPages loginPageREgEx = new LoginPages();

    @Given("^I am on the LandingPage$")
    public void i_am_on_the_LandingPage() throws Throwable {
        loginPageREgEx.launchUrl();
    }

    @When("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_enter_my_as(String value, String data) throws Throwable {
      if (value.equalsIgnoreCase("username")){
              loginPageREgEx.usernameRegEx(data);
          }
          if (value.equalsIgnoreCase("password")){
                  loginPageREgEx.passwordRegEx(data);
              }
      else{
          System.out.println("Values not found");
          }
    }
    @Then("^I should be on Homepage$")
    public void i_should_be_on_Homepage() throws Throwable {
        loginPageREgEx.homePage();
    }
}
