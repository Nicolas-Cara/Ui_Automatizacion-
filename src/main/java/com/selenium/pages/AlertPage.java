package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By clickAlertButton = By.cssSelector("button[onclick='jsAlert()']");
    private By clickConfirmButton = By.cssSelector("button[onclick='jsConfirm()']");
    private By clickPromptButton = By.cssSelector("button[onclick='jsPrompt()']");
    private By result = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton() {
        driver.findElement(clickAlertButton).click();
    }

    public void clickConfirmButton() {
        driver.findElement(clickConfirmButton).click();
    }

    public void clickPromptButton() {
        driver.findElement(clickPromptButton).click();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }

}
