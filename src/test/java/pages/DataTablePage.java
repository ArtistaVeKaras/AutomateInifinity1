package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import util.DriverUtil;

import java.util.List;

public class DataTablePage extends DriverUtil {

    public void multipleData(DataTable MyData){

        List<List<String>> data = MyData.raw();
        driver.findElement(By.id("usernamelogin")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("loginPassword")).sendKeys(data.get(0).get(1));
    }
    public void tradeYourJet(){
        driver.findElement(By.id("TradeYourJetTab")).click();
    }
    public void entermultipleValues(DataTable MyData){
        List<List<String>> value = MyData.raw();
        driver.findElement(By.name("currentjetprice")).sendKeys(value.get(0).get(0));
        driver.findElement(By.name("purchaseprice")).sendKeys(value.get(0).get(1));
        driver.findElement(By.name("flighttime")).sendKeys(value.get(0).get(2));
    }
    public void clickSubmit(){
        driver.findElement(By.id("a1")).click();
    }
    public void tradeYourJetPage(){

    }
}
