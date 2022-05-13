package elements;

import com.codeborne.selenide.*;
import elements.header.HeaderFragment;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.*;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private final SelenideElement gallery = $x("//a[@href=\"galerei\"]");
    private final SelenideElement videos = $x("//a[@href=\"video\"]");
    private final SelenideElement infographic = $x("//div[3]/a/img");
    private ElementsCollection topNews = $$x("//*[@id='bx-pager']/a");
    private SelenideElement allMenu = $x("//ul[contains(@class,'b-menu-nav')]");
    private final SelenideElement allNews = $x("//ul[contains(@class,'news-search')]/li/h3/a");
    private final SelenideElement homeMenu = $x("//i[contains(@class,'icon-home-2')]");
    private final SelenideElement administrMenu = $x("//li/a[text()='Адміністрація']");
    private final SelenideElement docsMenu = $x("//li/a[text()='Документи']");
    private final SelenideElement administratorsMenu = $x("//li/a[text()='Адмінпослуги']");
    private final SelenideElement feedbackMenu = $x("//li/a[text()='Зворотній зв’язок']");
    private final SelenideElement accessMenu = $x("//li/a[text()='Доступ до публічної інформації']");
    private final SelenideElement newsMenu = $x("//li/a[text()='Новини']");
    private final SelenideElement regionMenu = $x("//li/a[text()='Про область']");
    private final SelenideElement fourthTopNews = $x("//div[contains(@class,'ytp-cued-thumbnail-overlay-image')]");
    private final SelenideElement fifthTopNews = $x("//a[contains(@class,'infograph j-infograph cbox')]");
    private final SelenideElement linerHeadOfNews = $x("//div[contains(@class,'liner-head')]");

    @Step("Verify that emblemKh is displayed")
    public HomePage verifyEmblemKhIsPresent() {
        assertTrue(headerFragment.getEmblemKh().isDisplayed(), "EmblemKh is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that emblemUkr is displayed")
    public HomePage verifyEmblemUkrIsPresent() {
        assertTrue(headerFragment.getEmblemUkr().isDisplayed(), "EmblemUkr is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that iconGlasses is displayed")
    public HomePage verifyIconGlassesIsPresent() {
        assertTrue(headerFragment.getIconGlasses().isDisplayed(), "Icon glasses is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that title is displayed")
    public HomePage verifyTitleIsPresent() {
        String expectedTitle = "ОФІЦІЙНИЙ ВЕБ-САЙТ\n" +
                "ХАРКІВСЬКА ОБЛАСНА\n" +
                "ДЕРЖАВНА АДМІНІСТРАЦІЯ";
        assertEquals(headerFragment.getTitle().getText(), expectedTitle, "act and exp is different");
        return page(HomePage.class);
    }

    @Step("Verify that btn to change lang to rus is present")
    public HomePage verifyBtnRusLngIsPresent() {
        assertTrue(headerFragment.getRussianLanguage().isDisplayed(), "Button RusLng is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that btn to change lang to eng is present")
    public HomePage verifyBtnEngLngIsPresent() {
        assertTrue(headerFragment.getEnglishLanguage().isDisplayed(), "Button EngLng is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that btn to change lang to ukr is present")
    public HomePage verifyBtnUkrLngIsPresent() {
        assertTrue(headerFragment.getUkrainianLanguage().isDisplayed(), "Button UkrLng is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that btn to open facebook is present")
    public HomePage verifyBtnFcbIsPresent() {
        assertTrue(headerFragment.getFacebookBtn().isDisplayed(), "Button open facebook is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that btn to open RSS is present")
    public HomePage verifyBtnRssIsPresent() {
        assertTrue(headerFragment.getRssBtn().isDisplayed(), "Button RSS is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that btn to search is present")
    public HomePage verifyBtnSearchIsPresent() {
        assertTrue(headerFragment.getSearchBtn().isDisplayed(), "Button Search is not displayed!");
        return page(HomePage.class);
    }

    @Step("Verify that gallery icon is present")
    public HomePage verifyGalleryIconIsPresent() {
        assertTrue(gallery.isDisplayed(), "Gallery icon is not present");
        return page(HomePage.class);
    }

    @Step("Click on gallery icon")
    public HomePage clickOnGalleryIcon() {
        gallery.click();
        return page(HomePage.class);
    }

    @Step("Verify that video icon is present")
    public HomePage verifyVideoIconIsPresent() {
        assertTrue(videos.isDisplayed(), "Video icon is not present");
        return page(HomePage.class);
    }

    @Step("Click on video icon")
    public HomePage clickOnVideoIcon() {
        gallery.click();
        return page(HomePage.class);
    }

    @Step("Verify that infographic icon is present")
    public HomePage verifyInfographicIconIsPresent() {
        assertTrue(infographic.isDisplayed(), "Infographic icon is not present");
        return page(HomePage.class);
    }

    public String getCurrentUrl() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        return currentUrl;
    }
}