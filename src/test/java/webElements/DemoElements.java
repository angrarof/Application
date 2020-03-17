package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoElements {
    WebDriver driver;

    @FindBy(id = "carselect")
    public WebElement dwnCar;

    @FindBy(id = "name")
    public WebElement tbxName;

    @FindBy(id = "alertbtn")
    public WebElement btnAlert;

    public DemoElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCarOption(String option){
        Select mySelect = new Select(dwnCar);
        mySelect.selectByVisibleText(option);
    }
}
