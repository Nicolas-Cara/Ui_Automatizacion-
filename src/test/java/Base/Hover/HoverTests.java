package Base.Hover;

import org.testng.annotations.Test;
import Base.BaseTests;
import com.selenium.pages.HoversPage;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "No se muestra el caption");
        assertEquals(caption.getTitle(), "name: user1", "Titulo incorrecto");
        assertEquals(caption.getLinkText(), "View profile", "Caption incorrecto");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrecto");
    }
}
