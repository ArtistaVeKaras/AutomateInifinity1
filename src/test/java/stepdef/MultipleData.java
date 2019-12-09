package stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DataTablePage;

public class MultipleData {

    DataTablePage datatable = new DataTablePage();

    @When("^I enter my username & password as below$")
    public void i_enter_my_username_password_as_below(DataTable userdetails) throws Throwable {
        datatable.multipleData(userdetails);
    }

    @Then("^I click the tradeYourJet button$")
    public void i_click_the_tradeYourJet_button() throws Throwable {
       datatable.tradeYourJet();
       Thread.sleep(5000);
    }

    @Then("^I enter the following details$")
    public void i_enter_the_following_details(DataTable data) throws Throwable {
       datatable.entermultipleValues(data);
    }

    @Then("^I click the submit button$")
    public void i_click_the_submit_button() throws Throwable {
       datatable.clickSubmit();
    }

    @Then("^I should on the tradeyourjet  page$")
    public void i_should_on_the_tradeyourjet_page() throws Throwable {

    }
}
