# Selenium FluentInterface demo

## overview
This is a simple demo project to demonstrate the `fluent interface` design with **Selenium WebDriver**.

## Project Information

The following was used to create this project

* java 1.8
* maven 3.3.9
* selenium-java 3.6.0
* testng 6.11

## Application Under test

Basic test to google search. **url** - `https://www.google.com` 

## Basic fluent interface

Basic fluent interface for the test.

```
searchRobot
   .withOpenBrowser()
        .typeTextToSearch()
        .clickSearchBtn()
   .withSearchResult()
        .verify()
        .done();
```
