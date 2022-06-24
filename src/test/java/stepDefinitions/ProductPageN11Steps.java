package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPageN11;
import util.DriverFactory;

public class ProductPageN11Steps {

    ProductPageN11 productPage = new ProductPageN11(DriverFactory.getDriver());

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        productPage.clickAddToCart();
    }

    @When("Sepetim sayfasina gidilir")
    public void sepetimSayfasinaGidilir() {
        productPage.clickGoCartButton();
    }
}