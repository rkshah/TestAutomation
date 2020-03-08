package org.onada.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverInit {
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverInit.class);

    private final WebDriver driver;

    public DriverInit() {
        driver = initializeChromeDriver();
    }

    public DriverInit(final String browserType) {
        switch (browserType) {
            case "Chrome" :
                driver = initializeChromeDriver();
                break;
            case "Firefox" :
                driver = initializeFirefoxDriver();
                break;
            default:
                driver = initializeChromeDriver();
                break;
        }
    }

    private static WebDriver initializeChromeDriver() {
        LOGGER.info("Initializing Chrome Driver");
        String driverPath = System.getProperty("driverPath");
        if (null == driverPath || driverPath.isEmpty()) {
            LOGGER.info("Taking default driver information");
            driverPath = "/Users/rakesh.shah/chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
        final ChromeOptions options = new ChromeOptions();
        //TODO: Add chrome options
        return new ChromeDriver(options);
    }

    private static WebDriver initializeFirefoxDriver() {
        LOGGER.info("Initializing Firefox Driver");
        String driverPath = System.getProperty("driverPath");
        if (null == driverPath || driverPath.isEmpty()) {
            LOGGER.info("Taking default driver information");
            driverPath = "./geckodriver";
        }
        System.setProperty("webdriver.gecko.driver", driverPath);
        final FirefoxOptions options = new FirefoxOptions();
        //TODO: add firefox options
        return new FirefoxDriver(options);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
