package com.codingmechanic.fluentinterface.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {

    private WebDriver driver;

    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver withChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public void killDriver() {
        driver.close();
        driver.quit();
    }
}
