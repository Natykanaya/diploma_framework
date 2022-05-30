package helpers;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;


public class MethodsHelper {
    public static void checkUrlIsChange(String expectedUrlPart) {
        String currentUrl = WebDriverRunner.url();
        Assert.assertTrue(currentUrl.contains(expectedUrlPart), "Urls are not equal!");
    }
}
