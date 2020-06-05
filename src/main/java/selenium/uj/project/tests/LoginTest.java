package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.LoginPage;
import selenium.uj.project.utils.BaseProperties;

public class LoginTest extends DefaultTest {


//Alicja Jurkowska

    @Test
    public void successLoginTest() {



        LoginPage loginPage = new LoginPage(driver, logger);

        if ( loginPage.isPrivacyDisplayed() ) {
            loginPage.confirmPrivacy();
        }

        loginPage
                .showLoginForm()
                .fillLoginForm(
                        BaseProperties.BASE_ADMIN_EMAIL,
                        BaseProperties.BASE_ADMIN_PASSWORD);



        customScreenshot.makeScreenshot(driver,
                "A" + "_" +
                        new LoginTest(){}.getClass().getEnclosingMethod().getName()
                        + "_" + "STEP 1 - FILL_LOGIN_FORM");



        Assert.assertTrue(
                loginPage
                        .submitLoginForm()
                        .isLoginPageSuccess());
    }
}