package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.EmptyDiscovery;

//Paweł Sikora

public class AddEmptyDiscoveryTest extends DefaultTest {

    @Test
    public void successEmptyDiscovery() {
        EmptyDiscovery emptyDiscovery = new EmptyDiscovery(driver, logger);
        emptyDiscovery.clickAddDiscovery();
        emptyDiscovery.clickAddEmptyDiscovery();


        customScreenshot.makeScreenshot(driver,
                "A" + "_" +
                        new AddEmptyDiscoveryTest(){}.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 4 - ADD_EMPTY_DISCOVERY");

        Assert.assertTrue(
                emptyDiscovery
                        .isEmptyDiscoveryAddSuccess()
        );

    }

}
