package Base.Alert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.AlertPage;

import Base.BaseTests;

public class AlertTest extends BaseTests {

    @Test
    public void aceptarAlert() {
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.clickAlertButton();
        driver.switchTo().alert().accept();
        String text = alertPage.getResult();
        Assert.assertEquals(text, "You successfully clicked an alert");
    }

    @Test
    public void cancelarConfirm() {
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.clickConfirmButton();
        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(text, "I am a JS Confirm");
    }

    @Test
    public void completarPrompt() {
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.clickPromptButton();
        driver.switchTo().alert().sendKeys("Esto es una alerta!");
        driver.switchTo().alert().accept();
        String text = alertPage.getResult();
        Assert.assertEquals(text, "You entered: Esto es una alerta!");
    }
}
