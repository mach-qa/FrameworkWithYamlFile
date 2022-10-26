package setup;

import factory.BrowserFactory;
import models.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    public static WebDriver driver;

    private static Browser browser;

    @BeforeAll
//    static void setupDriver(){
//        Browser browserEnvironment = new Browser();
//        driver = browserEnvironment.getDriver();
////        WebDriverManager.chromedriver().setup();
//        logger.info("Webdriver started succesfully");
//    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    void exit() {
        driver.quit();
        logger.info("Webdriver closed properly");
    }
}
