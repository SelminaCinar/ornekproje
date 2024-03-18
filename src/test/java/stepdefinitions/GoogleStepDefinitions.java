package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
//        CEREZ CIKAN ARKADARLAR ICIN, CEREZI OKEYLEYELIM
        try{
            homePage.popUpAccept.click();
        }catch (Exception e){

        }
    }
//    @When("kullanici iphone için arama yapar")
//    public void kullanici_iphone_için_arama_yapar() {
//        homePage.searchBox.sendKeys("lego"+ Keys.ENTER);
//    }
//    @Then("sonuclarda iphone oldugunu dogrular")
//    public void sonuclarda_iphone_oldugunu_dogrular() {
//        Assert.assertTrue(Driver.getDriver().getPageSource().contains("lego"));
//    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
//    @When("kullanici tesla için arama yapar")
//    public void kullanici_tesla_için_arama_yapar() {
//        homePage.searchBox.sendKeys("tesla"+Keys.ENTER);
//
//    }
//    @Then("sonuclarda tesla oldugunu dogrular")
//    public void sonuclarda_tesla_oldugunu_dogrular() {
//        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
//
//    }

    @When("kullanici {string} için arama yapar")
    public void kullanici_için_arama_yapar(String string) {
        homePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini dogrula")
    public void sonuclarin_icerdigini_dogrula(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));

    }


    @Given("kullanici amazon gider")
    public void kullaniciAmazonGider() {


    }

    @When("kullanici lego için arama yapar")
    public void kullaniciLegoIçinAramaYapar() {

        homePage.searchBox.sendKeys("lego"+ Keys.ENTER);

    }

    @Then("sonuclarda lego oldugunu dogrular")
    public void sonuclardaLegoOldugunuDogrular() {

        Assert.assertTrue(Driver.getDriver().getPageSource().contains("lego"));
    }

    @When("kullanici mouse için arama yapar")
    public void kullaniciMouseIçinAramaYapar() {

        homePage.searchBox.sendKeys("mouse"+Keys.ENTER);

    }

    @Then("sonuclarda mouse oldugunu dogrular")
    public void sonuclardaMouseOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("mouse"));
    }

    @When("kullanici giris yap butonuna basar")
    public void kullaniciGirisYapButonunaBasar() {

        homePage.entranceButton.click();
    }

    @Then("kullanici telefon numarasini girer")
    public void kullaniciTelefonNumarasiniGirer() {
        homePage.cellBox.sendKeys("5522893225");
    }

    @Then("kullanici devam et butonuna basar")
    public void kullaniciDevamEtButonunaBasar() {
        homePage.continueButton.click();
    }

    @Then("kullanici password girer")
    public void kullaniciPasswordGirer() {
        homePage.passwordBox.sendKeys("123321..");
    }

    @Then("kullanici sign in butonuna basar")
    public void kullaniciSignInButonunaBasar() {

        homePage.signInButton.click();
    }

    @Then("giris yaptigini dogrular")
    public void girisYaptiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains((CharSequence) homePage.assertIade));


    }
}