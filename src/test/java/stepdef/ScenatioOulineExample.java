package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;

public class ScenatioOulineExample {

    LoginPages loginpages = new LoginPages();

    @When("^I enter my \"([^\"]*)\" as \"([^\"]*)\" in the textfield$")
    public void i_enter_my_as_in_the_textfield(String data, String value) throws Throwable {
     if (data.equalsIgnoreCase("username")){
         loginpages.usernameRegEx(value);
     }
     if (data.equalsIgnoreCase("password")){
         loginpages.passwordRegEx(value);
     }
     else {
         System.out.println("Keyword not found");
     }
    }
    @When("^I click login button$")
    public void i_click_login_button() throws Throwable {
      loginpages.clickButton();
    }
    @Then("^Home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
      loginpages.homePage();
    }
}
