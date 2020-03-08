package org.onada.pages;

import org.onada.base.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*
This class will move to Test repository in real condition.
It's added here for sake of simplicity and all functionality in single repo.
*/

public class CurrencyConverterPage extends Page {

    private static final String BASE_URL = "https://www1.oanda.com";

    @FindBy(id = "logo")
    private WebElement logo;

    @FindBy(css = "#quote_currency_input")
    private WebElement currencyIHave;

    @FindBy(css = "#base_currency_input")
    private WebElement currencyIWant;

    @FindBy(id = "quote_amount_input")
    private WebElement amountToConvert;

    @FindBy(id = "base_amount_input")
    private WebElement amountConverted;

    @FindBy(css = "a#view_details>span")
    private WebElement rateDetails;

    @FindBy(css = "#infoDetails")
    private WebElement infoDetails;

    @FindBy(css = "a#view_cheatsheet>span")
    private WebElement travelerCheatsheet;

    @FindBy(css = "#w-signin>a")
    private WebElement signIn;

    @FindBy(css = "#w-open>a")
    private WebElement openAnAccount;

    public CurrencyConverterPage(final WebDriver driver) {
        super(driver);
    }

    public boolean openUrl() {
        driver.navigate().to(BASE_URL + "/currency/converter/");
        return logo.isDisplayed();
    }

    public void selectCurrencyIhave(final String currency) {
        currencyIHave.sendKeys(currency);
        currencyIHave.sendKeys(Keys.ENTER);
    }

    public void selectCurrencyIWant(final String currency) {
        currencyIWant.sendKeys(currency);
        currencyIWant.sendKeys(Keys.ENTER);
    }

    public void enterAmount(final String amount) {
        amountToConvert.sendKeys(amount);
    }

    public String getConvertedCurrency() {
        return amountConverted.getAttribute("value");
    }

    public String getSignInLink() {
        return signIn.getAttribute("href");
    }

    public String getOpenAccountLink() {
        return openAnAccount.getAttribute("href");
    }

    public String getInfoDetailsText() {
        infoDetails.click();
        return infoDetails.getText();
    }
}
