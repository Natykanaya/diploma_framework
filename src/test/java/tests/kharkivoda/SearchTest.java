package tests.kharkivoda;

import elements.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;
import static helpers.TestConstants.SEARCH_VALID_ARTICLE;
import static helpers.TestConstants.ZELENSKIY_TAG_UKR;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest() {
        page(HomePage.class)
                .openPage()
                .searchArticle(SEARCH_VALID_ARTICLE)
                .verifyResultsPresented(true)
                .openFirstArticle()
                .verifyTagsPresented(ZELENSKIY_TAG_UKR)
                .openPage()
                .searchArticle("")
                .verifyResultsPresented(false);
    }
}
