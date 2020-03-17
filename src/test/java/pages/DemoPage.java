package pages;

import config.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import webElements.DemoElements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoPage extends DriverFactory {
    DemoElements demoElements = new DemoElements(driver);
    private List<WebElement> allOptions;
    private Alert myAlert;
    private String nameToAlert;
    public DemoPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToDemo(){
        driver.get("https://learn.letskodeit.com/p/practice");
    }

    public void saveAllCars(){
        Select mySelect = new Select(demoElements.dwnCar);
         allOptions = mySelect.getOptions();
    }

    public void orderOptionsCar(){
        List<String> newList = new ArrayList<String>();
        for(int i=0; i<allOptions.size(); i++){
            newList.add(allOptions.get(i).getText());
        }
        System.out.println(newList);
    }

    public void selectOption(String option){
        demoElements.selectCarOption(option);
        System.out.println("Option selected: "+option);
    }

    public void enterTxbText(String text){
        nameToAlert = text;
        demoElements.tbxName.sendKeys(nameToAlert);
    }

    public void clickAlertButton(){
        demoElements.btnAlert.click();
    }

    public void switchToAlert(){
        myAlert = driver.switchTo().alert();
    }

    public void acceptAlert(){
        myAlert.accept();
    }

    public void validateAlertText(){
        Assert.assertEquals(String.format("Hello %s, share this practice page and share your knowledge",nameToAlert),myAlert.getText());
        System.out.println("Text is equal");
    }

}
