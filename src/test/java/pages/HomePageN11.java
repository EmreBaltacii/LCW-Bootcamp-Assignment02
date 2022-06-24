package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class HomePageN11 {
    By ad = By.cssSelector(".slidesjs-control[style=\"position: relative; left: 0px; width: 720px; height: 492px;\"]");
    By searchBox = By.id("searchData");
    By searchButton = By.cssSelector(".searchBtn");

    WebDriver driver;
    ElementHelper helper;

    public HomePageN11(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }


    public void checkAd() {
        helper.checkElementVisible(ad);
    }

    public void setSearchBox(String product) {
        helper.sendKey(searchBox, product);
    }

    public void clickSearchButton() {
        helper.click(searchButton);
    }
}
