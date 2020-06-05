package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyDiscovery extends DefaultPage{

    @FindBy(xpath = "//*[@id=\"nav\"]/div/ul[2]/li[3]/a")
    private WebElement addDiscovery;

    @FindBy(xpath = "//*[@id=\"add-new\"]/div[1]/div[1]/div/fieldset[2]/p/input")
    private WebElement addEmptyDiscovery;

    @FindBy(xpath = "//*[@id=\"urlErrors\"]/p")
    private WebElement addEmptyDiscoverySuccess;

    public EmptyDiscovery(WebDriver driver, Logger logger) {

        super(driver, logger);
    }

    public EmptyDiscovery clickAddDiscovery() {
        clickElement(addDiscovery);
        return this;
    }

    public EmptyDiscovery clickAddEmptyDiscovery() {
        clickElement(addEmptyDiscovery);
        return this;
    }

    public boolean isEmptyDiscoveryAddSuccess() {

        return isElementDisplayed(addEmptyDiscoverySuccess);
    }

}
