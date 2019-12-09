package stepdef;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPages;
import util.DriverUtil;

public class LoginAndLogoutSteps extends DriverUtil {

    // Creating an object to use all the classes of the LoginPages
    private LoginPages loginpages = new LoginPages();

    @Before
    public void start() throws InterruptedException {
        loginpages.launchUrl();
    }

    @Given("^the user is \"([^\"]*)\" page and the title is \"([^\"]*)\"$")
    public void the_user_is_page_and_the_title_is(String data, String value) throws Throwable {
       if (data.equalsIgnoreCase("login page")){
           Thread.sleep(3000);
           String expectedLoginTitle = driver.getTitle();
           String actualLoginTitle = "Login";
           Assert.assertTrue(expectedLoginTitle, actualLoginTitle);
           driver.get(value);
       }
    }
    @When("^I enter my \"([^\"]*)\" in the textfield as \"([^\"]*)\"$")
    public void i_enter_my_in_the_textfield_as(String param, String data) throws Throwable {
        if (param.equalsIgnoreCase("username")){
            loginpages.usernameRegEx(data);
        }
        if (param.equalsIgnoreCase("password")){
            loginpages.passwordRegEx(data);
        }
        else {
            System.out.println("Values not found");
        }
    }

    @When("^I click login button on the login page$")
    public void i_click_login_button_on_the_login_page() throws Throwable {
      loginpages.clickButton();
    }

    @Then("^I should be on the \"([^\"]*)\" and the title should be \"([^\"]*)\"$")
    public void i_should_be_on_the_and_the_title_should_be(String data, String value) throws Throwable {
       if (data.equalsIgnoreCase("home page")){
           loginpages.homePage();
       }
       if (data.equalsIgnoreCase("WEG Group")){
           driver.get(value);
           Assert.assertTrue(driver.getTitle().contains("WEG Group"));
       }
    }
}
