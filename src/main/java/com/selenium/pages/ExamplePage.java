package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamplePage {

    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Menu Element");

    public ExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1Page() {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }

}
