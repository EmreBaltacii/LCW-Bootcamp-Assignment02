package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ElementHelper;

public class BasketPageN11 {

    By paymentButton = By.cssSelector("#js-buyBtn");
    // By price1 = By.cssSelector(".prodPrice__text [value]:nth-child(1)");
    By plus1 = By.cssSelector(".spinnerUp.spinnerArrow:nth-child(1)");
    // By price2 = By.cssSelector(".prodPrice__text [value]:nth-child(2)");
    By plus2 = By.cssSelector(".spinnerUp.spinnerArrow:nth-child(2)");
    // By price3 = By.cssSelector(".prodPrice__text [value]:nth-child(3)");
    By plus3 = By.cssSelector(".spinnerUp.spinnerArrow:nth-child(3)");
    By clickEmptySpace = By.id("newCheckout");



    WebDriver driver;
    ElementHelper helper;

    public BasketPageN11(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void comparePrices (){
        int price1Value = Integer.parseInt(helper.getText(price1));
        int price2Value = Integer.parseInt(helper.getText(price2));
        int price3Value = Integer.parseInt(helper.getText(price3));
        if (price1Value < price2Value && price1Value < price3Value){
            helper.click(plus1);
            helper.click(plus1);
        }
        else if (price2Value < price1Value && price2Value < price3Value){
            helper.click(plus2);
            helper.click(plus2);
        }
        else {
            helper.click(plus3);
            helper.click(plus3);
        }
        helper.click(clickEmptySpace);
    }

    public void clickPaymentButton(){
        helper.click(paymentButton);
    }
}
