package elements;

import com.codeborne.selenide.*;
import elements.header.HeaderFragment;
import io.qameta.allure.Step;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private final SelenideElement gallery = $x("//a[@href=\"galerei\"]");
    private final SelenideElement videos = $x("//a[@href=\"video\"]");
    private final SelenideElement infographic = $x("//div[3]/a/img");
    private SelenideElement oneOfTopNews = $x("//*[@id='bx-pager']/a[1]");
    private final SelenideElement allTopNews = $x("//div[contains(@class,'block-slider')]");
    //*[@id="bx-pager"]/a[1]/p
    private SelenideElement allMenu = $x("//ul[contains(@class,'b-menu-nav')]");
    private final SelenideElement allNewsBtn = $x("//ul[contains(@class,'news-search')]/li/h3/a");
    private final SelenideElement homeMenu = $x("//i[contains(@class,'icon-home-2')]");
    private final SelenideElement administrMenu = $x("//li/a[text()='Адміністрація']");
    private final SelenideElement docsMenu = $x("//li/a[text()='Документи']");
    private final SelenideElement administratorsMenu = $x("//li/a[text()='Адмінпослуги']");
    private final SelenideElement feedbackMenu = $x("//li/a[text()='Зворотній зв’язок']");
    private final SelenideElement accessMenu = $x("//li/a[text()='Доступ до публічної інформації']");
    private final SelenideElement newsMenu = $x("//li/a[text()='Новини']");
    private final SelenideElement regionMenu = $x("//li/a[text()='Про область']");
    private final SelenideElement linerHeadOfNews = $x("//div[contains(@class,'liner-head')]");
    private final SelenideElement oneOfNewsUnderHeader = $x("//ul[contains(@class,'main-news')]/li[1]");
    private final SelenideElement footMenu = $x("//div[contains(@class,'foot-main')]");

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
        videos.click();
        return page(HomePage.class);
    }

    @Step("Verify that infographic icon is present")
    public HomePage verifyInfographicIconIsPresent() {
        assertTrue(infographic.isDisplayed(), "Infographic icon is not present");
        return page(HomePage.class);
    }

    @Step("Click on infografic icon")
    public HomePage clickOnInfograficIcon() {
        infographic.click();
        return page(HomePage.class);
    }

    @Step("Verify that all top news is present")
    public HomePage verifyAllTopNewsIsPresent() {
        assertTrue(allTopNews.isDisplayed(), "All top news icon is not present");
        return page(HomePage.class);
    }

    @Step("Verify one of top news icon")
    public HomePage verifyTopNewsIconIsPresent() {
        assertTrue(oneOfTopNews.isDisplayed(), "top news icon is not present");
        return page(HomePage.class);
    }

    @Step("Click on one of top news icon")
    public HomePage clickOnTopNewsIcon() {
        oneOfTopNews.click();
        return page(HomePage.class);
    }

    @Step("Verify Header Of News is present")
    public HomePage verifyHeaderOfNewsIsPresent() {
        actions().moveToElement(linerHeadOfNews);
        assertTrue(linerHeadOfNews.isDisplayed(), "Header of news is not present");
        return page(HomePage.class);
    }

    @Step("Verify One Of the News is present")
    public HomePage verifyOneOfNewsIsPresent() {
        actions().moveToElement(oneOfNewsUnderHeader);
        assertTrue(oneOfNewsUnderHeader.isDisplayed(), "One of the news is not present");
        return page(HomePage.class);
    }

    @Step("Click on One Of the News")
    public HomePage clickOneOfNews() {
        actions().moveToElement(oneOfNewsUnderHeader);
        oneOfNewsUnderHeader.click();
        return page(HomePage.class);
    }

    @Step("Verify all news btn is present")
    public HomePage verifyAllNewsBtnIsPresent() {
        actions().moveToElement(allNewsBtn);
        assertTrue(allNewsBtn.isDisplayed(), "All news btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on all news btn")
    public HomePage clickOnAllNewsBtn() {
        actions().moveToElement(allNewsBtn);
        allNewsBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify foot menu is present")
    public HomePage verifyFootMenuIsPresent() {
        actions().moveToElement(footMenu);
        assertTrue(footMenu.isDisplayed(), "All news btn is not present");
        return page(HomePage.class);
    }

}