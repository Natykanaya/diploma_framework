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
    private final SelenideElement oneOfTopNews = $x("//*[@id='bx-pager']/a[1]");
    private final SelenideElement allTopNews = $x("//div[contains(@class,'block-slider')]");
    private final SelenideElement allMenu = $x("//ul[contains(@class,'b-menu-nav')]");
    private final SelenideElement allNewsBtn = $x("//ul[contains(@class,'news-search')]/li/h3/a");
    private final SelenideElement homeMenuBtn = $x("//i[contains(@class,'icon-home-2')]");
    private final SelenideElement administrMenuBtn = $x("//li/a[text()='Адміністрація']");
    private final SelenideElement docsMenuBtn = $x("//li/a[text()='Документи']");
    private final SelenideElement administratorsMenuBtn = $x("//li/a[text()='Адмінпослуги']");
    private final SelenideElement feedbackMenuBtn = $x("//li/a[text()='Зворотній зв’язок']");
    private final SelenideElement accessMenuBtn = $x("//li/a[text()='Доступ до публічної інформації']");
    private final SelenideElement newsMenuBtn = $x("//li/a[text()='Новини']");
    private final SelenideElement regionMenuBtn = $x("//li/a[text()='Про область']");
    private final SelenideElement linerHeadOfNews = $x("//div[contains(@class,'liner-head')]");
    private final SelenideElement oneOfNewsUnderHeader = $x("//ul[contains(@class,'main-news')]/li[1]");
    private final SelenideElement footMenu = $x("//div[contains(@class,'foot-main')]");
    private final SelenideElement footerPage = $x("//div[contains(@class,'foot-contacts')]");
    private final SelenideElement footerEmblemOfKh = $x("//div[contains(@class,'g-tacenter')]");
    private final SelenideElement footerContacts = $x("//p[contains(@class,'contancts-head')]");

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
                "ВІЙСЬКОВА АДМІНІСТРАЦІЯ";
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
        linerHeadOfNews.scrollTo();
        assertTrue(linerHeadOfNews.isDisplayed(), "Header of news is not present");
        return page(HomePage.class);
    }

    @Step("Verify One Of the News is present")
    public HomePage verifyOneOfNewsIsPresent() {
        oneOfNewsUnderHeader.scrollTo();
        assertTrue(oneOfNewsUnderHeader.isDisplayed(), "One of the news is not present");
        return page(HomePage.class);
    }

    @Step("Click on One Of the News")
    public HomePage clickOneOfNews() {
        oneOfNewsUnderHeader.scrollTo();
        oneOfNewsUnderHeader.click();
        return page(HomePage.class);
    }

    @Step("Verify all news btn is present")
    public HomePage verifyAllNewsBtnIsPresent() {
        allNewsBtn.scrollTo();
        assertTrue(allNewsBtn.isDisplayed(), "All news btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on all news btn")
    public HomePage clickOnAllNewsBtn() {
        allNewsBtn.scrollTo();
        allNewsBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify foot menu is present")
    public HomePage verifyFootMenuIsPresent() {
        footMenu.scrollTo();
        assertTrue(footMenu.isDisplayed(), "All news btn is not present");
        return page(HomePage.class);
    }

    @Step("Verify Footer page is present")
    public HomePage verifyFooterPageIsPresent() {
        footerPage.scrollTo();
        assertTrue(footerPage.isDisplayed(), "Footer page is not present");
        return page(HomePage.class);
    }


    @Step("Verify Footer EmblemOfKh is present")
    public HomePage verifyFooterEmblemOfKhIsPresent() {
        footerEmblemOfKh.scrollTo();
        assertTrue(footerEmblemOfKh.isDisplayed(), "Footer EmblemOfKh is not present");
        return page(HomePage.class);
    }

    @Step("Verify Footer Contacts is present")
    public HomePage verifyFooterContactsIsPresent() {
        footerContacts.scrollTo();
        assertTrue(footerContacts.isDisplayed(), "Footer Contacts is not present");
        return page(HomePage.class);
    }

    @Step("Verify Footer BtnUp is present")
    public HomePage verifyFooterBtnUpIsPresent() {
        headerFragment.getFooterBtnUp().scrollTo();
        assertTrue(headerFragment.getFooterBtnUp().isDisplayed(), "Footer BtnUp is not present");
        return page(HomePage.class);
    }

    @Step("Click on Footer BtnUp")
    public HomePage clickFooterBtnUp() {
        headerFragment.getFooterBtnUp().scrollTo();
        headerFragment.getFooterBtnUp().click();
        return page(HomePage.class);
    }

    @Step("Verify Menu is present")
    public HomePage verifyAllMenuIsPresent() {
        allMenu.click();
        assertTrue(allMenu.isDisplayed(), "Menu is not present");
        return page(HomePage.class);
    }

    @Step("Verify Home Menu Btn is present")
    public HomePage verifyHomeMenuBtnIsPresent() {
        assertTrue(allNewsBtn.isDisplayed(), "Home menu btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on home menu btn")
    public HomePage clickOnHomeMenuBtn() {
        homeMenuBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify administr Menu Btn is present")
    public HomePage verifyAdministrMenuBtnIsPresent() {
        assertTrue(administrMenuBtn.isDisplayed(), "Administr Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on administr menu btn")
    public HomePage clickOnAdministrMenuBtn() {
        administrMenuBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify Docs Menu Btn is present")
    public HomePage verifyDocsMenuBtnIsPresent() {
        assertTrue(docsMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on Docs Menu Btn")
    public HomePage clickOnDocsMenuBtn() {
        docsMenuBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify Administrators Menu Btn is present")
    public HomePage verifyAdministratorsMenuBtnIsPresent() {
        assertTrue(administratorsMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on Administrators Menu Btn")
    public HomePage clickOnAdministratorsMenuBtn() {
        administratorsMenuBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify Feedback Menu Btn is present")
    public HomePage verifyFeedbackMenuBtnIsPresent() {
        assertTrue(feedbackMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on Feedback Menu Btn")
    public FeedbackPage clickOnFeedbackMenuBtn() {
        feedbackMenuBtn.click();
        return page(FeedbackPage.class);
    }

    @Step("Verify Access Menu Btn is present")
    public HomePage verifyAccessMenuBtnIsPresent() {
        assertTrue(accessMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on Access Menu Btn")
    public HomePage clickOnAccessMenuBtn() {
        accessMenuBtn.click();
        return page(HomePage.class);
    }

    @Step("Verify News Menu Btn is present")
    public HomePage verifyNewsMenuBtnIsPresent() {
        assertTrue(newsMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on News Menu Btn")
    public NewsPage clickOnNewsMenuBtn() {
        newsMenuBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify Region Menu Btn is present")
    public HomePage verifyRegionMenuBtnIsPresent() {
        assertTrue(regionMenuBtn.isDisplayed(), "Docs Menu Btn is not present");
        return page(HomePage.class);
    }

    @Step("Click on Region Menu Btn")
    public HomePage clickOnRegionMenuBtn() {
        regionMenuBtn.click();
        return page(HomePage.class);
    }
}