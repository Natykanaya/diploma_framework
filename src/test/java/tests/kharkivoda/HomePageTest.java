package tests.kharkivoda;

import com.google.inject.Inject;
import elements.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;
import static helpers.MethodsHelper.checkUrlIsChange;
import static enums.MAIN_URL.*;

public class HomePageTest extends BaseTest {
    private static final String EXPECTED_GALLERY_URL = GALLERY_URL.getValue();
    private static final String EXPECTED_VIDEO_URL = VIDEO_URL.getValue();
    private static final String EXPECTED_NEWS_URL = NEWS_URL.getValue();


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

    @Test(description = "Verify gallery icon")
    public void clickOnGalleryIcon() {
        page(HomePage.class)
                .openPage()
                .verifyGalleryIconIsPresent()
                .clickOnGalleryIcon();
        checkUrlIsChange(EXPECTED_GALLERY_URL);
    }

    @Test(description = "Verify video icon")
    public void clickOnVideoIcon() {
        page(HomePage.class)
                .openPage()
                .verifyVideoIconIsPresent()
                .clickOnVideoIcon();
        checkUrlIsChange(EXPECTED_VIDEO_URL);
    }

    @Test(description = "Verify infografic icon")
    public void clickOnInfograficIcon() {
        page(HomePage.class)
                .openPage()
                .verifyInfographicIconIsPresent()
                .clickOnInfograficIcon();
    }

    @Test(description = "Verify top news")
    public void verifyOnTopNews() {
        page(HomePage.class)
                .openPage()
                .verifyAllTopNewsIsPresent()
                .verifyTopNewsIconIsPresent()
                .clickOnTopNewsIcon();
    }

    @Test(description = "Click on random news")
    public void clickOnRandomNews() {
        page(HomePage.class)
                .openPage()
                .verifyOneOfNewsIsPresent()
                .clickOneOfNews();
        checkUrlIsChange(EXPECTED_NEWS_URL);
    }

    @Test(description = "Click on all news")
    public void clickOnAllNews() {
        page(HomePage.class)
                .openPage()
                .verifyAllNewsBtnIsPresent()
                .clickOnAllNewsBtn();
        checkUrlIsChange(EXPECTED_NEWS_URL);
    }

}
