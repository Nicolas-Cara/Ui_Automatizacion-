package Base.EntryAd;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.EntryAdPage;

import Base.BaseTests;

public class EntryAdTest extends BaseTests {
    @Test
    public void modalTest() {
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();
        boolean modal = entryAdPage.isModal();
        Assert.assertTrue(modal);
        entryAdPage.closeFooter();
        Assert.assertFalse(driver.findElement(By.id("modal")).isDisplayed());
    }
}
