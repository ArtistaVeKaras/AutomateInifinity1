package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;

public class ClickAllTabsPage extends DriverUtil {

    public void tradeYourJet() {
        driver.findElement(By.id("TradeYourJetTab")).click();
    }

    public void bookYourJet() {
        driver.findElement(By.id("bookyourjettab")).click();
    }

    public void justTrade() {
        driver.findElement(By.id("justtradetab")).click();
    }

    public void aboutUs() {
        driver.findElement(By.id("aboutustab")).click();
    }

    public void confirmAboutUsPage() {
        Assert.assertTrue(driver.findElement(By.cssSelector("content-header")).isDisplayed());
    }
    public void refershPage(){
        driver.navigate().refresh();
    }
}
