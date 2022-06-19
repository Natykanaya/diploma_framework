package driver;

import com.codeborne.selenide.Configuration;
import driver.driverfactory.WebDriverFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import lombok.Getter;

public class WebDriverProvider {
    @Getter
    private WebDriver driver;

    private static WebDriverFactory webDriverFactory;

    private static class WebDriverProviderInit {
        static WebDriverProvider INSTANCE = new WebDriverProvider();
    }

    private WebDriverProvider() {
        webDriverFactory = new WebDriverFactory();
    }

    @SneakyThrows
    public synchronized void initDriver() {
        driver = webDriverFactory.newWebDriver();
        driver.manage().deleteAllCookies();
        Configuration.headless = true;
        //driver.manage().window().maximize();
    }

    public static WebDriverProvider getWebDriverProviderInstance() {
        return WebDriverProviderInit.INSTANCE;
    }
}
