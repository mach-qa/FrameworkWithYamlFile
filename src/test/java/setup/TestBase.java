package setup;

import factory.DriverSetup;
import factory.PropertiesFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    public static WebDriver driver;
    private static DriverSetup driverSetup;
    private static PropertiesFactory propertiesFactory;

    @BeforeAll
    static void setupDriver(){
        propertiesFactory = PropertiesFactory.getInstance();
        driverSetup = new DriverSetup();
        logger.info("Webdriver started succesfully");
    }

    @BeforeEach
    void beforeEach() {
        driver = driverSetup.getDriver();
    }

    @AfterEach
    void exit() {
        driver.quit();
        logger.info("Webdriver closed properly");
    }
}
