package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MAIN_URL {
    //region Menu
    GALLERY_URL("https://kharkivoda.gov.ua/galerei"),
    VIDEO_URL("https://kharkivoda.gov.ua/video"),
    NEWS_URL("https://kharkivoda.gov.ua/news"),
    HOME_URL("https://kharkivoda.gov.ua/"),
    ADMINISTR_MENU_URL("https://kharkivoda.gov.ua/oblasna-derzhavna-administratsiya"),
    DOCS_MENU_URL("https://kharkivoda.gov.ua/dokumenti"),
    ADMINISTRATORS_MENU_URL("https://kharkivoda.gov.ua/adminposlugi"),
    FEEDBACK_MENU_URL("https://kharkivoda.gov.ua/101"),
    ACCESS_MENU_URL("https://kharkivoda.gov.ua/dostup-do-publichnoyi-informatsiyi"),
    REGION_MENU_URL("https://kharkivoda.gov.ua/pro-oblast/43126"),
    //endregion

    LEGAL_EDUCATION_PAGE_URL ( "https://kharkivoda.gov.ua/101/425/690");

    @Getter
    private final String value;
}
