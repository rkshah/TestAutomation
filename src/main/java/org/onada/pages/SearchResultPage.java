package org.onada.pages;

import org.onada.base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends Page {

    @FindBy(id = "rcnt")
    private WebElement resultList;

    public SearchResultPage(final WebDriver driver) {
        super(driver);
    }

    public boolean isSearchResultAvailable() {
        return isElementVisible(resultList);
    }
}
