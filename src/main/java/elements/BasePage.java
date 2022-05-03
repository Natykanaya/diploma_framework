package elements;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BasePage {
    private static final String HOME_PAGE = "https://kharkivoda.gov.ua/";

    public HomePage openPage() {
        open(HOME_PAGE);
        return page(HomePage.class);
    }

    public HomePage openPage(String pageName) {
        open(pageName);
        return page(HomePage.class);
    }
}
