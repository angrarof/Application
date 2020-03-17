package steps;

import config.DriverFactory;
import cucumber.api.java.en.Given;
import gherkin.lexer.De;
import pages.DemoPage;

public class DemoSteps extends DriverFactory {
    DemoPage demoPage = new DemoPage(driver);

    @Given("Start demo$")
    public void startDemo(){
        demoPage.goToDemo();
        demoPage.saveAllCars();
        demoPage.orderOptionsCar();
        demoPage.selectOption("Honda");
        demoPage.enterTxbText("Angel Aguilar");
        demoPage.clickAlertButton();
        demoPage.switchToAlert();
        demoPage.validateAlertText();
    }

}
