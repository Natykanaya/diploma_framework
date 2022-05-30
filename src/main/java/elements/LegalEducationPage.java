package elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static elements.FeedbackPage.PRIMARY_LEGAL_AID_INFO;
import static enums.MAIN_URL.LEGAL_EDUCATION_PAGE_URL;
import static java.lang.String.format;
import static org.openqa.selenium.By.cssSelector;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Getter
public class LegalEducationPage extends BasePage {
    private final SelenideElement pageTitle = $(cssSelector(".document-page h1"));
    private final List<SelenideElement> documentsLinks = $$x(format("//a[contains(text(), '%s')]", PRIMARY_LEGAL_AID_INFO));

    public LegalEducationPage openLegalEducationPage() {
        open(LEGAL_EDUCATION_PAGE_URL.getValue());
        return this;
    }

    @Step("Verify page title")
    public LegalEducationPage verifyPageTitle(String title) {
        assertEquals(pageTitle.getText(), title);
        return this;
    }

    @Step("Verify number of document links for some year")
    public LegalEducationPage verifyNumberOfDocumentLinksForYearIsDisplayed(String year, int documentNumber) {
        List<SelenideElement> documentsLinksForYear = getDocumentsMatchYear(year);

        assertEquals(documentsLinksForYear.size(), documentNumber, format("The documents aren't exist for %s year", year));
        return this;
    }

    @Step("Verify link contains the document extension for first document for some year")
    public LegalEducationPage verifyLinkContainsDocumentMatchSomeYear(String year, String firstDocumentExtension) {
        boolean isFirstDocumentHasExtension = Objects.requireNonNull(getDocumentsMatchYear(year)
                .stream().findFirst()
                .orElseThrow(() -> new NoSuchElementException(format("The document isn't exist for %s year", year)))
                .shouldBe(visible)
                .getAttribute("href"))
                .contains(firstDocumentExtension);

        assertTrue(isFirstDocumentHasExtension, "The document has another extension then " + firstDocumentExtension);
        return this;
    }

    private List<SelenideElement> getDocumentsMatchYear(String year) {
        return documentsLinks.stream()
                .filter(d -> d.getText().contains(year))
                .collect(Collectors.toList());
    }
}
