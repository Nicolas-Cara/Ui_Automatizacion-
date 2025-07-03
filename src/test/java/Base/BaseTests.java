package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pages.Example1Page;
import com.selenium.pages.ExamplePage;
import com.selenium.pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected ExamplePage examplePage;
    protected Example1Page example1Page;

    public void setUp() {

        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
        examplePage = homePage.clickShifContLink();
        example1Page = examplePage.clickExample1Page();
        System.out.println(example1Page.driver.findElements(By.tagName("li")));

        // driver.quit();
    }

    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }
}
