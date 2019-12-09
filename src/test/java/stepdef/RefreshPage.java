package stepdef;

import cucumber.api.java.en.When;
import pages.ClickAllTabsPage;

public class RefreshPage {

    ClickAllTabsPage clicktabs = new ClickAllTabsPage();

    @When("^I click \"([^\"]*)\" tab on the home page$")
    public void i_click_tab_on_the_home_page(String value) throws Throwable {
       if (value.equalsIgnoreCase("TYJ")){
           clicktabs.tradeYourJet();
       }
       if (value.equalsIgnoreCase("ABTUS")){
           clicktabs.aboutUs();
       }else {
           System.out.println("Values not found");
       }
    }
    @When("^I click refersh page$")
    public void i_click_refersh_page() throws Throwable {
        for (int i =0; i<2; i++)
        clicktabs.refershPage();
    }

}
