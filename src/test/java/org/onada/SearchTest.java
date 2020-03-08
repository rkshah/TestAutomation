package org.onada;

import org.onada.pages.GoogleSearchPage;
import org.onada.pages.SearchResultPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends TestConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchTest.class);

    private GoogleSearchPage searchPage;
    private SearchResultPage resultPage;

    @BeforeClass
    public void setup() {
        searchPage = new GoogleSearchPage(driver);
        resultPage = new SearchResultPage(driver);
        searchPage.openUrl();
    }

    @Test
    public void verifySearch() {
        final String searchText = "Test Automation";
        searchPage.enterSearchText(searchText);
        Assert.assertTrue(resultPage.isSearchResultAvailable());
    }

    //Dataprovider Example
    @Test (dataProvider = "searchData", dataProviderClass = SearchDataProvider.class)
    public void multipleSearch(final String searchText) {
        searchPage.enterSearchText(searchText);
        Assert.assertTrue(resultPage.isSearchResultAvailable());
    }
}
