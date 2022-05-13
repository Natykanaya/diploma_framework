package tests.kharkivoda;

import com.google.inject.Inject;
import elements.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class HomePageTest extends BaseTest {

    @Test(description = "Verify header of home page")
    public void verifyHeaderOfHomePage() {
        page(HomePage.class)
                .openPage()
                .verifyEmblemUkrIsPresent()
                .verifyTitleIsPresent()
                .verifyEmblemKhIsPresent()
                .verifyIconGlassesIsPresent()
                .verifyBtnUkrLngIsPresent()
                .verifyBtnEngLngIsPresent()
                .verifyBtnRusLngIsPresent()
                .verifyBtnSearchIsPresent()
                .verifyBtnRssIsPresent()
                .verifyBtnFcbIsPresent();
    }

    @Test(description = "Verify that gallery icon is present")
    public void clickOnGalleryIcon() {
        page(HomePage.class)
                .openPage()
                .verifyGalleryIconIsPresent()
                .clickOnGalleryIcon();
    }

}
