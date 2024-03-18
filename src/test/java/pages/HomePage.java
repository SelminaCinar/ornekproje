package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class HomePage {
    public WebElement popUpAccept;
    public WebElement searchBox;


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "((//*[@id='twotabsearchtextbox'])")
    public WebElement searchbox;

    @FindBy(xpath = "(//*[@class='s-image'])[1])")
    public WebElement ilkSiparis;

    @FindBy (xpath = "(//*[@id='nav-link-accountList-nav-line-1'])")
    public WebElement entranceButton ;

    @FindBy (xpath = "(//*[@id='ap_email'])")
    public WebElement cellBox ;

    @FindBy (xpath = "//*[@class='a-button-input'])")
    public WebElement continueButton;

    @FindBy (xpath = "//*[@id='ap_password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@id='signInSubmit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@class='nav-line-2'])[1]")
    public WebElement assertIade ;


}