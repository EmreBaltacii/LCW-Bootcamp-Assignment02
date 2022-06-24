package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPageN11;
import util.DriverFactory;

public class BasketPageN11Steps {

    BasketPageN11 basketPage = new BasketPageN11(DriverFactory.getDriver());

    @Then("en ucuz ürünün sayısı 3 yapılır")
    public void enUcuzÜrününSayısı3Yapılır() {
        basketPage.comparePrices();
    }

    @And("Satın al butonuna tıklanır")
    public void satınAlButonunaTıklanır() {
        basketPage.clickPaymentButton();
    }

}
