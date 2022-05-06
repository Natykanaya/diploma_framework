package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import driver.WebDriverProvider;
import listeners.AllureSelenideListener;
import listeners.TestResultsListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

@Listeners(TestResultsListener.class)
public class BaseTest {
    private WebDriverProvider driverProvider;

    @BeforeClass
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenideListener());
        driverProvider = driverProvider.getWebDriverProviderInstance();
        driverProvider.initDriver();
        setWebDriver(driverProvider.getDriver());
    }

    @AfterTest
    public void tearDown() {
        getWebDriver().quit();
    }
}
