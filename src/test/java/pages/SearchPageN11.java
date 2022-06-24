package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class SearchPageN11 {

    By searchPage = By.cssSelector(".group.listingGroup.resultListGroup.import-search-view");
    By correctionWord = By.cssSelector((".result-mean-word"));
    By pageCount3 = By.cssSelector("[href=\"https://www.n11.com/arama?q=ayfone&pg=3\"]");
    By searchedProductFirst = By.cssSelector(".columnContent[data-position=\"1\"] img");
    By searchedProductLast = By.cssSelector(".columnContent[data-position=\"27\"] img");
    By searchedProduct5th = By.cssSelector(".columnContent[data-position=\"61\"] img");
    WebDriver driver;
    ElementHelper helper;

    public SearchPageN11(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkList() {
        helper.checkElementVisible(searchPage);
    }

    public void checkCorrectionWord() {
        helper.checkElementVisible(correctionWord);
    }

    public void clickFirstProduct(){
        helper.click(searchedProductFirst);
    }

    public void clickLastProduct(){
        helper.click(searchedProductLast);
    }

    public void click5thProduct(){
        helper.click(searchedProduct5th);
    }

    public void switchPage(){
        helper.click(pageCount3);

    }
}
