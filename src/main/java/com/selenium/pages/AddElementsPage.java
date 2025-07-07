package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddElementsPage {
    public WebDriver driver;
    private By addButton = By.cssSelector("button[onclick='addElement()']");
    private By deleteButton = By.cssSelector("button[onclick='deleteElement()']");

    public AddElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddButtonClick() {
        driver.findElement(addButton).click();
    }

    public void DeleteButtonClick() {
        driver.findElement(deleteButton).click();
    }
}
