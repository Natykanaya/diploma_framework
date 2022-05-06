package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.header.HeaderFragment;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private final SelenideElement galery = $x("//div[1]/a/img");
    private final SelenideElement videos = $x("///div[2]/a/img");
    private final SelenideElement infographic = $x("//div[3]/a/img");
    private ElementsCollection topNews = $$x("//*[@id='bx-pager']/a");
    private SelenideElement allMenu = $x("//ul[contains(@class,'b-menu-nav')]");
    private final SelenideElement allNews = $x("//ul/li/h3/a");
    private final SelenideElement homeMenu = $x("//i[contains(@class,'icon-home-2')]");
    private final SelenideElement administrMenu = $x("//li/a[text()='Адміністрація']");
    private final SelenideElement docsMenu = $x("//li/a[text()='Документи']");
    private final SelenideElement administratorsMenu = $x("//li/a[text()='Адмінпослуги']");
    private final SelenideElement feedbackMenu = $x("//li/a[text()='Зворотній зв’язок']");
    private final SelenideElement accessMenu = $x("//li/a[text()='Доступ до публічної інформації']");
    private final SelenideElement newsMenu = $x("//li/a[text()='Новини']");
    private final SelenideElement regionMenu = $x("//li/a[text()='Про область']");

    @Step("Verify that emblemKh is displayed")
    public void checkEmblemKh() {
        headerFragment.getEmblemKh()
                .isDisplayed();
    }

    @Step("Verify that emblemUkr is displayed")
    public void checkEmblemUkr() {
        headerFragment.getEmblemUkr()
                .isDisplayed();
    }

    @Step("Verify that title is displayed")
    public void checkTitle() {
        String expectedTitle = "ОФІЦІЙНИЙ ВЕБ-САЙТ\\n\" +\n" +
                "                \"ХАРКІВСЬКА ОБЛАСНА\\n\" +\n" +
                "                \"ДЕРЖАВНА АДМІНІСТРАЦІЯ";
        Assert.assertEquals(headerFragment.getTitle().getText(), expectedTitle, "act and exp is different");
    }

    @Step("Verify that galery icon is present")
    public void verifyGaleryIconIsPresent() {
        galery.isDisplayed();
    }

}