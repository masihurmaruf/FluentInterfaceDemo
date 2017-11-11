package com.codingmechanic.fluentinterface.tests;

import com.codingmechanic.fluentinterface.controllers.SearchRobot;
import com.codingmechanic.fluentinterface.controllers.impls.SearchRobotImpl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    SearchRobot searchRobot = new SearchRobotImpl();

    @Test
    public void googleSearch() {
        searchRobot
            .withOpenBrowser()
                 .typeTextToSearch()
                 .clickSearchBtn()
            .withSearchResult()
                 .verify()
                 .done();
    }

    @AfterMethod
    public void cleanUp() {

    }
}
