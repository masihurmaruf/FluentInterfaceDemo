package com.codingmechanic.fluentinterface.controllers.impls;

import com.codingmechanic.fluentinterface.controllers.SearchRobot;
import com.codingmechanic.fluentinterface.controllers.GoogleSearchController;
import com.codingmechanic.fluentinterface.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;

public class SearchRobotImpl implements SearchRobot {

    private WebDriver driver;

    public GoogleSearchController withOpenBrowser() {
        WebDriverUtils driverUtils = new WebDriverUtils(driver);
        driver = driverUtils.withChromeDriver();
        driver.get("https://www.google.com");
        return new GoogleSearchControllerImpl(driver);
    }
}
