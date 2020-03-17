package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeElements {
    WebDriver driver;

    @FindBy(xpath = "//*[@data-ved='0ahUKEwjl9-HzgZjoAhVIAqwKHXqkD4UQ4dUDCAo']")
    public WebElement btnSearch;

    @FindBy(name = "q")
    public WebElement txtBoxSearch;

    public HomeElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
