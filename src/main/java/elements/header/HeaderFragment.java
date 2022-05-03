package elements.header;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeaderFragment {
    private SelenideElement title = $x("//p[contains(@class,'logo-text')]");
    private SelenideElement emblem = $x("//p[contains(@class,'logo-trident')]");
    private SelenideElement nameOfTitle = $x("//p[contains(@class,'logo') and text()='Харківська обласна державна адміністрація']");
}
