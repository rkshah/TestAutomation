package org.onada.pages;

import org.onada.base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleSearchPage extends Page {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchPage.class);

    private static final String BASE_URL = "https://www.google.com";

    @FindBy(name = "q")
    private WebElement searchBar;

    public GoogleSearchPage(final WebDriver driver) {
        super(driver);
    }

    public void openUrl() {
        driver.navigate().to(BASE_URL);
    }

    public void enterSearchText(final String searchText) {
        searchBar.clear();
        searchBar.sendKeys(searchText);
        searchBar.submit();
    }


}
