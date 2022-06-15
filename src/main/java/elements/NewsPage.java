package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elements.header.HeaderFragment;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.*;

public class NewsPage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private final SelenideElement linerHeadOfNews = $x("//div[contains(@class,'liner-head')]");
    private final SelenideElement archiveOfDocs = $x("//div[contains(@class,'menu-aside')]");
    private final SelenideElement selectYearDropdown = $x("//div[contains(@data-placeholder,'оберіть рік')]");
    private final SelenideElement selectMonthDropdown = $x("//div[contains(@data-placeholder,'оберіть місяць')]");
    private final SelenideElement tableOfYear = $x("//table[contains(@class,'calendar')]");
    private final SelenideElement submitBtn = $x("//input[contains(@type,'submit')]");
    private final SelenideElement previousPageBtn = $x("//span[contains(@class,'b-pag__prev')]");
    private final SelenideElement nextPageBtn = $x("//a[contains(@class,'b-pag__next')]");
    private final SelenideElement selectedDate = $x("//div[contains(@class,'g-pseudo-h2')]");
    private final SelenideElement showBtn = $x("//input[contains(@type,'submit')]");
    private final SelenideElement showAllBtn = $x("//a[contains(@class,'g-button')]");
    private final SelenideElement listOfNews = $x("//ul[contains(@class,'news-list')]");
    private final SelenideElement titleOfArchive = $x("//h4[contains(@class,'b-aside__header')]");
    private final SelenideElement pagination = $x("//ul[contains(@class,'g-tacenter')]");
    private final SelenideElement selectedYear = $x("//div[contains(@class,'jq-selectbox__dropdown')]/ul/li[text()='2021']");
    private final SelenideElement selectedMonth = $x("//li[text()='Березень'][2]");
    private final SelenideElement textOfSelectedMonth = $x("//div[contains(@data-placeholder,'оберіть місяць')]/div/div[contains(@class,'jq-selectbox__select-text')]");
    private final SelenideElement textOfSelectedYear = $x("//div[contains(@data-placeholder,'оберіть рік')]/div/div[contains(@class,'jq-selectbox__select-text')]");
    private final SelenideElement dateInNews = $x("//p[contains(@class,'date')]");

    @Step("Verify liner Head Of News is present")
    public NewsPage verifyLinerHeadOfNewsIsPresent() {
        assertTrue(linerHeadOfNews.isDisplayed(), "Liner head of news is not present");
        return page(NewsPage.class);
    }

    @Step("Verify list Of News is present")
    public NewsPage verifyListOfNewsIsPresent() {
        assertTrue(listOfNews.isDisplayed(), "List of news is not present");
        return page(NewsPage.class);
    }

    @Step("Verify liner Head Of News text")
    public NewsPage verifyLinerHeadOfNewsText() {
        String linerHeadOfNewsText = "Новини";
        assertEquals(linerHeadOfNews.getText(), linerHeadOfNewsText, "Text of liner is not correct");
        return page(NewsPage.class);
    }

    @Step("Verify archive of docs is present")
    public NewsPage verifyArchiveOfDocsIsPresent() {
        assertTrue(archiveOfDocs.isDisplayed(), "Archive of docs is not present");
        return page(NewsPage.class);
    }

    @Step("Verify archive of docs text")
    public NewsPage verifyArchiveOfDocsText() {
        String archiveOfDocsText = "АРХІВ ДОКУМЕНТIВ";
        assertEquals(titleOfArchive.getText(), archiveOfDocsText, "Text of Archive of docs is not correct");
        return page(NewsPage.class);
    }

    @Step("Verify that Select Year dropdown is present")
    public NewsPage verifySelectYearDropdownIsPresent() {
        assertTrue(selectYearDropdown.isDisplayed(), "Select Year dropdown is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Select Year dropdown")
    public NewsPage clickOnSelectYearDropdown() {
        selectYearDropdown.click();
        return page(NewsPage.class);
    }

    @Step("Verify that Select Month dropdown is present")
    public NewsPage verifySelectMonthDropdownIsPresent() {
        assertTrue(selectMonthDropdown.isDisplayed(), "Select Month dropdown is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Select Month dropdown")
    public NewsPage clickOnSelectMonthDropdown() {
        selectMonthDropdown.click();
        return page(NewsPage.class);
    }

    @Step("Verify that submit Btn is present")
    public NewsPage verifySubmitBtnIsPresent() {
        assertTrue(submitBtn.isDisplayed(), "Submit Btn is not present");
        return page(NewsPage.class);
    }

    @Step("Click on submit Btn")
    public NewsPage clickOnSubmitBtn() {
        submitBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify that table Of Year is present")
    public NewsPage verifyTableOfYearIsPresent() {
        assertTrue(tableOfYear.isDisplayed(), "Table of year is not present");
        return page(NewsPage.class);
    }

    @Step("Verify previous Page Btn is present")
    public NewsPage verifyPreviousPageBtnIsPresent() {
        previousPageBtn.scrollTo();
        assertTrue(previousPageBtn.isDisplayed(), "Previous Page Btn is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Previous Page Btn")
    public NewsPage clickOnPreviousPageBtn() {
        previousPageBtn.scrollTo();
        previousPageBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify Next Page Btn is present")
    public NewsPage verifyNextPageBtnIsPresent() {
        nextPageBtn.scrollTo();
        assertTrue(nextPageBtn.isDisplayed(), "Next Page Btn is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Next Page Btn")
    public NewsPage clickOnNextPageBtn() {
        nextPageBtn.scrollTo();
        nextPageBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify show Btn is present")
    public NewsPage verifyShowBtnIsPresent() {
        showBtn.scrollTo();
        assertTrue(showBtn.isDisplayed(), "Show Btn is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Show Btn")
    public NewsPage clickOnShowBtn() {
        showBtn.scrollTo();
        showBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify show All Btn is present")
    public NewsPage verifyShowAllBtnIsPresent() {
        showAllBtn.scrollTo();
        assertTrue(showAllBtn.isDisplayed(), "Show All Btn is not present");
        return page(NewsPage.class);
    }

    @Step("Click on Show All Btn")
    public NewsPage clickOnShowAllBtn() {
        showAllBtn.scrollTo();
        showAllBtn.click();
        return page(NewsPage.class);
    }

    @Step("Verify selected Date is present")
    public NewsPage verifySelectedDateIsPresent() {
        selectedDate.scrollTo();
        assertTrue(selectedDate.isDisplayed(), "Selected Date is not present");
        return page(NewsPage.class);
    }

    @Step("Verify pagination is present")
    public NewsPage verifyPaginationIsPresent() {
        pagination.scrollTo();
        assertTrue(pagination.isDisplayed(), "Pagination is not present");
        return page(NewsPage.class);
    }

    @Step("Choose year in archive")
    public NewsPage chooseYear() {
        selectedYear.shouldBe(Condition.exist).click();
        return page(NewsPage.class);
    }

    @Step("Choose month in archive")
    public NewsPage chooseMonth() {
        selectedMonth.shouldBe(Condition.exist).click();
        return page(NewsPage.class);
    }

    @Step("Get text of selected date")
    public NewsPage verifyTextOfSelectedDate() {
        String selectedDateText = textOfSelectedMonth.getText() + " " + textOfSelectedYear.getText();
        selectedDate.scrollTo();
        assertEquals(selectedDateText, selectedDate.getText(), "Selected date are not equal!");
        return page(NewsPage.class);
    }

    @Step("Verify that news are contains selected year")
    public NewsPage verifyYearInNewsDate() {
        assertTrue(dateInNews.getText().contains(textOfSelectedYear.getText()));
        return page(NewsPage.class);
    }
}
