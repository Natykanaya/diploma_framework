package elements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class FeedbackPage extends BasePage {
    public static final String PRIMARY_LEGAL_AID_INFO = "Інформація про надання обласною державною адміністрацією безоплатної первинної правової допомоги";

    private static final String CATEGORY_SELECTOR = "//div[@class='category-titul']//a[contains(text(), '%s')]";

    public void clickOnTheCategory(String categoryName) {
        $x(format(CATEGORY_SELECTOR, categoryName)).shouldBe(visible).click();
    }
}
