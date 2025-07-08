package Base.ForgotPassword;

import java.net.HttpURLConnection;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.HttpURLConnection;
import java.net.URL;

import com.selenium.pages.ForgotPasswordPage;

import Base.BaseTests;

public class ForgotPasswordTests extends BaseTests {

    public int getStatusCode(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            return connection.getResponseCode();

        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Código de error personalizado si algo falla
        }
    }

    @Test
    public void teatRetrivePassword() {
        ForgotPasswordPage retrive = homePage.clickForgotPasswordLink();
        retrive.setEMail("hola@hola.com");
        retrive.clickSubmitButton();
        int statusCode = getStatusCode("https://the-internet.herokuapp.com/forgot_password");
        Assert.assertEquals(statusCode, 200);
    }
}
