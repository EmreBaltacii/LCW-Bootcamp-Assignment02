package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class LoginPageN11 {

    By misafirKullanıcı = By.cssSelector(".btn-continue");
    By emailBox = By.id("guestEmail");
    By phoneNumber = By.id("gsmNumber");
    By continueButton = By.id("js-guestVerification");

    WebDriver driver;
    ElementHelper helper;

    public LoginPageN11(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void clickGuest(){
        helper.click(misafirKullanıcı);

    }
    public void enterEmail() {
        helper.sendKey(emailBox, "gavavis905@doerma.com");
    }

    public void enterPhoneNumber() {
        helper.sendKey(phoneNumber, "051231231");
    }

    public void continueAsGuest() {
        helper.click(continueButton);

    }
}
