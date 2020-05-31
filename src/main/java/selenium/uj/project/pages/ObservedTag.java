package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObservedTag extends DefaultPage{

    @FindBy(xpath = "//*[@id=\"nav\"]/div/ul[1]/li[6]/a")
    private WebElement elementOfMenu;

    @FindBy(xpath = "//*[@id=\"openTagsConf\"]/small")
    private WebElement addTag;

    @FindBy(xpath= "//*[@id=\"tagsConf\"]/input")
    private WebElement tagField;

    @FindBy(xpath = "//html/body/ul[1]/li[1]/p")
    private WebElement emptyField;

    @FindBy(xpath = "//*[@id=\"tagsConf\"]/fieldset/p/input")
    private WebElement confirmAddButton;

    @FindBy(xpath = "//*[@id=\"observedTags\"]/div/a[1]/span")
    private WebElement wykopTag;



    public ObservedTag(WebDriver driver, Logger logger) {

        super(driver, logger);
    }



    public ObservedTag pickElementOfMenu(){
        clickElement(elementOfMenu);
        return this;
    }

    public ObservedTag showAddTagForm() {
        clickElement(addTag);
        return this;
    }
    public ObservedTag clickFillTagField(){
        clickElement(tagField);
        return this;
    }

    public ObservedTag fillTagField(String tagName) {
        fillElement(tagField, tagName);
        return this;
    }

    public ObservedTag clickEmptyField() {
        clickElement(emptyField);
        return this;
    }

    public ObservedTag confirmAddTagForm() {
        clickElement(confirmAddButton);
        return new ObservedTag(driver, logger);
    }

    public boolean isTagSuccessAdded() {
        return isElementDisplayed(wykopTag);
    }

}
