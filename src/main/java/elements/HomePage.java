package elements;

import elements.header.HeaderFragment;

import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
}
