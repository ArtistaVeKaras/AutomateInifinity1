package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {

    public static WebDriver driver;

    public void setDriver(String browser){

        if(driver == null){
            if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers\\chromedriver.exe");
                 driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            else if (browser.equalsIgnoreCase("IE")){
                System.setProperty("webdriver.driver.internetexplorer","");
                driver = new InternetExplorerDriver();
            }
            else{
                System.out.println("Drivers not found");
            }
        }

    }
    public void tearDown(){
        driver.close();
    }
}
