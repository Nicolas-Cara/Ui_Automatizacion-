package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String absolutePath) {
        driver.findElement(By.id("file-upload")).sendKeys(absolutePath);
        driver.findElement(By.id("file-submit")).click();
    }

    public String getUploadedFiles() {
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
