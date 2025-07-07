package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.AddElementsPage;

public class AddElementTest extends BaseTests {

    @Test
    public void testAdDeletElements() {
        AddElementsPage elementsPage = homePage.clickAddElementsLink();
        elementsPage.AddButtonClick();
        elementsPage.AddButtonClick();
        elementsPage.AddButtonClick();
        List<WebElement> deletes = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        Assert.assertEquals(deletes.size(), 3);
        elementsPage.DeleteButtonClick();
        deletes = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        Assert.assertEquals(deletes.size(), 2);
    }
}
