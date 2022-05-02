package invokers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface WebDriverInvoker {
    WebDriver invokeWebDriver() throws MalformedURLException;
}
