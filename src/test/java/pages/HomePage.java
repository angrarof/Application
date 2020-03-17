package pages;

import config.DriverFactory;
import org.openqa.selenium.WebDriver;
import webElements.HomeElements;

public class HomePage extends DriverFactory {
    HomeElements home = new HomeElements(driver);

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToMain(){
        driver.get("www.google.com");
    }





}
