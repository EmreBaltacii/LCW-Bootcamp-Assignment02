package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ElementHelper;

public class ProductPageN11 {

    By addToCartButton = By.cssSelector(".btn.btnGrey.addBasketUnify");
    By goToCartButton = By.cssSelector(".icon.iconBasket");
    WebDriver driver;
    ElementHelper helper;
    public ProductPageN11(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void clickAddToCart(){
        helper.click(addToCartButton);
    }

    public void clickGoCartButton(){
        helper.click(goToCartButton);
    }
}
