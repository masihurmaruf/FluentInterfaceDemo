package com.codingmechanic.fluentinterface.verifiers.impls;

import com.codingmechanic.fluentinterface.models.SearchPageModels;
import com.codingmechanic.fluentinterface.utils.WebDriverUtils;
import com.codingmechanic.fluentinterface.verifiers.GoogleSearchVerifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GoogleSearchVerifierImpl implements GoogleSearchVerifier {

    private WebDriver driver;

    public GoogleSearchVerifierImpl(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleSearchVerifier verify() {
        List<WebElement> results = driver.findElements(By.xpath(SearchPageModels.SEARCH_RESULT));
        Assert.assertEquals(results.size(), 1);
        return this;
    }

    public void done() {
        new WebDriverUtils(driver).killDriver();
    }
}
