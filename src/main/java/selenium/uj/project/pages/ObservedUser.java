package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObservedUser extends DefaultPage{

    @FindBy(xpath = "//*[@id=\"openUsersConf\"]/small")
    private WebElement addUser;

    @FindBy(xpath = "//*[@id=\"usersConf\"]/input")
    private WebElement userField;

    @FindBy(xpath = "//*[@id=\"site\"]/div/div[3]/div[2]/h4")
    private WebElement emptySpace;

    @FindBy(xpath = "//*[@id=\"usersConf\"]/fieldset/p/input")
    private WebElement addUserButton;

    @FindBy(xpath = "//*[@id=\"observedUsers\"]/div/a[1]/span")
    private WebElement wykopUser;

    public ObservedUser(WebDriver driver, Logger logger) {

        super(driver, logger);
    }

    public ObservedUser clickAddUser() {
        clickElement(addUser);
        return this;
    }

    public ObservedUser fillUserField(String tagUser) {
       fillElement(userField, tagUser);
        return this;
    }

    public ObservedUser clickEmptyField_2() {
        clickElement(emptySpace);
        return this;
    }

    public ObservedUser confirmAddUser() {
        clickElement(addUserButton);
        return this;
    }

    public boolean isUserSuccessAdded() {
        return isElementDisplayed(wykopUser);
    }

}
