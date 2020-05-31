package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[9]/div[1]/div/div/div[2]/a[2]/span/b")
    private WebElement acceptPrivacy;

    @FindBy(xpath ="//*[@id=\"nav\"]/div/ul[2]/li[4]/a")
    private WebElement loginButton;

    @FindBy(id = "newregister-login")
    private WebElement emailField;

    @FindBy(id = "newregister-pass")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"nav\"]/div/ul[2]/li[4]/div/div/ul/li[1]/form/fieldset/p/input")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"nav\"]/div/ul[2]/li[5]/a/i")
    private WebElement avatarImg;


    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isPrivacyDisplayed() {
        return isElementDisplayed(acceptPrivacy);
    }

    public LoginPage confirmPrivacy() {
        clickElement(acceptPrivacy);
        return new LoginPage(driver, logger);


    }
    public LoginPage showLoginForm() {
        clickElement(loginButton);
        return this;
    }

    public LoginPage fillLoginForm(String email, String password) {
        fillElement(emailField, email);
        fillElement(passwordField, password);

        return this;
    }

    public boolean isLoginPageSuccess() {

        return isElementDisplayed(avatarImg);
    }

    public LoginPage submitLoginForm() {
        clickElement(submitButton);
        return new LoginPage(driver, logger);
    }


}