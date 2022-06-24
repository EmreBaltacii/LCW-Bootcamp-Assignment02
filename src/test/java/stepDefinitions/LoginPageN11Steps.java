package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPageN11;
import util.DriverFactory;

public class LoginPageN11Steps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPageN11 loginPage = new LoginPageN11(driver);


    @Then("Uye olmadan devam edilir")
    public void uyeOlmadanDevamEdilir() {
        loginPage.enterEmail();
        loginPage.enterPhoneNumber();
        loginPage.continueAsGuest();
    }

    @When("Misafir kullanıcı secilir")
    public void misafirKullanıcıSecilir() {
        loginPage.clickGuest();
    }
}