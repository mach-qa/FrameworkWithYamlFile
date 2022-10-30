package tests;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

public class PageTests extends TestBase {

    private static final Logger logger = LoggerFactory.getLogger(PageTests.class);

    @Test
    void websiteTitleTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = System.getProperty("title");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
