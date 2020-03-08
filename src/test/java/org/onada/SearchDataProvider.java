package org.onada;

import org.testng.annotations.DataProvider;

public class SearchDataProvider {

    @DataProvider(name = "searchData")
    public Object[][] searchData() {
        return new Object[][] {
                {"TESTNG"},
                {"maven"},
                {"architecture123"}
        };
    }
}
