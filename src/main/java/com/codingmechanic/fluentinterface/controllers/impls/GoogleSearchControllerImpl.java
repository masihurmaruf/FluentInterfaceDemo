package com.codingmechanic.fluentinterface.controllers.impls;

import com.codingmechanic.fluentinterface.controllers.GoogleSearchController;
import com.codingmechanic.fluentinterface.models.SearchPageModels;
import com.codingmechanic.fluentinterface.verifiers.GoogleSearchVerifier;
import com.codingmechanic.fluentinterface.verifiers.impls.GoogleSearchVerifierImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchControllerImpl implements GoogleSearchController{

    private WebDriver driver;

    public GoogleSearchControllerImpl(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleSearchController typeTextToSearch() {
        driver.findElement(By.name(SearchPageModels.SEARCH_INPUT_BOX)).sendKeys("Masihur's Blog");
        return this;
    }

    public GoogleSearchController clickSearchBtn() {
        driver.findElement(By.name(SearchPageModels.SEARCH_BUTTON)).click();
        return this;
    }

    public GoogleSearchVerifier withSearchResult() {
        return new GoogleSearchVerifierImpl(driver);
    }
}
