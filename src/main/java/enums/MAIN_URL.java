package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MAIN_URL {
    GALLERY_URL("https://kharkivoda.gov.ua/galerei"),
    VIDEO_URL("https://kharkivoda.gov.ua/video"),
    NEWS_URL("https://kharkivoda.gov.ua/news");

    @Getter
    private final String value;
}
