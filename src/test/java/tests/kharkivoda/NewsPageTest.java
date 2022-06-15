package tests.kharkivoda;

import elements.HomePage;
import elements.NewsPage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;
import static helpers.MethodsHelper.checkUrlIsChange;

public class NewsPageTest extends BaseTest {

    @Test(description = "Verify Basic Of News Page",priority = 1)
    public void verifyBasicOfNewsMenu() {
        page(HomePage.class)
                .openPage()
                .verifyNewsMenuBtnIsPresent()
                .clickOnNewsMenuBtn()
                .verifyLinerHeadOfNewsIsPresent()
                .verifyLinerHeadOfNewsText()
                .verifyListOfNewsIsPresent()
                .verifyArchiveOfDocsIsPresent()
                .verifyArchiveOfDocsText()
                .verifyPaginationIsPresent()
                .verifyPreviousPageBtnIsPresent()
                .verifyNextPageBtnIsPresent();
    }

    @Test(description = "Search news by date",priority = 2)
    public void newsSearchByDate() {
        page(HomePage.class)
                .openPage()
                .verifyNewsMenuBtnIsPresent()
                .clickOnNewsMenuBtn()
                .verifyArchiveOfDocsIsPresent()
                .verifyArchiveOfDocsText()
                .verifySelectYearDropdownIsPresent()
                .clickOnSelectYearDropdown()
                .chooseYear()
                .verifySelectMonthDropdownIsPresent()
                .clickOnSelectMonthDropdown()
                .chooseMonth()
                .verifyShowBtnIsPresent()
                .clickOnShowBtn()
                .verifySelectedDateIsPresent()
                .verifyTextOfSelectedDate()
                .verifyYearInNewsDate();
    }
}
