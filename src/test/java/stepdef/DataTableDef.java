package stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pages.DataTablePage;

public class DataTableDef {

    DataTablePage datatable = new DataTablePage();

    @When("^I enter my username and password as below$")
    public void i_enter_my_username_and_password_as_below(DataTable userdetails) throws Throwable {
        datatable.multipleData(userdetails);
    }
}
