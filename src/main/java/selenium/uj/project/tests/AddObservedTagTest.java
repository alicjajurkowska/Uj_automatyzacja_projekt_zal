package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.ObservedTag;
import selenium.uj.project.utils.BaseProperties;

public class AddObservedTagTest extends DefaultTest{

    @Test
    public void successObservedTagTest(){
        ObservedTag observedTag = new ObservedTag(driver, logger);
        observedTag.pickElementOfMenu();
        observedTag.showAddTagForm();
        observedTag.clickFillTagField();
        observedTag.fillTagField(
                "#wykop"
        );
        observedTag.clickEmptyField();
        observedTag.confirmAddTagForm();



        customScreenshot.makeScreenshot(driver,
                "A" + "_" +
                        new AddObservedTagTest(){}.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 2 - ADD_OBSERVED_TAG");



        Assert.assertTrue(
                observedTag
                .isTagSuccessAdded()
        );


    }

}
