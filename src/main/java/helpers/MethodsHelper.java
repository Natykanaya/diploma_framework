package helpers;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;


public class MethodsHelper {
    public static void checkUrl(String expectedUrlPart) {
        String currentUrl = WebDriverRunner.url();
        Assert.assertFalse(currentUrl.contains(expectedUrlPart), "Urls are equal");
    }
}
