package com.selenium.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
    public By footer = By.className("modal-footer");
    public By close = By.xpath(".//p[text()='Close']");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeFooter() {
        driver.findElement(close).click();
    }

    public Boolean isModal() {

        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(4L))
                .pollingEvery(Duration.ofSeconds(2L))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(footer)));
        return driver.findElements(By.id("modal")).get(0).isDisplayed();
    }
}
