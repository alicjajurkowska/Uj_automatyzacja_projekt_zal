package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.ObservedTag;
import selenium.uj.project.pages.ObservedUser;

public class AddObservedUserTest extends DefaultTest {

    @Test
    public void successObservedUserTest() {
        ObservedUser observedUser = new ObservedUser(driver, logger);
        observedUser.clickAddUser();
        observedUser.fillUserField("@wykop");
        observedUser.clickEmptyField_2();
        observedUser.confirmAddUser();


        customScreenshot.makeScreenshot(driver,
                "A" + "_" +
                        new AddObservedUserTest(){}.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 3 - ADD_OBSERVED_USER");

        Assert.assertTrue(
                observedUser
                        .isUserSuccessAdded()
        );

    }
}
