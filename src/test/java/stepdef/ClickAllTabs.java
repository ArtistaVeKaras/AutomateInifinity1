package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClickAllTabsPage;
import pages.LoginPages;

public class ClickAllTabs {

    LoginPages loginpage = new LoginPages();
    ClickAllTabsPage clicktabs = new ClickAllTabsPage();

    @Given("^Im on the \"([^\"]*)\"$")
    public void imOnThe(String data) throws Throwable {
        if (data.equalsIgnoreCase("LoginPage")){
            loginpage.launchUrl();
        }
        if (data.equalsIgnoreCase("ABTUS page")){
            clicktabs.confirmAboutUsPage();
        }
        else {System.out.println("Data is not present in the feature file");
        }
    }

    @When("^I click \"([^\"]*)\" tab$")
    public void i_click_tab(String value) throws Throwable {
        switch(value) {
            case "TYJ":
                clicktabs.tradeYourJet();
                break;
            case "BYJ":
                clicktabs.bookYourJet();
                break;
            case "JT":
                clicktabs.justTrade();
                break;
            case "ABTUS":
                clicktabs.aboutUs();
                break;
            default:
                System.out.println("values not found");
        }
      }


    @Then("^I am \"([^\"]*)\"$")
    public void i_am(String data) throws Throwable {

    }
}
