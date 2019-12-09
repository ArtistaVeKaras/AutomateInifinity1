package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClickAllTabsPage;
import pages.LoginPages;
import sun.rmi.runtime.Log;

public class AllMenu {

    LoginPages loginPages = new LoginPages();
    ClickAllTabsPage clicktabs = new ClickAllTabsPage();

    @Given("^I am on the home page for Weglobal training$")
    public void i_am_on_the_home_page_for_Weglobal_training() throws Throwable {
        loginPages.launchUrl();
    }

    @Given("^The home page is displayed$")
    public void the_home_page_is_displayed() throws Throwable {
        loginPages.homePage();
    }

    @When("^I click  in \"([^\"]*)\" tab$")
    public void i_click_in_tab(String value) throws Throwable {
      if (value.equalsIgnoreCase("Tabs"));
      clicktabs.tradeYourJet();
      clicktabs.bookYourJet();
      clicktabs.justTrade();
      clicktabs.aboutUs();
    }

    @Then("^\"([^\"]*)\" should be displayed$")
    public void should_be_displayed(String value) throws Throwable {

    }
}
