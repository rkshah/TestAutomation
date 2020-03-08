package org.onada;

import org.onada.base.DriverInit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestConfig {

    public static WebDriver driver;

    @Parameters("browserType")
    @BeforeSuite
    public void initDriver(final String browserType) {
        if ("firefox".equalsIgnoreCase(browserType)) {
            driver = new DriverInit("Firefox").getDriver();
        } else {
            driver = new DriverInit().getDriver();
        }
    }

    @AfterSuite
    public void destroy() {
        driver.quit();
    }
}
