package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");
    private By shifContLink = By.linkText("Shifting Content");
    private By addElementsLink = By.linkText("Add/Remove Elements");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthLink() {
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }

    public ExamplePage clickShifContLink() {
        driver.findElement(shifContLink).click();
        return new ExamplePage(driver);
    }

    public AddElementsPage clickAddElementsLink() {
        driver.findElement(addElementsLink).click();
        return new AddElementsPage(driver);
    }

}
