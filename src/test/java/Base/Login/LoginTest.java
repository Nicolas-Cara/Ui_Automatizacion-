package Base.Login;

import com.selenium.pages.LoginPage;
import com.selenium.pages.SecureAreaPage;

import org.testng.*;
import org.testng.annotations.Test;

import Base.BaseTests;

public class LoginTest extends BaseTests {

    @Test
    public void testSucceFulLogin() {
        LoginPage login = homePage.clickFormAuthLink();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea = login.clickLoginButton();
        Assert.assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"));
    }

}
