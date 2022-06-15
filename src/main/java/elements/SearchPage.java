package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

public class SearchPage extends BasePage{
    List<SelenideElement> searchResults = $$x("//ul[@class='news-search']");
    List<SelenideElement> articleTags = $$x("//section/p/a");

    String articleXpath = "li/p/a";

    public SearchPage verifyResultsPresented(boolean expected) {
        assertEquals(!searchResults.isEmpty(), expected);
        return page(SearchPage.class);
    }

    public SearchPage verifyTagsPresented(String expectedTag) {
        assertTrue(articleTags.stream().anyMatch(e -> e.getText().equals(expectedTag)));
        return page(SearchPage.class);
    }

    public SearchPage openFirstArticle() {
        SelenideElement selenideElement = searchResults.stream().map(e -> e.$x(articleXpath)).findFirst().get();
        selenideElement.click();
        return page(SearchPage.class);
    }
}
