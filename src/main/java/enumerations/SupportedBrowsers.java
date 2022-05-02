package enumerations;

import invokers.WebDriverInvoker;
import invokers.impl.LocalChromeInvoker;
import invokers.impl.LocalFirefoxInvoker;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker());

    private final WebDriverInvoker invoker;

    SupportedBrowsers(WebDriverInvoker invoker) {
        this.invoker = invoker;
    }

    public WebDriverInvoker getWebDriver() {
        return invoker;
    }
}
