package elements.header;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeaderFragment {
    private final SelenideElement title = $x("//p[contains(@class,'logo-text')]");
    private final SelenideElement emblem = $x("//p[contains(@class,'logo-trident')]");
    private final SelenideElement nameOfTitle = $x("//p[contains(@class,'logo') and text()='Харківська обласна державна адміністрація']");
    private final SelenideElement iconGlasses = $x("//a[contains(@class,'sv')]");
    private final SelenideElement ukrainianLanguage = $x("//span[text()='УКР']");
    private final SelenideElement russianLanguage=$x("//a[text()='РУС']");
    private final SelenideElement englishLanguage=$x("//a[text()='EN']");
    private final SelenideElement facebookBtn=$x("//a[@title='Facebook']");
    private final SelenideElement rssBtn=$x("//a[@title='RSS']");
    private final SelenideElement searchBtn = $x("//input[@type='text']");
}
