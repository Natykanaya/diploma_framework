package invokers.impl;

import invokers.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static owner.BrowserOwner.BROWSER_CONFIG;

public class LocalChromeInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver().browserVersion(BROWSER_CONFIG.getVersion()).setup();
        return new ChromeDriver();
    }
}
