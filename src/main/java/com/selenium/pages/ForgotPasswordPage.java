package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By eMailField = By.id("email");
    private By submitButtonField = By.cssSelector("button");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEMail(String email) {
        driver.findElement(eMailField).sendKeys(email);
    }

    public EmailSentPage clickSubmitButton() {
        driver.findElement(submitButtonField).click();
        return new EmailSentPage(driver);
    }
}
