package tests.kharkivoda;

import elements.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class HomePageTest extends BaseTest {

    @Test
    public void checkTitle(){
        page(HomePage.class)
                .openPage();
    }
}
