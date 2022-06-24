package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePageN11;
import util.DriverFactory;

public class HomePageN11Steps {

    WebDriver driver = DriverFactory.getDriver();
    HomePageN11 homePage = new HomePageN11(driver);

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        homePage.checkAd();
    }

    @When("Arama cubuguna {string} yazilir")
    public void aramaCubugunaAyfoneYazilir(String product) {
        homePage.setSearchBox(product);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.clickSearchButton();
    }
}
