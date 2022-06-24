package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPageN11;
import util.DriverFactory;

public class SearchPageN11Steps {

    SearchPageN11 searchPage = new SearchPageN11(DriverFactory.getDriver());

    @Then("Urunlerin listelendigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkList();
    }

    @When("Ilk siradaki urune tiklanir")
    public void IlkSiradakiUruneTiklanir() {
        searchPage.clickFirstProduct();
    }

    @When("ücüncü sayfaya gidilir")
    public void ücüncüSayfayaGidilir() {
        searchPage.switchPage();
    }

    @Then("Aranan kelimenin düzeltildigi kontrol edilir")
    public void arananKelimeninDüzeltildigiKontrolEdilir() {
        searchPage.checkCorrectionWord();
    }

    @When("Son siradaki urune tiklanir")
    public void sonSiradakiUruneTiklanir() {
        searchPage.clickLastProduct();
    }

    @When("5 siradaki urune tiklanir")
    public void siradakiUruneTiklanir() {
        searchPage.click5thProduct();
    }
}
