package com.codingmechanic.fluentinterface.controllers;

import com.codingmechanic.fluentinterface.verifiers.GoogleSearchVerifier;

public interface GoogleSearchController {

    GoogleSearchController typeTextToSearch();

    GoogleSearchController clickSearchBtn();

    GoogleSearchVerifier withSearchResult();
}
