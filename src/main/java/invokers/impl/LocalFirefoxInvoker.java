package invokers.impl;

import invokers.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static owner.BrowserOwner.BROWSER_CONFIG;


public class LocalFirefoxInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver().browserVersion(BROWSER_CONFIG.getVersion()).setup();
        return new FirefoxDriver();
    }
}
