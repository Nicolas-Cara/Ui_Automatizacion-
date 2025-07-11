package Base.FileUpload;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.FileUploadPage;

import Base.BaseTests;

public class FileUploadTest extends BaseTests {
    @Test
    public void testUploadFile() {
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("C:\\Users\\caram\\Desktop\\Hola.txt");
        Assert.assertEquals(fileUploadPage.getUploadedFiles(), "Hola.txt");
    }
}
