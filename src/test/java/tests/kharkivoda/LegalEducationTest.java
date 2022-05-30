package tests.kharkivoda;

import elements.HomePage;
import elements.LegalEducationPage;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.page;
import static elements.FeedbackPage.PRIMARY_LEGAL_AID_INFO;
import static enums.MAIN_URL.LEGAL_EDUCATION_PAGE_URL;
import static helpers.MethodsHelper.*;

public class LegalEducationTest extends BaseTest {

    public static final String PRIMARY_LEGAL_AID_INFO_TEXT = "Інформація про надання обласною державною адміністрацією " +
            "безоплатної первинної правової допомоги";

    @Test(description = "Verify page opening using link")
    public void verifyPageOpeningByLink() {
        page(LegalEducationPage.class)
                .openLegalEducationPage()
                .verifyPageTitle(PRIMARY_LEGAL_AID_INFO_TEXT);
    }

    @Test(description = "Verify page opening from Home page")
    public void verifyPageOpeningFromHomePage() {
        page(HomePage.class)
                .openPage()
                .verifyFeedbackMenuBtnIsPresent()
                .clickOnFeedbackMenuBtn()
                .clickOnTheCategory(PRIMARY_LEGAL_AID_INFO);

        page(LegalEducationPage.class)
                .verifyPageTitle(PRIMARY_LEGAL_AID_INFO_TEXT);
        checkUrlIsChange(LEGAL_EDUCATION_PAGE_URL.getValue());

    }

    @Test(description = "Verify number of document links for 2017-2021 years")
    public void verifyNumberOfDocumentLinks() {
        page(LegalEducationPage.class)
                .openLegalEducationPage()
                .verifyNumberOfDocumentLinksForYearIsDisplayed("2017", 4)
                .verifyNumberOfDocumentLinksForYearIsDisplayed("2018", 4)
                .verifyNumberOfDocumentLinksForYearIsDisplayed("2019", 4)
                .verifyNumberOfDocumentLinksForYearIsDisplayed("2020", 1)
                .verifyNumberOfDocumentLinksForYearIsDisplayed("2021", 1);
    }

    @Test(description = "Verify link contains the document extension for first document for some year")
    public void verifyDocumentLinks() throws IOException {
        page(LegalEducationPage.class)
                .openLegalEducationPage()
                .verifyLinkContainsDocumentMatchSomeYear("2017", ".doc")
                .verifyLinkContainsDocumentMatchSomeYear("2018", ".doc")
                .verifyLinkContainsDocumentMatchSomeYear("2019", ".PDF")
                .verifyLinkContainsDocumentMatchSomeYear("2020", ".pdf")
                .verifyLinkContainsDocumentMatchSomeYear("2021", ".pdf");
    }
}
