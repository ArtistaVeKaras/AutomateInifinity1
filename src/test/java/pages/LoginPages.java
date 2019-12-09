package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;
import java.util.concurrent.TimeUnit;

public class LoginPages extends DriverUtil {

    //declaring global variables using the By class from Selenium org
    //so we can use the variables at any stages within the class
    String url = "http://test001-automatetillinfinity.co.uk/";
    public static By usernameInput = By.id("usernamelogin");
    public static By passwordInput = By.id("loginPassword");
    public static By clickButton   = By.id("LoginBtn");

    // Creating a method to launch the url
    public void launchUrl() throws InterruptedException {
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          driver.get(url);
    // Thread.sleep(3000);
    }
    // method to allow the user to login without using regEx
    public void username(){
        driver.findElement(By.id("usernamelogin"));
        usernameInput.sendKeys("montego001");
    }
    // method using the regEx for username
    public void usernameRegEx(String testData){
        driver.findElement(By.id("usernamelogin"));
        usernameInput.sendKeys(testData);
    }
    // method using regEx for password
    public void passwordRegEx(String testData){
        driver.findElement(By.id("loginPassword"));
        passwordInput.sendKeys(testData);
    }
    // method with no regEx
    public void password(){
       driver.findElement(By.id("loginPassword"));
        passwordInput.sendKeys("12345678");
    }
    public void clickButton(){
        driver.findElement(By.id("LoginBtn"));
                clickButton.click();
    }
    // method performing an assertion on the tile page
    public void homePage(){
            driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
            Assert.assertTrue(driver.getTitle().contains("WEG Group"));
            WebDriverWait wait = new WebDriverWait(driver,500);
            wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.id(""))));
    }
}
